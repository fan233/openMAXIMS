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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.43 build 2232.25589)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.ocrr.domain.impl;

import java.util.Iterator;
import java.util.List;

import ims.core.clinical.domain.objects.QuestionInformation;
import ims.domain.DomainFactory;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.hibernate3.IMSCriteria;
import ims.framework.exceptions.CodingRuntimeException;
import ims.ocrr.configuration.domain.objects.CategoryQuestion;
import ims.ocrr.domain.base.impl.BaseCategoryQuestionsImpl;
import ims.ocrr.vo.CategoryQuestionLiteVoCollection;
import ims.ocrr.vo.CategoryQuestionShortVoCollection;
import ims.ocrr.vo.domain.CategoryQuestionLiteVoAssembler;
import ims.ocrr.vo.domain.CategoryQuestionShortVoAssembler;
import ims.ocrr.vo.lookups.Category;

public class CategoryQuestionsImpl extends BaseCategoryQuestionsImpl
{
	private static final long serialVersionUID = 1L;

	/**
	 * listCategoryQuestions
	 */
	public CategoryQuestionShortVoCollection listCategoryQuestions(ims.ocrr.vo.lookups.Category category)
	{
		if(category == null)
			throw new CodingRuntimeException("category parameter is null - listCategoryQuestions");
		
		List list = getDomainFactory().find("from CategoryQuestion cat where cat.oCRRCategory = :category order by systemInformation.creationDateTime", new String[]{"category"}, new Object[]{getDomLookup(category)});
		return CategoryQuestionShortVoAssembler.createCategoryQuestionShortVoCollectionFromCategoryQuestion(list);
	}
	
	public CategoryQuestionLiteVoCollection listCategoryQuestionsLite(ims.ocrr.vo.lookups.Category category)
	{
		if(category == null)
			throw new CodingRuntimeException("category parameter is null - listCategoryQuestions");
		
		List list = getDomainFactory().find("from CategoryQuestion cat where cat.oCRRCategory = :category order by systemInformation.creationDateTime", new String[]{"category"}, new Object[]{getDomLookup(category)});
		return CategoryQuestionLiteVoAssembler.createCategoryQuestionLiteVoCollectionFromCategoryQuestion(list);
	}
	
	public CategoryQuestionShortVoCollection listCategoryQuestions(ims.ocrr.vo.lookups.CategoryCollection categories)
	{
		if (categories == null || categories.size() == 0)
			return null;

		StringBuffer hql = new StringBuffer();
		hql.append("from CategoryQuestion as c1_1 where");
		hql.append(" c1_1.oCRRCategory.id in (");

		for (int i = 0; i < categories.size(); i++)
		{
			hql.append(categories.get(i).getID());
			if (i < (categories.size() - 1))
				hql.append(", ");
		}

		hql.append(") order by systemInformation.creationDateTime");
		List list = getDomainFactory().find(hql.toString());
		return CategoryQuestionShortVoAssembler.createCategoryQuestionShortVoCollectionFromCategoryQuestion(list);
	}
	

	public void saveCategoryQuestions(CategoryQuestionShortVoCollection voCollCatQuestions, Category category) throws StaleObjectException, ForeignKeyViolationException
	{
		if(voCollCatQuestions == null)
			throw new RuntimeException("voCollCatQuestions is null : method saveCategoryQuestions");
		if(category == null)
			throw new RuntimeException("category is null : method saveCategoryQuestions");
		if (voCollCatQuestions.isValidated() == false)
			throw new CodingRuntimeException("voCollCatQuestions is not validated");

		DomainFactory factory = getDomainFactory();
		
		factory.delete("from CategoryQuestion cat where cat.oCRRCategory.id = '" +  String.valueOf(category.getId()) + "' order by systemInformation.creationDateTime");
		
		CategoryQuestion doCatQuestion;
		List questions = CategoryQuestionShortVoAssembler.extractCategoryQuestionList(factory, voCollCatQuestions);
		Iterator it = questions.iterator();
		while(it.hasNext())
		{
			doCatQuestion = (CategoryQuestion) it.next();
			factory.save(doCatQuestion);
		}
	}
}
