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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.OrderInvestigation business object (ID: 1070100002).
 */
public class NewResultSpecDocVo extends ims.ocrr.orderingresults.vo.OrderInvestigationRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public NewResultSpecDocVo()
	{
	}
	public NewResultSpecDocVo(Integer id, int version)
	{
		super(id, version);
	}
	public NewResultSpecDocVo(ims.ocrr.vo.beans.NewResultSpecDocVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specimen = ims.ocrr.vo.PathologySpecimenVoCollection.buildFromBeanCollection(bean.getSpecimen());
		this.ordinvcurrentstatus = bean.getOrdInvCurrentStatus() == null ? null : bean.getOrdInvCurrentStatus().buildVo();
		this.investigation = bean.getInvestigation() == null ? null : bean.getInvestigation().buildVo();
		this.allocatedhcpforreview = bean.getAllocatedHCPforReview() == null ? null : bean.getAllocatedHCPforReview().buildVo();
		this.resultdetails = bean.getResultDetails() == null ? null : bean.getResultDetails().buildVo();
		this.resultstatus = bean.getResultStatus() == null ? null : ims.ocrr.vo.lookups.ResultStatus.buildLookup(bean.getResultStatus());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.NewResultSpecDocVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specimen = ims.ocrr.vo.PathologySpecimenVoCollection.buildFromBeanCollection(bean.getSpecimen());
		this.ordinvcurrentstatus = bean.getOrdInvCurrentStatus() == null ? null : bean.getOrdInvCurrentStatus().buildVo(map);
		this.investigation = bean.getInvestigation() == null ? null : bean.getInvestigation().buildVo(map);
		this.allocatedhcpforreview = bean.getAllocatedHCPforReview() == null ? null : bean.getAllocatedHCPforReview().buildVo(map);
		this.resultdetails = bean.getResultDetails() == null ? null : bean.getResultDetails().buildVo(map);
		this.resultstatus = bean.getResultStatus() == null ? null : ims.ocrr.vo.lookups.ResultStatus.buildLookup(bean.getResultStatus());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.NewResultSpecDocVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.NewResultSpecDocVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.NewResultSpecDocVoBean();
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
		if(fieldName.equals("SPECIMEN"))
			return getSpecimen();
		if(fieldName.equals("ORDINVCURRENTSTATUS"))
			return getOrdInvCurrentStatus();
		if(fieldName.equals("INVESTIGATION"))
			return getInvestigation();
		if(fieldName.equals("ALLOCATEDHCPFORREVIEW"))
			return getAllocatedHCPforReview();
		if(fieldName.equals("RESULTDETAILS"))
			return getResultDetails();
		if(fieldName.equals("RESULTSTATUS"))
			return getResultStatus();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSpecimenIsNotNull()
	{
		return this.specimen != null;
	}
	public ims.ocrr.vo.PathologySpecimenVoCollection getSpecimen()
	{
		return this.specimen;
	}
	public void setSpecimen(ims.ocrr.vo.PathologySpecimenVoCollection value)
	{
		this.isValidated = false;
		this.specimen = value;
	}
	public boolean getOrdInvCurrentStatusIsNotNull()
	{
		return this.ordinvcurrentstatus != null;
	}
	public ims.ocrr.vo.OrderedInvestigationStatusVo getOrdInvCurrentStatus()
	{
		return this.ordinvcurrentstatus;
	}
	public void setOrdInvCurrentStatus(ims.ocrr.vo.OrderedInvestigationStatusVo value)
	{
		this.isValidated = false;
		this.ordinvcurrentstatus = value;
	}
	public boolean getInvestigationIsNotNull()
	{
		return this.investigation != null;
	}
	public ims.ocrr.vo.InvestigationListVo getInvestigation()
	{
		return this.investigation;
	}
	public void setInvestigation(ims.ocrr.vo.InvestigationListVo value)
	{
		this.isValidated = false;
		this.investigation = value;
	}
	public boolean getAllocatedHCPforReviewIsNotNull()
	{
		return this.allocatedhcpforreview != null;
	}
	public ims.core.vo.HcpLiteVo getAllocatedHCPforReview()
	{
		return this.allocatedhcpforreview;
	}
	public void setAllocatedHCPforReview(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.allocatedhcpforreview = value;
	}
	public boolean getResultDetailsIsNotNull()
	{
		return this.resultdetails != null;
	}
	public ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo getResultDetails()
	{
		return this.resultdetails;
	}
	public void setResultDetails(ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo value)
	{
		this.isValidated = false;
		this.resultdetails = value;
	}
	public boolean getResultStatusIsNotNull()
	{
		return this.resultstatus != null;
	}
	public ims.ocrr.vo.lookups.ResultStatus getResultStatus()
	{
		return this.resultstatus;
	}
	public void setResultStatus(ims.ocrr.vo.lookups.ResultStatus value)
	{
		this.isValidated = false;
		this.resultstatus = value;
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
		if(this.specimen != null)
		{
			if(!this.specimen.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.ordinvcurrentstatus != null)
		{
			if(!this.ordinvcurrentstatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.resultdetails != null)
		{
			if(!this.resultdetails.isValidated())
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
		if(this.specimen != null)
		{
			String[] listOfOtherErrors = this.specimen.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.ordinvcurrentstatus == null)
			listOfErrors.add("OrdInvCurrentStatus is mandatory");
		if(this.ordinvcurrentstatus != null)
		{
			String[] listOfOtherErrors = this.ordinvcurrentstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.investigation == null)
			listOfErrors.add("Investigation is mandatory");
		if(this.resultdetails != null)
		{
			String[] listOfOtherErrors = this.resultdetails.validate();
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
	
		NewResultSpecDocVo clone = new NewResultSpecDocVo(this.id, this.version);
		
		if(this.specimen == null)
			clone.specimen = null;
		else
			clone.specimen = (ims.ocrr.vo.PathologySpecimenVoCollection)this.specimen.clone();
		if(this.ordinvcurrentstatus == null)
			clone.ordinvcurrentstatus = null;
		else
			clone.ordinvcurrentstatus = (ims.ocrr.vo.OrderedInvestigationStatusVo)this.ordinvcurrentstatus.clone();
		if(this.investigation == null)
			clone.investigation = null;
		else
			clone.investigation = (ims.ocrr.vo.InvestigationListVo)this.investigation.clone();
		if(this.allocatedhcpforreview == null)
			clone.allocatedhcpforreview = null;
		else
			clone.allocatedhcpforreview = (ims.core.vo.HcpLiteVo)this.allocatedhcpforreview.clone();
		if(this.resultdetails == null)
			clone.resultdetails = null;
		else
			clone.resultdetails = (ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo)this.resultdetails.clone();
		if(this.resultstatus == null)
			clone.resultstatus = null;
		else
			clone.resultstatus = (ims.ocrr.vo.lookups.ResultStatus)this.resultstatus.clone();
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
		if (!(NewResultSpecDocVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A NewResultSpecDocVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((NewResultSpecDocVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((NewResultSpecDocVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.specimen != null)
			count++;
		if(this.ordinvcurrentstatus != null)
			count++;
		if(this.investigation != null)
			count++;
		if(this.allocatedhcpforreview != null)
			count++;
		if(this.resultdetails != null)
			count++;
		if(this.resultstatus != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.ocrr.vo.PathologySpecimenVoCollection specimen;
	protected ims.ocrr.vo.OrderedInvestigationStatusVo ordinvcurrentstatus;
	protected ims.ocrr.vo.InvestigationListVo investigation;
	protected ims.core.vo.HcpLiteVo allocatedhcpforreview;
	protected ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo resultdetails;
	protected ims.ocrr.vo.lookups.ResultStatus resultstatus;
	private boolean isValidated = false;
	private boolean isBusy = false;
}