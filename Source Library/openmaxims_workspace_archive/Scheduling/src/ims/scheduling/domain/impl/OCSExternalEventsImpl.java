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
// This code was generated by Michael Noonan using IMS Development Environment (version 1.65 build 3187.17423)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.scheduling.domain.impl;

import java.util.List;
import ims.core.admin.domain.objects.ProviderSystem;
import ims.core.admin.vo.ProviderSystemRefVo;
import ims.core.generic.domain.objects.ConfigProperty;
import ims.core.vo.lookups.ReferralManagementContractType;
import ims.core.vo.lookups.ServiceCategory;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.ocrr.orderingresults.domain.objects.OrderInvestigation;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVo;
import ims.ocrr.vo.lookups.OrderMessageStatus;
import ims.scheduling.domain.base.impl.BaseOCSExternalEventsImpl;
import ims.scheduling.domain.objects.Booking_Appointment;
import ims.scheduling.domain.objects.ExternalSystemEvent;
import ims.scheduling.vo.Booking_AppointmentRefVo;
import ims.scheduling.vo.lookups.ExternalSystemEventTypes;
import ims.vo.LookupInstVo;

public class OCSExternalEventsImpl extends BaseOCSExternalEventsImpl
{

	private static final long	serialVersionUID	= 1L;

