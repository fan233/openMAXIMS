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

package ims.chooseandbook.vo;

/**
 * Linked to choose_book.SeqPoint business object (ID: 1069100003).
 */
public class SeqPointVo extends ims.choose_book.vo.SeqPointRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SeqPointVo()
	{
	}
	public SeqPointVo(Integer id, int version)
	{
		super(id, version);
	}
	public SeqPointVo(ims.chooseandbook.vo.beans.SeqPointVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.initial = bean.getInitial();
		this.terminal = bean.getTerminal();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.chooseandbook.vo.beans.SeqPointVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.initial = bean.getInitial();
		this.terminal = bean.getTerminal();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.chooseandbook.vo.beans.SeqPointVoBean bean = null;
		if(map != null)
			bean = (ims.chooseandbook.vo.beans.SeqPointVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.chooseandbook.vo.beans.SeqPointVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("NAME"))
			return getName();
		if(fieldName.equals("INITIAL"))
			return getInitial();
		if(fieldName.equals("TERMINAL"))
			return getTerminal();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNameIsNotNull()
	{
		return this.name != null;
	}
	public String getName()
	{
		return this.name;
	}
	public static int getNameMaxLength()
	{
		return 100;
	}
	public void setName(String value)
	{
		this.isValidated = false;
		this.name = value;
	}
	public boolean getInitialIsNotNull()
	{
		return this.initial != null;
	}
	public Boolean getInitial()
	{
		return this.initial;
	}
	public void setInitial(Boolean value)
	{
		this.isValidated = false;
		this.initial = value;
	}
	public boolean getTerminalIsNotNull()
	{
		return this.terminal != null;
	}
	public Boolean getTerminal()
	{
		return this.terminal;
	}
	public void setTerminal(Boolean value)
	{
		this.isValidated = false;
		this.terminal = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.name == null || this.name.length() == 0)
			listOfErrors.add("name is mandatory");
		else if(this.name.length() > 100)
			listOfErrors.add("The length of the field [name] in the value object [ims.chooseandbook.vo.SeqPointVo] is too big. It should be less or equal to 100");
		if(this.initial == null)
			listOfErrors.add("initial is mandatory");
		if(this.terminal == null)
			listOfErrors.add("terminal is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		SeqPointVo clone = new SeqPointVo(this.id, this.version);
		
		clone.name = this.name;
		clone.initial = this.initial;
		clone.terminal = this.terminal;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(SeqPointVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SeqPointVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SeqPointVo compareObj = (SeqPointVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_SeqPoint() == null && compareObj.getID_SeqPoint() != null)
				return -1;
			if(this.getID_SeqPoint() != null && compareObj.getID_SeqPoint() == null)
				return 1;
			if(this.getID_SeqPoint() != null && compareObj.getID_SeqPoint() != null)
				retVal = this.getID_SeqPoint().compareTo(compareObj.getID_SeqPoint());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.name != null)
			count++;
		if(this.initial != null)
			count++;
		if(this.terminal != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected String name;
	protected Boolean initial;
	protected Boolean terminal;
	private boolean isValidated = false;
	private boolean isBusy = false;
}