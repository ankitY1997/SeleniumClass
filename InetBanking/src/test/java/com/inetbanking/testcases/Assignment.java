package com.inetbanking.testcases;

import com.inetbanking.pageobjects.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assignment
{
   private WebDriver driver;
   @Test
    public void verify()
    {

      BaseClass bs=new BaseClass();
        bs.openBrowser("Edge");
        bs.openUrl("https://maqdoomec.github.io/login.html");

        driver.findElement(By.xpath("//input[@id='usernametxt']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='passwordtxt']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@onclick=\"checkLogin();\"]")).click();

    }


}
