//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Marius Mihalec using IMS Development Environment (version 1.71 build 3937.27059)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.admin.forms.documentconversiontasksettings;

import java.util.ArrayList;

import ims.admin.forms.documentconversiontasksettings.GenForm.Group1Enumeration;
import ims.admin.vo.DocumentConversionSettingsVo;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.interfaces.IDynamicFormDataOperations;

public class Logic extends BaseLogic implements IDynamicFormDataOperations
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{
		loadData();
	}
	public void loadData() throws PresentationLogicException
	{
		DocumentConversionSettingsVo record = domain.getConfiguration(form.getGlobalContext().Admin.getCurrentJobConfiguration());
		form.getLocalContext().setRecord(record);
		populateScreenFromData(record);
		
		form.Group1().setValue(record != null && record.getAllRecords() ? Group1Enumeration.rdoFull : Group1Enumeration.rdoLastUpdate);		
		if (record != null && record.getFromDateIsNotNull() && record.getToDateIsNotNull())
		{
			form.chkPeriod().setValue(true);
			form.dtimFrom().setValue(record.getFromDate());
			form.dtimTo().setValue(record.getToDate());
		}
		else
		{
			form.chkPeriod().setValue(false);
		}
		
		onChkPeriodValueChanged();
	}
	public void saveData() throws Exception 
	{	
		DocumentConversionSettingsVo record = getData();
		
		String[] errors = record.validate();
		if(errors != null && errors.length > 0)
			throw new Exception("Validation Errors");
		
		domain.saveConfiguration(record);		
	}
	
	private String[] getUiErrors() 
	{
		ArrayList<String> errors = new ArrayList<String>();
		if (form.chkPeriod().getValue() && (form.dtimFrom().getValue() == null || form.dtimTo().getValue() == null))
		{
			errors.add("FromDate and ToDate are mandatory!");
		}
		if (form.chkPeriod().getValue() &&
				form.dtimFrom().getValue() != null && form.dtimTo().getValue() != null &&
					(form.dtimFrom().getValue().isGreaterThan(form.dtimTo().getValue())))
		{
			errors.add("FromDate must be less than ToDate");
		}
		if (errors.size() > 0) 
		{
			String[] searchErrors = new String[errors.size()];
			errors.toArray(searchErrors);
			engine.showErrors("Invalid DocumentConversionSettings record", searchErrors);
			return searchErrors;
		}
		return null;
	}
	
	public String[] validateData() 
	{
		return getData().validate(getUiErrors());
	}	
	public DocumentConversionSettingsVo getData()
	{
		DocumentConversionSettingsVo record = populateDataFromScreen(form.getLocalContext().getRecord());
		record.setConfiguredJob(form.getGlobalContext().Admin.getCurrentJobConfiguration());
		record.setAllRecords(form.Group1().getValue().equals(Group1Enumeration.rdoFull) ? true : false);
		if (form.chkPeriod().getValue() &&
				form.dtimFrom().getValue() != null &&
					form.dtimTo().getValue() != null &&
						form.dtimFrom().getValue().isLessOrEqualThan(form.dtimTo().getValue()))
		{			
			record.setFromDate(form.dtimFrom().getValue());
			record.setToDate(form.dtimTo().getValue());
		}
		else
		{
			record.setFromDate(null);
			record.setToDate(null);
		}
		
		return record;
	}
	@Override
	protected void onChkPeriodValueChanged() throws PresentationLogicException 
	{ 
		if (form.chkPeriod().getValue())
		{
			form.dtimFrom().setEnabled(true);
			form.dtimTo().setEnabled(true);
		}
		else
		{
			form.dtimFrom().setEnabled(false);
			form.dtimTo().setEnabled(false);
			
			form.dtimFrom().setValue(null);
			form.dtimTo().setValue(null);
		}
	}
}