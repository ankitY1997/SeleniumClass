package WindowBasedOperation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Program1 extends BasePage
{

	
	@Test
	public void window() throws InterruptedException
	{
		
		//supposed if you want to perform window based operation
		
		//so you can used manage and window interface which provide some method to perform
		//some operation
		//lets see
		
	openBrowser("Edge");
	openUrl("https://www.facebook.com");
	
	//supposed if you want full screen you have use fullscreenmehtod
	
		driver.manage().window().fullscreen();
		
		
	//supposed if you want to maximized so we have method maximized
		
		driver.manage().window().maximize();
		
	//supposed if you want to minimized so we can use minimized method
		
		driver.manage().window().minimize();
		
//supoosed if you want to know the size of window so we have one method is 
		
		Dimension dim=driver.manage().window().getSize();
		System.out.println("the size of the dimension :=>"+dim);
		
		//supposed if you want to know the height of window
		
		int height=dim.getHeight();
		System.out.println("the height of screen is :=>"+height);
		int width=dim.getWidth();
		
		System.out.println("the width of screen is :=>"+width);
		
		
		//supposed if you want to change the height and width so we have to create instanece
		
		Dimension newdim=new Dimension(587,900);
		driver.manage().window().setSize(newdim);
		
		Thread.sleep(5000);
		Dimension dim1=driver.manage().window().getSize();
		System.out.println("the new dimension is :=>"+dim1);
		
		driver.manage().window().maximize();
		//if you want to set a position of web page so we have one method a and want to know
		
		//want to know the position of browser
		Thread.sleep(2000);
		Point ps=driver.manage().window().getPosition();
		
		System.out.println("the postion of the browser is :=>"+ps);
		
	//	if you want to set a position
		
		//if you want to know loaction of x and y postion
		
		int height1=ps.getY();
		System.out.println("the position is :=>"+height1);
		int width1=ps.getX();
		System.out.println("the position is :=>"+width1);
		
		Thread.sleep(5000);
		//now we are setting a position 
		
		Point ps1=new Point(10,10);
		driver.manage().window().setPosition(ps1);
		Thread.sleep(5000);
		
		
		
	}
	@AfterTest
	
	public void colseConn()
	{
		driver.quit();
	}
}
