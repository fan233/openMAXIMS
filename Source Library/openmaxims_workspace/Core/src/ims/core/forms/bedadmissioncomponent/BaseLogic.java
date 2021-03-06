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

package ims.core.forms.bedadmissioncomponent;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.BedAdmissionComponent.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.core.domain.BedAdmissionComponent domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbSourceOfEmergencyReferralValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSourceOfEmergencyReferral().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfEmergencyReferral existingInstance = (ims.core.vo.lookups.SourceOfEmergencyReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSourceOfEmergencyReferralLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceOfEmergencyReferral)
		{
			ims.core.vo.lookups.SourceOfEmergencyReferral instance = (ims.core.vo.lookups.SourceOfEmergencyReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSourceOfEmergencyReferralLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfEmergencyReferral existingInstance = (ims.core.vo.lookups.SourceOfEmergencyReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSourceOfEmergencyReferral().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSourceOfEmergencyReferralLookup()
	{
		this.form.cmbSourceOfEmergencyReferral().clear();
		ims.core.vo.lookups.SourceOfEmergencyReferralCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceOfEmergencyReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSourceOfEmergencyReferral().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSourceOfEmergencyReferralLookupValue(int id)
	{
		ims.core.vo.lookups.SourceOfEmergencyReferral instance = ims.core.vo.lookups.LookupHelper.getSourceOfEmergencyReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSourceOfEmergencyReferral().setValue(instance);
	}
	protected final void defaultcmbSourceOfEmergencyReferralLookupValue()
	{
		this.form.cmbSourceOfEmergencyReferral().setValue((ims.core.vo.lookups.SourceOfEmergencyReferral)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceOfEmergencyReferral.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceOfEmergencyReferral.TYPE_ID));
	}
	protected final void oncmbWardTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbWardType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.WardType existingInstance = (ims.core.vo.lookups.WardType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbWardTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.WardType)
		{
			ims.core.vo.lookups.WardType instance = (ims.core.vo.lookups.WardType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbWardTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.WardType existingInstance = (ims.core.vo.lookups.WardType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbWardType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbWardTypeLookup()
	{
		this.form.cmbWardType().clear();
		ims.core.vo.lookups.WardTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getWardType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbWardType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbWardTypeLookupValue(int id)
	{
		ims.core.vo.lookups.WardType instance = ims.core.vo.lookups.LookupHelper.getWardTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbWardType().setValue(instance);
	}
	protected final void defaultcmbWardTypeLookupValue()
	{
		this.form.cmbWardType().setValue((ims.core.vo.lookups.WardType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.WardType.class, engine.getFormName().getID(), ims.core.vo.lookups.WardType.TYPE_ID));
	}
	protected final void oncmbSourceValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSource().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfAdmission existingInstance = (ims.core.vo.lookups.SourceOfAdmission)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSourceLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceOfAdmission)
		{
			ims.core.vo.lookups.SourceOfAdmission instance = (ims.core.vo.lookups.SourceOfAdmission)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSourceLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfAdmission existingInstance = (ims.core.vo.lookups.SourceOfAdmission)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSource().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSourceLookup()
	{
		this.form.cmbSource().clear();
		ims.core.vo.lookups.SourceOfAdmissionCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceOfAdmission(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSource().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSourceLookupValue(int id)
	{
		ims.core.vo.lookups.SourceOfAdmission instance = ims.core.vo.lookups.LookupHelper.getSourceOfAdmissionInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSource().setValue(instance);
	}
	protected final void defaultcmbSourceLookupValue()
	{
		this.form.cmbSource().setValue((ims.core.vo.lookups.SourceOfAdmission)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceOfAdmission.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceOfAdmission.TYPE_ID));
	}
	protected final void oncmbMethodValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbMethod().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.MethodOfAdmission existingInstance = (ims.core.vo.lookups.MethodOfAdmission)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbMethodLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.MethodOfAdmission)
		{
			ims.core.vo.lookups.MethodOfAdmission instance = (ims.core.vo.lookups.MethodOfAdmission)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbMethodLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.MethodOfAdmission existingInstance = (ims.core.vo.lookups.MethodOfAdmission)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbMethod().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbMethodLookup()
	{
		this.form.cmbMethod().clear();
		ims.core.vo.lookups.MethodOfAdmissionCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getMethodOfAdmission(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbMethod().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbMethodLookupValue(int id)
	{
		ims.core.vo.lookups.MethodOfAdmission instance = ims.core.vo.lookups.LookupHelper.getMethodOfAdmissionInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbMethod().setValue(instance);
	}
	protected final void defaultcmbMethodLookupValue()
	{
		this.form.cmbMethod().setValue((ims.core.vo.lookups.MethodOfAdmission)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.MethodOfAdmission.class, engine.getFormName().getID(), ims.core.vo.lookups.MethodOfAdmission.TYPE_ID));
	}
	protected final void oncmbPatientStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbPatientStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatientStatus existingInstance = (ims.core.vo.lookups.PatientStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPatientStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PatientStatus)
		{
			ims.core.vo.lookups.PatientStatus instance = (ims.core.vo.lookups.PatientStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPatientStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatientStatus existingInstance = (ims.core.vo.lookups.PatientStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbPatientStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPatientStatusLookup()
	{
		this.form.cmbPatientStatus().clear();
		ims.core.vo.lookups.PatientStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPatientStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbPatientStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPatientStatusLookupValue(int id)
	{
		ims.core.vo.lookups.PatientStatus instance = ims.core.vo.lookups.LookupHelper.getPatientStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbPatientStatus().setValue(instance);
	}
	protected final void defaultcmbPatientStatusLookupValue()
	{
		this.form.cmbPatientStatus().setValue((ims.core.vo.lookups.PatientStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PatientStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.PatientStatus.TYPE_ID));
	}
	protected final void oncmbIdTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrAdmission().tabWaiting().cmbIdType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatIdType existingInstance = (ims.core.vo.lookups.PatIdType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbIdTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PatIdType)
		{
			ims.core.vo.lookups.PatIdType instance = (ims.core.vo.lookups.PatIdType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbIdTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatIdType existingInstance = (ims.core.vo.lookups.PatIdType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrAdmission().tabWaiting().cmbIdType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbIdTypeLookup()
	{
		this.form.lyrAdmission().tabWaiting().cmbIdType().clear();
		ims.core.vo.lookups.PatIdTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPatIdType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrAdmission().tabWaiting().cmbIdType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbIdTypeLookupValue(int id)
	{
		ims.core.vo.lookups.PatIdType instance = ims.core.vo.lookups.LookupHelper.getPatIdTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrAdmission().tabWaiting().cmbIdType().setValue(instance);
	}
	protected final void defaultcmbIdTypeLookupValue()
	{
		this.form.lyrAdmission().tabWaiting().cmbIdType().setValue((ims.core.vo.lookups.PatIdType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PatIdType.class, engine.getFormName().getID(), ims.core.vo.lookups.PatIdType.TYPE_ID));
	}
	protected final void oncmbSourceOfReferralValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSourceOfReferral().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSourceOfReferralLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceOfReferral)
		{
			ims.core.vo.lookups.SourceOfReferral instance = (ims.core.vo.lookups.SourceOfReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSourceOfReferralLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSourceOfReferral().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSourceOfReferralLookup()
	{
		this.form.cmbSourceOfReferral().clear();
		ims.core.vo.lookups.SourceOfReferralCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceOfReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSourceOfReferral().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSourceOfReferralLookupValue(int id)
	{
		ims.core.vo.lookups.SourceOfReferral instance = ims.core.vo.lookups.LookupHelper.getSourceOfReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSourceOfReferral().setValue(instance);
	}
	protected final void defaultcmbSourceOfReferralLookupValue()
	{
		this.form.cmbSourceOfReferral().setValue((ims.core.vo.lookups.SourceOfReferral)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceOfReferral.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceOfReferral.TYPE_ID));
	}
	protected void clearScreen()
	{
		this.form.cmbWardType().setValue(null);
		this.form.cmbSource().setValue(null);
		this.form.cmbMethod().setValue(null);
		this.form.cmbPatientStatus().setValue(null);
		this.form.chkSelfAdmitPatient().setValue(false);
		this.form.chkIsMaternity().setValue(false);
		this.form.txtReason().setValue("");
		this.form.txtCaseComment().setValue("");
		this.form.cmbSpecialty().setValue(null);
		this.form.dteEstDischarge().setValue(null);
		this.form.dtimAdmit().setValue(null);
		this.form.chkChaplain().setValue(false);
		this.form.cmbWard().setValue(null);
	}
	protected void populateScreenFromData(ims.core.vo.AdmissionDetailVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.cmbWardType().setValue(value.getWardTypeIsNotNull() ? value.getWardType() : null);
		this.form.cmbSource().setValue(value.getSourceOfAdmissionIsNotNull() ? value.getSourceOfAdmission() : null);
		this.form.cmbMethod().setValue(value.getMethodOfAdmissionIsNotNull() ? value.getMethodOfAdmission() : null);
		this.form.cmbPatientStatus().setValue(value.getPatientStatusIsNotNull() ? value.getPatientStatus() : null);
		if(value.getSelfAdmitPatientIsNotNull())
			this.form.chkSelfAdmitPatient().setValue(value.getSelfAdmitPatient().booleanValue());
		if(value.getIsMaternityIsNotNull())
			this.form.chkIsMaternity().setValue(value.getIsMaternity().booleanValue());
		this.form.txtReason().setValue(value.getReasonForAdmissionIsNotNull() ? value.getReasonForAdmission(): null);
		this.form.txtCaseComment().setValue(value.getCaseFolderCommentsIsNotNull() ? value.getCaseFolderComments(): null);
		this.form.cmbSpecialty().setValue(value.getSpecialtyIsNotNull() ? value.getSpecialty() : null);
		if(value.getEstDischargeDateIsNotNull())
			this.form.dteEstDischarge().setValue(value.getEstDischargeDate().getDate());
		else
			this.form.dteEstDischarge().setValue(null);
		this.form.dtimAdmit().setValue(value.getAdmissionDateTimeIsNotNull() ? value.getAdmissionDateTime() : null);
		if(value.getIsChaplainRequiredIsNotNull())
			this.form.chkChaplain().setValue(value.getIsChaplainRequired().booleanValue());
		this.form.cmbWard().setValue(value.getWardIsNotNull() ? value.getWard() : null);
	}
	protected ims.core.vo.AdmissionDetailVo populateDataFromScreen(ims.core.vo.AdmissionDetailVo value)
	{
		if(value == null)
			value = new ims.core.vo.AdmissionDetailVo();

		value.setWardType(this.form.cmbWardType().getValue());
		value.setSourceOfAdmission(this.form.cmbSource().getValue());
		value.setMethodOfAdmission(this.form.cmbMethod().getValue());
		value.setPatientStatus(this.form.cmbPatientStatus().getValue());
		value.setSelfAdmitPatient(new Boolean(this.form.chkSelfAdmitPatient().getValue()));
		value.setIsMaternity(new Boolean(this.form.chkIsMaternity().getValue()));
		value.setReasonForAdmission(this.form.txtReason().getValue());
		value.setCaseFolderComments(this.form.txtCaseComment().getValue());
		value.setSpecialty(this.form.cmbSpecialty().getValue());
		if(value.getEstDischargeDateIsNotNull())
			value.setEstDischargeDate((this.form.dteEstDischarge().getValue() == null && value.getEstDischargeDate().getTime() == null) ? null : new ims.framework.utils.DateTime(this.form.dteEstDischarge().getValue(), value.getEstDischargeDate().getTime()));
		else
			value.setEstDischargeDate(this.form.dteEstDischarge().getValue() == null ? null : new ims.framework.utils.DateTime(this.form.dteEstDischarge().getValue(), null));
		value.setAdmissionDateTime(this.form.dtimAdmit().getValue());
		value.setIsChaplainRequired(new Boolean(this.form.chkChaplain().getValue()));
		value.setWard(this.form.cmbWard().getValue());

		return value;
	}
	protected ims.core.vo.AdmissionDetailVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.core.vo.AdmissionDetailVo());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.BedAdmissionComponent domain;
}
