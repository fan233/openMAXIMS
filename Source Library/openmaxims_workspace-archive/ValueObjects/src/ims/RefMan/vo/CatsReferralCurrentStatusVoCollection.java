// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralCurrentStatusVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<CatsReferralCurrentStatusVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<CatsReferralCurrentStatusVo> col = new ArrayList<CatsReferralCurrentStatusVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.CatsReferral";
	}
	public boolean add(CatsReferralCurrentStatusVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, CatsReferralCurrentStatusVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(CatsReferralCurrentStatusVo instance)
	{
		return col.indexOf(instance);
	}
	public CatsReferralCurrentStatusVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, CatsReferralCurrentStatusVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(CatsReferralCurrentStatusVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(CatsReferralCurrentStatusVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		CatsReferralCurrentStatusVoCollection clone = new CatsReferralCurrentStatusVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((CatsReferralCurrentStatusVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public CatsReferralCurrentStatusVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public CatsReferralCurrentStatusVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public CatsReferralCurrentStatusVoCollection sort(SortOrder order)
	{
		return sort(new CatsReferralCurrentStatusVoComparator(order));
	}
	public CatsReferralCurrentStatusVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new CatsReferralCurrentStatusVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public CatsReferralCurrentStatusVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.CatsReferralRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.CatsReferralRefVoCollection result = new ims.RefMan.vo.CatsReferralRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public CatsReferralCurrentStatusVo[] toArray()
	{
		CatsReferralCurrentStatusVo[] arr = new CatsReferralCurrentStatusVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<CatsReferralCurrentStatusVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class CatsReferralCurrentStatusVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public CatsReferralCurrentStatusVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public CatsReferralCurrentStatusVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public CatsReferralCurrentStatusVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			CatsReferralCurrentStatusVo voObj1 = (CatsReferralCurrentStatusVo)obj1;
			CatsReferralCurrentStatusVo voObj2 = (CatsReferralCurrentStatusVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean[] result = new ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			CatsReferralCurrentStatusVo vo = ((CatsReferralCurrentStatusVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean)vo.getBean();
		}
		return result;
	}
	public static CatsReferralCurrentStatusVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		CatsReferralCurrentStatusVoCollection coll = new CatsReferralCurrentStatusVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static CatsReferralCurrentStatusVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.CatsReferralCurrentStatusVoBean[] beans)
	{
		CatsReferralCurrentStatusVoCollection coll = new CatsReferralCurrentStatusVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
