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

package ims.emergency.vo;

/**
 * Linked to emergency.Configuration.TrackingArea business object (ID: 1087100001).
 */
public class TrackingAreaVo extends ims.emergency.configuration.vo.TrackingAreaRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TrackingAreaVo()
	{
	}
	public TrackingAreaVo(Integer id, int version)
	{
		super(id, version);
	}
	public TrackingAreaVo(ims.emergency.vo.beans.TrackingAreaVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.areanamedescription = bean.getAreaNameDescription();
		this.areadisplayname = bean.getAreaDisplayName();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.isoverallview = bean.getIsOverallView();
		this.isregistrationarea = bean.getIsRegistrationArea();
		this.patientrefreshrate = bean.getPatientRefreshRate();
		this.sendtoareas = ims.emergency.vo.TrackingAreaVoCollection.buildFromBeanCollection(bean.getSendToAreas());
		this.edlocation = bean.getEDLocation() == null ? null : bean.getEDLocation().buildVo();
		this.columns = ims.emergency.vo.ColumnDetailVoCollection.buildFromBeanCollection(bean.getColumns());
		this.areatype = bean.getAreaType() == null ? null : ims.emergency.vo.lookups.AreaType.buildLookup(bean.getAreaType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.TrackingAreaVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.areanamedescription = bean.getAreaNameDescription();
		this.areadisplayname = bean.getAreaDisplayName();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.isoverallview = bean.getIsOverallView();
		this.isregistrationarea = bean.getIsRegistrationArea();
		this.patientrefreshrate = bean.getPatientRefreshRate();
		this.sendtoareas = ims.emergency.vo.TrackingAreaVoCollection.buildFromBeanCollection(bean.getSendToAreas());
		this.edlocation = bean.getEDLocation() == null ? null : bean.getEDLocation().buildVo(map);
		this.columns = ims.emergency.vo.ColumnDetailVoCollection.buildFromBeanCollection(bean.getColumns());
		this.areatype = bean.getAreaType() == null ? null : ims.emergency.vo.lookups.AreaType.buildLookup(bean.getAreaType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.TrackingAreaVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.TrackingAreaVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.TrackingAreaVoBean();
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
		if(fieldName.equals("AREANAMEDESCRIPTION"))
			return getAreaNameDescription();
		if(fieldName.equals("AREADISPLAYNAME"))
			return getAreaDisplayName();
		if(fieldName.equals("STATUS"))
			return getStatus();
		if(fieldName.equals("ISOVERALLVIEW"))
			return getIsOverallView();
		if(fieldName.equals("ISREGISTRATIONAREA"))
			return getIsRegistrationArea();
		if(fieldName.equals("PATIENTREFRESHRATE"))
			return getPatientRefreshRate();
		if(fieldName.equals("SENDTOAREAS"))
			return getSendToAreas();
		if(fieldName.equals("EDLOCATION"))
			return getEDLocation();
		if(fieldName.equals("COLUMNS"))
			return getColumns();
		if(fieldName.equals("AREATYPE"))
			return getAreaType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAreaNameDescriptionIsNotNull()
	{
		return this.areanamedescription != null;
	}
	public String getAreaNameDescription()
	{
		return this.areanamedescription;
	}
	public static int getAreaNameDescriptionMaxLength()
	{
		return 150;
	}
	public void setAreaNameDescription(String value)
	{
		this.isValidated = false;
		this.areanamedescription = value;
	}
	public boolean getAreaDisplayNameIsNotNull()
	{
		return this.areadisplayname != null;
	}
	public String getAreaDisplayName()
	{
		return this.areadisplayname;
	}
	public static int getAreaDisplayNameMaxLength()
	{
		return 15;
	}
	public void setAreaDisplayName(String value)
	{
		this.isValidated = false;
		this.areadisplayname = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getIsOverallViewIsNotNull()
	{
		return this.isoverallview != null;
	}
	public Boolean getIsOverallView()
	{
		return this.isoverallview;
	}
	public void setIsOverallView(Boolean value)
	{
		this.isValidated = false;
		this.isoverallview = value;
	}
	public boolean getIsRegistrationAreaIsNotNull()
	{
		return this.isregistrationarea != null;
	}
	public Boolean getIsRegistrationArea()
	{
		return this.isregistrationarea;
	}
	public void setIsRegistrationArea(Boolean value)
	{
		this.isValidated = false;
		this.isregistrationarea = value;
	}
	public boolean getPatientRefreshRateIsNotNull()
	{
		return this.patientrefreshrate != null;
	}
	public Integer getPatientRefreshRate()
	{
		return this.patientrefreshrate;
	}
	public void setPatientRefreshRate(Integer value)
	{
		this.isValidated = false;
		this.patientrefreshrate = value;
	}
	public boolean getSendToAreasIsNotNull()
	{
		return this.sendtoareas != null;
	}
	public ims.emergency.vo.TrackingAreaVoCollection getSendToAreas()
	{
		return this.sendtoareas;
	}
	public void setSendToAreas(ims.emergency.vo.TrackingAreaVoCollection value)
	{
		this.isValidated = false;
		this.sendtoareas = value;
	}
	public boolean getEDLocationIsNotNull()
	{
		return this.edlocation != null;
	}
	public ims.core.vo.LocationLiteVo getEDLocation()
	{
		return this.edlocation;
	}
	public void setEDLocation(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.edlocation = value;
	}
	public boolean getColumnsIsNotNull()
	{
		return this.columns != null;
	}
	public ims.emergency.vo.ColumnDetailVoCollection getColumns()
	{
		return this.columns;
	}
	public void setColumns(ims.emergency.vo.ColumnDetailVoCollection value)
	{
		this.isValidated = false;
		this.columns = value;
	}
	public boolean getAreaTypeIsNotNull()
	{
		return this.areatype != null;
	}
	public ims.emergency.vo.lookups.AreaType getAreaType()
	{
		return this.areatype;
	}
	public void setAreaType(ims.emergency.vo.lookups.AreaType value)
	{
		this.isValidated = false;
		this.areatype = value;
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
		if(this.columns != null)
		{
			if(!this.columns.isValidated())
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
		if(this.areanamedescription == null || this.areanamedescription.length() == 0)
			listOfErrors.add("AreaNameDescription is mandatory");
		else if(this.areanamedescription.length() > 150)
			listOfErrors.add("The length of the field [areanamedescription] in the value object [ims.emergency.vo.TrackingAreaVo] is too big. It should be less or equal to 150");
		if(this.areadisplayname == null || this.areadisplayname.length() == 0)
			listOfErrors.add("AreaDisplayName is mandatory");
		else if(this.areadisplayname.length() > 15)
			listOfErrors.add("The length of the field [areadisplayname] in the value object [ims.emergency.vo.TrackingAreaVo] is too big. It should be less or equal to 15");
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
		if(this.isoverallview == null)
			listOfErrors.add("isOverallView is mandatory");
		if(this.isregistrationarea == null)
			listOfErrors.add("isRegistrationArea is mandatory");
		if(this.edlocation == null)
			listOfErrors.add("EDLocation is mandatory");
		if(this.columns != null)
		{
			String[] listOfOtherErrors = this.columns.validate();
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
	
		TrackingAreaVo clone = new TrackingAreaVo(this.id, this.version);
		
		clone.areanamedescription = this.areanamedescription;
		clone.areadisplayname = this.areadisplayname;
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
		clone.isoverallview = this.isoverallview;
		clone.isregistrationarea = this.isregistrationarea;
		clone.patientrefreshrate = this.patientrefreshrate;
		if(this.sendtoareas == null)
			clone.sendtoareas = null;
		else
			clone.sendtoareas = (ims.emergency.vo.TrackingAreaVoCollection)this.sendtoareas.clone();
		if(this.edlocation == null)
			clone.edlocation = null;
		else
			clone.edlocation = (ims.core.vo.LocationLiteVo)this.edlocation.clone();
		if(this.columns == null)
			clone.columns = null;
		else
			clone.columns = (ims.emergency.vo.ColumnDetailVoCollection)this.columns.clone();
		if(this.areatype == null)
			clone.areatype = null;
		else
			clone.areatype = (ims.emergency.vo.lookups.AreaType)this.areatype.clone();
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
		if (!(TrackingAreaVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TrackingAreaVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TrackingAreaVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TrackingAreaVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.areanamedescription != null)
			count++;
		if(this.areadisplayname != null)
			count++;
		if(this.status != null)
			count++;
		if(this.isoverallview != null)
			count++;
		if(this.isregistrationarea != null)
			count++;
		if(this.patientrefreshrate != null)
			count++;
		if(this.sendtoareas != null)
			count++;
		if(this.edlocation != null)
			count++;
		if(this.columns != null)
			count++;
		if(this.areatype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected String areanamedescription;
	protected String areadisplayname;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus status;
	protected Boolean isoverallview;
	protected Boolean isregistrationarea;
	protected Integer patientrefreshrate;
	protected ims.emergency.vo.TrackingAreaVoCollection sendtoareas;
	protected ims.core.vo.LocationLiteVo edlocation;
	protected ims.emergency.vo.ColumnDetailVoCollection columns;
	protected ims.emergency.vo.lookups.AreaType areatype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}