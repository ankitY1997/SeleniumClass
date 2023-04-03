package ClassicDropDownList;

import java.net.SocketException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassicDropDown {

	public static void main(String[] args) throws InterruptedException ,SocketException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement elm=driver.findElement(By.xpath("//a[text()='Dropdown']"));
		elm.click();
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown']"));	
		Select opt=new Select(drop);
		//it you want to select the option then you have to use this method specially for dropdown
	opt.selectByIndex(0);//by value
		//and select option we have another method is by text
	//	opt.selectByVisibleText("Option 2");
		
		/*List<WebElement> liselmt=opt.getOptions();
		int num=liselmt.size();
		Thread.sleep(5000);
	  // driver.close();
	   
	   for(int i=0;i<liselmt.size();i++)
	   {
		   System.out.println(liselmt.get(i).getText());
	   }
		
	      */
	}

}
