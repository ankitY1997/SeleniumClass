package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		//WebElement page=driver.findElement(By.xpath("//div[@class=\"form-group ml-field-email ml-validate-email ml-validate-required mb-2\"]/child::input"));
			
		//page.click();
		//page.sendKeys("ankiteng1997@gmail.com");
		
		
		List<WebElement> col=driver.findElements(By.xpath("//table[@class=\"tg\"]/tbody/tr[1]/th"));
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@class=\"tg\"]/tbody/tr/following-sibling::tr"));
		int j=1;
		for(int i=1;i<=row.size();i++)
		{
			j=1;
			while(j<=col.size())
			{
			WebElement celldata=driver.findElement(By.xpath("//table[@class=\"tg\"]/tbody/tr/following-sibling::tr[i]/td[j]"))	;
			
			System.out.println(celldata.getText());
			j++;
			}
		}
	

	}

}
