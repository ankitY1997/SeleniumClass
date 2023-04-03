package com.appname.pages;

import org.openqa.selenium.WebDriver;

import com.appname.basepage.BasePage;
import com.relevantcodes.extentreports.ExtentTest;

public class Add_Job_Title_Page extends BasePage 
{
 //public WebDriver driver;
 
 public String jobtitle="//div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div/input[@class=\"oxd-input oxd-input--active\"]";
 public String jobdescr="//textarea[@placeholder=\"Type description here\"]";
 public String jobspec="//div[@class='oxd-file-button']";
 public String note="//textarea[@placeholder=\"Add note\"]";
 public String save="//button[@type=\"submit\"]";
 
 
 public Add_Job_Title_Page(WebDriver driver,ExtentTest test)
 {
	super(driver,test);
 }
 
 public void addJob()
 {
	 
 }
}
