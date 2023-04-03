package Checkbox_and_radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox_handling {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		
		//so clicking is simple but main things i want to know check box is slected or not so i use is Slected mehtod
		
		boolean check1=checkbox1.isSelected();/* this is the method to check its selected or not and it will always return boolean type
												value so thats why we will take boolean data type*/
		
		System.out.println(check1);//
		
		boolean  check2=checkbox2.isSelected();
		
		System.out.println(check2);
		
		if(check1==false)
		{
			checkbox1.click();
		}
		else if (check2==true)
		{
			checkbox1.click();
			
		}
	
	}

}
