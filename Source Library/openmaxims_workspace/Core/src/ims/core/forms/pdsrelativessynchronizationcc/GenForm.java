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

package ims.core.forms.pdsrelativessynchronizationcc;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	protected void fireCustomControlValueChanged()
	{
		super.fireValueChanged();
	}
	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	public static class grdSyncRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdSyncRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setcolPdsLocalReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean iscolPdsLocalReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showcolPdsLocalOpened()
		{
			super.row.showOpened(0);
		}
		public String getcolPdsLocal()
		{
			return (String)super.row.get(0);
		}
		public void setcolPdsLocal(String value)
		{
			super.row.set(0, value);
		}
		public void setCellcolPdsLocalTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setcolNameReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean iscolNameReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showcolNameOpened()
		{
			super.row.showOpened(1);
		}
		public String getcolName()
		{
			return (String)super.row.get(1);
		}
		public void setcolName(String value)
		{
			super.row.set(1, value);
		}
		public void setCellcolNameTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public void setcolRoleReadOnly(boolean value)
		{
			super.row.setReadOnly(2, value);
		}
		public boolean iscolRoleReadOnly()
		{
			return super.row.isReadOnly(2);
		}
		public void showcolRoleOpened()
		{
			super.row.showOpened(2);
		}
		public String getcolRole()
		{
			return (String)super.row.get(2);
		}
		public void setcolRole(String value)
		{
			super.row.set(2, value);
		}
		public void setCellcolRoleTooltip(String value)
		{
			super.row.setTooltip(2, value);
		}
		public void setcolTypeReadOnly(boolean value)
		{
			super.row.setReadOnly(3, value);
		}
		public boolean iscolTypeReadOnly()
		{
			return super.row.isReadOnly(3);
		}
		public void showcolTypeOpened()
		{
			super.row.showOpened(3);
		}
		public String getcolType()
		{
			return (String)super.row.get(3);
		}
		public void setcolType(String value)
		{
			super.row.set(3, value);
		}
		public void setCellcolTypeTooltip(String value)
		{
			super.row.setTooltip(3, value);
		}
		public void setcolContactReadOnly(boolean value)
		{
			super.row.setReadOnly(4, value);
		}
		public boolean iscolContactReadOnly()
		{
			return super.row.isReadOnly(4);
		}
		public void showcolContactOpened()
		{
			super.row.showOpened(4);
		}
		public String getcolContact()
		{
			return (String)super.row.get(4);
		}
		public void setcolContact(String value)
		{
			super.row.set(4, value);
		}
		public void setCellcolContactTooltip(String value)
		{
			super.row.setTooltip(4, value);
		}
		public void setcolRemoveReadOnly(boolean value)
		{
			super.row.setReadOnly(5, value);
		}
		public boolean iscolRemoveReadOnly()
		{
			return super.row.isReadOnly(5);
		}
		public void showcolRemoveOpened()
		{
			super.row.showOpened(5);
		}
		public ims.framework.utils.Image getcolRemove()
		{
			return (ims.framework.utils.Image)super.row.get(5);
		}
		public void setcolRemove(ims.framework.utils.Image value)
		{
			super.row.set(5, value);
		}
		public void setCellcolRemoveTooltip(String value)
		{
			super.row.setTooltip(5, value);
		}
		public ims.core.vo.PatRelative getValue()
		{
			return (ims.core.vo.PatRelative)super.row.getValue();
		}
		public void setValue(ims.core.vo.PatRelative value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdSyncRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdSyncRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdSyncRow get(int index)
		{
			return new grdSyncRow(super.collection.get(index));
		}
		public grdSyncRow newRow()
		{
			return new grdSyncRow(super.collection.newRow());
		}
		public grdSyncRow newRow(boolean autoSelect)
		{
			return new grdSyncRow(super.collection.newRow(autoSelect));
		}
		public grdSyncRow newRowAt(int index)
		{
			return new grdSyncRow(super.collection.newRowAt(index));
		}
		public grdSyncRow newRowAt(int index, boolean autoSelect)
		{
			return new grdSyncRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdSyncGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		private void addButtonColumn(String caption, int captionAlignment, int alignment, int width, boolean bold, boolean canGrow)
		{
			super.grid.addButtonColumn(caption, captionAlignment, alignment, width, bold, canGrow);
		}
		public ims.core.vo.PatRelativeCollection getValues()
		{
			ims.core.vo.PatRelativeCollection listOfValues = new ims.core.vo.PatRelativeCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.core.vo.PatRelative getValue()
		{
			return (ims.core.vo.PatRelative)super.grid.getValue();
		}
		public void setValue(ims.core.vo.PatRelative value)
		{
			super.grid.setValue(value);
		}
		public grdSyncRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdSyncRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdSyncRowCollection getRows()
		{
			return new grdSyncRowCollection(super.grid.getRows());
		}
		public grdSyncRow getRowByValue(ims.core.vo.PatRelative value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdSyncRow(row);
		}
		public void setcolPdsLocalHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getcolPdsLocalHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setcolNameHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getcolNameHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
		public void setcolRoleHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(2, value);
		}
		public String getcolRoleHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(2);
		}
		public void setcolTypeHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(3, value);
		}
		public String getcolTypeHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(3);
		}
		public void setcolContactHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(4, value);
		}
		public String getcolContactHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(4);
		}
		public void setcolRemoveHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(5, value);
		}
		public String getcolRemoveHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(5);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(880, 616);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setImageReferences(ImageReferencesFlyweightFactory.getInstance().create(Images.class));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Grid Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 864, 600, ims.framework.enumerations.ControlAnchoring.ALL);
		Grid m_grdSyncTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), new Integer(-1), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.FALSE, Boolean.FALSE, new Integer(24), Boolean.TRUE, null, Boolean.FALSE, Boolean.FALSE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdSyncTemp);
		grdSyncGrid grdSync = (grdSyncGrid)GridFlyweightFactory.getInstance().createGridBridge(grdSyncGrid.class, m_grdSyncTemp);
		grdSync.addStringColumn("PDS / Local", 0, 0, 80, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSync.addStringColumn("Name", 0, 0, 240, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSync.addStringColumn("Role", 0, 0, 150, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSync.addStringColumn("Type", 0, 0, 130, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSync.addStringColumn("Contact No", 0, 0, 130, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSync.addButtonColumn("Remove", 1, 1, -1, false, true);
		super.addGrid(grdSync);
	}



	public Images getImages()
	{
		return (Images)super.getImageReferences();
	}
	public grdSyncGrid grdSync()
	{
		return (grdSyncGrid)super.getGrid(0);
	}

	public static class Images implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		private final class ImageHelper extends ims.framework.utils.ImagePath
		{
			private static final long serialVersionUID = 1L;
			
			private ImageHelper(int id, String path, Integer width, Integer height)
			{
				super(id, path, width, height);
			}
		}
		private Images()
		{
			Core = new CoreImages();
		}
		public final class CoreImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreImages()
			{
				LeftArrowDisabled16 = new ImageHelper(102581, "Images/Core/arrow_left_disabled_16.png", new Integer(16), new Integer(16));
				LeftArrowEnabled16 = new ImageHelper(102582, "Images/Core/arrow_left_enabled_16.png", new Integer(16), new Integer(16));
				LeftArrowRed16 = new ImageHelper(102579, "Images/Core/arrow_left_red_16.png", new Integer(16), new Integer(16));
				RightArrowDisabled16 = new ImageHelper(102583, "Images/Core/arrow_right_disabled_16.png", new Integer(16), new Integer(16));
				RightArrowEnabled16 = new ImageHelper(102584, "Images/Core/arrow_right_enabled_16.png", new Integer(16), new Integer(16));
				RightArrowRed16 = new ImageHelper(102580, "Images/Core/arrow_right_red_16.png", new Integer(16), new Integer(16));
				Remove = new ImageHelper(102300, "Images/Core/remove.gif", new Integer(16), new Integer(16));
			}
			public final ims.framework.utils.Image LeftArrowDisabled16;
			public final ims.framework.utils.Image LeftArrowEnabled16;
			public final ims.framework.utils.Image LeftArrowRed16;
			public final ims.framework.utils.Image RightArrowDisabled16;
			public final ims.framework.utils.Image RightArrowEnabled16;
			public final ims.framework.utils.Image RightArrowRed16;
			public final ims.framework.utils.Image Remove;
		}
		public final CoreImages Core;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_Relatives = new ims.framework.ContextVariable("Relatives", prefix + "_lv_Core.PDSRelativesSynchronizationCc.__internal_x_context__Relatives_" + componentIdentifier + "");
		}
		
		public boolean getRelativesIsNotNull()
		{
			return !cxl_Relatives.getValueIsNull(context);
		}
		public ims.core.vo.PatRelativeCollection getRelatives()
		{
			return (ims.core.vo.PatRelativeCollection)cxl_Relatives.getValue(context);
		}
		public void setRelatives(ims.core.vo.PatRelativeCollection value)
		{
			cxl_Relatives.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_Relatives = null;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[144];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DEMENTIABREACHDATETIME", "DementiaBreachDateTime");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DEMENTIAWORKLISTSTATUS", "DementiaWorklistStatus");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MRNSTATUS", "MRNStatus");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-HASSCANNEDCASENOTEFOLDERS", "HasScannedCaseNoteFolders");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISCONFIDENTIAL", "IsConfidential");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFBIRTH", "TimeOfBirth");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-PATIENTCATEGORY", "PatientCategory");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPAENDOSCOPIST", "IsHCPaEndoscopist");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-ID", "ID_NAESReferral");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-DATEREFERRALRECEIVED", "DateReferralReceived");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-DATEOFSURGERY", "DateOfSurgery");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-REFERRINGHOSPITAL", "ReferringHospital");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-REFERRINGDOCTOR", "ReferringDoctor");
			fields[71] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-REFERRALREASON", "ReferralReason");
			fields[72] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-SECONDARYSURGERY", "SecondarySurgery");
			fields[73] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-UNDERLYINGREASON", "UnderlyingReason");
			fields[74] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-AFFECTEDEYE", "AffectedEye");
			fields[75] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-IMPLANT", "Implant");
			fields[76] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-IMPLANTTYPE", "ImplantType");
			fields[77] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-INTERPRETERREQUIRED", "InterpreterRequired");
			fields[78] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-LANGUAGE", "Language");
			fields[79] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-LANGUAGEIFOTHER", "LanguageIfOther");
			fields[80] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-REFERREDBY", "ReferredBy");
			fields[81] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-_6WEEKKPI", "SixWeekKPI");
			fields[82] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-_3WEEKKPI", "ThreeWeekKPI");
			fields[83] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-PREFERREDCLINIC", "PreferredClinic");
			fields[84] = new ims.framework.ReportField(this.context, "_cvp_Naes.Referral", "BO-1097100004-NOTES", "Notes");
			fields[85] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[86] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[87] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[88] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[89] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[90] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[91] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[92] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[93] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[94] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[95] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientClinicalNotesSearchCriteria", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[96] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientClinicalNotesSearchCriteria", "BO-1011100000-NOTETYPE", "NoteType");
			fields[97] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientClinicalNotesSearchCriteria", "BO-1011100000-FORREVIEW", "ForReview");
			fields[98] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientClinicalNotesSearchCriteria", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[99] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-ID", "ID_ObservationForm");
			fields[100] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-FORMTYPE", "FormType");
			fields[101] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-DETAILS", "Details");
			fields[102] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-DATETIMESTART", "DateTimeStart");
			fields[103] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-DATETIMESTOP", "DateTimeStop");
			fields[104] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-ISSTOPPED", "IsStopped");
			fields[105] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-CARECONTEXT", "CareContext");
			fields[106] = new ims.framework.ReportField(this.context, "_cvp_Nursing.ObservationFormsSearchCriteria", "BO-1011100002-CLINICALCONTACT", "ClinicalContact");
			fields[107] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesAdmSearchCriteia", "BO-1072100034-ID", "ID_MedicationOverview");
			fields[108] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesAdmSearchCriteia", "BO-1072100034-TYPE", "Type");
			fields[109] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesAdmSearchCriteia", "BO-1072100034-CARECONTEXT", "CareContext");
			fields[110] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesDisSearchCriteria", "BO-1072100034-ID", "ID_MedicationOverview");
			fields[111] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesDisSearchCriteria", "BO-1072100034-TYPE", "Type");
			fields[112] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesDisSearchCriteria", "BO-1072100034-CARECONTEXT", "CareContext");
			fields[113] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesOPDSearchCriteria", "BO-1072100034-ID", "ID_MedicationOverview");
			fields[114] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesOPDSearchCriteria", "BO-1072100034-TYPE", "Type");
			fields[115] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesOPDSearchCriteria", "BO-1072100034-CARECONTEXT", "CareContext");
			fields[116] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesPatSearchCriteria", "BO-1072100034-ID", "ID_MedicationOverview");
			fields[117] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesPatSearchCriteria", "BO-1072100034-TYPE", "Type");
			fields[118] = new ims.framework.ReportField(this.context, "_cvp_Clinical.MedMultipleDosesPatSearchCriteria", "BO-1072100034-CARECONTEXT", "CareContext");
			fields[119] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-ID", "ID_Urinalysis");
			fields[120] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-NOABNORMALITYDETECTED", "NoAbnormalityDetected");
			fields[121] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-LEUCOCYTES", "Leucocytes");
			fields[122] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-PROTEIN", "Protein");
			fields[123] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-BLOOD", "Blood");
			fields[124] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-KETONES", "Ketones");
			fields[125] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-ASCORBICACID", "AscorbicAcid");
			fields[126] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-GLUCOSE", "Glucose");
			fields[127] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-BILIRUBIN", "Bilirubin");
			fields[128] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-UROBILINOGEN", "Urobilinogen");
			fields[129] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-NITRATE", "Nitrate");
			fields[130] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-PH", "PH");
			fields[131] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-SPECIFICGRAVITY", "SpecificGravity");
			fields[132] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-NOSAMPLE", "NoSample");
			fields[133] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-ISACTIVE", "IsActive");
			fields[134] = new ims.framework.ReportField(this.context, "_cvp_Core.UrinalysisSearchCriteria", "BO-1022100012-CARECONTEXT", "CareContext");
			fields[135] = new ims.framework.ReportField(this.context, "_cvp_Core.PDSPatientFilterSearchCriteria", "BO-1001100000-ID", "ID_Patient");
			fields[136] = new ims.framework.ReportField(this.context, "_cvp_Core.PDSPatientFilterSearchCriteria", "BO-1001100000-SEX", "Sex");
			fields[137] = new ims.framework.ReportField(this.context, "_cvp_Core.PDSPatientFilterSearchCriteria", "BO-1001100000-DOB", "Dob");
			fields[138] = new ims.framework.ReportField(this.context, "_cvp_Core.LocalPatientFilterSearchCriteria", "BO-1001100000-ID", "ID_Patient");
			fields[139] = new ims.framework.ReportField(this.context, "_cvp_Core.LocalPatientFilterSearchCriteria", "BO-1001100000-SEX", "Sex");
			fields[140] = new ims.framework.ReportField(this.context, "_cvp_Core.LocalPatientFilterSearchCriteria", "BO-1001100000-DOB", "Dob");
			fields[141] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[142] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[143] = new ims.framework.ReportField(this.context, "_cvp_RefMan.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return formInfo.getLocalVariablesPrefix() + formInfo.getNamespaceName() + formInfo.getFormName() + formInfo.getFormId() + "_" + this.componentIdentifier;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private IReportField[] reportFields = null;
}
