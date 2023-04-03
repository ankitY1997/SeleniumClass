package com.intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Whatsapp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(20000);
		
		WebElement sendmes=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		String name=sendmes.getAttribute("Search or start new chat");
		
		System.out.println(name);
		
		sendmes.sendKeys("Shubham Coaching");
		
		List<WebElement> list=driver.findElements(By.xpath("//span[text()='Shubham Coaching']"));
		//String x=null;
		for(int i=0;i<list.size();i++)
		{
		   
			System.out.println(list.get(i).getText());
		
			if((list.get(i).getText()).equals("Shubham Coaching"))
			{
			list.get(i).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//p[@class=\"selectable-text copyable-text\"]")).sendKeys("hiii shubham iam ankit bro");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@data-testid=\"send\"]")).click();
			
			
			}
			
		}
	}
		
		
}


