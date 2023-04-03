package FileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
			
		WebElement upld=driver.findElement(By.xpath("//input[@id=\"uploadPicture\"]"));
		
		int loc=upld.getLocation().y;
		
		//uploading photo there is a method sendkeys
		JavascriptExecutor scrol=(JavascriptExecutor)driver;
	    scrol.executeScript("window.scrollTo(0,"+loc+")");
		//scrol.executeScript("window.scrollTO(0,"+loc+")");
		
		//this for uploading
		upld.sendKeys("D:\\photos\\Camera imports\\photos\\dualipa.jpg");*/
		
		demo();
		
	}
	
	//demoqa
	
	public static void demo() {
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoqa.com/automation-practice-form");
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		int loc=element.getLocation().y;
	 //  act.moveByOffset(0, loc).perform();
		act.scrollByAmount(0, loc).perform();
		element.sendKeys("C:\\Users\\ankit yadav\\OneDrive\\Documents\\Ankit cv.pdf");
		driver.quit();
		
	}

}
