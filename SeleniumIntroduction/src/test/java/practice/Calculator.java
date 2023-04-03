package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calculator 
{

	public static void main(String[] args) throws Exception
	{
		
		
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    driver.get("https://emicalculator.net/");
	    
	    List<WebElement> callist=driver.findElements(By.xpath("(//*[local-name()='svg']/*[name()='g'])[10]/*[name()='g']/*[name()='rect']"));
	    Actions act=new Actions(driver);
	    int num=callist.size();
	    System.out.println(num);
	    
	    List<WebElement> higher=driver.findElements(By.xpath("(((//*[local-name()='svg']/*[name()='g'])[10]/*[name()='g'])[1]/*[name()='rect'])"));
	    int highersize=higher.size();
	 // List<WebElement> listbarsname=driver.findElements(By.xpath("(//*[name()='g' and@class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]/*[name()='text']//*[name()='tspan'])"));
	 // int size=listbarsname.size();
	 // System.out.println(size+"+++++++++");
	    int k=1;
	   int l=0;
	   int m=0;
	    
	    for(int i=21;i>=1;i--)
	    {
	    	
	    	while(k<=highersize)
	    	{
	    		Thread.sleep(1000);
	    	WebElement higherchart=driver.findElement(By.xpath("(((//*[local-name()='svg']/*[name()='g'])[10]/*[name()='g'])[1]/*[name()='rect'])["+k+"]"));
	    	Thread.sleep(500);
	    	act.moveToElement(higherchart).build().perform();
	    	Thread.sleep(1000);
	    		
	    	
	    	List<WebElement> list=driver.findElements(By.xpath("//*[name()='g'and@class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()='text']//*[name()='tspan']"));
	    	//System.out.println(list.size());
	    	
	    	
	    
	    	  l=1;
	     	while(l<=list.size())
	     	{
	     		Thread.sleep(500);
	   
	     		WebElement barname=driver.findElement(By.xpath("(//*[name()='g'and@class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()='text']//*[name()='tspan'])["+l+"]"));
	     		System.out.print(barname.getText()+" ");
	     		//System.out.println("*********************************");
	     		
	     		l++;
	     	}
	    	
	     	System.out.println("*********************************");
	    	k++;
	    	
	    	
	    	}
	    	
	    	Thread.sleep(1000);
	   // System.out.println(i);
	   
	    	
	    	WebElement lower=driver.findElement(By.xpath("((//*[name()='g'][7]/*[name()='g'])[3]/*[name()='rect'])["+i+"]"));
	    	if(i==21)
    		{
    			int loc=lower.getLocation().y;
    			
    			js.executeScript("window.scrollTo(0,"+loc+")");
    		}
	    	else if(i!=21)
	    	{
	    	act.moveToElement(lower).build().perform();
	    	}
	    	
	    	Thread.sleep(1000);
	    	List<WebElement> list=driver.findElements(By.xpath("//*[name()='g'and@class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()='text']//*[name()='tspan']"));
	    	//System.out.println(list.size());
	    	
	    	
	    
	    	  m=1;
	     	while(m<=list.size())
	     	{
	     		Thread.sleep(500);
	   
	     		WebElement barname=driver.findElement(By.xpath("(//*[name()='g'and@class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()='text']//*[name()='tspan'])["+m+"]"));
	     		System.out.print(barname.getText()+" ");
	     		
	     		m++;
	     	}
	    	
	     	System.out.println("*********************************************");
	    	
	    
	    }
	   
	  /*  WebElement move=driver.findElement(By.xpath("//div[@id=\"emipaymenttable\"]"));
	    act.moveToElement(move).build().perform();
	    List<WebElement> column=driver.findElements(By.xpath("//tr[@class=\"row no-margin\"]/th[not(@class=\"col-3 d-table-cell d-sm-none\")]"));
	  
	    int columnsize=column.size();
	    System.out.println(columnsize);
	    
	    List<WebElement> row=driver.findElements(By.xpath("//tr[@class=\"row no-margin yearlypaymentdetails\"]"));
	    
	    int rowsize=row.size();
	    System.out.println(rowsize);
	    
	    int j=1;
	    for(int i=1;i<=rowsize;i++)
	    {
	    	j=1;
	    	while(j<=columnsize)
	    	{
	    		String name=driver.findElement(By.xpath("(//tr[@class=\"row no-margin yearlypaymentdetails\"])["+i+"]/td["+j+"]")).getText();
	    		System.out.println(name);
	    		
	    		j++;
	    	}
	    	System.out.println("************************");
	    }*/
	    
	    driver.quit();
	    
	}
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	 

