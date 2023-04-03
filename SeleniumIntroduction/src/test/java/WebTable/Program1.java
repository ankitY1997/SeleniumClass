package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
	
		WebElement webel=driver.findElement(By.xpath("//a[text()=\"Sortable Data Tables\"]"));
		
		webel.click();
		
		List<WebElement> col=driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th"));
		
		System.out.println(col.size());
		
List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr"));
		
		System.out.println(row.size());
		
	//Thread.sleep(5000);
		int rownum=0;
		int column;
		int j=1;
		for(int i=1;i<=row.size();i++) 
		{
			j=1;
			while(j<=col.size())
			{
				
				
			WebElement opt=driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]"));	
			
			String x=opt.getText();
			//System.out.println(x);
			
			if(x.equals("fbach@yahoo.com"))
			{
				 rownum=i;
				 column=j;
				 System.out.println("rownum :"+rownum);
				 System.out.println("column :"+column);
				 break;
			}
			j++;
			}
			if(rownum>0) {
				
				break;
				}
		}
		WebElement delete=driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr["+rownum+"]/td[6]/a[2]"));
		
		delete.click();
		
		Thread.sleep(5000);
		
		driver.close();
			
	}
}
