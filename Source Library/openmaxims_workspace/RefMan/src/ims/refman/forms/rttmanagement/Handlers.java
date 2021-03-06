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

package ims.RefMan.forms.rttmanagement;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void OnMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormClosing(CancelArgs args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCompleteValidation() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkReturnToPathways() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCcPatientJourneyValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnMarkReferralAsNotSubjectRTTClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdEventSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnBtnAddRTTEvent() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnBtnUndoRTTEvent() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnbtnEditRTTEvent() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnBtnViewOutcome() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnBtnUpdateReferralDate() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnBtnViewAllComments() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnBtnValidate() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDte62DayTargetValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnReferralDateValueChange() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnCmbReferralChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnReviewReferralClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				OnMessageBoxClosed(messageBoxId, result);
			}
		});
		this.form.setFormClosingEvent(new FormClosing()
		{
			private static final long serialVersionUID = 1L;
			public void handle(CancelArgs args) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormClosing(args);
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormOpen(args);
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.btnCompleteValidation().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCompleteValidation();
			}
		});
		this.form.lnkReturnToPathways().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkReturnToPathways();
			}
		});
		this.form.lyrDetails().tabJourney().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabJourneyActivated();
			}
		});
		this.form.lyrDetails().tabEvents().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabEventsActivated();
			}
		});
		this.form.lyrDetails().tabJourney().setccPatientJourneyValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCcPatientJourneyValueChanged();
			}
		});
		this.form.lyrDetails().tabEvents().btnMarkReferralAsNotSubjectRTT().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnMarkReferralAsNotSubjectRTTClick();
			}
		});
		this.form.lyrDetails().tabEvents().grdEvent().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdEventSelectionChanged();
			}
		});
		this.form.lyrDetails().tabEvents().btnAddRTTEvent().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnBtnAddRTTEvent();
			}
		});
		this.form.lyrDetails().tabEvents().btnUndoRTTEvent().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnBtnUndoRTTEvent();
			}
		});
		this.form.lyrDetails().tabEvents().btnEditRTTEvent().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnbtnEditRTTEvent();
			}
		});
		this.form.lyrDetails().tabEvents().btnViewOutcome().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnBtnViewOutcome();
			}
		});
		this.form.btnUpdateR().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnBtnUpdateReferralDate();
			}
		});
		this.form.btnViewAllComments().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnBtnViewAllComments();
			}
		});
		this.form.btnValidate().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnBtnValidate();
			}
		});
		this.form.dte62DayTarget().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDte62DayTargetValueChanged();
			}
		});
		this.form.dteReferral().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnReferralDateValueChange();
			}
		});
		this.form.cmbReferral().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnCmbReferralChanged();
			}
		});
		this.form.btnReviewReferral().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnReviewReferralClick();
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementAddRTTEventItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.AddRTTEvent, sender);
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementUndoRTTEventItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.UndoRTTEvent, sender);
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementEditRTTStatusItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.EditRTTStatus, sender);
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementEDIT_RTT_STATUS_DATE_TIMEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.EDIT_RTT_STATUS_DATE_TIME, sender);
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementViewOutcomeItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.ViewOutcome, sender);
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementVALIDATEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.VALIDATE, sender);
			}
		});
		this.form.getContextMenus().RefMan.getRTTManagementVIEW_ALL_COMMItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.RTTManagement.VIEW_ALL_COMM, sender);
			}
		});
	}
	private void onlyrDetailstabJourneyActivated()
	{
		this.form.lyrDetails().showtabJourney();
	}
	private void onlyrDetailstabEventsActivated()
	{
		this.form.lyrDetails().showtabEvents();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
