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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ReviewReferralDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100019;
	private static final long serialVersionUID = 1096100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Review Type */
	private ims.domain.lookups.LookupInstance reviewType;
	/** ReasonNotes */
	private String reasonNotes;
	/** ReviewedDate */
	private java.util.Date reviewedDate;
	/** Reviewed By */
	private ims.core.resource.people.domain.objects.MemberOfStaff reviewedBy;
	/** ReviewNotes */
	private String reviewNotes;
	/** Recording User */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingUser;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReviewReferralDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReviewReferralDetail ()
    {
    	super();
    }
    public ReviewReferralDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReviewReferralDetail.class;
	}


	public ims.domain.lookups.LookupInstance getReviewType() {
		return reviewType;
	}
	public void setReviewType(ims.domain.lookups.LookupInstance reviewType) {
		this.reviewType = reviewType;
	}

	public String getReasonNotes() {
		return reasonNotes;
	}
	public void setReasonNotes(String reasonNotes) {
		if ( null != reasonNotes && reasonNotes.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonNotes. Tried to set value: "+
				reasonNotes);
		}
		this.reasonNotes = reasonNotes;
	}

	public java.util.Date getReviewedDate() {
		return reviewedDate;
	}
	public void setReviewedDate(java.util.Date reviewedDate) {
		this.reviewedDate = reviewedDate;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(ims.core.resource.people.domain.objects.MemberOfStaff reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public String getReviewNotes() {
		return reviewNotes;
	}
	public void setReviewNotes(String reviewNotes) {
		if ( null != reviewNotes && reviewNotes.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reviewNotes. Tried to set value: "+
				reviewNotes);
		}
		this.reviewNotes = reviewNotes;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingUser() {
		return recordingUser;
	}
	public void setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff recordingUser) {
		this.recordingUser = recordingUser;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*reviewType* :");
		if (reviewType != null)
			auditStr.append(reviewType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonNotes* :");
		auditStr.append(reasonNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewedDate* :");
		auditStr.append(reviewedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewedBy* :");
		if (reviewedBy != null)
		{
			auditStr.append(toShortClassName(reviewedBy));
				
		    auditStr.append(reviewedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewNotes* :");
		auditStr.append(reviewNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingUser* :");
		if (recordingUser != null)
		{
			auditStr.append(toShortClassName(recordingUser));
				
		    auditStr.append(recordingUser.getId());
		}
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "ReviewReferralDetail";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getReviewType() != null)
		{
			sb.append("<reviewType>");
			sb.append(this.getReviewType().toXMLString()); 
			sb.append("</reviewType>");		
		}
		if (this.getReasonNotes() != null)
		{
			sb.append("<reasonNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonNotes().toString()));
			sb.append("</reasonNotes>");		
		}
		if (this.getReviewedDate() != null)
		{
			sb.append("<reviewedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReviewedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</reviewedDate>");		
		}
		if (this.getReviewedBy() != null)
		{
			sb.append("<reviewedBy>");
			sb.append(this.getReviewedBy().toXMLString(domMap)); 	
			sb.append("</reviewedBy>");		
		}
		if (this.getReviewNotes() != null)
		{
			sb.append("<reviewNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReviewNotes().toString()));
			sb.append("</reviewNotes>");		
		}
		if (this.getRecordingUser() != null)
		{
			sb.append("<recordingUser>");
			sb.append(this.getRecordingUser().toXMLString(domMap)); 	
			sb.append("</recordingUser>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			ReviewReferralDetail domainObject = getReviewReferralDetailfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			ReviewReferralDetail domainObject = getReviewReferralDetailfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static ReviewReferralDetail getReviewReferralDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReviewReferralDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReviewReferralDetail getReviewReferralDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReviewReferralDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReviewReferralDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReviewReferralDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReviewReferralDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReviewReferralDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReviewReferralDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReviewReferralDetail)factory.getImportedDomainObject(ReviewReferralDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReviewReferralDetail();
		}
		String keyClassName = "ReviewReferralDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReviewReferralDetail)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReviewReferralDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("reviewType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReviewType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonNotes");
		if(fldEl != null)
		{	
    		obj.setReasonNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reviewedDate");
		if(fldEl != null)
		{	
    		obj.setReviewedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reviewedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReviewedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reviewNotes");
		if(fldEl != null)
		{	
    		obj.setReviewNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ReviewType = "reviewType";
		public static final String ReasonNotes = "reasonNotes";
		public static final String ReviewedDate = "reviewedDate";
		public static final String ReviewedBy = "reviewedBy";
		public static final String ReviewNotes = "reviewNotes";
		public static final String RecordingUser = "recordingUser";
	}
}

