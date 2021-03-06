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

package ims.clinical.forms.otherequipmentintraopdialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinical.domain.OtherEquipmentIntraOpDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinical.domain.OtherEquipmentIntraOpDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected void clearScreen()
	{
		this.form.qmbEquipCheckedBy().setValue(null);
		this.form.dteExpiry().setValue(null);
		this.form.txtEquipmentDesc().setValue("");
		this.form.txtComments().setValue("");
		this.form.txtUnitNo().setValue("");
	}
	protected void populateScreenFromData(ims.clinical.vo.EquipmentIntraOpVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.qmbEquipCheckedBy().setValue(value.getEquipmentCheckedByIsNotNull() ? value.getEquipmentCheckedBy() : null);
		this.form.dteExpiry().setValue(value.getExpiryDateIsNotNull() ? value.getExpiryDate() : null);
		this.form.txtEquipmentDesc().setValue(value.getEquipmentDescriptionIsNotNull() ? value.getEquipmentDescription(): null);
		this.form.txtComments().setValue(value.getCommentsIsNotNull() ? value.getComments(): null);
		this.form.txtUnitNo().setValue(value.getUnitNumberIsNotNull() ? value.getUnitNumber(): null);
	}
	protected ims.clinical.vo.EquipmentIntraOpVo populateDataFromScreen(ims.clinical.vo.EquipmentIntraOpVo value)
	{
		if(value == null)
			value = new ims.clinical.vo.EquipmentIntraOpVo();

		value.setEquipmentCheckedBy(this.form.qmbEquipCheckedBy().getValue());
		value.setExpiryDate(this.form.dteExpiry().getValue());
		value.setEquipmentDescription(this.form.txtEquipmentDesc().getValue());
		value.setComments(this.form.txtComments().getValue());
		value.setUnitNumber(this.form.txtUnitNo().getValue());

		return value;
	}
	protected ims.clinical.vo.EquipmentIntraOpVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.clinical.vo.EquipmentIntraOpVo());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinical.domain.OtherEquipmentIntraOpDialog domain;
}
