// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface LinkReportNoteToTemplate extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* getReportNotePrintTemplateByType
	*/
	public ims.RefMan.vo.ReportNotePrintTemplateVo getReportNotePrintTemplateByType(ims.RefMan.vo.lookups.ReportNoteType type);

	// Generated from form domain interface definition
	/**
	* vo
	*/
	public ims.RefMan.vo.ReportNotePrintTemplateVo save(ims.RefMan.vo.ReportNotePrintTemplateVo report) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void removeLink(ims.RefMan.vo.ReportNotePrintTemplateVo report) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;
}
