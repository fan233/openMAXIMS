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

package ims.icp.vo;

/**
 * Linked to ICPs.Instantiation.PatientICP business object (ID: 1100100000).
 */
public class PatientICP_CriticalEventsVo extends ims.icps.instantiation.vo.PatientICPRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientICP_CriticalEventsVo()
	{
	}
	public PatientICP_CriticalEventsVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientICP_CriticalEventsVo(ims.icp.vo.beans.PatientICP_CriticalEventsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.criticalevents = ims.icp.vo.PatientCriticalEventsVoCollection.buildFromBeanCollection(bean.getCriticalEvents());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.icp.vo.beans.PatientICP_CriticalEventsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.criticalevents = ims.icp.vo.PatientCriticalEventsVoCollection.buildFromBeanCollection(bean.getCriticalEvents());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.icp.vo.beans.PatientICP_CriticalEventsVoBean bean = null;
		if(map != null)
			bean = (ims.icp.vo.beans.PatientICP_CriticalEventsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.icp.vo.beans.PatientICP_CriticalEventsVoBean();
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
		if(fieldName.equals("CRITICALEVENTS"))
			return getCriticalEvents();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCriticalEventsIsNotNull()
	{
		return this.criticalevents != null;
	}
	public ims.icp.vo.PatientCriticalEventsVoCollection getCriticalEvents()
	{
		return this.criticalevents;
	}
	public void setCriticalEvents(ims.icp.vo.PatientCriticalEventsVoCollection value)
	{
		this.isValidated = false;
		this.criticalevents = value;
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
		if(this.criticalevents != null)
		{
			if(!this.criticalevents.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.criticalevents != null)
		{
			String[] listOfOtherErrors = this.criticalevents.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		PatientICP_CriticalEventsVo clone = new PatientICP_CriticalEventsVo(this.id, this.version);
		
		if(this.criticalevents == null)
			clone.criticalevents = null;
		else
			clone.criticalevents = (ims.icp.vo.PatientCriticalEventsVoCollection)this.criticalevents.clone();
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
		if (!(PatientICP_CriticalEventsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientICP_CriticalEventsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientICP_CriticalEventsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientICP_CriticalEventsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.criticalevents != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 1;
	}
	protected ims.icp.vo.PatientCriticalEventsVoCollection criticalevents;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
