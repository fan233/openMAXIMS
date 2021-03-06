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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.80 build 5540.19885)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.theatresessiondebriefdialog;

import ims.clinical.forms.theatresessiondebriefdialog.GenForm.grdDebriefRow;
import ims.clinical.vo.SessionDebriefDetailVo;
import ims.clinical.vo.SessionTheatreDelayAndDebriefTimesVo;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	private void open()
	{
		form.setMode(FormMode.VIEW);
		SessionTheatreDelayAndDebriefTimesVo session = domain.getSessionDebrief(form.getGlobalContext().Scheduling.getTheatreSession());
		form.getLocalContext().setSessionTheatreDelayandDebrief(session);
		
		populateScreenFromData();
	}

	private void populateScreenFromData()
	{
		SessionTheatreDelayAndDebriefTimesVo session = form.getLocalContext().getSessionTheatreDelayandDebrief();
		
		form.grdDebrief().getRows().clear();
		form.dtimDebrief().setValue(null);
		
		if (session != null)
		{
			for (SessionDebriefDetailVo detail : session.getDebriefDateTimes())
			{
				if (detail!=null && detail.getDebriefDateTimeIsNotNull())
				{
					grdDebriefRow row = form.grdDebrief().getRows().newRow();
					row.setColDebriefDateTime(detail.getDebriefDateTime().toString());
					row.setValue(detail);
				}
			}
		}
	}

	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.grdDebrief().setValue(null);
		form.dtimDebrief().setValue(new DateTime());
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onGrdDebriefSelectionChanged()
	{
		updateControlState();
		form.dtimDebrief().setValue(form.grdDebrief().getValue().getDebriefDateTime());
	}

	private void updateControlState() //WDEV-21858
	{
		form.btnNew().setVisible(form.getMode().equals(FormMode.VIEW));
		form.btnEdit().setVisible(form.grdDebrief().getValue() != null && form.getMode().equals(FormMode.VIEW));
		
		if(form.getMode().equals(FormMode.EDIT))
		{			
			form.btnCancel().setText("Cancel");
		}
		else
		{
			form.btnCancel().setText("Close");
		}
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		SessionTheatreDelayAndDebriefTimesVo session = form.getLocalContext().getSessionTheatreDelayandDebrief();
		
		session = populateDataFromScreen(session);
		String[] errors = session.validate();
		if(errors != null)
		{
			engine.showErrors(errors);
			return;
		}
		
		try
		{
			domain.saveSessionDebrief(session);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			form.getLocalContext().setSessionTheatreDelayandDebrief(domain.getSessionDebrief(form.getGlobalContext().Scheduling.getTheatreSession()));
			form.grdDebrief().setValue(null);//WDEV-21858
			open(); //WDEV-21858
			return;
		}
		engine.close(DialogResult.OK);
	}

	private SessionTheatreDelayAndDebriefTimesVo populateDataFromScreen(SessionTheatreDelayAndDebriefTimesVo session) //WDEV-21858
	{
		session = (SessionTheatreDelayAndDebriefTimesVo) session.clone(); //WDEV-21858
		SessionDebriefDetailVo detail = form.grdDebrief().getValue();
		if(detail == null)
		{
			detail = new SessionDebriefDetailVo();
			detail.setDebriefDateTime(form.dtimDebrief().getValue());
			session.getDebriefDateTimes().add(detail);
		}
		else
		{
			for (int i=0;i<session.getDebriefDateTimes().size();i++)
			{
				if (detail.equals(session.getDebriefDateTimes().get(i)))
				{
					session.getDebriefDateTimes().get(i).setDebriefDateTime(form.dtimDebrief().getValue());
					break;
				}
			}
		}
				
		return session;
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.btnCancel().getText().equals("Close"))
		{
			engine.close(DialogResult.CANCEL);
		}
		else
		{
			form.grdDebrief().setValue(null); //WDEV-21858
			open();
		}
		
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlState();	
	}
}
