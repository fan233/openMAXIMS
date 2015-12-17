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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.forms.pendingdischarges;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.PendingDischarges.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.core.domain.PendingDischarges domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbIDTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbIDType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatIdType existingInstance = (ims.core.vo.lookups.PatIdType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbIDTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PatIdType)
		{
			ims.core.vo.lookups.PatIdType instance = (ims.core.vo.lookups.PatIdType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbIDTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatIdType existingInstance = (ims.core.vo.lookups.PatIdType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbIDType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbIDTypeLookup()
	{
		this.form.cmbIDType().clear();
		ims.core.vo.lookups.PatIdTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPatIdType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbIDType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbIDTypeLookupValue(int id)
	{
		ims.core.vo.lookups.PatIdType instance = ims.core.vo.lookups.LookupHelper.getPatIdTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbIDType().setValue(instance);
	}
	protected final void defaultcmbIDTypeLookupValue()
	{
		this.form.cmbIDType().setValue((ims.core.vo.lookups.PatIdType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PatIdType.class, engine.getFormName().getID(), ims.core.vo.lookups.PatIdType.TYPE_ID));
	}
	protected final void oncmbTimeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbTime().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTimeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.TimeUnitsSecondsToMonths)
		{
			ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTimeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbTime().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTimeLookup()
	{
		this.form.cmbTime().clear();
		ims.core.vo.lookups.TimeUnitsSecondsToMonthsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonths(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbTime().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTimeLookupValue(int id)
	{
		ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonthsInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbTime().setValue(instance);
	}
	protected final void defaultcmbTimeLookupValue()
	{
		this.form.cmbTime().setValue((ims.core.vo.lookups.TimeUnitsSecondsToMonths)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.TimeUnitsSecondsToMonths.class, engine.getFormName().getID(), ims.core.vo.lookups.TimeUnitsSecondsToMonths.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.PendingDischarges domain;
}