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
// This code was generated by John MacEnri using IMS Development Environment (version 1.20 build 40819.1700)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.ArrayList;

import ims.admin.vo.FlagCategoryVo;
import ims.admin.vo.FlagCategoryVoCollection;
import ims.configuration.AFlag;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.EnvironmentConfig;
import ims.configuration.IFlag;
import ims.domain.DbType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.hibernate3.Registry;
import ims.dto.DTODomainImplementation;
import ims.framework.cn.SessionManager;
import ims.utils.Logging;

public class ConfigFlagsImpl extends DTODomainImplementation implements ims.admin.domain.ConfigFlags
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	/**
	* Saves a ConfigFlag
	*/
	public String saveConfigFlag(IFlag flag, String flagValue) throws DomainInterfaceException
	{
		if(flag.getName().equals(ConfigFlag.GEN.QUARTZ_SERVER_URL.getName()))
			processQuartzFlag(flag, flagValue);
		
		try
		{
			ConfigFlag.saveFlag(flag, flag.getName(), flagValue);
		}
		catch (Exception e)
		{
			throw new DomainRuntimeException(e);
		}
		
		this.saveFlag(flag.getName(), flagValue);
		
		return "";
	}

	private void saveFlag(String flagName, String flagValue)
	{
		try
		{
			AFlag flag = ConfigFlag.getConfigFlag(flagName);			
			if (flag == null) 
				return;			
			flag.setValue(flagValue);
			
			
			if (flagName.equals(ConfigFlag.GEN.LOGGING_LEVEL.getName()))
			{
				EnvironmentConfig.SetLoggingLevel(ConfigFlag.GEN.LOGGING_LEVEL.getValue());
				Logging.setLoggingLevel(ConfigFlag.GEN.LOGGING_LEVEL.getValue());
			}
			else if (flagName.equals(ConfigFlag.GEN.LOG_FILE.getName()))
			{
				Logging.setMaximsAppenderFile(ConfigFlag.GEN.LOG_FILE.getValue());
			}
			
			/*else if (flagName.equals(ConfigFlag.GEN.SHOW_SQL.getName()))
			{
				setShowSql(ConfigFlag.GEN.SHOW_SQL.getValue());
			}
			else if (flagName.equals(ConfigFlag.GEN.HIBERNATE_STATISTICS_ENABLED.getName()))
			{
				setHibernateStatisticsEnabled(ConfigFlag.GEN.HIBERNATE_STATISTICS_ENABLED.getValue());
			}
			else if (flagName.equals(ConfigFlag.GEN.FORMAT_SQL.getName()))
			{
				this.getDomainFactory().setFormatSql(ConfigFlag.GEN.FORMAT_SQL.getValue());
			}*/			
			/*else if (flagName.equals(ConfigFlag.DOM.MAIN_DATASOURCE_NAME.getName()))
			{
				String dsName = ConfigFlag.DOM.MAIN_DATASOURCE_NAME.getValue();
				this.getDomainFactory().setDatasource(dsName);
				this.reloadConfiguration();
			}	*/		
			/*else if (flagName.equals(ConfigFlag.DOM.CACHE_PROVIDER.getName()))
			{
				Registry.getInstance().setCacheProvider();
				this.reloadConfiguration();
			}*/
			else if (flagName.equals(ConfigFlag.GEN.SESSION_TIMEOUT.getName()))
			{
				SessionManager.setSessionTimeout(ConfigFlag.GEN.SESSION_TIMEOUT.getValue());
			}
			else if (flagName.equals(ConfigFlag.ENABLE_DB_CONNECTION_TRACE.getName()))
			{
				if (this.getDbType().equals(DbType.ORACLE))
				{
					DomainFactory factory = getDomainFactory();		
					Connection conn = factory.getJdbcConnection();
					if (ConfigFlag.ENABLE_DB_CONNECTION_TRACE.getValue())
					{
						//conn.createStatement().execute("ALTER SESSION SET TIMED_STATISTICS = TRUE");
						conn.createStatement().execute("ALTER SESSION SET EVENTS '10046 TRACE NAME CONTEXT FOREVER, LEVEL 4'");						
					}
					else
					{
						//conn.createStatement().execute("ALTER SESSION SET TIMED_STATISTICS = FALSE");
						conn.createStatement().execute("ALTER SESSION SET EVENTS '10046 TRACE NAME CONTEXT OFF'");						
					}
				}
			}
		}
		catch (Exception e)
		{
			throw new DomainRuntimeException(e);
		}
	}

	public FlagCategoryVoCollection listCategories()
	{
		FlagCategoryVoCollection coll = new FlagCategoryVoCollection();
		String dispChoice = ConfigFlag.DISPLAY_CHOICE.getValue();
		if (dispChoice.equals("ALL") || dispChoice.indexOf("DOM") != -1)
			coll.add(createCategory("DOM", "Data"));
		if (dispChoice.equals("ALL") || dispChoice.indexOf("FW") != -1)
			coll.add(createCategory("FW", "Framework"));
		if (dispChoice.equals("ALL") || dispChoice.indexOf("UI") != -1)
			coll.add(createCategory("UI", "User Interface"));
		if (dispChoice.equals("ALL") || dispChoice.indexOf("DTO") != -1)
			coll.add(createCategory("DTO", "DTO"));
		if (dispChoice.equals("ALL") || dispChoice.indexOf("HL7") != -1)
			coll.add(createCategory("HL7", "HL7 Engine"));
		if (dispChoice.equals("ALL") || dispChoice.indexOf("GEN") != -1)
			coll.add(createCategory("GEN", "General"));
		if (dispChoice.equals("ALL") || dispChoice.indexOf("RCHTIM") != -1)
			coll.add(createCategory("RCHTIM", "RCHT HL7 Interface"));
		return coll;
	}
	
	private FlagCategoryVo createCategory(String key, String name)
	{
		FlagCategoryVo vo = new FlagCategoryVo();
		vo.setKey(key);
		vo.setName(name);
		return vo;
	}

	public IFlag[] listFlags(FlagCategoryVo catVo)
	{				
		IFlag[] flags = ConfigFlag.getFlags(catVo.getKey());
		return flags;
	}

	public IFlag[] listFlags(FlagCategoryVo catVo, String filter)
	{
		IFlag[] flags = ConfigFlag.getFlags(catVo.getKey());
		ArrayList mf = new ArrayList();
		for (int i = 0; i < flags.length; i++)
		{
			if (flags[i].getName().toUpperCase().indexOf(filter.toUpperCase()) != -1)
					mf.add(flags[i]);
		}
		IFlag[] ret = new IFlag[mf.size()];
		mf.toArray(ret);
		return ret;
	}
	
	private void processQuartzFlag(IFlag flag, String flagValue) throws DomainInterfaceException
	{
		if(flag.getValAsString().equals(flagValue))
			return;
		
		if(flagValue != null && !flagValue.equals(""))
		{
			try
			{
				URL url = new URL(flagValue);
				
				String host = url.getHost();
				
				if(host.equalsIgnoreCase("localhost"))
					throw new DomainInterfaceException("localhost url is not allowed !");
				else if(host.equals("127.0.0.1"))
					throw new DomainInterfaceException("127.0.0.1 url is not allowed !");
			}
			catch (MalformedURLException e)
			{
				throw new DomainInterfaceException(e);
			}
		}
		
		if(flagValue != null && !flagValue.equals(""))
			pingQuartz(flagValue);
		
		if(flag.getValAsString() != null && flag.getValAsString().length() > 0)
		{
			try
			{
				stopQuartz(flag.getValAsString());
			}
			catch(DomainInterfaceException e)
			{
				
			}
			
		}
		
		if(flagValue != null && !flagValue.equals(""))
			startQuartz(flagValue);
	}

	public void startQuartz(String quartzUrl) throws DomainInterfaceException
	{
		String content = "action=start";
		
		try
		{
			if(!postData(quartzUrl, content).equals("OK"))
				throw new DomainInterfaceException("Could not connect to server: " + quartzUrl);
		}
		catch (IOException e)
		{
			throw new DomainInterfaceException(e);
		}
	}

	public void stopQuartz(String quartzUrl) throws DomainInterfaceException
	{
		String content = "action=stop";
		
		try
		{
			if(!postData(quartzUrl, content).equals("OK"))
				throw new DomainInterfaceException("Could not connect to server: " + quartzUrl);
		}
		catch (IOException e)
		{
			throw new DomainInterfaceException(e);
		}
	}

	public void pingQuartz(String quartzUrl) throws DomainInterfaceException
	{
		String content = "action=ping";
		
		try
		{
			if(!postData(quartzUrl, content).equals("OK"))
				throw new DomainInterfaceException("Could not connect to server: " + quartzUrl);
		}
		catch (IOException e)
		{
			throw new DomainInterfaceException(e);
		}
	}
	
	private String postData(String postUrl, String content) throws IOException, DomainInterfaceException
	{
		URL url;
		URLConnection urlConn;
		DataOutputStream printout = null;
		String qsUrl = postUrl;

		if (qsUrl.endsWith("/"))
			qsUrl += "QuartzInitializer";
		else
			qsUrl += "/QuartzInitializer";

		// URL of servlet.
		url = new URL(qsUrl);
		// URL connection channel.
		urlConn = url.openConnection();
		// Let the run-time system (RTS) know that we want input.
		urlConn.setDoInput(true);
		// Let the RTS know that we want to do output.
		urlConn.setDoOutput(true);
		// No caching, we want the real thing.
		urlConn.setUseCaches(false);
		// Specify the content type.
		urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		// Send POST output.
		try
		{
			printout = new DataOutputStream(urlConn.getOutputStream());
		}
		catch (IllegalArgumentException e)
		{
			throw new DomainInterfaceException("Could not connect to server: " + postUrl);
		}
		printout.writeBytes(content);
		printout.flush();
		printout.close();
		// Get response data.
		/*
		 * Map headers = urlConn.getHeaderFields(); Iterator it =
		 * headers.keySet().iterator();
		 * 
		 * while(it.hasNext()) { String key = (String)it.next();
		 * System.out.println(key + " >> " + headers.get(key)); }
		 */

		String err = urlConn.getHeaderField(null);
		// the OK response should be HTTP/1.1 200 OK
		if (err.indexOf("HTTP/1.1 200 OK") == -1)
		{
			throw new IOException(err);
		}

		StringBuffer sb = new StringBuffer();
		
		DataInputStream input = new DataInputStream (urlConn.getInputStream ());
		BufferedReader d = new BufferedReader(new InputStreamReader(input));
		String str;
		while (null != ((str = d.readLine()))) 
		{
			sb.append(str); 
		} 
		input.close();
		 
		return sb.toString();
	}
	
}