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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PeriOpSurgeryStopTimeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PeriOpSurgeryStopTimeVo copy(ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObjectDest, ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PeriOpSurgeryStopTime(valueObjectSrc.getID_PeriOpSurgeryStopTime());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// SurgeryStopTime
		valueObjectDest.setSurgeryStopTime(valueObjectSrc.getSurgeryStopTime());
		// RecordedBy
		valueObjectDest.setRecordedBy(valueObjectSrc.getRecordedBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PeriOpSurgeryStopTime objects.
	 */
	public static ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(java.util.Set domainObjectSet)	
	{
		return createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PeriOpSurgeryStopTime objects.
	 */
	public static ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection voList = new ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject = (ims.clinical.domain.objects.PeriOpSurgeryStopTime) iterator.next();
			ims.clinical.vo.PeriOpSurgeryStopTimeVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.clinical.domain.objects.PeriOpSurgeryStopTime objects.
	 */
	public static ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(java.util.List domainObjectList) 
	{
		return createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PeriOpSurgeryStopTime objects.
	 */
	public static ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection createPeriOpSurgeryStopTimeVoCollectionFromPeriOpSurgeryStopTime(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection voList = new ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject = (ims.clinical.domain.objects.PeriOpSurgeryStopTime) domainObjectList.get(i);
			ims.clinical.vo.PeriOpSurgeryStopTimeVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.clinical.domain.objects.PeriOpSurgeryStopTime set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPeriOpSurgeryStopTimeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection voCollection) 
	 {
	 	return extractPeriOpSurgeryStopTimeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPeriOpSurgeryStopTimeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PeriOpSurgeryStopTimeVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject = PeriOpSurgeryStopTimeVoAssembler.extractPeriOpSurgeryStopTime(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
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
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.clinical.domain.objects.PeriOpSurgeryStopTime list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPeriOpSurgeryStopTimeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection voCollection) 
	 {
	 	return extractPeriOpSurgeryStopTimeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPeriOpSurgeryStopTimeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PeriOpSurgeryStopTimeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PeriOpSurgeryStopTimeVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject = PeriOpSurgeryStopTimeVoAssembler.extractPeriOpSurgeryStopTime(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.clinical.domain.objects.PeriOpSurgeryStopTime object.
	 * @param domainObject ims.clinical.domain.objects.PeriOpSurgeryStopTime
	 */
	 public static ims.clinical.vo.PeriOpSurgeryStopTimeVo create(ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PeriOpSurgeryStopTime object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PeriOpSurgeryStopTimeVo create(DomainObjectMap map, ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObject = (ims.clinical.vo.PeriOpSurgeryStopTimeVo) map.getValueObject(domainObject, ims.clinical.vo.PeriOpSurgeryStopTimeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PeriOpSurgeryStopTimeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PeriOpSurgeryStopTime
	 */
	 public static ims.clinical.vo.PeriOpSurgeryStopTimeVo insert(ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObject, ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PeriOpSurgeryStopTime
	 */
	 public static ims.clinical.vo.PeriOpSurgeryStopTimeVo insert(DomainObjectMap map, ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObject, ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PeriOpSurgeryStopTime(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// SurgeryStopTime
		java.util.Date SurgeryStopTime = domainObject.getSurgeryStopTime();
		if ( null != SurgeryStopTime ) 
		{
			valueObject.setSurgeryStopTime(new ims.framework.utils.DateTime(SurgeryStopTime) );
		}
		// RecordedBy
		if (domainObject.getRecordedBy() != null)
		{
			if(domainObject.getRecordedBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRecordedBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRecordedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setRecordedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getRecordedBy().getId(), domainObject.getRecordedBy().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PeriOpSurgeryStopTime extractPeriOpSurgeryStopTime(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObject) 
	{
		return 	extractPeriOpSurgeryStopTime(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PeriOpSurgeryStopTime extractPeriOpSurgeryStopTime(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PeriOpSurgeryStopTimeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PeriOpSurgeryStopTime();
		ims.clinical.domain.objects.PeriOpSurgeryStopTime domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PeriOpSurgeryStopTime)domMap.get(valueObject);
			}
			// ims.clinical.vo.PeriOpSurgeryStopTimeVo ID_PeriOpSurgeryStopTime field is unknown
			domainObject = new ims.clinical.domain.objects.PeriOpSurgeryStopTime();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PeriOpSurgeryStopTime());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PeriOpSurgeryStopTime)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PeriOpSurgeryStopTime) domainFactory.getDomainObject(ims.clinical.domain.objects.PeriOpSurgeryStopTime.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PeriOpSurgeryStopTime());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getSurgeryStopTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setSurgeryStopTime(value2);
		ims.core.resource.people.domain.objects.MemberOfStaff value3 = null;
		if ( null != valueObject.getRecordedBy() ) 
		{
			if (valueObject.getRecordedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordedBy()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordedBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getRecordedBy();	
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordedBy().getBoId());
			}
		}
		domainObject.setRecordedBy(value3);

		return domainObject;
	}

}
