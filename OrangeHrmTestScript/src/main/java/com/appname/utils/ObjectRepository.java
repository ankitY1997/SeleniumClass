package com.appname.utils;

public class ObjectRepository 
{
	//****************login page****************************//
	
	public static final String strusername="//input[@name='username']";
	public static final String strpassword="//input[@type='password']";
	public static final String strloginbutton="//button[@type='submit']";
	
	//************************************************************//
	
	//****************dashboard page******************************//
	public static final String dashboard="//h6[text()='Dashboard']";
	
	//*****************Admin UserManagemnt Page*******************//
	public static final String strJob="//span[text()='Job ']";
	public static final String strJobTitle="//a[text()='Job Titles']";
	
	//********************Admin Page*****************************//
	public static final String straddJob="//div/button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
	
	
	
	
	//**********************Add-job-title-page********************************//

	 public static final String jobtitle="//div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div/input[@class=\"oxd-input oxd-input--active\"]";
	 public static final String jobdescr="//textarea[@placeholder=\"Type description here\"]";
	 public static final String jobspec="//div[@class='oxd-file-button']";
	 public static final String note="//textarea[@placeholder=\"Add note\"]";
	 public static final String save="//button[@type=\"submit\"]";
	 
}
