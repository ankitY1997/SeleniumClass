package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/webtables");
		
		List<WebElement> col=driver.findElements(By.xpath("//div[@class=\"rt-tr\"]/child::div"));
		
		int column=col.size();
		
		//System.out.println(column);
		List<WebElement> row=driver.findElements(By.xpath("//div[@class=\"rt-thead -header\"]/following-sibling::div/div"));
		
		int rownum=row.size();
		
		//System.out.println(rownum);
		
		int rowcal=0;
		int colcal=0;
		boolean flag=false;
		for(int i=1;i<=rownum;i++)
		{
			
			int j=1;
			while(j<=column)
			{
				WebElement list=driver.findElement(By.xpath("//div[@class=\"rt-thead -header\"]/following-sibling::div/div["+i+"]/div/div["+j+"]"));
				
				String name=list.getText();
				
				//System.out.println(name);
				
				if(name.equals("alden@example.com"))
				{
					flag=true;
					 rowcal=i;
					 colcal=j;
					 System.out.println(rowcal);
					 System.out.println(colcal);
					 break;
			
				
			    }
				j++;
			
		   }
		
			if(flag==true)
			{
				break;
			}
			
			
		
	
	}
		
		WebElement edit=driver.findElement(By.xpath("//div[@class=\"rt-thead -header\"]/following-sibling::div/div["+rowcal+"]/div/div[7]/div/span[1]"));
	
		edit.click();
		Thread.sleep(5000);
		WebElement  frame=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		frame.click();
		
		frame.clear();
		frame.sendKeys("ankit");
		
		Thread.sleep(2000);
		
		String x=frame.getAttribute("value");
		System.out.println(x);
		
		WebElement button=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		boolean sel=button.isSelected();
		System.out.println(sel);
		
		if(sel==false)
		{
			button.click();
		}
		try {
		driver.close();
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		System.out.println("program is closed");

	}
}
