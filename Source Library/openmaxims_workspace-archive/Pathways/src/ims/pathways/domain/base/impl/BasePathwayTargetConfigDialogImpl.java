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

package ims.pathways.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BasePathwayTargetConfigDialogImpl extends DomainImpl implements ims.pathways.domain.PathwayTargetConfigDialog, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistTargetByCriteria(String name, ims.pathways.vo.lookups.EventLinkType eventLinkType)
	{
	}

	@SuppressWarnings("unused")
	public void validateget(ims.pathways.configuration.vo.TargetRefVo refVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistEventTargetByTarget(ims.pathways.configuration.vo.TargetRefVo target, Boolean isViewMode)
	{
		if(isViewMode == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'isViewMode' of type 'Boolean' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetEventMappingsByEventAndStatus(ims.pathways.configuration.vo.EventRefVo voRef, ims.core.vo.lookups.PreActiveActiveInactiveStatus status)
	{
	}

	@SuppressWarnings("unused")
	public void validategetRTTByEventAndStatus(ims.pathways.configuration.vo.EventRefVo voRef, ims.core.vo.lookups.PreActiveActiveInactiveStatus status)
	{
	}
}
