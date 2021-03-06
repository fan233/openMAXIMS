// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class ElectiveListConfigurationLiteVoBean extends ims.vo.ValueObjectBean
{
	public ElectiveListConfigurationLiteVoBean()
	{
	}
	public ElectiveListConfigurationLiteVoBean(ims.RefMan.vo.ElectiveListConfigurationLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.waitinglistname = vo.getWaitingListName();
		this.startdate = vo.getStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStartDate().getBean();
		this.enddate = vo.getEndDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEndDate().getBean();
		this.service = vo.getService() == null ? null : (ims.admin.vo.beans.ServiceForElectiveListConfigVoBean)vo.getService().getBean();
		this.waitinglistcode = vo.getWaitingListCode();
		this.isactive = vo.getIsActive();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.ElectiveListConfigurationLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.waitinglistname = vo.getWaitingListName();
		this.startdate = vo.getStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStartDate().getBean();
		this.enddate = vo.getEndDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEndDate().getBean();
		this.service = vo.getService() == null ? null : (ims.admin.vo.beans.ServiceForElectiveListConfigVoBean)vo.getService().getBean(map);
		this.waitinglistcode = vo.getWaitingListCode();
		this.isactive = vo.getIsActive();
	}

	public ims.RefMan.vo.ElectiveListConfigurationLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.ElectiveListConfigurationLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.ElectiveListConfigurationLiteVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.ElectiveListConfigurationLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.ElectiveListConfigurationLiteVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getWaitingListName()
	{
		return this.waitinglistname;
	}
	public void setWaitingListName(String value)
	{
		this.waitinglistname = value;
	}
	public ims.framework.utils.beans.DateBean getStartDate()
	{
		return this.startdate;
	}
	public void setStartDate(ims.framework.utils.beans.DateBean value)
	{
		this.startdate = value;
	}
	public ims.framework.utils.beans.DateBean getEndDate()
	{
		return this.enddate;
	}
	public void setEndDate(ims.framework.utils.beans.DateBean value)
	{
		this.enddate = value;
	}
	public ims.admin.vo.beans.ServiceForElectiveListConfigVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.admin.vo.beans.ServiceForElectiveListConfigVoBean value)
	{
		this.service = value;
	}
	public String getWaitingListCode()
	{
		return this.waitinglistcode;
	}
	public void setWaitingListCode(String value)
	{
		this.waitinglistcode = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}

	private Integer id;
	private int version;
	private String waitinglistname;
	private ims.framework.utils.beans.DateBean startdate;
	private ims.framework.utils.beans.DateBean enddate;
	private ims.admin.vo.beans.ServiceForElectiveListConfigVoBean service;
	private String waitinglistcode;
	private Boolean isactive;
}
