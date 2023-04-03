package com.intro;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Websites 
{
	public void web(String name)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		EdgeOptions opt=new EdgeOptions();
		
		opt.addArguments("ignore-certification-error");
		opt.addArguments("--disable-notification");
		opt.addArguments("--start-maximized");
		ArrayList memb=new ArrayList();
		memb.add("facebook");
		memb.add("instagram");
		memb.add("whatsapp");
		memb.add("amazon");
		memb.add("impactqa");
		memb.add("landrover");
		
		
		int count=0;
		for(int i=0;i<6;i++)
		{
			String c=(String)(memb.get(i));
			System.out.println(c);
		EdgeDriver url=new EdgeDriver(opt);
		//url.get("https:\\www.bing.com");
		
		count++;
		if((c.equalsIgnoreCase("facebook"))&&(count==1))
		{
			System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			
			opt.addArguments("ignore-certification-error");
			url.get("https://www.bing.com/search?q=facebook+log+in&cvid=44a50d76c28e460ea3d8cc47ad5d2486&aqs=edge.1.69i60j69i59j69i57j46j0l5.4196j0j1&pglt=43&FORM=ANNTA1&PC=HCTS");
		}
		else if((c.equalsIgnoreCase("instagram"))&&(count==2))
		{System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			opt.addArguments("ignore-certification-error");
			url.get("https://www.instagram.com");
		}
		else if((c.equalsIgnoreCase("whatsapp"))&&(count==3))
		{System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			opt.addArguments("ignore-certification-error");
			url.get("https://www.bing.com/search?q=whatsapp+web&cvid=b197db1b567940a785c98c3185a7e04e&aqs=edge.0.0j69i57j46j69i59j0j69i59j69i60l3.5286j0j1&pglt=299&FORM=ANNTA1&PC=HCTS");
		}
		else if((c.equalsIgnoreCase("amazon"))&&(count==4))
		{System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			opt.addArguments("ignore-certification-error");
			url.get("https://www.bing.com/search?q=amazon.com&cvid=720f732823e14d61a95aa7ed1027d99f&aqs=edge.1.69i57j46j0l7.8391j0j1&pglt=299&FORM=ANNTA1&PC=HCTS");
		}
		else if((c.equalsIgnoreCase("impactqa"))&&(count==5))
		{System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			url.get("https://www.bing.com/search?q=impactqa&cvid=3514625c43ee4ef8961d8188cc3e278f&aqs=edge.0.0l9.4830j0j1&FORM=ANNTA1&PC=HCTS");
		}
		else if((c.equalsIgnoreCase("landrover"))&&(count==6))
		{System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			opt.addArguments("ignore-certification-error");
			url.get("https://www.bing.com/images/search?q=landrover+defender&form=HDRSC2&first=1&tsc=ImageHoverTitle");
		}
		else if((c.equalsIgnoreCase("phonepe"))&&(count==7))
		{System.out.println(count +" ="+c);
			opt.addArguments("--disable-notification");
			opt.addArguments("ignore-certification-error");
			url.get("https://www.bing.com/search?q=phonepe&cvid=29d1ec440bcf48008fd5b09dbbd16793&aqs=edge..69i57j46j0l7.4313j0j1&pglt=299&FORM=ANNTA1&PC=HCTS");
		}
		else
		{System.out.println(count +" ="+c);
			System.out.println("client  side error -404");
		}
		}
		
	}

}
