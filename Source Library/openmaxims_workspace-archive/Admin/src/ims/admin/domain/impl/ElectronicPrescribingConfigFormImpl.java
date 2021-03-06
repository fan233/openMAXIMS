//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.admin.domain.impl;

import ims.admin.domain.base.impl.BaseElectronicPrescribingConfigFormImpl;
import ims.admin.vo.ElectronicPrescribingConfigVo;
import ims.admin.vo.domain.ElectronicPrescribingConfigVoAssembler;
import ims.core.admin.domain.objects.ElectronicPrescribingConfig;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.exceptions.CodingRuntimeException;

public class ElectronicPrescribingConfigFormImpl extends BaseElectronicPrescribingConfigFormImpl
{

	private static final long serialVersionUID = 1L;

	public ims.admin.vo.ElectronicPrescribingConfigVoCollection listElectronicPrescribing()
	{
		DomainFactory factory = getDomainFactory();
		return ElectronicPrescribingConfigVoAssembler.createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(factory.listDomainObjects(ElectronicPrescribingConfig.class)).sort();
	}

	public ims.admin.vo.ElectronicPrescribingConfigVo saveElectronicPrescribingConfig(ims.admin.vo.ElectronicPrescribingConfigVo voConfig) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, UniqueKeyViolationException	
	{
		if(voConfig == null)
			throw new RuntimeException("Cannot save null value for ElectronicPrescribingConfigVo");
		if(!voConfig.isValidated())
			throw new CodingRuntimeException("ElectronicPrescribingConfigVo has not been validated");

		DomainFactory factory = getDomainFactory();
		ElectronicPrescribingConfig doEP = ElectronicPrescribingConfigVoAssembler.extractElectronicPrescribingConfig(factory, voConfig);			
		try
		{
			factory.save(doEP);
		}
		catch(UnqViolationUncheckedException e)
		{		
			throw new UniqueKeyViolationException("This button could have already been configured by another user, the screen will be refreshed", e);
		}
		catch (IllegalArgumentException e)
		{
			throw new StaleObjectException(doEP);
		}

		return ElectronicPrescribingConfigVoAssembler.create(doEP);
	}

	public void deleteElectronicPrescribingRecord(ElectronicPrescribingConfigVo voEP) throws StaleObjectException, ForeignKeyViolationException
	{
		if(voEP == null) 
			throw new CodingRuntimeException("ElectronicPrescribingConfigVo is null");

		if (!voEP.isValidated())
			throw new DomainRuntimeException("ElectronicPrescribingConfigVo not validated");
		
		DomainFactory factory = getDomainFactory();
		ElectronicPrescribingConfig doEP = ElectronicPrescribingConfigVoAssembler.extractElectronicPrescribingConfig(factory, voEP);	
		try
		{
			factory.delete(doEP);					
		}
		catch (IllegalArgumentException e)
		{
			throw new StaleObjectException(doEP);
		}
}
	
}
