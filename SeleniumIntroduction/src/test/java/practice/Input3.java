package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Input3 {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://the-internet.herokuapp.com/inputs");
	    driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9340256458 ");
	    
	    Thread.sleep(5000);
	    
	    driver.close();

	}

}
