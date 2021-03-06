//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.22 build 50301.1100)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import java.util.List;

import ims.admin.vo.AppFormVo;
import ims.admin.vo.AppFormVoCollection;
import ims.admin.vo.domain.AppFormVoAssembler;
import ims.core.configuration.domain.objects.AppForm;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;

public class FormHelpImpl extends DomainImpl implements ims.admin.domain.FormHelp, ims.domain.impl.Transactional
{
	private static final long	serialVersionUID	= 1L;

	/**
	* Saves Help URL details for a particular form
	*/
	public void saveHelpDetails(ims.admin.vo.AppFormVo form) throws StaleObjectException
	{
		if (!form.isValidated())
			throw new DomainRuntimeException("AppFormVo has not been validated");
		DomainFactory factory = getDomainFactory();
		AppForm domForm = (AppForm)factory.getDomainObject(form);		
		// The only field updateable is the help url field
		domForm.setHelpLink(form.getHelpLink());
		factory.save(domForm);
	}

	public AppFormVoCollection listFormByName(String formName)
	{
		if (formName == null)
			throw new CodingRuntimeException("Cannot search on null Form Name!");
		
		DomainFactory factory = getDomainFactory();
		String hql = " from AppForm app where app.isComponent != true " +
			" and upper(app.name) like :formName";
		
		if (formName.indexOf("%") == -1)
			formName += "%";
		List lst = factory.find(hql, new String[]{"formName"}, new Object[]{formName.toUpperCase()});
		return AppFormVoAssembler.createAppFormVoCollectionFromAppForm(lst);
		
	}

	public AppFormVoCollection listFormsWithHelpUrl()
	{
		DomainFactory factory = getDomainFactory();
		
		String hql = " from AppForm app where app.isComponent != true " +
			" and app.helpLink != null";
		List lst = factory.find(hql);
		return AppFormVoAssembler.createAppFormVoCollectionFromAppForm(lst);
	}


	public void deleteForm(AppFormVo appForm) throws ForeignKeyViolationException, StaleObjectException 
	{
		String errors[] = appForm.validate();
		if (errors != null)
		{
			throw new DomainRuntimeException(errors.toString());
		
		}
			
		DomainFactory factory = getDomainFactory();
		AppForm domForm = (AppForm)factory.getDomainObject(appForm);
		domForm.setHelpLink(null);
		factory.save(domForm);
	
	
	}
	
}
