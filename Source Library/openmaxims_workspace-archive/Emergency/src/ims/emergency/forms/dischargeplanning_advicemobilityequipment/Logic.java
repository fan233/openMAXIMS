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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 4785.23502)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.dischargeplanning_advicemobilityequipment;


import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.lookups.LookupHelper;
import ims.core.vo.lookups.PatientMobility;
import ims.core.vo.lookups.PatientMobilityCollection;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabMobilityAndEquipmentContainer.grdEquipmentRow;
import ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabMobilityAndEquipmentContainer.grdMobilityRow;
import ims.emergency.vo.AdviceLeafletConfigDisplayVo;
import ims.emergency.vo.AdviceLeafletConfigDisplayVoCollection;
import ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo;
import ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection;
import ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo;
import ims.emergency.vo.InterventionTreatmentDetailForAdviceLeafletVo;
import ims.emergency.vo.InterventionTreatmentDetailForAdviceLeafletVoCollection;
import ims.emergency.vo.InterventionsTreatmentForAdviceLeafletVo;
import ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo;
import ims.emergency.vo.enums.DischargeDetails_CustomEvents;
import ims.emergency.vo.lookups.Dischargequipment;
import ims.emergency.vo.lookups.DischargequipmentCollection;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;

import java.util.ArrayList;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		//WDEV-17337
		form.getLocalContext().setCustomEvent(DischargeDetails_CustomEvents.CANCEL);
		form.fireCustomControlValueChanged();
		
		open();
		form.lyrAdviceMobility().showtabAdvice();
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		//WDEV-17337
		form.getLocalContext().setCustomEvent(DischargeDetails_CustomEvents.SAVE);
		form.fireCustomControlValueChanged();
		
		form.getLocalContext().setRecord(populateDataFromInstanceControls(form.getLocalContext().getRecord()));
		if ( !isFormPopulated())
		{
			//WDEV-18103
			engine.showMessage("There is no data entered to save. Please enter some data on either 'Advice' or 'Mobility and Equipment' tabs and save again.");
			return;
		}
		if( save())
		{
			open();
			
		}
	}
	public boolean save() throws PresentationLogicException
	{
		try
		{
			// Get data from screen
			form.getLocalContext().setRecord(populateDataFromInstanceControls(form.getLocalContext().getRecord()));

			// Validate data
			String[] errors = form.getLocalContext().getRecord().validate();//WDEV-17822

			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}

			// Attempt to save data to database
			form.getLocalContext().setRecord(domain.save(form.getLocalContext().getRecord(),null));

			return true;
		}
		// Treat any errors that might arise
		catch (StaleObjectException e)
		{
			e.printStackTrace();

			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			initialize();
			open();
			form.lyrAdviceMobility().showtabAdvice();
			return false;
		}
	}
	
	//WDEV-17822
	private String[] getUIErrors()
	{
		ArrayList<String> errors = new ArrayList<String>();

		if (form.lyrAdviceMobility().tabAdvice().txtOverallAdvice().getValue()==null)
		{
			errors.add("'Actions, Comments and advice for GP' is mandatory!");
		}
		
		if (errors.size() > 0)
		{
			String[] UIErrors = new String[errors.size()];
			errors.toArray(UIErrors);
			return UIErrors;
		}

		return null;
	}
	
	private DischargeServicesAndAdviceForDischargePlanningVo populateDataFromInstanceControls(DischargeServicesAndAdviceForDischargePlanningVo record)
	{
		// If no record exist then create and initialize one
		if (record == null)
		{
			record = new DischargeServicesAndAdviceForDischargePlanningVo();
			
			record.setPatient(form.getGlobalContext().Core.getPatientShort());
			record.setEpisode(form.getGlobalContext().Core.getEpisodeofCareShort());
			record.setAttendance(form.getLocalContext().getCareContext());
		}
		
		// Get selected PatientMobility values
		record.setPatientMobility(new PatientMobilityCollection());
		
		for (int i = 0; i < form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRows().size(); i++)
		{
			ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabMobilityAndEquipmentContainer.grdMobilityRow row = form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRows().get(i);
			
			if (row.getColSelect())
			{
				record.getPatientMobility().add(row.getValue());
			}
		}
		
		// Get Transport details
		record.setTransportArrangedType(form.lyrAdviceMobility().tabMobilityAndEquipment().cmbTransportType().getValue());
		record.setTransportDateTime(form.lyrAdviceMobility().tabMobilityAndEquipment().dtimTransport().getValue());
		record.setBookingNo(form.lyrAdviceMobility().tabMobilityAndEquipment().txtBookingNo().getValue());
		
		// Get selected Equipment values
		record.setEquipment(new DischargequipmentCollection());
		
		for (int i = 0; i < form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRows().size(); i++)
		{
			ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabMobilityAndEquipmentContainer.grdEquipmentRow row = form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRows().get(i);
			
			if (row.getColSelect())
			{
				record.getEquipment().add(row.getValue());
			}
		}
		
		// Get overall Comments
		record.setComments(form.lyrAdviceMobility().tabAdvice().txtOverallAdvice().getValue());
		
		return record;
	}
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCustomEvent(null);
		updateInstance();
	}
	public void updateInstance()
	{
		form.setMode(FormMode.EDIT);
	}
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCustomEvent(null);
		newInstance();
	}
	public void newInstance() throws PresentationLogicException
	{
		// Set form in EDIT mode
		form.setMode(FormMode.EDIT);
	}
	protected void onBtnPrintAdviceClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCustomEvent(null);
		selectPrinter();
	}
	private void selectPrinter()
	{
		engine.open(form.getForms().Admin.SelectPrinterDialog);
	}
	
	protected void onGrdAdviceLefletGridCheckBoxClicked(int column, ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabAdviceContainer.grdAdviceLefletRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCustomEvent(null);
		
		updateControlsState();
	}
	
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID)
		{
			case ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.ContextMenus.EmergencyNamespace.DischargeAdviceLeaflet.Preview:

				form.getLocalContext().setCustomEvent(null);
				
				previewReport();
				break;
		}
	}
	private void previewReport() 
	{
		String result = "";
		
		String urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		String urlQueryServer = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		
		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, engine.getSessionId());
		
		
		if( form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getSelectedRow().getValue() instanceof AdviceLeafletConfigDisplayVo)
		{
			result = previewAdviceLeafletReport(form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getSelectedRow().getValue(), urlReportServer, client); 
		}
		if(result != "")
		{
			engine.openUrl(result);
		}
	}
	private String previewAdviceLeafletReport(AdviceLeafletConfigDisplayVo valuerow, String urlReportServer, QueryBuilderClient client) 
	{
		String result = "";
		
		if(urlReportServer == null)
			urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		
		if(client == null)
			client = new QueryBuilderClient(ConfigFlag.GEN.QUERY_SERVER_URL.getValue(), engine.getSessionId());
		
		// Get Report and Template from database
		String report[] = domain.getReportAndTemplate(valuerow.getTemplate());

		
		
		if(report == null || report.length < 2)
		{
			engine.showMessage("I could not get the report and template for selected advice lealfet! ");
			return result;
		}

		if(report[0] == null || report[1] == null)
		{
			engine.showMessage("The report for selected advice leaflet has not been deployed !");
			return result;
		}
		
		//OrderInvestigationRefVo refDFTInv = (OrderInvestigationRefVo) row.getValue();
		//client.addSeed(new SeedValue("OrderInvestigation_id", refDFTInv.getID_OrderInvestigation(), Integer.class));
		
		try
		{
			result = client.buildReportAsUrl(report[0], report[1], urlReportServer, "PDF", "",1);
			client.getSeeds().clear();
		} 
		catch (QueryBuilderClientException e1)
		{
			engine.showMessage("Error building the report: " + e1.toString());
			return result;
		}
		
		return result;
	}
	public void initialize()
	{
		form.lyrAdviceMobility().tabAdvice().setHeaderVisible(true);
		form.lyrAdviceMobility().tabMobilityAndEquipment().setHeaderVisible(true);
		
		// Bind PatientMobility grid
		bindPatientMobilityGrid();
		
		// Bind Equipment Provided grid
		bindEquipmentProvided();
	}

	public void setValue(ims.clinical.configuration.vo.ClinicalProblemRefVo clinicalProblem, ims.core.admin.vo.CareContextRefVo careContext)
	{
		// Initialize the form
		initialize();
		
		// Set local context for problem
		form.getLocalContext().setCareContext(careContext);
		
		// Set local context for CareContext
		form.getLocalContext().setMainProblem(clinicalProblem);
		
		// Present form to screen
		open();
	}
	public void clear()
	{
		// Clear 'Advice Leaflet' grid
		form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().clear();
		
		// Clear instance controls
		clearInstanceControls();
	}
	public void clearInstanceControls()
	{
		// Clear patient mobility
		for (int i = 0; i < form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRows().size(); i++)
		{
			form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRows().get(i).setColSelect(false);
		}
		
		// Clear Transport Details
		form.lyrAdviceMobility().tabMobilityAndEquipment().cmbTransportType().setValue(null);
		form.lyrAdviceMobility().tabMobilityAndEquipment().dtimTransport().setValue(null);
		form.lyrAdviceMobility().tabMobilityAndEquipment().txtBookingNo().setValue(null);
		
		// Clear Equipment provided
		for (int i = 0; i < form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRows().size(); i++)
		{
			form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRows().get(i).setColSelect(false);
		}
		
		// Clear comments
		form.lyrAdviceMobility().tabAdvice().txtOverallAdvice().setValue(null);
	}
	
	public void open()
	{
		// Clear screen
		clear();
		
		form.getLocalContext().setRecord(domain.getDischargeServiceAndAdvice(form.getLocalContext().getCareContext()));
		// Populate advice leaflets
		populateAdviceLeaflets(domain.getAdviceLeaflets(form.getLocalContext().getMainProblem()));
		
		// Populate instance controls
		
		populateInstanceControls(form.getLocalContext().getRecord());
		
		// Set form in VIEW mode
		form.setMode(FormMode.VIEW);
		updateControlsState();
	}
	private void populateInstanceControls(DischargeServicesAndAdviceForDischargePlanningVo record)
	{
		// Clear instance controls
		clearInstanceControls();
		
		// Check parameter
		if (record == null)
			return;
		

		// Populate patient mobility
		if (record.getPatientMobilityIsNotNull())
		{
			for (int i = 0; i < record.getPatientMobility().size(); i++)
			{
				ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabMobilityAndEquipmentContainer.grdMobilityRow row = form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRowByValue(record.getPatientMobility().get(i));
				
				if (row != null) row.setColSelect(true);
			}
		}
		
		// Populate Transport details
		form.lyrAdviceMobility().tabMobilityAndEquipment().cmbTransportType().setValue(record.getTransportArrangedType());
		form.lyrAdviceMobility().tabMobilityAndEquipment().dtimTransport().setValue(record.getTransportDateTime());
		form.lyrAdviceMobility().tabMobilityAndEquipment().txtBookingNo().setValue(record.getBookingNo());
		
		// Populate Equipment type
		if (record.getEquipmentIsNotNull())
		{
			for (int i = 0; i < record.getEquipment().size(); i++)
			{
				ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabMobilityAndEquipmentContainer.grdEquipmentRow row = form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRowByValue(record.getEquipment().get(i));
				
				if (row != null) row.setColSelect(true);
			}
		}
		
		// Populate Comments
		form.lyrAdviceMobility().tabAdvice().txtOverallAdvice().setValue(record.getComments());		
	}

	private void populateAdviceLeaflets(AdviceLeafletConfigDisplayVoCollection adviceLeaflets)
	{
		// Clear advice leaflet grid
		form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().clear();
		
		// Check advice collection parameter
		if (adviceLeaflets == null)
			return;
		
		
		for (AdviceLeafletConfigDisplayVo advice : adviceLeaflets)
		{
			ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabAdviceContainer.grdAdviceLefletRow row = form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().newRow();
			
			row.setColAdvice(advice.getTemplate().getName());
			row.setColSelect(false);
			row.setColumnGiven(isAdiceLeafletsPrinted(advice,form.getLocalContext().getRecord(),row));
			row.setValue(advice);
		}
	}
	//wdev-17075
	private boolean isAdiceLeafletsPrinted(AdviceLeafletConfigDisplayVo advice, DischargeServicesAndAdviceForDischargePlanningVo record,ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabAdviceContainer.grdAdviceLefletRow row)
	{
		if( advice == null  )
			return false;
		if( record == null || !record.getAdviceLeafletsPrintedIsNotNull() || record.getAdviceLeafletsPrinted().size() == 0)
			return false;
		
		for( int i = 0 ; i < record.getAdviceLeafletsPrinted().size();i++)
		{
			if( advice.getTemplateIsNotNull() && record.getAdviceLeafletsPrinted().get(i).getTemplateIsNotNull())
			{
				if( advice.getTemplate().getID_TemplateBo().equals(record.getAdviceLeafletsPrinted().get(i).getTemplate().getID_TemplateBo()))
				{
					row.setCellColumnGivenTooltip("Given Date: " + record.getAdviceLeafletsPrinted().get(i).getDateGiven().toString()+ ", Authoring HCP: "+ record.getAdviceLeafletsPrinted().get(i).getAuthoringHCP().getName().toString());
					return true;
				}
			}
		}
		
		return false;
		
	}
	//----------
	public void setReadOnly(Boolean readOnly)
	{
		form.getLocalContext().setReadOnly(readOnly);
		
		updateControlsState();
	}
	private boolean isAdviceSelected()
	{
		for (int i = 0; i < form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().size(); i++)
		{
			if( form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().get(i).getColSelect() == true)
				return true;
		}

		return false;
	}

	public void updateControlsState()
	{
		if( FormMode.VIEW.equals(form.getMode()))
		{
	   		form.btnNew().setVisible(true);
    		form.btnNew().setEnabled(!Boolean.TRUE.equals(form.getLocalContext().getReadOnly()) 
    				&& (form.getLocalContext().getRecord() == null ||  (form.getLocalContext().getRecordIsNotNull() && !isFormPopulated())) );  //wdev-17350
    		
     		form.btnEdit().setVisible((form.getLocalContext().getRecordIsNotNull() && isFormPopulated()));
    		form.btnEdit().setEnabled(!Boolean.TRUE.equals(form.getLocalContext().getReadOnly()));
    		
    		boolean adviceSelected = isAdviceSelected();

    		form.lyrAdviceMobility().tabAdvice().btnPrintAdvice().setVisible(true);
    		form.lyrAdviceMobility().tabAdvice().btnPrintAdvice().setEnabled(!Boolean.TRUE.equals(form.getLocalContext().getReadOnly()) && adviceSelected);
    		
    		form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().setReadOnly(Boolean.TRUE.equals(form.getLocalContext().getReadOnly())); //wdev-16751
    		
    		// Also the context menu print option
    		form.getContextMenus().Emergency.getDischargeAdviceLeafletPreviewItem().setVisible(true);
    		form.getContextMenus().Emergency.getDischargeAdviceLeafletPreviewItem().setEnabled(form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getValue() != null);
		}
	}

	private boolean isFormPopulated() 
	{
		if (form.getLocalContext().getRecord() == null)
			return false;

		if (form.getLocalContext().getRecord().getPatientMobilityIsNotNull()
			&& form.getLocalContext().getRecord().getPatientMobility().size() >0)
			return true;
		
		if (form.getLocalContext().getRecord().getTransportArrangedTypeIsNotNull()
			|| form.getLocalContext().getRecord().getCommentsIsNotNull()
			|| form.getLocalContext().getRecord().getTransportDateTimeIsNotNull()
			|| form.getLocalContext().getRecord().getBookingNoIsNotNull())
			return true;
		
		if (form.getLocalContext().getRecord().getEquipmentIsNotNull()
			&& form.getLocalContext().getRecord().getEquipment().size() > 0)
			return true;

		return false;
	}

	public ims.emergency.vo.enums.DischargeDetails_CustomEvents getCustomEvent()
	{
		return form.getLocalContext().getCustomEvent();//WDEV-17337
	}

	public void clearCustomEvent()
	{
		form.getLocalContext().setCustomEvent(null);
	}
	/**
	 * Function used to bind Patient Mobility lookup to grid
	 */
	private void bindPatientMobilityGrid()
	{
		// Clear grid
		form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRows().clear();
		
		// Get PatientMobility values
		PatientMobilityCollection values = LookupHelper.getPatientMobility(domain.getLookupService());
		
		// Add each Patient Mobility to grid
		if (values != null)
		{
			for (int i = 0; i < values.size(); i++)
			{
				PatientMobility mobility = values.get(i);
				
				grdMobilityRow row = form.lyrAdviceMobility().tabMobilityAndEquipment().grdMobility().getRows().newRow();
				
				row.setColMobility(mobility.getText());
				row.setColMobilityReadOnly(false);
				
				row.setValue(mobility);
			}
		}
	}


	/**
	 * Function used to bind Equipment Provided lookup to grid
	 */
	private void bindEquipmentProvided()
	{
		// Clear grid
		form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRows().clear();
		
		// Get Equipment values
		DischargequipmentCollection values = ims.emergency.vo.lookups.LookupHelper.getDischargequipment(domain.getLookupService());

		// Add each Equipment to grid
		if (values != null)
		{
			for (int i = 0; i < values.size(); i++)
			{
				Dischargequipment equipment = values.get(i);
				
				grdEquipmentRow row = form.lyrAdviceMobility().tabMobilityAndEquipment().grdEquipment().getRows().newRow();
				
				row.setColEquipment(equipment.getText());
				row.setColEquipmentReadOnly(false);
				
				row.setValue(equipment);
			}
		}
	}

	
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		// TODO Auto-generated method stub
		
	}

	
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		
		// Check if printing is necessary
		if (form.getForms().Admin.SelectPrinterDialog.equals(formName) && DialogResult.OK.equals(result))
		{
			form.getLocalContext().setIsPrintingOk(Boolean.FALSE);		//wdev-17075
			form.getLocalContext().setPrintedAdviceLeaflets(null);		//wdev-17075
			printSelectedAdviceLeaflets();
			//wdev-17075
			if( Boolean.TRUE.equals(form.getLocalContext().getIsPrintingOk()))
			{
				if( saveAdviceLeafletPrinted(form.getLocalContext().getRecord()))
				{
					open();
					form.lyrAdviceMobility().showtabAdvice();
				}
				
				
			}
			//------------
		}
		
		//WDEV-17337
		if (DialogResult.OK.equals(result))
		{
			form.getLocalContext().setCustomEvent(DischargeDetails_CustomEvents.SAVE);
			form.fireCustomControlValueChanged();
		}
		else
		{
			form.getLocalContext().setCustomEvent(DischargeDetails_CustomEvents.CANCEL);
			form.fireCustomControlValueChanged();
		}
		
	}
	//wdev-17075
	private InterventionsTreatmentForAdviceLeafletVo populateInterventionTreatment()
	{
		
		InterventionsTreatmentForAdviceLeafletVo interVo = null;
		TreatmentInterventionForAdviceLeafletVo tempVo = domain.getTreatmentIntervention(TaxonomyType.MAXIMS_INTERNAL, "ADVICE_LEAFLET");
		if( tempVo != null)
		{
			interVo = domain.getInterventionsTreatmentsForAttendence(form.getLocalContext().getCareContext());
			if( interVo == null )
			{
				interVo = new InterventionsTreatmentForAdviceLeafletVo();
				interVo.setPatient(form.getGlobalContext().Core.getPatientShort());
				interVo.setEpisode(form.getGlobalContext().Core.getEpisodeofCareShort());
				interVo.setAttendance(form.getLocalContext().getCareContext());
			}
			
			InterventionTreatmentDetailForAdviceLeafletVoCollection intreatDetCollVo = interVo.getInterventionTreatments();
			if( intreatDetCollVo == null)
				intreatDetCollVo = new InterventionTreatmentDetailForAdviceLeafletVoCollection();
			
			if( false == collectionHasInterventionTreatmentAlready(intreatDetCollVo, tempVo ))  //wdev-17439
			{
			
				InterventionTreatmentDetailForAdviceLeafletVo intTreatDetVo = new InterventionTreatmentDetailForAdviceLeafletVo();
				
				AuthoringInformationVo temAuthVo = new AuthoringInformationVo();
				
				HcpLiteVo hcp = null;
				if( domain.getHcpLiteUser() instanceof HcpLiteVo )
				{
					hcp = (HcpLiteVo) domain.getHcpLiteUser();
				}
				temAuthVo.setAuthoringHcp(hcp);
				temAuthVo.setAuthoringDateTime(new DateTime());
				intTreatDetVo.setAuthoringInformation(temAuthVo);
				intTreatDetVo.setTreatmentInterventionDescription(tempVo.getTreatmentInterventionName());
				intTreatDetVo.setTreatmentIntervention(tempVo);
				
				intreatDetCollVo.add(intTreatDetVo);
				interVo.setInterventionTreatments(intreatDetCollVo);
			
			}
			
			return interVo;
		}
		
		return null;

	}
	//wdev-17439
	private boolean collectionHasInterventionTreatmentAlready(InterventionTreatmentDetailForAdviceLeafletVoCollection intreatDetCollVo, TreatmentInterventionForAdviceLeafletVo tempVo )
	{
		if( intreatDetCollVo != null && intreatDetCollVo.size() > 0 && tempVo != null )
		{
			for( int i = 0; i < intreatDetCollVo.size();i++ )
			{
				InterventionTreatmentDetailForAdviceLeafletVo intreatVo = intreatDetCollVo.get(i); 
				if( intreatVo != null && intreatVo.getTreatmentInterventionIsNotNull())
				{
					if( intreatVo.getTreatmentIntervention().getID_TreatmentInterventionIsNotNull() && intreatVo.getTreatmentIntervention().getID_TreatmentIntervention().equals(tempVo.getID_TreatmentIntervention()))
						return true;
				}
			}
		}
		
		return false;
	}
	
	//wdev-17075
	private AdviceLeafletConfigDisplayVo getTemplate()
	{
		for(int i = 0;i < form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().size();i++)
		{
			if( form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().get(i).getColSelect() == true )
				return form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().get(i).getValue();
			
		}
		return null;
	}
	
	
	private AdviceLeafletsForSelectAndPrinterVoCollection addAdviceLeafletsForSelectedAndPrinter(AdviceLeafletConfigDisplayVoCollection tenpColl, AdviceLeafletsForSelectAndPrinterVoCollection tempRecSelected)
	{
		if( tenpColl == null || tenpColl.size() == 0 )
			return null;
		
		if( tempRecSelected == null )
			tempRecSelected = new AdviceLeafletsForSelectAndPrinterVoCollection();
		
		for(int i = 0; i < tenpColl.size();i++)
		{
			AdviceLeafletsForSelectAndPrinterVo tempVo = new AdviceLeafletsForSelectAndPrinterVo();
			AdviceLeafletConfigDisplayVo advTemplVo  = tenpColl.get(i);
			tempVo.setTemplate(advTemplVo != null ? advTemplVo.getTemplate():null);
			tempVo.setDateGiven(new Date());
			tempVo.setCareContext(form.getLocalContext().getCareContext());
			
			HcpLiteVo hcpVo = null;
			if( domain.getHcpLiteUser() instanceof HcpLiteVo)
			{
				hcpVo = (HcpLiteVo) domain.getHcpLiteUser();
			}
			tempVo.setAuthoringHCP(hcpVo);
			tempVo.setAuthoringDateTime(new DateTime());
			tempRecSelected.add(tempVo);
		}
		
		return tempRecSelected;
	}
	private boolean saveAdviceLeafletPrinted( DischargeServicesAndAdviceForDischargePlanningVo record)
	{
		if (record == null)
		{
			record = new DischargeServicesAndAdviceForDischargePlanningVo();
			
			record.setPatient(form.getGlobalContext().Core.getPatientShort());
			record.setEpisode(form.getGlobalContext().Core.getEpisodeofCareShort());
			record.setAttendance(form.getLocalContext().getCareContext());
		}
		
		AdviceLeafletsForSelectAndPrinterVoCollection tempColl = record.getAdviceLeafletsPrinted();
		//if( tempColl == null)
		//	tempColl = new AdviceLeafletsForSelectAndPrinterVoCollection();
		
		if( form.getLocalContext().getPrintedAdviceLeafletsIsNotNull() && form.getLocalContext().getPrintedAdviceLeaflets().size() > 0)
		{
			tempColl = addAdviceLeafletsForSelectedAndPrinter(form.getLocalContext().getPrintedAdviceLeaflets(),tempColl);
			record.setAdviceLeafletsPrinted(tempColl);
		}
		
				
		InterventionsTreatmentForAdviceLeafletVo intervTreatmVo =  populateInterventionTreatment();
		
		String[] errorstreatment = null;
		
		if( intervTreatmVo != null)
			errorstreatment = intervTreatmVo.validate();	
		
		String[] errors = record.validate(errorstreatment);

		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
						
		try
		{
			

			// Attempt to save data to database
			form.getLocalContext().setRecord(domain.save(record,intervTreatmVo));

			return true;
		}
		// Treat any errors that might arise
		catch (StaleObjectException e)
		{
			e.printStackTrace();

			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			initialize();
			open();
			form.lyrAdviceMobility().showtabAdvice();
			return false;
		}
		
		
		
	}
	
	private void printSelectedAdviceLeaflets()
	{
		String templateName = null;  								//wdev-17075
		form.getLocalContext().setIsPrintingOk(Boolean.FALSE);		//wdev-17075
		try
		{
			// Get selected advice leaflets
			AdviceLeafletConfigDisplayVoCollection selectedAdviceLeaflets = new AdviceLeafletConfigDisplayVoCollection();

			for (int i = 0; i < form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().size(); i++)
			{
				ims.emergency.forms.dischargeplanning_advicemobilityequipment.GenForm.lyrAdviceMobilityLayer.tabAdviceContainer.grdAdviceLefletRow adviceRow = form.lyrAdviceMobility().tabAdvice().grdAdviceLeflet().getRows().get(i);

				if (adviceRow.getColSelect())	selectedAdviceLeaflets.add(adviceRow.getValue());
			}
			
			
			// For each selected advice leaflet
			for (AdviceLeafletConfigDisplayVo adviceLeaflet : selectedAdviceLeaflets)
			{
				// Get Report and Template from database
				String report[] = domain.getReportAndTemplate(adviceLeaflet.getTemplate());
				//wdev-17075
				if( adviceLeaflet != null && adviceLeaflet.getTemplateIsNotNull())
					templateName = adviceLeaflet.getTemplate().getName();
				//-----------	
				// Check for valid report and template
				if (report == null)
				{
					engine.showMessage("No report found for selected advice leaflet");
					form.getLocalContext().setIsPrintingOk(Boolean.FALSE);		//wdev-17075
					return;
				}

				// Create a query builder client instance
				QueryBuilderClient client = new QueryBuilderClient(ConfigFlag.GEN.QUERY_SERVER_URL.getValue(), engine.getSessionId());

				// Attempt to build report and print it to printer
				String printerName = form.getGlobalContext().Admin.getSelectedPrinter() != null ? form.getGlobalContext().Admin.getSelectedPrinter().getIPrinterName() : null;
				client.buildReport(report[0], report[1], ConfigFlag.GEN.REPORT_SERVER_URL.getValue(), "PDF", printerName, 1);
				
				//wdev-17075
				AdviceLeafletConfigDisplayVoCollection printColl = form.getLocalContext().getPrintedAdviceLeaflets();
				if( printColl == null)
					printColl = new AdviceLeafletConfigDisplayVoCollection();
				printColl.add(adviceLeaflet);
				form.getLocalContext().setPrintedAdviceLeaflets(printColl);
				form.getLocalContext().setIsPrintingOk(Boolean.TRUE);
				//---------------------
			}
			
			
		}
		catch (QueryBuilderClientException exception)
		{
			
			engine.showMessage("Advice Leaflet: " + (templateName != null ? templateName:"") + " cannot be printed");		//wdev-17075	
			exception.printStackTrace();
		}
	}

	
	protected void onGrdAdviceLefletSelectionChanged() throws PresentationLogicException
	{
		updateControlsState();
		
	}
}