	/**
	 * This should be called when an order is ready to be sent. i.e. at the same
	 * time the order status is set to AUTHORISED
	 */
	public void generateNewOrderEvent(ims.scheduling.vo.Booking_AppointmentRefVo appointment, ims.ocrr.orderingresults.vo.OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.NEWORDER);
	}

	/**
	 * Should be called when a patient arrives in clinic
	 */
	public void generatePatientArrivingEvent(Booking_AppointmentRefVo appointment, OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.PATIENTARRIVING);
	}

	/**
	 * Should be called in when an order is cancelled in MAXIMS UI
	 */
	public void generateOrderCancelEvent(ims.scheduling.vo.Booking_AppointmentRefVo appointment, ims.ocrr.orderingresults.vo.OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.CANCELORDER);
	}

	/**
	 * This should be called in when an appointment associated with the order is
	 * changed/rebooked
	 */
	public void generateOrderUpdateEvent(ims.scheduling.vo.Booking_AppointmentRefVo appointment, ims.ocrr.orderingresults.vo.OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.UPDATEORDER);

	}

	/**
	 * Should be called in RefMan when a patient NDAs
	 */
	public void generateOrderPatientDNAEvent(ims.scheduling.vo.Booking_AppointmentRefVo appointment, ims.ocrr.orderingresults.vo.OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.PATIENTDNA);
	}

	public void generateOrderCancelAsRequestedEvent(Booking_AppointmentRefVo appointment, OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.ACKCANCELREQUEST);

	}

	public void generateOrderNumberAllocatedEvent(Booking_AppointmentRefVo appointment, OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		createExternalEvent(appointment, investigation, ExternalSystemEventTypes.ALLOCATEORDERNUMBER);

	}

	private void createExternalEvent(Booking_AppointmentRefVo appointment, OrderInvestigationRefVo investigation, LookupInstVo type) throws StaleObjectException
	{
		if (null == appointment)
			throw new DomainRuntimeException("Appointment Cannot be NULL");

		DomainFactory factory = getDomainFactory();
		ExternalSystemEvent event = new ExternalSystemEvent();
		
		// We need to deal with null investigations
		// when (not )sending the messages
		if (null != investigation) 
		{
			OrderInvestigation domInv = (OrderInvestigation) factory.getDomainObject(investigation);
			
			//WDEV-5912 For Investigations marked as NoInterface there are no interface calls
			if(domInv.getInvestigation() != null && domInv.getInvestigation().getInvestigationIndex() != null &&  domInv.getInvestigation().getInvestigationIndex().isNoInterface() != null && domInv.getInvestigation().getInvestigationIndex().isNoInterface())
				return;
			
			event.setInvestigation(domInv);
			event.setProviderSystem(domInv.getInvestigation().getProviderService().getProviderSystem());
		}

		Booking_Appointment domBookAppt = (Booking_Appointment) factory.getDomainObject(appointment);
		
		if(type !=null //http://jira/browse/WDEV-12816 If it is not radiology then we doon't need a message
				&&ExternalSystemEventTypes.PATIENTARRIVING.getID()==type.getID()
				&&domBookAppt!=null&&domBookAppt.getSession()!=null
				&&domBookAppt.getSession().getService()!=null
				&&domBookAppt.getSession().getService().getServiceCategory()!=null
				&&ServiceCategory.RADIOLOGY_MODALITY.getID()!=domBookAppt.getSession().getService().getServiceCategory().getId())
		{
			return;
		}
		
		event.setAppointment(domBookAppt);
		event.setWasProcessed(Boolean.FALSE);
		event.setMessageStatus(getDomLookup(OrderMessageStatus.CREATED));
		event.setEventType(getDomLookup(type));
		factory.save(event);
	}

	public void generateAppointmentCancelEvent(Booking_AppointmentRefVo appointment, OrderInvestigationRefVo investigation) throws StaleObjectException
	{
		if (null == appointment)
			throw new DomainRuntimeException("Appointment Cannot be NULL");
		DomainFactory factory = getDomainFactory();
		ExternalSystemEvent event = new ExternalSystemEvent();
		
		// We need to deal with null investigations
		// when (not )sending the messages
		if (null != investigation) 
		{
			OrderInvestigation domInv = (OrderInvestigation) factory.getDomainObject(investigation);
			
			//WDEV-5912 For Investigations marked as NoInterface there are no interface calls
			if(domInv.getInvestigation() != null && domInv.getInvestigation().getInvestigationIndex() != null &&  domInv.getInvestigation().getInvestigationIndex().isNoInterface() != null && domInv.getInvestigation().getInvestigationIndex().isNoInterface())
				return;
			
			if (domInv.getInvestigation()!=null&&domInv.getInvestigation().getProviderService()!=null&&domInv.getInvestigation().getProviderService().getLocationService()!=null
					&&domInv.getInvestigation().getProviderService().getLocationService().getService()!=null
					&&!(ServiceCategory.RADIOLOGY_MODALITY.getID()==( domInv.getInvestigation().getProviderService().getLocationService().getService().getServiceCategory().getId())))
				
				return;
			
			event.setInvestigation(domInv);
			ProviderSystem providerSystem=domInv.getInvestigation().getProviderService().getProviderSystem();
			if(!isRebookApptWithCancelandFullXOSetForProviderSystem(providerSystem))
				return;

			event.setProviderSystem(providerSystem);
		}

		if (ReferralManagementContractType.DIAGNOSTIC.getId() == getContractTypeIdFromReferralContractForBookingId(appointment.getBoId()))
			return;
		
		Booking_Appointment domBookAppt = (Booking_Appointment) factory.getDomainObject(appointment);
		event.setAppointment(domBookAppt);
		event.setWasProcessed(Boolean.FALSE);
		event.setMessageStatus(getDomLookup(OrderMessageStatus.CREATED));
		event.setEventType(getDomLookup(ExternalSystemEventTypes.CANCELAPPOINTMENT));
		if(domBookAppt!=null &&domBookAppt.getSession()!=null)
		{
			event.setCancelledAppointmentLocation(domBookAppt.getSession().getSchLocation());
		}
		factory.save(event);

	}
	private boolean isRebookApptWithCancelandFullXOSetForProviderSystem(ProviderSystem providerSystem)
	{
		List<ConfigProperty> configProperties=providerSystem.getConfigItems();
		if (configProperties==null||configProperties.size()==0)
			return false;
		for (ConfigProperty configProperty : configProperties)
		{
			if ("RebookApptWithCancelandFullXO".equals(configProperty.getPropertyName())&&
					(configProperty.getPropertyValue()!=null&&(configProperty.getPropertyValue().equalsIgnoreCase("TRUE")||configProperty.getPropertyValue().equalsIgnoreCase("YES"))))
					{
						return true;
					}
		}
		return false;
	}
	
	private Integer getContractTypeIdFromReferralContractForBookingId(Integer nBookingId)
	{
		DomainFactory factory = getDomainFactory();
		List contractId = factory.find("select cont.contractType.id from CatsReferral as cats left join cats.appointments as bk left join cats.contract as cont where (bk.id = '" + nBookingId + "')");
		if (contractId.size() > 0)
			return (Integer)contractId.get(0);
		else
			return null;
	}

	public Boolean isRebookApptWithCancelandFullXOSetForProviderSystem(ProviderSystemRefVo providerSystem)
	{
		DomainFactory factory = getDomainFactory();
		if (providerSystem==null)
			return false;
		ProviderSystem provider = (ProviderSystem)factory.getDomainObject(providerSystem);
		return isRebookApptWithCancelandFullXOSetForProviderSystem(provider);
	}


}