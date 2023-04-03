package com.banking.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{

	
	public Properties pro;
	
	
	public ReadConfig()
	{
		File src=new File("./Configuration/Config.properties");
		
		//now we have to create an instance of proprties file
		pro =new Properties();
		
		try {
	FileInputStream fis=new FileInputStream(src);	
		
		pro.load(fis);//its used to load a properties at run time whatever the properties 
		                 //Present inside the properties
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		             
		
		//now we have to read the properties one by one so create one method for every properties
		//lets start
	}
	
	public String getApplicationUrl()
	{
		//now we have one method provided by properties class to read the data one by one 
		
		String url=pro.getProperty("url");
	   
		return url;
	}
	
	public String getUserId()
	{
		String user_id=pro.getProperty("userId");
		
		return user_id;
	}
	
	public String getPasswrd()
	{
		String password=pro.getProperty("passward");
		return password;
	}
	
	public String getChromePath()
	{
		String chrome_path=pro.getProperty("chrome_path");
		return chrome_path;
	}
	
	public String getEdgePath()
	{
		String edge_path=pro.getProperty("edge_path");
		
		return edge_path;
	}
	
}
