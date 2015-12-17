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
// This code was generated by Bogdan Tofei using IMS Development Environment (version 1.80 build 5360.17707)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.notecorrectionmosdialog;

import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.RecordingUserInformationVo;
import ims.core.vo.enums.MosType;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.DateTime;
import ims.pathways.vo.BreachReasonCorrectionVo;
import ims.vo.interfaces.IMos;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialise();
	}

	private void initialise()
	{
		form.ccMOS().initialize(MosType.ALL);
		form.ccMOS().isRequired(Boolean.TRUE);
		
		form.ccMOS().setValue((IMos) domain.getMosUser());
		form.dtimAuthoring().setValue(new DateTime());
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateGlobalContext();
	}
	
	private void populateGlobalContext()
	{
		
		String[] errors = validateUiRules();

		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return;
		}
		
		BreachReasonCorrectionVo correctionDetails = new BreachReasonCorrectionVo();
		
		RecordingUserInformationVo recordingInfo = new RecordingUserInformationVo();
		
		recordingInfo.setRecordingUser((MemberOfStaffLiteVo) form.ccMOS().getValue());
		recordingInfo.setRecordingDateTime(form.dtimAuthoring().getValue());
		
		correctionDetails.setAuthoringInformation(recordingInfo);
		correctionDetails.setCorrectionComments(form.richTextCorrectionComments().getValue());
		
		form.getGlobalContext().Pathways.setBreachReasonCorrectionData(correctionDetails);
		
		engine.close(DialogResult.OK);
		
	}
	
	private String[] validateUiRules()
	{
		ArrayList<String> listOfErrors = new ArrayList<String>();

		if (form.ccMOS().getError("Authoring MOS") != null)
		{
			listOfErrors.add(form.ccMOS().getError("Authoring MOS"));
		}
		
		if (form.dtimAuthoring().getValue() == null)
		{
			listOfErrors.add("Authoring Date/Time is mandatory");
		}
		
		if (form.richTextCorrectionComments().getValue().length() > 5000)
		{
			listOfErrors.add("Correction Comments should be less or equal to 5000 chars");
		}

		int errorCount = listOfErrors.size();
		String[] result = new String[errorCount];

		for (int x = 0; x < errorCount; x++)
			result[x] = (String) listOfErrors.get(x);

		return result;
	}

}