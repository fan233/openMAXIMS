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

package ims.assessment.vo.beans;

public class UserDefinedObjectFilterVoBean extends ims.vo.ValueObjectBean
{
	public UserDefinedObjectFilterVoBean()
	{
	}
	public UserDefinedObjectFilterVoBean(ims.assessment.vo.UserDefinedObjectFilterVo vo)
	{
		this.name = vo.getName();
		this.category = vo.getCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getCategory().getBean();
		this.beginswith = vo.getBeginsWith();
		this.contains = vo.getContains();
		this.exacttext = vo.getExactText();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.UserDefinedObjectFilterVo vo)
	{
		this.name = vo.getName();
		this.category = vo.getCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getCategory().getBean();
		this.beginswith = vo.getBeginsWith();
		this.contains = vo.getContains();
		this.exacttext = vo.getExactText();
	}

	public ims.assessment.vo.UserDefinedObjectFilterVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.assessment.vo.UserDefinedObjectFilterVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.UserDefinedObjectFilterVo vo = null;
		if(map != null)
			vo = (ims.assessment.vo.UserDefinedObjectFilterVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.assessment.vo.UserDefinedObjectFilterVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public ims.vo.LookupInstanceBean getCategory()
	{
		return this.category;
	}
	public void setCategory(ims.vo.LookupInstanceBean value)
	{
		this.category = value;
	}
	public Boolean getBeginsWith()
	{
		return this.beginswith;
	}
	public void setBeginsWith(Boolean value)
	{
		this.beginswith = value;
	}
	public Boolean getContains()
	{
		return this.contains;
	}
	public void setContains(Boolean value)
	{
		this.contains = value;
	}
	public Boolean getExactText()
	{
		return this.exacttext;
	}
	public void setExactText(Boolean value)
	{
		this.exacttext = value;
	}

	private String name;
	private ims.vo.LookupInstanceBean category;
	private Boolean beginswith;
	private Boolean contains;
	private Boolean exacttext;
}
