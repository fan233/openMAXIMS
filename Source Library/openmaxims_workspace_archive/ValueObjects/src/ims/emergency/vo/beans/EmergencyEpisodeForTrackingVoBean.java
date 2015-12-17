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

package ims.emergency.vo.beans;

public class EmergencyEpisodeForTrackingVoBean extends ims.vo.ValueObjectBean
{
	public EmergencyEpisodeForTrackingVoBean()
	{
	}
	public EmergencyEpisodeForTrackingVoBean(ims.emergency.vo.EmergencyEpisodeForTrackingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.injurydatetime = vo.getInjuryDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getInjuryDateTime().getBean();
		this.presentingcomplaint = vo.getPresentingComplaint() == null ? null : (ims.vo.LookupInstanceBean)vo.getPresentingComplaint().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.EmergencyEpisodeForTrackingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.injurydatetime = vo.getInjuryDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getInjuryDateTime().getBean();
		this.presentingcomplaint = vo.getPresentingComplaint() == null ? null : (ims.vo.LookupInstanceBean)vo.getPresentingComplaint().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
	}

	public ims.emergency.vo.EmergencyEpisodeForTrackingVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.EmergencyEpisodeForTrackingVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.EmergencyEpisodeForTrackingVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.EmergencyEpisodeForTrackingVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.EmergencyEpisodeForTrackingVo();
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
	public ims.framework.utils.beans.DateTimeBean getInjuryDateTime()
	{
		return this.injurydatetime;
	}
	public void setInjuryDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.injurydatetime = value;
	}
	public ims.vo.LookupInstanceBean getPresentingComplaint()
	{
		return this.presentingcomplaint;
	}
	public void setPresentingComplaint(ims.vo.LookupInstanceBean value)
	{
		this.presentingcomplaint = value;
	}
	public ims.vo.RefVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.vo.RefVoBean value)
	{
		this.episodeofcare = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean injurydatetime;
	private ims.vo.LookupInstanceBean presentingcomplaint;
	private ims.vo.RefVoBean episodeofcare;
}