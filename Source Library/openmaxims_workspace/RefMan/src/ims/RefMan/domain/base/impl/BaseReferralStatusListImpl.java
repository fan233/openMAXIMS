// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseReferralStatusListImpl extends DomainImpl implements ims.RefMan.domain.ReferralStatusList, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistDirectoryOfService(ims.scheduling.vo.DirectoryOfServiceVo directoryOfService)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistClinics_Profiles(ims.scheduling.vo.DirectoryofServiceRefVo voDOSRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCATSReferrals(ims.RefMan.vo.CATSReferralFilterVo voCATSFilter, Boolean bIncludeICPColumn, Boolean bIncludeELEColumn)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistServiceFunctionsLite(ims.core.clinical.vo.ServiceRefVo service)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatientShort(ims.core.patient.vo.PatientRefVo voPatientRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContextShort(ims.core.admin.vo.CareContextRefVo voCareContextRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetArrivedBookingAppt(ims.RefMan.vo.CatsReferralListVo catsReferralRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetConsultation(ims.RefMan.vo.CatsReferralRefVo voCATSRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveConsultationAndBookingAppointmentAndCatsReferral(ims.scheduling.vo.Booking_AppointmentShortVo voBooking, ims.RefMan.vo.ConsultationDetailsVo voConsultation, ims.RefMan.vo.CatsReferralListVo voReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetHcpLiteById(ims.core.resource.people.vo.HcpRefVo refId)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveConsultationAndReferralAndAppt(ims.RefMan.vo.ConsultationDetailsVo voConsultation, ims.RefMan.vo.CatsReferralListVo voReferral, ims.scheduling.vo.Booking_AppointmentVo voAppt)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCatsReferral(ims.RefMan.vo.CatsReferralRefVo voReferralRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetBookingAppt(ims.scheduling.vo.Booking_AppointmentRefVo voBookingRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveConsultation(ims.RefMan.vo.ConsultationDetailsVo voConsultation)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCatsReferral(ims.RefMan.vo.CatsReferralWizardVo record)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCatsReferralWizardVo(ims.RefMan.vo.CatsReferralRefVo voCatsRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetMemberOfStaff(ims.core.vo.MemberOfStaffShortVo mos)
	{
	}

	@SuppressWarnings("unused")
	public void validateresetProviderCancellation(ims.RefMan.vo.CatsReferralWizardVo catsReferral, ims.RefMan.vo.ProviderCancellationVo provCancellationVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetProviderCancellation(ims.RefMan.vo.ProviderCancellationRefVo voProvCanceRef)
	{
	}

	@SuppressWarnings("unused")
	public void validateresetReferralRejection(ims.RefMan.vo.CatsReferralWizardVo catsReferral, ims.RefMan.vo.RejectReferralVo rejRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistOrganisations(ims.core.vo.OrgShortVo filter)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistLocationByOrganisation(ims.core.resource.place.vo.OrganisationRefVo organisation, String name)
	{
	}

	@SuppressWarnings("unused")
	public void validateundoProviderCancellation(ims.RefMan.vo.CatsReferralListVo referral, ims.core.vo.ReferralNoteVo referralNote)
	{
		if(referral == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'referral' of type 'ims.RefMan.vo.CatsReferralListVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateundoReferralRejection(ims.RefMan.vo.CatsReferralListVo catsRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProcedures(String strSearchText)
	{
	}

	@SuppressWarnings("unused")
	public void validategetProcedureLite(ims.core.clinical.vo.ProcedureRefVo procRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistActiveContracts(ims.core.resource.place.vo.OrganisationRefVo voOrgRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistAllContracts(ims.core.resource.place.vo.OrganisationRefVo voOrgRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetOrganisationByLocation(Integer locationId)
	{
	}

	@SuppressWarnings("unused")
	public void validateisThereAnyDiagnosticContractsForThisSite(ims.core.resource.place.vo.OrganisationRefVo voOrg)
	{
	}

	@SuppressWarnings("unused")
	public void validategetOnwardReferralByCatsReferral(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistActiveContractsForLocation(ims.core.resource.place.vo.LocationRefVo location)
	{
	}

	@SuppressWarnings("unused")
	public void validatehasLocationDiagnosicContracts(ims.core.resource.place.vo.LocationRefVo location)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistLocationServicesByServiceId(ims.core.clinical.vo.ServiceRefVo service)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistLocationServiceByContract(ims.core.configuration.vo.ContractConfigRefVo contract)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistLocationServiceByContractAndService(ims.core.configuration.vo.ContractConfigRefVo contract, ims.core.clinical.vo.ServiceRefVo service)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPIDDiagnosisInfo(ims.core.admin.vo.CareContextRefVo careContextRefVo, ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validateundoEndOfCare(ims.RefMan.vo.CatsReferralListVo catsRef)
	{
	}
}