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

package ims.naes.forms.actionplan;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbPeriodUnitLookup();
	abstract protected void defaultcmbPeriodUnitLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyr1TabChanged(ims.framework.LayerBridge tab);
	abstract protected void ondteCompletedValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPeriodUnitValueSet(Object value);
	abstract protected void onIntPeriodValueValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtonRecallGroupValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdAppointmentsGridButtonClicked(int column, GenForm.lyr1Layer.tabDetailsContainer.grdAppointmentsRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onActionGridSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onrecbActionPlanvalueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditNoteClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewNoteClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdNotesValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNcpClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onbtnCanceledClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onbntEditClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlnkBackClicked() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
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
		this.form.lyr1().tabDetails().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyr1tabDetailsActivated();
			}
		});
		this.form.lyr1().tabNotes().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyr1tabNotesActivated();
			}
		});
		this.form.lyr1().tabDetails().dteCompleted().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				ondteCompletedValueChanged();
			}
		});
		this.form.lyr1().tabDetails().cmbPeriodUnit().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPeriodUnitValueSet(value);
			}
		});
		this.form.lyr1().tabDetails().intPeriodValue().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onIntPeriodValueValueChanged();
			}
		});
		this.form.lyr1().tabDetails().RecallGroup().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonRecallGroupValueChanged();
			}
		});
		this.form.lyr1().tabDetails().grdAppointments().setGridButtonClickedEvent(new GridButtonClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdAppointmentsGridButtonClicked(column, new GenForm.lyr1Layer.tabDetailsContainer.grdAppointmentsRow(row));
			}
		});
		this.form.lyr1().tabDetails().grdPlanDetails().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onActionGridSelectionChanged();
			}
		});
		this.form.lyr1().tabDetails().recbrActionPlan().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onrecbActionPlanvalueChanged();
			}
		});
		this.form.lyr1().tabNotes().btnEditNote().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditNoteClicked();
			}
		});
		this.form.lyr1().tabNotes().btnNewNote().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewNoteClicked();
			}
		});
		this.form.lyr1().tabNotes().grdNotes().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdNotesValueChanged();
			}
		});
		this.form.btnNCP().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNcpClicked();
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClicked();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onbtnCanceledClicked();
			}
		});
		this.form.btnEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onbntEditClicked();
			}
		});
		this.form.btnNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewClicked();
			}
		});
		this.form.lnkBack().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlnkBackClicked();
			}
		});
		this.form.getContextMenus().Core.getActionsADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.Actions.ADD, sender);
			}
		});
		this.form.getContextMenus().Core.getActionsREMOVEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.Actions.REMOVE, sender);
			}
		});
		this.form.getContextMenus().Core.getActionsEDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.Actions.EDIT, sender);
			}
		});
		this.form.getContextMenus().Core.getActionsMULTIADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.Actions.MULTIADD, sender);
			}
		});
		this.form.getContextMenus().NAES.getNAES_REFERRAL_NOTES_MENUADD_NOTEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.NAESNamespace.NAES_REFERRAL_NOTES_MENU.ADD_NOTE, sender);
			}
		});
		this.form.getContextMenus().NAES.getNAES_REFERRAL_NOTES_MENUEDIT_NOTEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.NAESNamespace.NAES_REFERRAL_NOTES_MENU.EDIT_NOTE, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbPeriodUnitLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbPeriodUnitLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbPeriodUnitLookupValue();
	}
	private void onlyr1tabDetailsActivated()
	{
		this.form.lyr1().showtabDetails();
		onlyr1TabChanged(this.form.lyr1().tabDetails());
	}
	private void onlyr1tabNotesActivated()
	{
		this.form.lyr1().showtabNotes();
		onlyr1TabChanged(this.form.lyr1().tabNotes());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}