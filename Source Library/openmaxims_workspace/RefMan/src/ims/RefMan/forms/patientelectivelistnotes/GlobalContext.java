// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.patientelectivelistnotes;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		RefMan = new RefManContext(context);
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientElectiveListNotesIsNotNull()
		{
			return !cx_RefManPatientElectiveListNotes.getValueIsNull(context);
		}
		public ims.RefMan.vo.PatientElectiveListNotesVo getPatientElectiveListNotes()
		{
			return (ims.RefMan.vo.PatientElectiveListNotesVo)cx_RefManPatientElectiveListNotes.getValue(context);
		}
		public void setPatientElectiveListNotes(ims.RefMan.vo.PatientElectiveListNotesVo value)
		{
			cx_RefManPatientElectiveListNotes.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientElectiveListNotes = new ims.framework.ContextVariable("RefMan.PatientElectiveListNotes", "_cv_RefMan.PatientElectiveListNotes");

		private ims.framework.Context context;
	}

	public RefManContext RefMan;
}