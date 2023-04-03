package LinkHandling;

import java.net.SocketException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinkHandling1 {

	public static String xyz;
	public static void main(String[] args) 
	{
		 LinkHandling1 web=new  LinkHandling1();
		 try
		 {
		 web.amazon();
		 }
		 catch(Exception e)
		 {
			 
		 }
		
		//web.elements1();
		
		//String web1=web.elements1();
		//System.out.println(web1);
		/*System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//now we check what is the title of the page so we have method get title
		try
		{
		String act_title=driver.getTitle();
		System.out.println(act_title);//our title is The Internet
		Thread.sleep(5000);
		String exp_title="Th Internet";
		
	//now we compare the title
		
		if(exp_title.equals(act_title))
		{
		System.out.println("test is passed ");	
		}
		else
		{
			System.out.println("test is fail");
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally {
		driver.close();
		}*/
	}
	
	//now we will use how many element persent in web page and name of the elements and compare these elements ok
	
	public void makeMy()
	{
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip&ef_id=1038ac82886e1de9b221cfe0a825b6e1:G:s");
		
		List<WebElement> elmlist=driver.findElements(By.xpath("//div"));
		
		int x=elmlist.size();
		System.out.println(x);
		String name=null;
		//boolean flag=false;
		
		for(int i=0;i<x;i++)
		{
			name=elmlist.get(i).getText();
			//String name1=name;
		//System.out.println(name);
		
		//now we verify to put web element persent  in web page or not  
		
		if(name.equals("Trains"))
		{
		 System.out.println("test is passed");
		
		}
	
		//driver.close();
	
		}
		
		
	}
	public void amazon() throws SocketException
	{
System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_b_brand41_mkw_Ycxs8vQM-dc&mrntrk=pcrid_75454108097584_slid__pgrid_1207264149347696_pgeo_157340_x__ptid_kwd-75454277835080:loc-90");
		List<WebElement> name=driver.findElements(By.xpath("//div"));
		
		int size=name.size();
	
		for(int i=0;i<name.size();i++)
		{
			String name1=name.get(i).getText();
			//System.out.println(name1);
			
			if(name1.equals("Search Prime Video"))
			{
				System.out.println("test is passed");
				
				break;
			}
			//driver.close();
		}
	
	
			
		}
		
		
		
		
	}

