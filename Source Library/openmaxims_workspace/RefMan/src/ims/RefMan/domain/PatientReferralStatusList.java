// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface PatientReferralStatusList extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Get PatientShort
	*/
	public ims.core.vo.PatientShort getPatientShort(ims.core.patient.vo.PatientRefVo voPatientRef);

	// Generated from form domain interface definition
	/**
	* Get Care Context Short
	*/
	public ims.core.vo.CareContextShortVo getCareContextShort(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	/**
	* Get
	*/
	public ims.RefMan.vo.ConsultationDetailsVo getConsultation(ims.RefMan.vo.CatsReferralRefVo voCATSRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralListVo getCatsReferral(ims.RefMan.vo.CatsReferralRefVo voReferralRef);

	// Generated from form domain interface definition
	public Boolean isPatientAlreadyAdmitted(ims.core.patient.vo.PatientRefVo voPatientRef);

	// Generated from form domain interface definition
	public Boolean hadPreviousAdmissionForThisReferral(ims.RefMan.vo.CatsReferralRefVo voCatsRef);

	// Generated from form domain interface definition
	public void undoProviderCancellation(ims.RefMan.vo.CatsReferralListVo referral, ims.core.vo.ReferralNoteVo referralNote) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public void undoReferralRejection(ims.RefMan.vo.CatsReferralListVo catsRef) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public String getPIDDiagnosisInfo(ims.core.admin.vo.CareContextRefVo careContextRefVo, ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo);

	// Generated from form domain interface definition
	public ims.RefMan.vo.PatientElectiveListRefVo getActivePatientElectiveListsForCurrentCatsReferral(ims.RefMan.vo.CatsReferralRefVo catsRef);

	// Generated from form domain interface definition
	/**
	* list CATS referrals
	*/
	public ims.RefMan.vo.CatsReferralListManualAssemblyVoCollection listCATSReferrals(ims.RefMan.vo.CATSReferralFilterVo voCATSFilter, Boolean bIncludeICPColumn, Boolean bIncludeELEColumn);
}