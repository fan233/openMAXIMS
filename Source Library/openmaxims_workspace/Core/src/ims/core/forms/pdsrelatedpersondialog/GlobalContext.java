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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.forms.pdsrelatedpersondialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPdsRelatedPersonIsNotNull()
		{
			return !cx_CorePdsRelatedPerson.getValueIsNull(context);
		}
		public ims.core.vo.PatRelative getPdsRelatedPerson()
		{
			return (ims.core.vo.PatRelative)cx_CorePdsRelatedPerson.getValue(context);
		}
		public void setPdsRelatedPerson(ims.core.vo.PatRelative value)
		{
			cx_CorePdsRelatedPerson.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePdsRelatedPerson = new ims.framework.ContextVariable("Core.PdsRelatedPerson", "_cv_Core.PdsRelatedPerson");
		public boolean getViewRelatedPersonIsNotNull()
		{
			return !cx_CoreViewRelatedPerson.getValueIsNull(context);
		}
		public Boolean getViewRelatedPerson()
		{
			return (Boolean)cx_CoreViewRelatedPerson.getValue(context);
		}
		public void setViewRelatedPerson(Boolean value)
		{
			cx_CoreViewRelatedPerson.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreViewRelatedPerson = new ims.framework.ContextVariable("Core.ViewRelatedPerson", "_cv_Core.ViewRelatedPerson");
		public boolean getPatientRelativesIsNotNull()
		{
			return !cx_CorePatientRelatives.getValueIsNull(context);
		}
		public ims.core.vo.PatRelativeCollection getPatientRelatives()
		{
			return (ims.core.vo.PatRelativeCollection)cx_CorePatientRelatives.getValue(context);
		}
		public void setPatientRelatives(ims.core.vo.PatRelativeCollection value)
		{
			cx_CorePatientRelatives.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientRelatives = new ims.framework.ContextVariable("Core.PatientRelatives", "_cv_Core.PatientRelatives");

		private ims.framework.Context context;
	}

	public CoreContext Core;
}
