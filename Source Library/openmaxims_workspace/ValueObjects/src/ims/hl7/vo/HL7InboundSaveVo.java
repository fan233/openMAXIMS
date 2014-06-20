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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.hl7.vo;

/**
 * Linked to hl7.HL7Inbound business object (ID: 1106100000).
 */
public class HL7InboundSaveVo extends ims.hl7.vo.HL7InboundRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public HL7InboundSaveVo()
	{
	}
	public HL7InboundSaveVo(Integer id, int version)
	{
		super(id, version);
	}
	public HL7InboundSaveVo(ims.hl7.vo.beans.HL7InboundSaveVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hl7message = bean.getHL7Message();
		this.failuremessage = bean.getFailureMessage();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.providersystem = bean.getProviderSystem() == null ? null : new ims.core.admin.vo.ProviderSystemRefVo(new Integer(bean.getProviderSystem().getId()), bean.getProviderSystem().getVersion());
		this.messagetype = bean.getMessageType() == null ? null : ims.hl7.vo.lookups.MessageType.buildLookup(bean.getMessageType());
		this.messagecategory = bean.getMessageCategory() == null ? null : ims.hl7.vo.lookups.MessageType.buildLookup(bean.getMessageCategory());
		this.messagedatetime = bean.getMessageDateTime() == null ? null : bean.getMessageDateTime().buildDateTime();
		this.successfuloutcome = bean.getSuccessfulOutcome();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.hl7.vo.beans.HL7InboundSaveVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hl7message = bean.getHL7Message();
		this.failuremessage = bean.getFailureMessage();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.providersystem = bean.getProviderSystem() == null ? null : new ims.core.admin.vo.ProviderSystemRefVo(new Integer(bean.getProviderSystem().getId()), bean.getProviderSystem().getVersion());
		this.messagetype = bean.getMessageType() == null ? null : ims.hl7.vo.lookups.MessageType.buildLookup(bean.getMessageType());
		this.messagecategory = bean.getMessageCategory() == null ? null : ims.hl7.vo.lookups.MessageType.buildLookup(bean.getMessageCategory());
		this.messagedatetime = bean.getMessageDateTime() == null ? null : bean.getMessageDateTime().buildDateTime();
		this.successfuloutcome = bean.getSuccessfulOutcome();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.hl7.vo.beans.HL7InboundSaveVoBean bean = null;
		if(map != null)
			bean = (ims.hl7.vo.beans.HL7InboundSaveVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.hl7.vo.beans.HL7InboundSaveVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("HL7MESSAGE"))
			return getHL7Message();
		if(fieldName.equals("FAILUREMESSAGE"))
			return getFailureMessage();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("PROVIDERSYSTEM"))
			return getProviderSystem();
		if(fieldName.equals("MESSAGETYPE"))
			return getMessageType();
		if(fieldName.equals("MESSAGECATEGORY"))
			return getMessageCategory();
		if(fieldName.equals("MESSAGEDATETIME"))
			return getMessageDateTime();
		if(fieldName.equals("SUCCESSFULOUTCOME"))
			return getSuccessfulOutcome();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getHL7MessageIsNotNull()
	{
		return this.hl7message != null;
	}
	public String getHL7Message()
	{
		return this.hl7message;
	}
	public static int getHL7MessageMaxLength()
	{
		return 10000;
	}
	public void setHL7Message(String value)
	{
		this.isValidated = false;
		this.hl7message = value;
	}
	public boolean getFailureMessageIsNotNull()
	{
		return this.failuremessage != null;
	}
	public String getFailureMessage()
	{
		return this.failuremessage;
	}
	public static int getFailureMessageMaxLength()
	{
		return 1000;
	}
	public void setFailureMessage(String value)
	{
		this.isValidated = false;
		this.failuremessage = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getProviderSystemIsNotNull()
	{
		return this.providersystem != null;
	}
	public ims.core.admin.vo.ProviderSystemRefVo getProviderSystem()
	{
		return this.providersystem;
	}
	public void setProviderSystem(ims.core.admin.vo.ProviderSystemRefVo value)
	{
		this.isValidated = false;
		this.providersystem = value;
	}
	public boolean getMessageTypeIsNotNull()
	{
		return this.messagetype != null;
	}
	public ims.hl7.vo.lookups.MessageType getMessageType()
	{
		return this.messagetype;
	}
	public void setMessageType(ims.hl7.vo.lookups.MessageType value)
	{
		this.isValidated = false;
		this.messagetype = value;
	}
	public boolean getMessageCategoryIsNotNull()
	{
		return this.messagecategory != null;
	}
	public ims.hl7.vo.lookups.MessageType getMessageCategory()
	{
		return this.messagecategory;
	}
	public void setMessageCategory(ims.hl7.vo.lookups.MessageType value)
	{
		this.isValidated = false;
		this.messagecategory = value;
	}
	public boolean getMessageDateTimeIsNotNull()
	{
		return this.messagedatetime != null;
	}
	public ims.framework.utils.DateTime getMessageDateTime()
	{
		return this.messagedatetime;
	}
	public void setMessageDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.messagedatetime = value;
	}
	public boolean getSuccessfulOutcomeIsNotNull()
	{
		return this.successfuloutcome != null;
	}
	public Boolean getSuccessfulOutcome()
	{
		return this.successfuloutcome;
	}
	public void setSuccessfulOutcome(Boolean value)
	{
		this.isValidated = false;
		this.successfuloutcome = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.failuremessage != null)
			if(this.failuremessage.length() > 1000)
				listOfErrors.add("The length of the field [failuremessage] in the value object [ims.hl7.vo.HL7InboundSaveVo] is too big. It should be less or equal to 1000");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		HL7InboundSaveVo clone = new HL7InboundSaveVo(this.id, this.version);
		
		clone.hl7message = this.hl7message;
		clone.failuremessage = this.failuremessage;
		clone.patient = this.patient;
		clone.providersystem = this.providersystem;
		if(this.messagetype == null)
			clone.messagetype = null;
		else
			clone.messagetype = (ims.hl7.vo.lookups.MessageType)this.messagetype.clone();
		if(this.messagecategory == null)
			clone.messagecategory = null;
		else
			clone.messagecategory = (ims.hl7.vo.lookups.MessageType)this.messagecategory.clone();
		if(this.messagedatetime == null)
			clone.messagedatetime = null;
		else
			clone.messagedatetime = (ims.framework.utils.DateTime)this.messagedatetime.clone();
		clone.successfuloutcome = this.successfuloutcome;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(HL7InboundSaveVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A HL7InboundSaveVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((HL7InboundSaveVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((HL7InboundSaveVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.hl7message != null)
			count++;
		if(this.failuremessage != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.providersystem != null)
			count++;
		if(this.messagetype != null)
			count++;
		if(this.messagecategory != null)
			count++;
		if(this.messagedatetime != null)
			count++;
		if(this.successfuloutcome != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected String hl7message;
	protected String failuremessage;
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.core.admin.vo.ProviderSystemRefVo providersystem;
	protected ims.hl7.vo.lookups.MessageType messagetype;
	protected ims.hl7.vo.lookups.MessageType messagecategory;
	protected ims.framework.utils.DateTime messagedatetime;
	protected Boolean successfuloutcome;
	private boolean isValidated = false;
	private boolean isBusy = false;
}