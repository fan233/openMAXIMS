// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeModel;
import ims.framework.cn.data.TreeNode;
import ims.vo.LookupInstanceCollection;
import ims.vo.LookupInstVo;

public class AwaitingClinicalInformationTypeCollection extends LookupInstanceCollection implements ims.vo.ImsCloneable, TreeModel
{
	private static final long serialVersionUID = 1L;
	public void add(AwaitingClinicalInformationType value)
	{
		super.add(value);
	}
	public int indexOf(AwaitingClinicalInformationType instance)
	{
		return super.indexOf(instance);
	}
	public boolean contains(AwaitingClinicalInformationType instance)
	{
		return indexOf(instance) >= 0;
	}
	public AwaitingClinicalInformationType get(int index)
	{
		return (AwaitingClinicalInformationType)super.getIndex(index);
	}
	public void remove(AwaitingClinicalInformationType instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public Object clone()
	{
		AwaitingClinicalInformationTypeCollection newCol = new AwaitingClinicalInformationTypeCollection();
		AwaitingClinicalInformationType item;
		for (int i = 0; i < super.size(); i++)
		{
			item = this.get(i);
			newCol.add(new AwaitingClinicalInformationType(item.getID(), item.getText(), item.isActive(), item.getParent(), item.getImage(), item.getColor(), item.getOrder()));
		}
		for (int i = 0; i < newCol.size(); i++)
		{
			item = newCol.get(i);
			if (item.getParent() != null)
			{
				int parentIndex = this.indexOf(item.getParent());
				if(parentIndex >= 0)
					item.setParent(newCol.get(parentIndex));
				else
					item.setParent((AwaitingClinicalInformationType)item.getParent().clone());
			}
		}
		return newCol;
	}
	public AwaitingClinicalInformationType getInstance(int instanceId)
	{
		return (AwaitingClinicalInformationType)super.getInstanceById(instanceId);
	}
	public TreeNode[] getRootNodes()
	{
		LookupInstVo[] roots = super.getRoots();
		TreeNode[] nodes = new TreeNode[roots.length];
		System.arraycopy(roots, 0, nodes, 0, roots.length);
		return nodes;
	}
	public AwaitingClinicalInformationType[] toArray()
	{
		AwaitingClinicalInformationType[] arr = new AwaitingClinicalInformationType[this.size()];
		super.toArray(arr);
		return arr;
	}
	public static AwaitingClinicalInformationTypeCollection buildFromBeanCollection(java.util.Collection beans)
	{
		AwaitingClinicalInformationTypeCollection coll = new AwaitingClinicalInformationTypeCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while(iter.hasNext())
		{
			coll.add(AwaitingClinicalInformationType.buildLookup((ims.vo.LookupInstanceBean)iter.next()));
		}
		return coll;
	}
	public static AwaitingClinicalInformationTypeCollection buildFromBeanCollection(ims.vo.LookupInstanceBean[] beans)
	{
		AwaitingClinicalInformationTypeCollection coll = new AwaitingClinicalInformationTypeCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(AwaitingClinicalInformationType.buildLookup(beans[x]));
		}
		return coll;
	}
}
