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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.71 build 3876.28032)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.admin.domain.ClinicAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.impl.ClinicAdminImpl;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.core.domain.base.impl.BasePASOutPatientAppointmentListImpl;
import ims.core.vo.domain.OutPatientAttendanceVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;

import java.util.ArrayList;
import java.util.List;

public class PASOutPatientAppointmentListImpl extends BasePASOutPatientAppointmentListImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.OutPatientAttendanceVoCollection listOutpatients(ims.core.vo.OutPatientListSearchCriteriaVo filter, Boolean listByReqAndNotReqStatus)
	{
		DomainFactory factory = getDomainFactory();
		String hql;
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
		
		hql = " from OutpatientAttendance op "; 
		StringBuffer condStr = new StringBuffer();
		String andStr = " and ";
		
		condStr.append(" op.isActive = :isActive");
		markers.add("isActive");
		values.add(Boolean.TRUE);
	
		if (filter.getClinic() != null)
		{
			condStr.append(andStr + " op.clinic.id = :clinic");
			markers.add("clinic");
			values.add(filter.getClinic().getID_Clinic());
		}
		if(filter.getDateFromIsNotNull())
		{
			condStr.append(andStr + " op.appointmentDateTime >= :dateFrom");
 			markers.add("dateFrom");
			values.add(filter.getDateFrom().getDate());
			andStr = " and ";	
		}
		if(filter.getDateToIsNotNull())
		{
			condStr.append(andStr + " op.appointmentDateTime < :dateTo");
 			markers.add("dateTo");
			values.add(filter.getDateTo().copy().addDay(1).getDate());
			andStr = " and ";	
		}

		hql += " where ";
		
		hql += condStr.toString();
		List ops = factory.find(hql, markers, values);
		
		return OutPatientAttendanceVoAssembler.createOutPatientAttendanceVoCollectionFromOutpatientAttendance(ops).sort();
	}

	public ims.core.vo.LocationLiteVoCollection listActiveLocations()
	{
		OrganisationAndLocation orgLoc = (OrganisationAndLocation)getDomainImpl(OrganisationAndLocationImpl.class);
		return orgLoc.listActiveLocSiteLite();
	}

	public ims.core.vo.ClinicLiteVoCollection listClinicsforLocation(ims.core.resource.place.vo.LocationRefVo voLocRef, String strClinicName)
	{
		ClinicAdmin clinicAdmin = (ClinicAdmin)getDomainImpl(ClinicAdminImpl.class);
		return clinicAdmin.listClinicsForLocationByClinicName(voLocRef,strClinicName );
	}
}