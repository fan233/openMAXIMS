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

package ims.emergency.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class UrgencyLevel extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public UrgencyLevel()
	{
		super();
	}
	public UrgencyLevel(int id)
	{
		super(id, "", true);
	}
	public UrgencyLevel(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public UrgencyLevel(int id, String text, boolean active, UrgencyLevel parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public UrgencyLevel(int id, String text, boolean active, UrgencyLevel parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public UrgencyLevel(int id, String text, boolean active, UrgencyLevel parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static UrgencyLevel buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new UrgencyLevel(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (UrgencyLevel)super.getParentInstance();
	}
	public UrgencyLevel getParent()
	{
		return (UrgencyLevel)super.getParentInstance();
	}
	public void setParent(UrgencyLevel parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		UrgencyLevel[] typedChildren = new UrgencyLevel[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (UrgencyLevel)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof UrgencyLevel)
		{
			super.addChild((UrgencyLevel)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof UrgencyLevel)
		{
			super.removeChild((UrgencyLevel)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		UrgencyLevelCollection result = new UrgencyLevelCollection();
		result.add(RESUS);
		result.add(MAJOR);
		result.add(MINOR);
		return result;
	}
	public static UrgencyLevel[] getNegativeInstances()
	{
		UrgencyLevel[] instances = new UrgencyLevel[3];
		instances[0] = RESUS;
		instances[1] = MAJOR;
		instances[2] = MINOR;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "RESUS";
		negativeInstances[1] = "MAJOR";
		negativeInstances[2] = "MINOR";
		return negativeInstances;
	}
	public static UrgencyLevel getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static UrgencyLevel getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		UrgencyLevel[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1291033;
	public static final UrgencyLevel RESUS = new UrgencyLevel(-2364, "Resus", true, null, new ims.framework.utils.ImagePath(129139, "Images/Emergency/resuscitation24.png"), Color.Default);
	public static final UrgencyLevel MAJOR = new UrgencyLevel(-2365, "MAJOR", true, null, null, Color.Default);
	public static final UrgencyLevel MINOR = new UrgencyLevel(-2366, "Minor", true, null, null, Color.Default);
}