package Checkbox_and_radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	
		WebElement create=driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		
				create.click();
				
				Thread.sleep(5000);
			WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
			Thread.sleep(5000);		
			firstname.sendKeys("girish");
			
		System.out.println(firstname.getAttribute("value"));
				
				WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
				
				lastname.sendKeys("dubey");
				
				WebElement gmail=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
				
				gmail.sendKeys("ankiteng1997@gamil.com");
				
				WebElement paswd=driver.findElement(By.xpath("//input[@data-type=\"password\"]"));
					paswd.sendKeys("xyzz@123");
				
				WebElement dropdown1=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
				
			
				Select dropdown=new Select(dropdown1);
				
				dropdown.selectByVisibleText("15");
				
				//Thread.sleep(5000);
				WebElement dropdown2=driver.findElement(By.xpath("//select[@title=\"Month\"]"));
				Select dropdownx=new Select(dropdown2);
				dropdownx.selectByVisibleText("Aug");
				//Thread.sleep(5000);
				WebElement dropdown3=driver.findElement(By.xpath("//select[@id=\"year\"]"));
				Select dropdowny=new Select(dropdown3);
				dropdowny.selectByVisibleText("1997");
				
				
				
			// this is  for radio button  	
				
				WebElement radiomale=driver.findElement(By.xpath("//label[text()='Male']"));
						radiomale.click();
						
						
				boolean check=radiomale.isSelected();
				WebElement radiofemale=driver.findElement(By.xpath("//label[text()='Female']"));
				
				boolean checkfemale=radiofemale.isSelected();
				
				WebElement radiocustome=driver.findElement(By.xpath("//label[text()='Female']"));
				
				boolean checkcustom=radiocustome.isSelected();
				
				
				
			WebElement submit=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
			submit.click();
	
			
			
			
			
			
				
				
	}

}
