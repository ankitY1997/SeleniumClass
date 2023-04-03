package com.inetbanking.testcases;

import com.inetbanking.pageobjects.LogInPage2;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Tc_LoginTest_002 extends BaseClass
{

    LogInPage2 lp2;
    int count=0;
    @Test(dataProvider ="inputdata")
    public void verifyWordOccurance(HashMap map)
    {

            lp2 = new LogInPage2(driver);
            lp2.setData("test", "test", lp2.username1, lp2.password1);
            logger.info("suceesfully set username and password ");
            lp2.click(lp2.loginbutton1);
            logger.info("succesfully click on login button");
            String input1=map.get("input1").toString();
            String input2=map.get("input2").toString();
          lp2.setData(input1,input2,lp2.searchterm,lp2.searchcontent);
        logger.info("sucessfuly put a input in both text field");
        lp2.click(lp2.findbutton);
        logger.info("sucessfully click on find button");
         String expoccurance=lp2.expOccurance(input1,input2);
       String actoccurance=lp2.getText(lp2.actualvalue);

         if(actoccurance.contains(expoccurance))
           {
         Assert.assertTrue(true,"test is passed ");
            }
         else {
         Assert.assertTrue(false,"test is failed ");
          }
         logger.info("===========================================");
        driver.navigate().back();
         lp2.username1.clear();
        lp2.password1.clear();


    }


}
