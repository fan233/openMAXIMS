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
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.80 build 5332.26009)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.codedrecordaudit;

import ims.RefMan.forms.codedrecordaudit.GenForm.grdStagingExpImpRow;
import ims.RefMan.vo.StageCodeExportVo;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
		populateScreenFromData();
	}
	private void populateScreenFromData() 
	{
		if (form.getGlobalContext().RefMan.getReferralExternalCodingIsNotNull() && form.getGlobalContext().RefMan.getReferralExternalCoding().getStagingCodeExportIsNotNull())
		{			
			for (StageCodeExportVo rec: form.getGlobalContext().RefMan.getReferralExternalCoding().getStagingCodeExport())
			{
				grdStagingExpImpRow row = form.grdStagingExpImp().getRows().newRow();
				row.setColCodingStatus(rec.getCodingStatusIsNotNull()?rec.getCodingStatus().getText():"");
				row.setColExportData(rec.getDataExport());
				row.setColExportDateTime(rec.getExportDateTimeIsNotNull()?rec.getExportDateTime().toString():"");
				row.setColImportData(rec.getDataImport());
				row.setColImportDateTime(rec.getImportDateTimeIsNotNull()?rec.getImportDateTime().toString():"");
				row.setValue(rec);
			}
		}
	}
	@Override
	protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);
	}
	@Override
	protected void OngrdselExpImpRecord()
	{
		form.cc1().setValue(form.grdStagingExpImp().getValue());		
	}
	@Override
	protected void OngrdselClearExpImpRecord() throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}
}