package GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AffZ59KBqD9dhDk5yf5FtQi8sr5WkMmbp8wFPGhIeS77aNCtYYD1-dgLvFT4qywsntSqX9ZghAc7pzhAmi1gN90_gf37ul5qiUQ77u4Cx4o5KA&smuh=56936&lh=Ac8CMRbj5_ilnaTwMqc");
		//WebElement name=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		//Thread.sleep(5000);
		//String x=name.getText();
		                                 //name.click();
		WebElement name=driver.findElement(By.xpath("//div[text()='Thanks for stopping by!']"));                               // this for text method it will return text whatever path we have copied 
		String act=name.getText();
		///System.out.println(act);
		String exp_result="Thanks for stopping by!";
		   if(act.equals(exp_result))  
		   {
			   System.out.println("test is passed ");
		   }
		

	}

}
