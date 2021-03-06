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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.ClinicalResultDetail business object (ID: 1070100009).
 */
public class ClinicalResultDetailsLightVo extends ims.ocrr.orderingresults.vo.ClinicalResultDetailRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClinicalResultDetailsLightVo()
	{
	}
	public ClinicalResultDetailsLightVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClinicalResultDetailsLightVo(ims.ocrr.vo.beans.ClinicalResultDetailsLightVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.examdatetime = bean.getExamDateTime() == null ? null : bean.getExamDateTime().buildDateTime();
		this.examtimesupplied = bean.getExamTimeSupplied();
		this.reporttext = bean.getReportText();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.ClinicalResultDetailsLightVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.examdatetime = bean.getExamDateTime() == null ? null : bean.getExamDateTime().buildDateTime();
		this.examtimesupplied = bean.getExamTimeSupplied();
		this.reporttext = bean.getReportText();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.ClinicalResultDetailsLightVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.ClinicalResultDetailsLightVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.ClinicalResultDetailsLightVoBean();
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
		if(fieldName.equals("EXAMDATETIME"))
			return getExamDateTime();
		if(fieldName.equals("EXAMTIMESUPPLIED"))
			return getExamTimeSupplied();
		if(fieldName.equals("REPORTTEXT"))
			return getReportText();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getExamDateTimeIsNotNull()
	{
		return this.examdatetime != null;
	}
	public ims.framework.utils.DateTime getExamDateTime()
	{
		return this.examdatetime;
	}
	public void setExamDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.examdatetime = value;
	}
	public boolean getExamTimeSuppliedIsNotNull()
	{
		return this.examtimesupplied != null;
	}
	public Boolean getExamTimeSupplied()
	{
		return this.examtimesupplied;
	}
	public void setExamTimeSupplied(Boolean value)
	{
		this.isValidated = false;
		this.examtimesupplied = value;
	}
	public boolean getReportTextIsNotNull()
	{
		return this.reporttext != null;
	}
	public String getReportText()
	{
		return this.reporttext;
	}
	public static int getReportTextMaxLength()
	{
		return 64000;
	}
	public void setReportText(String value)
	{
		this.isValidated = false;
		this.reporttext = value;
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
		if(this.examdatetime == null)
			listOfErrors.add("ExamDateTime is mandatory");
		if(this.examtimesupplied == null)
			listOfErrors.add("ExamTimeSupplied is mandatory");
		if(this.reporttext == null || this.reporttext.length() == 0)
			listOfErrors.add("ReportText is mandatory");
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
	
		ClinicalResultDetailsLightVo clone = new ClinicalResultDetailsLightVo(this.id, this.version);
		
		if(this.examdatetime == null)
			clone.examdatetime = null;
		else
			clone.examdatetime = (ims.framework.utils.DateTime)this.examdatetime.clone();
		clone.examtimesupplied = this.examtimesupplied;
		clone.reporttext = this.reporttext;
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
		if (!(ClinicalResultDetailsLightVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClinicalResultDetailsLightVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ClinicalResultDetailsLightVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ClinicalResultDetailsLightVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.examdatetime != null)
			count++;
		if(this.examtimesupplied != null)
			count++;
		if(this.reporttext != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.framework.utils.DateTime examdatetime;
	protected Boolean examtimesupplied;
	protected String reporttext;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
