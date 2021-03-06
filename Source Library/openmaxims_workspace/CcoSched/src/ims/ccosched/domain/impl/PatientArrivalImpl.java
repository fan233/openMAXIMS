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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.55 build 2755.18939)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.domain.impl;

import ims.ccosched.domain.ActivityView;
import ims.ccosched.domain.base.impl.BasePatientArrivalImpl;
import ims.core.domain.PatientSearch;
import ims.core.domain.impl.PatientSearchImpl;
import ims.core.vo.PatientFilter;
import ims.core.vo.PatientShortCollection;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.dto.Result;
import ims.dto.client.Patient;
import ims.dto.client.Sd_appt_dts;
import ims.framework.exceptions.CodingRuntimeException;

public class PatientArrivalImpl extends BasePatientArrivalImpl
{

	private static final long serialVersionUID = 1L;

	public Sd_appt_dts getArrivalDetails(String appt_head_id, String appt_id) throws DomainInterfaceException
	{
		if(appt_head_id == null)
			throw new CodingRuntimeException("Cannot get appointment for null appt_head_id");
		
		if(appt_id == null)
			throw new CodingRuntimeException("Cannot get appointment for null appt_id");
		
		Sd_appt_dts appts = (Sd_appt_dts)getDTOInstance(Sd_appt_dts.class);
		appts.Filter.clear();
		appts.Filter.Appt_head_id = appt_head_id;
		appts.Filter.Appt_id = appt_id;

		Result result = appts.get();
		if (result != null)
		{
			throw new DomainInterfaceException(result.getMessage());
		}
		
		return appts;
	}

	public Sd_appt_dts getForUpdateArrivalDetails(Sd_appt_dts appointment) throws StaleObjectException
	{
		if(appointment == null)
			throw new CodingRuntimeException("Cannot perform getForUpdate for null appointment");
			
		Result result = appointment.getForUpdate();
		if (result != null)
			throw new StaleObjectException(null, result.getMessage());
		
		return appointment;
	}

	public Sd_appt_dts updateArrivalDetails(Sd_appt_dts appointment) throws DomainInterfaceException
	{
		if(appointment == null)
			throw new CodingRuntimeException("Cannot perform update for null appointment");
		
		Result result = appointment.update();
		if (result != null)
			throw new DomainInterfaceException(result.getMessage());
		
		return appointment;
	}

	public Sd_appt_dts listAppointmentDetails(String pkey, String sess_dt) throws DomainInterfaceException
	{
		Sd_appt_dts appDetails = (Sd_appt_dts)getDTOInstance(Sd_appt_dts.class);
		appDetails.Filter.clear();

		if(pkey != null)
			appDetails.Filter.Pkey = pkey;

		if(sess_dt == null)
			throw new CodingRuntimeException("Cannot list Appointment for null session date");
		
		appDetails.Filter.Sess_dt = sess_dt;

		Result result = appDetails.list();
		if (result != null)
			throw new DomainInterfaceException(result.getMessage());
		
		return appDetails;
	}

	public ims.core.vo.Patient getPatient(ims.core.vo.PatientShort patient) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		ActivityView impl = (ActivityView)getDomainImpl(ActivityViewImpl.class);
		return impl.getPatient(patient);
	}
	
	public Patient getPatient(String hospNum) throws DomainInterfaceException
	{
		if(hospNum == null)
			throw new CodingRuntimeException("Cannot get patient for null Hospital Number");
		
		//public PatientShortCollection getPatient(PatientFilter filter, Boolean remote) throws DomainInterfaceException 

		Patient patients = (Patient)getDTOInstance(Patient.class);
		patients.Filter.clear();
		patients.Filter.Hospnum = hospNum;
		Result result = patients.get();
		if(result != null)
			throw new DomainInterfaceException(result.getMessage());
		
		return patients;
	}

	public Patient getPatient(String surname, String forname, String dob) throws DomainInterfaceException
	{
		Patient patients = (Patient)getDTOInstance(Patient.class);
		patients.Filter.clear();
		
		if(surname != null)
			patients.Filter.Snm = surname;
		
		if(forname != null)
			patients.Filter.Fnm1 = forname;

		if(dob != null)
			patients.Filter.Dob = dob;

		Result result = patients.list();
		if(result != null)
			throw new DomainInterfaceException(result.getMessage());
		
		return patients;
	}

	public PatientShortCollection listPatients(PatientFilter patientFilter) throws DomainInterfaceException
	{
		PatientSearch impl = (PatientSearch)getDomainImpl(PatientSearchImpl.class);
		return impl.searchPatients(patientFilter);
	}
}
