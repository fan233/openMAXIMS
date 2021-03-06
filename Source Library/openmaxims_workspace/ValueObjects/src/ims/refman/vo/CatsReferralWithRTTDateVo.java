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

package ims.RefMan.vo;

/**
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralWithRTTDateVo extends ims.RefMan.vo.CatsReferralRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CatsReferralWithRTTDateVo()
	{
	}
	public CatsReferralWithRTTDateVo(Integer id, int version)
	{
		super(id, version);
	}
	public CatsReferralWithRTTDateVo(ims.RefMan.vo.beans.CatsReferralWithRTTDateVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo();
		this.cancertype = bean.getCancerType() == null ? null : ims.RefMan.vo.lookups.CancerType.buildLookup(bean.getCancerType());
		this.urgency = bean.getUrgency() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getUrgency());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.CatsReferralWithRTTDateVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo(map);
		this.cancertype = bean.getCancerType() == null ? null : ims.RefMan.vo.lookups.CancerType.buildLookup(bean.getCancerType());
		this.urgency = bean.getUrgency() == null ? null : ims.RefMan.vo.lookups.ReferralUrgency.buildLookup(bean.getUrgency());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.CatsReferralWithRTTDateVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.CatsReferralWithRTTDateVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.CatsReferralWithRTTDateVoBean();
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
		if(fieldName.equals("REFERRALDETAILS"))
			return getReferralDetails();
		if(fieldName.equals("CANCERTYPE"))
			return getCancerType();
		if(fieldName.equals("URGENCY"))
			return getUrgency();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getReferralDetailsIsNotNull()
	{
		return this.referraldetails != null;
	}
	public ims.RefMan.vo.ReferralLetterLiteVo getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.RefMan.vo.ReferralLetterLiteVo value)
	{
		this.isValidated = false;
		this.referraldetails = value;
	}
	public boolean getCancerTypeIsNotNull()
	{
		return this.cancertype != null;
	}
	public ims.RefMan.vo.lookups.CancerType getCancerType()
	{
		return this.cancertype;
	}
	public void setCancerType(ims.RefMan.vo.lookups.CancerType value)
	{
		this.isValidated = false;
		this.cancertype = value;
	}
	public boolean getUrgencyIsNotNull()
	{
		return this.urgency != null;
	}
	public ims.RefMan.vo.lookups.ReferralUrgency getUrgency()
	{
		return this.urgency;
	}
	public void setUrgency(ims.RefMan.vo.lookups.ReferralUrgency value)
	{
		this.isValidated = false;
		this.urgency = value;
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
	
		CatsReferralWithRTTDateVo clone = new CatsReferralWithRTTDateVo(this.id, this.version);
		
		if(this.referraldetails == null)
			clone.referraldetails = null;
		else
			clone.referraldetails = (ims.RefMan.vo.ReferralLetterLiteVo)this.referraldetails.clone();
		if(this.cancertype == null)
			clone.cancertype = null;
		else
			clone.cancertype = (ims.RefMan.vo.lookups.CancerType)this.cancertype.clone();
		if(this.urgency == null)
			clone.urgency = null;
		else
			clone.urgency = (ims.RefMan.vo.lookups.ReferralUrgency)this.urgency.clone();
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
		if (!(CatsReferralWithRTTDateVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CatsReferralWithRTTDateVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CatsReferralWithRTTDateVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CatsReferralWithRTTDateVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.referraldetails != null)
			count++;
		if(this.cancertype != null)
			count++;
		if(this.urgency != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.RefMan.vo.ReferralLetterLiteVo referraldetails;
	protected ims.RefMan.vo.lookups.CancerType cancertype;
	protected ims.RefMan.vo.lookups.ReferralUrgency urgency;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
