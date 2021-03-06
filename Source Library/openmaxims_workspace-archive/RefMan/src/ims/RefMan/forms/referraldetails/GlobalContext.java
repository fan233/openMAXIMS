// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referraldetails;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		RefMan = new RefManContext(context);
		ICP = new ICPContext(context);
		Core = new CoreContext(context);
		Scheduling = new SchedulingContext(context);
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCatsReferralIsNotNull()
		{
			return !cx_RefManCatsReferral.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
		{
			return (ims.RefMan.vo.CatsReferralRefVo)cx_RefManCatsReferral.getValue(context);
		}
		public void setCatsReferral(ims.RefMan.vo.CatsReferralRefVo value)
		{
			cx_RefManCatsReferral.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");
		public boolean getOpenApptAndInvTabIsNotNull()
		{
			return !cx_RefManOpenApptAndInvTab.getValueIsNull(context);
		}
		public Boolean getOpenApptAndInvTab()
		{
			return (Boolean)cx_RefManOpenApptAndInvTab.getValue(context);
		}
		public void setOpenApptAndInvTab(Boolean value)
		{
			cx_RefManOpenApptAndInvTab.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManOpenApptAndInvTab = new ims.framework.ContextVariable("RefMan.OpenApptAndInvTab", "_cv_RefMan.OpenApptAndInvTab");
		public boolean getCatsReferralStatusIsNotNull()
		{
			return !cx_RefManCatsReferralStatus.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralStatusVo getCatsReferralStatus()
		{
			return (ims.RefMan.vo.CatsReferralStatusVo)cx_RefManCatsReferralStatus.getValue(context);
		}
		public void setCatsReferralStatus(ims.RefMan.vo.CatsReferralStatusVo value)
		{
			cx_RefManCatsReferralStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferralStatus = new ims.framework.ContextVariable("RefMan.CatsReferralStatus", "_cv_RefMan.CatsReferralStatus");
		public boolean getRejectionReasonIsNotNull()
		{
			return !cx_RefManRejectionReason.getValueIsNull(context);
		}
		public ims.RefMan.vo.RejectReferralVo getRejectionReason()
		{
			return (ims.RefMan.vo.RejectReferralVo)cx_RefManRejectionReason.getValue(context);
		}
		public void setRejectionReason(ims.RefMan.vo.RejectReferralVo value)
		{
			cx_RefManRejectionReason.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManRejectionReason = new ims.framework.ContextVariable("RefMan.RejectionReason", "_cv_RefMan.RejectionReason");
		public boolean getReferralNoteIsNotNull()
		{
			return !cx_RefManReferralNote.getValueIsNull(context);
		}
		public ims.core.vo.ReferralNoteVo getReferralNote()
		{
			return (ims.core.vo.ReferralNoteVo)cx_RefManReferralNote.getValue(context);
		}
		public void setReferralNote(ims.core.vo.ReferralNoteVo value)
		{
			cx_RefManReferralNote.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReferralNote = new ims.framework.ContextVariable("RefMan.ReferralNote", "_cv_RefMan.ReferralNote");
		public boolean getCatsReferralHasGpLetterIsNotNull()
		{
			return !cx_RefManCatsReferralHasGpLetter.getValueIsNull(context);
		}
		public Boolean getCatsReferralHasGpLetter()
		{
			return (Boolean)cx_RefManCatsReferralHasGpLetter.getValue(context);
		}
		public void setCatsReferralHasGpLetter(Boolean value)
		{
			cx_RefManCatsReferralHasGpLetter.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferralHasGpLetter = new ims.framework.ContextVariable("RefMan.CatsReferralHasGpLetter", "_cv_RefMan.CatsReferralHasGpLetter");
		public boolean getIsProviderCancellationIsNotNull()
		{
			return !cx_RefManIsProviderCancellation.getValueIsNull(context);
		}
		public Boolean getIsProviderCancellation()
		{
			return (Boolean)cx_RefManIsProviderCancellation.getValue(context);
		}
		public void setIsProviderCancellation(Boolean value)
		{
			cx_RefManIsProviderCancellation.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManIsProviderCancellation = new ims.framework.ContextVariable("RefMan.IsProviderCancellation", "_cvp_RefMan.IsProviderCancellation");
		public boolean getReferralReviewDetailsModeIsNotNull()
		{
			return !cx_RefManReferralReviewDetailsMode.getValueIsNull(context);
		}
		public ims.RefMan.vo.enums.ReferralReviewDetail getReferralReviewDetailsMode()
		{
			return (ims.RefMan.vo.enums.ReferralReviewDetail)cx_RefManReferralReviewDetailsMode.getValue(context);
		}
		public void setReferralReviewDetailsMode(ims.RefMan.vo.enums.ReferralReviewDetail value)
		{
			cx_RefManReferralReviewDetailsMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReferralReviewDetailsMode = new ims.framework.ContextVariable("RefMan.ReferralReviewDetailsMode", "_cv_RefMan.ReferralReviewDetailsMode");
		public boolean getIsComponentInEditModeIsNotNull()
		{
			return !cx_RefManIsComponentInEditMode.getValueIsNull(context);
		}
		public ims.framework.enumerations.FormMode getIsComponentInEditMode()
		{
			return (ims.framework.enumerations.FormMode)cx_RefManIsComponentInEditMode.getValue(context);
		}
		public void setIsComponentInEditMode(ims.framework.enumerations.FormMode value)
		{
			cx_RefManIsComponentInEditMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManIsComponentInEditMode = new ims.framework.ContextVariable("RefMan.IsComponentInEditMode", "_cv_RefMan.IsComponentInEditMode");
		public boolean getReferralContractTypeForPatientIsNotNull()
		{
			return !cx_RefManReferralContractTypeForPatient.getValueIsNull(context);
		}
		public ims.core.vo.lookups.ReferralManagementContractType getReferralContractTypeForPatient()
		{
			return (ims.core.vo.lookups.ReferralManagementContractType)cx_RefManReferralContractTypeForPatient.getValue(context);
		}
		public void setReferralContractTypeForPatient(ims.core.vo.lookups.ReferralManagementContractType value)
		{
			cx_RefManReferralContractTypeForPatient.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReferralContractTypeForPatient = new ims.framework.ContextVariable("RefMan.ReferralContractTypeForPatient", "_cvp_RefMan.ReferralContractTypeForPatient");
		public boolean getOpenBookAppointmentScreenIsNotNull()
		{
			return !cx_RefManOpenBookAppointmentScreen.getValueIsNull(context);
		}
		public Boolean getOpenBookAppointmentScreen()
		{
			return (Boolean)cx_RefManOpenBookAppointmentScreen.getValue(context);
		}
		public void setOpenBookAppointmentScreen(Boolean value)
		{
			cx_RefManOpenBookAppointmentScreen.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManOpenBookAppointmentScreen = new ims.framework.ContextVariable("RefMan.OpenBookAppointmentScreen", "_cv_RefMan.OpenBookAppointmentScreen");
		public boolean getSecondOpinionReferralStatusIsNotNull()
		{
			return !cx_RefManSecondOpinionReferralStatus.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralStatusVo getSecondOpinionReferralStatus()
		{
			return (ims.RefMan.vo.CatsReferralStatusVo)cx_RefManSecondOpinionReferralStatus.getValue(context);
		}
		public void setSecondOpinionReferralStatus(ims.RefMan.vo.CatsReferralStatusVo value)
		{
			cx_RefManSecondOpinionReferralStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSecondOpinionReferralStatus = new ims.framework.ContextVariable("RefMan.SecondOpinionReferralStatus", "_cv_RefMan.SecondOpinionReferralStatus");
		public boolean getReferralOutcomeReportTypeIsNotNull()
		{
			return !cx_RefManReferralOutcomeReportType.getValueIsNull(context);
		}
		public ims.RefMan.vo.enums.ReferralOutcomeReportType getReferralOutcomeReportType()
		{
			return (ims.RefMan.vo.enums.ReferralOutcomeReportType)cx_RefManReferralOutcomeReportType.getValue(context);
		}
		public void setReferralOutcomeReportType(ims.RefMan.vo.enums.ReferralOutcomeReportType value)
		{
			cx_RefManReferralOutcomeReportType.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReferralOutcomeReportType = new ims.framework.ContextVariable("RefMan.ReferralOutcomeReportType", "_cv_RefMan.ReferralOutcomeReportType");
		public boolean getCurrentServiceLiteVoIsNotNull()
		{
			return !cx_RefManCurrentServiceLiteVo.getValueIsNull(context);
		}
		public ims.core.vo.ServiceLiteVo getCurrentServiceLiteVo()
		{
			return (ims.core.vo.ServiceLiteVo)cx_RefManCurrentServiceLiteVo.getValue(context);
		}
		public void setCurrentServiceLiteVo(ims.core.vo.ServiceLiteVo value)
		{
			cx_RefManCurrentServiceLiteVo.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCurrentServiceLiteVo = new ims.framework.ContextVariable("RefMan.CurrentServiceLiteVo", "_cv_RefMan.CurrentServiceLiteVo");
		public boolean getPrintRejectionLettersIsNotNull()
		{
			return !cx_RefManPrintRejectionLetters.getValueIsNull(context);
		}
		public Boolean getPrintRejectionLetters()
		{
			return (Boolean)cx_RefManPrintRejectionLetters.getValue(context);
		}
		public void setPrintRejectionLetters(Boolean value)
		{
			cx_RefManPrintRejectionLetters.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPrintRejectionLetters = new ims.framework.ContextVariable("RefMan.PrintRejectionLetters", "_cv_RefMan.PrintRejectionLetters");

		private ims.framework.Context context;
	}
	public final class ICPContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ICPContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getServiceIsNotNull()
		{
			return !cx_ICPService.getValueIsNull(context);
		}
		public ims.core.clinical.vo.ServiceRefVo getService()
		{
			return (ims.core.clinical.vo.ServiceRefVo)cx_ICPService.getValue(context);
		}
		public void setService(ims.core.clinical.vo.ServiceRefVo value)
		{
			cx_ICPService.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ICPService = new ims.framework.ContextVariable("ICP.Service", "_cv_ICP.Service");
		public boolean getProcedureIDIsNotNull()
		{
			return !cx_ICPProcedureID.getValueIsNull(context);
		}
		public ims.core.clinical.vo.ProcedureRefVo getProcedureID()
		{
			return (ims.core.clinical.vo.ProcedureRefVo)cx_ICPProcedureID.getValue(context);
		}
		public void setProcedureID(ims.core.clinical.vo.ProcedureRefVo value)
		{
			cx_ICPProcedureID.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ICPProcedureID = new ims.framework.ContextVariable("ICP.ProcedureID", "_cv_ICP.ProcedureID");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}
	public final class SchedulingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private SchedulingContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getBookingServiceIsNotNull()
		{
			return !cx_SchedulingBookingService.getValueIsNull(context);
		}
		public ims.core.clinical.vo.ServiceRefVo getBookingService()
		{
			return (ims.core.clinical.vo.ServiceRefVo)cx_SchedulingBookingService.getValue(context);
		}
		public void setBookingService(ims.core.clinical.vo.ServiceRefVo value)
		{
			cx_SchedulingBookingService.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingService = new ims.framework.ContextVariable("Scheduling.BookingService", "_cv_Scheduling.BookingService");

		private ims.framework.Context context;
	}

	public RefManContext RefMan;
	public ICPContext ICP;
	public CoreContext Core;
	public SchedulingContext Scheduling;
}
