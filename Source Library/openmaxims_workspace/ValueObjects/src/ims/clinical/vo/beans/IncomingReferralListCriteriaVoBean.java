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

public class IncomingReferralListCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public IncomingReferralListCriteriaVoBean()
	{
	}
	public IncomingReferralListCriteriaVoBean(ims.clinical.vo.IncomingReferralListCriteriaVo vo)
	{
		this.awaitingacceptance = vo.getAwaitingAcceptance();
		this.requires2ndopinion = vo.getRequires2ndOpinion();
		this.requiringappointment = vo.getRequiringAppointment();
		this.appointmentbooked = vo.getAppointmentBooked();
		this.rejected = vo.getRejected();
		this.completed = vo.getCompleted();
		this.referraltoservice = vo.getReferralToService() == null ? null : (ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean)vo.getReferralToService().getBean();
		this.referraltohcp = vo.getReferralToHcp() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getReferralToHcp().getBean();
		this.referraldatefrom = vo.getReferralDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDateFrom().getBean();
		this.referraldateto = vo.getReferralDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDateTo().getBean();
		this.inpatient = vo.getInpatient();
		this.outpatient = vo.getOutpatient();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean();
		this.services = vo.getServices() == null ? null : vo.getServices().getBeanCollection();
		this.accepted = vo.getAccepted();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.IncomingReferralListCriteriaVo vo)
	{
		this.awaitingacceptance = vo.getAwaitingAcceptance();
		this.requires2ndopinion = vo.getRequires2ndOpinion();
		this.requiringappointment = vo.getRequiringAppointment();
		this.appointmentbooked = vo.getAppointmentBooked();
		this.rejected = vo.getRejected();
		this.completed = vo.getCompleted();
		this.referraltoservice = vo.getReferralToService() == null ? null : (ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean)vo.getReferralToService().getBean(map);
		this.referraltohcp = vo.getReferralToHcp() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getReferralToHcp().getBean(map);
		this.referraldatefrom = vo.getReferralDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDateFrom().getBean();
		this.referraldateto = vo.getReferralDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDateTo().getBean();
		this.inpatient = vo.getInpatient();
		this.outpatient = vo.getOutpatient();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean(map);
		this.services = vo.getServices() == null ? null : vo.getServices().getBeanCollection();
		this.accepted = vo.getAccepted();
	}

	public ims.clinical.vo.IncomingReferralListCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.IncomingReferralListCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.IncomingReferralListCriteriaVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.IncomingReferralListCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.IncomingReferralListCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Boolean getAwaitingAcceptance()
	{
		return this.awaitingacceptance;
	}
	public void setAwaitingAcceptance(Boolean value)
	{
		this.awaitingacceptance = value;
	}
	public Boolean getRequires2ndOpinion()
	{
		return this.requires2ndopinion;
	}
	public void setRequires2ndOpinion(Boolean value)
	{
		this.requires2ndopinion = value;
	}
	public Boolean getRequiringAppointment()
	{
		return this.requiringappointment;
	}
	public void setRequiringAppointment(Boolean value)
	{
		this.requiringappointment = value;
	}
	public Boolean getAppointmentBooked()
	{
		return this.appointmentbooked;
	}
	public void setAppointmentBooked(Boolean value)
	{
		this.appointmentbooked = value;
	}
	public Boolean getRejected()
	{
		return this.rejected;
	}
	public void setRejected(Boolean value)
	{
		this.rejected = value;
	}
	public Boolean getCompleted()
	{
		return this.completed;
	}
	public void setCompleted(Boolean value)
	{
		this.completed = value;
	}
	public ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean getReferralToService()
	{
		return this.referraltoservice;
	}
	public void setReferralToService(ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean value)
	{
		this.referraltoservice = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getReferralToHcp()
	{
		return this.referraltohcp;
	}
	public void setReferralToHcp(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.referraltohcp = value;
	}
	public ims.framework.utils.beans.DateBean getReferralDateFrom()
	{
		return this.referraldatefrom;
	}
	public void setReferralDateFrom(ims.framework.utils.beans.DateBean value)
	{
		this.referraldatefrom = value;
	}
	public ims.framework.utils.beans.DateBean getReferralDateTo()
	{
		return this.referraldateto;
	}
	public void setReferralDateTo(ims.framework.utils.beans.DateBean value)
	{
		this.referraldateto = value;
	}
	public Boolean getInpatient()
	{
		return this.inpatient;
	}
	public void setInpatient(Boolean value)
	{
		this.inpatient = value;
	}
	public Boolean getOutpatient()
	{
		return this.outpatient;
	}
	public void setOutpatient(Boolean value)
	{
		this.outpatient = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.ward = value;
	}
	public ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean[] getServices()
	{
		return this.services;
	}
	public void setServices(ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean[] value)
	{
		this.services = value;
	}
	public Boolean getAccepted()
	{
		return this.accepted;
	}
	public void setAccepted(Boolean value)
	{
		this.accepted = value;
	}

	private Boolean awaitingacceptance;
	private Boolean requires2ndopinion;
	private Boolean requiringappointment;
	private Boolean appointmentbooked;
	private Boolean rejected;
	private Boolean completed;
	private ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean referraltoservice;
	private ims.core.vo.beans.HcpLiteVoBean referraltohcp;
	private ims.framework.utils.beans.DateBean referraldatefrom;
	private ims.framework.utils.beans.DateBean referraldateto;
	private Boolean inpatient;
	private Boolean outpatient;
	private ims.core.vo.beans.LocationLiteVoBean ward;
	private ims.clinical.vo.beans.ServiceConfigIntReferralForIncomingListVoBean[] services;
	private Boolean accepted;
}
