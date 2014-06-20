// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referraldetailscomponent;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.ReferralDetailsComponent.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.RefMan.domain.ReferralDetailsComponent domain)
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
	protected final void oncmbUrgencyValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbUrgency().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralUrgency existingInstance = (ims.RefMan.vo.lookups.ReferralUrgency)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbUrgencyLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReferralUrgency)
		{
			ims.RefMan.vo.lookups.ReferralUrgency instance = (ims.RefMan.vo.lookups.ReferralUrgency)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbUrgencyLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralUrgency existingInstance = (ims.RefMan.vo.lookups.ReferralUrgency)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbUrgency().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbUrgencyLookup()
	{
		this.form.cmbUrgency().clear();
		ims.RefMan.vo.lookups.ReferralUrgencyCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReferralUrgency(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbUrgency().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbUrgencyLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReferralUrgency instance = ims.RefMan.vo.lookups.LookupHelper.getReferralUrgencyInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbUrgency().setValue(instance);
	}
	protected final void defaultcmbUrgencyLookupValue()
	{
		this.form.cmbUrgency().setValue((ims.RefMan.vo.lookups.ReferralUrgency)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReferralUrgency.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReferralUrgency.TYPE_ID));
	}
	protected final void oncmbCategoryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbCategory().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.CatsReferralCategory existingInstance = (ims.RefMan.vo.lookups.CatsReferralCategory)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCategoryLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.CatsReferralCategory)
		{
			ims.RefMan.vo.lookups.CatsReferralCategory instance = (ims.RefMan.vo.lookups.CatsReferralCategory)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCategoryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.CatsReferralCategory existingInstance = (ims.RefMan.vo.lookups.CatsReferralCategory)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbCategory().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCategoryLookup()
	{
		this.form.cmbCategory().clear();
		ims.RefMan.vo.lookups.CatsReferralCategoryCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getCatsReferralCategory(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbCategory().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCategoryLookupValue(int id)
	{
		ims.RefMan.vo.lookups.CatsReferralCategory instance = ims.RefMan.vo.lookups.LookupHelper.getCatsReferralCategoryInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbCategory().setValue(instance);
	}
	protected final void defaultcmbCategoryLookupValue()
	{
		this.form.cmbCategory().setValue((ims.RefMan.vo.lookups.CatsReferralCategory)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.CatsReferralCategory.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.CatsReferralCategory.TYPE_ID));
	}
	protected final void oncmbSORValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSOR().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSORLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceOfReferral)
		{
			ims.core.vo.lookups.SourceOfReferral instance = (ims.core.vo.lookups.SourceOfReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSORLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSOR().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSORLookup()
	{
		this.form.cmbSOR().clear();
		ims.core.vo.lookups.SourceOfReferralCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceOfReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSOR().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSORLookupValue(int id)
	{
		ims.core.vo.lookups.SourceOfReferral instance = ims.core.vo.lookups.LookupHelper.getSourceOfReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSOR().setValue(instance);
	}
	protected final void defaultcmbSORLookupValue()
	{
		this.form.cmbSOR().setValue((ims.core.vo.lookups.SourceOfReferral)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceOfReferral.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceOfReferral.TYPE_ID));
	}
	protected final void oncmbLanguageValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbLanguage().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Language existingInstance = (ims.core.vo.lookups.Language)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbLanguageLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Language)
		{
			ims.core.vo.lookups.Language instance = (ims.core.vo.lookups.Language)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbLanguageLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Language existingInstance = (ims.core.vo.lookups.Language)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbLanguage().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbLanguageLookup()
	{
		this.form.cmbLanguage().clear();
		ims.core.vo.lookups.LanguageCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getLanguage(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbLanguage().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbLanguageLookupValue(int id)
	{
		ims.core.vo.lookups.Language instance = ims.core.vo.lookups.LookupHelper.getLanguageInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbLanguage().setValue(instance);
	}
	protected final void defaultcmbLanguageLookupValue()
	{
		this.form.cmbLanguage().setValue((ims.core.vo.lookups.Language)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Language.class, engine.getFormName().getID(), ims.core.vo.lookups.Language.TYPE_ID));
	}
	protected final void oncmbTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.ApptTransportType existingInstance = (ims.scheduling.vo.lookups.ApptTransportType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.ApptTransportType)
		{
			ims.scheduling.vo.lookups.ApptTransportType instance = (ims.scheduling.vo.lookups.ApptTransportType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.ApptTransportType existingInstance = (ims.scheduling.vo.lookups.ApptTransportType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTypeLookup()
	{
		this.form.cmbType().clear();
		ims.scheduling.vo.lookups.ApptTransportTypeCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getApptTransportType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTypeLookupValue(int id)
	{
		ims.scheduling.vo.lookups.ApptTransportType instance = ims.scheduling.vo.lookups.LookupHelper.getApptTransportTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbType().setValue(instance);
	}
	protected final void defaultcmbTypeLookupValue()
	{
		this.form.cmbType().setValue((ims.scheduling.vo.lookups.ApptTransportType)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.ApptTransportType.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.ApptTransportType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.ReferralDetailsComponent domain;
}