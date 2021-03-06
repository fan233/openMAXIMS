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

package ims.clinical.vo.beans;

public class ClinicalReferralStatusLiteVoBean extends ims.vo.ValueObjectBean
{
	public ClinicalReferralStatusLiteVoBean()
	{
	}
	public ClinicalReferralStatusLiteVoBean(ims.clinical.vo.ClinicalReferralStatusLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.referralstatus = vo.getReferralStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralStatus().getBean();
		this.recordinginfo = vo.getRecordingInfo() == null ? null : (ims.core.vo.beans.RecordingUserInformationVoBean)vo.getRecordingInfo().getBean();
		this.internalreferralstatuschangereason = vo.getInternalReferralStatusChangeReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getInternalReferralStatusChangeReason().getBean();
		this.appointmentrequired = vo.getAppointmentRequired();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.ClinicalReferralStatusLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.referralstatus = vo.getReferralStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralStatus().getBean();
		this.recordinginfo = vo.getRecordingInfo() == null ? null : (ims.core.vo.beans.RecordingUserInformationVoBean)vo.getRecordingInfo().getBean(map);
		this.internalreferralstatuschangereason = vo.getInternalReferralStatusChangeReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getInternalReferralStatusChangeReason().getBean();
		this.appointmentrequired = vo.getAppointmentRequired();
	}

	public ims.clinical.vo.ClinicalReferralStatusLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.ClinicalReferralStatusLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.ClinicalReferralStatusLiteVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.ClinicalReferralStatusLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.ClinicalReferralStatusLiteVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.LookupInstanceBean getReferralStatus()
	{
		return this.referralstatus;
	}
	public void setReferralStatus(ims.vo.LookupInstanceBean value)
	{
		this.referralstatus = value;
	}
	public ims.core.vo.beans.RecordingUserInformationVoBean getRecordingInfo()
	{
		return this.recordinginfo;
	}
	public void setRecordingInfo(ims.core.vo.beans.RecordingUserInformationVoBean value)
	{
		this.recordinginfo = value;
	}
	public ims.vo.LookupInstanceBean getInternalReferralStatusChangeReason()
	{
		return this.internalreferralstatuschangereason;
	}
	public void setInternalReferralStatusChangeReason(ims.vo.LookupInstanceBean value)
	{
		this.internalreferralstatuschangereason = value;
	}
	public Boolean getAppointmentRequired()
	{
		return this.appointmentrequired;
	}
	public void setAppointmentRequired(Boolean value)
	{
		this.appointmentrequired = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean referralstatus;
	private ims.core.vo.beans.RecordingUserInformationVoBean recordinginfo;
	private ims.vo.LookupInstanceBean internalreferralstatuschangereason;
	private Boolean appointmentrequired;
}
