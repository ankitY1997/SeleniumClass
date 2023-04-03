package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gamilLink {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.bing.com/search?q=gamil&cvid=d1128b13e2fb4c36adec6f87afc55c3b&aqs=edge..69i57j46j0l7.2119j0j1&pglt=299&FORM=ANNTA1&PC=HCTS");
	}

}
