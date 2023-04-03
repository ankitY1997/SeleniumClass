package com.inetbanking.pageobjects;

import com.inetbanking.utills.ObjectRepository;
import com.inetbanking.utills.WrapperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;
import java.lang.*;
public class LogInPage2 extends WrapperMethods {


 public WebDriver driver;

 public LogInPage2(WebDriver driver)
 {
     this.driver=driver;

    PageFactory.initElements(this.driver,this);

 }





    @FindBy(xpath= ObjectRepository.username1)
    public WebElement username1;

    @FindBy(xpath=ObjectRepository.password1)
    public WebElement password1;

    @FindBy(xpath=ObjectRepository.loginbutton1)
    public WebElement loginbutton1;


    @FindBy(xpath=ObjectRepository.searchterm)
    public WebElement searchterm;

    @FindBy(xpath=ObjectRepository.searchcontent)
    public WebElement searchcontent;

    @FindBy(xpath=ObjectRepository.findbutton)
    public WebElement findbutton;

    @FindBy(xpath=ObjectRepository.actualvalue)
    public WebElement actualvalue;

    public  String input="vmk";
    public String input2="cmkvmkvmvmkcnendvmk";

     public  String expOccurance(String input,String input2)
     {

       String finalresult=input2;


         int index=0;
         Integer count=0;
         int i=0;
         while(i!=-1)
         {
             index=finalresult.indexOf(input,i);
             //System.out.println(index);
             if(index==-1)
             {
                 break;
             }
             i=index+1;
             //System.out.println("my i value is =>"+i);
             count++;
         }
         String expectedresult=Integer.toString(count);

       return expectedresult;
     }





}
