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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.52 build 2495.16043)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import java.util.ArrayList;
import java.util.List;
import ims.admin.domain.base.impl.BasePracticeSearchImpl;
import ims.core.vo.domain.OrganisationWithSitesVoAssembler;
import ims.core.vo.lookups.OrganisationType;
import ims.domain.DomainFactory;

public class PracticeSearchImpl extends BasePracticeSearchImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.OrganisationWithSitesVoCollection listPractice(ims.admin.vo.PracticeSearchCriteriaVo filter)
	{
		DomainFactory factory = getDomainFactory();
		String andStr = " ";
		StringBuffer clause = new StringBuffer();
 
		ArrayList names = new ArrayList();
		ArrayList values = new ArrayList();
		
		if (filter.getTaxonomyCodeIsNotNull() && filter.getTaxonomyTypeIsNotNull())
		{
			StringBuffer taxonomyHql = new StringBuffer(" select distinct org from Organisation org join org.codeMappings as mappings" +
						" where mappings.taxonomyName = :taxonomyType and mappings.taxonomyCode = :taxonomyCode and org.type = :gpPractice");
			
			names.add("taxonomyType");
			names.add("taxonomyCode");
			names.add("gpPractice");
				
			values.add(getDomLookup(filter.getTaxonomyType()));
			values.add(filter.getTaxonomyCode());
			values.add(getDomLookup(OrganisationType.GPP));
			
			if (filter.getIsActiveIsNotNull())
			{
				names.add("isActive");
				values.add(filter.getIsActive());
				taxonomyHql.append(" and org.isActive = :isActive ");
			}
			
			List practices = factory.find(taxonomyHql.toString(), names, values);
			return OrganisationWithSitesVoAssembler.createOrganisationWithSitesVoCollectionFromOrganisation(practices);
		}
		
		if (filter.getIsActiveIsNotNull())
		{
			clause.append(andStr + " org.isActive = :isActive ");
			names.add("isActive");
			values.add(filter.getIsActive());
			andStr = " and ";
		}
		
		if (filter.getAddressIsNotNull())
 		{
	  		if (filter.getAddress() != null)
			{
				clause.append(andStr + " (upper(org.address.line1) like :partialAddress ");
				clause.append(" or upper(org.address.line2) like :partialAddress");
				clause.append(" or upper(org.address.line3) like :partialAddress");
				clause.append(" or upper(org.address.line4) like :partialAddress");
				clause.append(" or upper(org.address.line5) like :partialAddress )");

				names.add("partialAddress");
				values.add("%" + filter.getAddress().toUpperCase() + "%");
				andStr = " and ";
			}
        }
		
		if (filter.getNameIsNotNull())
		{
			clause.append(andStr + " (upper(org.name) like :practiceName) ");
			names.add("practiceName");
			values.add(filter.getName().toUpperCase() + "%");
			andStr = " and ";//WDEV-15674
		}
		
		String hql = "select org from Organisation as org where ";
		
		hql += clause.toString();
		
		//gp practices only
		hql += andStr + " org.type = :gpPractice"; //WDEV-15666
		names.add("gpPractice");
		values.add(getDomLookup(OrganisationType.GPP));
		andStr = " and ";//WDEV-15666
		
		List practices = factory.find(hql,names,values);
		
		return OrganisationWithSitesVoAssembler.createOrganisationWithSitesVoCollectionFromOrganisation(practices);
	}
}