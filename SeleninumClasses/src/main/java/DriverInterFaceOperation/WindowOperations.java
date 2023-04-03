package DriverInterFaceOperation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class WindowOperations extends BasePage
{

 /*if you want to perform some window type operation so we can use manage() interface which have a method of 
	windows here we can perform all window related task like maximized and minimized and full screen
	*difference between maximized and fullscreen =>
	*
	 difference is in maximized mode we can able to see browser option but in fullscrren
	 we can't able to see browser option


	
	so let see*/
	
	@Test
	public void Window() throws InterruptedException
	{
		
          openBrowser("Edge");
		//now we have to see maximized operation 
		driver.manage().window().maximize();
		openUrl("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//now we can see full screen so we get to know what's the difference 
		
		driver.navigate().to("https://www.instagram.com/");
		driver.manage().window().fullscreen();
	
		//lets see
		
		Thread.sleep(2000);
		
		
		//now we can minimized the screen
		
		driver.manage().window().minimize();
		//Thread.sleep(2000);
		     //another method is getSize() method .and its return type is dimension  
		    //it is used to find out the size of screen
		   //dimension is class there will be two method  getHieght(), and getWidth();
		  //now if you want to set the dimension then we hve one method setDimension
	      // but first we have to create an instance of the dimension then pass the dimension
	      //like width and size
		
	        Dimension dim=driver.manage().window().getSize();
	        System.out.println(dim);
		
	        int height=dim.getHeight();
	        System.out.println("the hiegth is :=>"+height);
	
	        int width=dim.getWidth();
	        System.out.println("the width is :=>"+width);
	
	
	       //now here we will perform setSize method 
	
	         Dimension setsize=new Dimension(200,447);
	         driver.manage().window().setSize(setsize);

	         Thread.sleep(2000);
	      
	        int	newheight=setsize.getHeight();
	        System.out.println("the new hiegth is :=>"+newheight);
	
	        int newwidht=setsize.getWidth();
	        System.out.println("the new width is :=>"+newwidht);
	      
	        //now if you want find the position so we have one method is getPosition() and its return type is 
	       //point so we have to store in a point 
	      
            Point ps=driver.manage().window().getPosition();
        
            System.out.println("the position is :=>"+ps);
            
            int startx=ps.getX();
            System.out.println("the x position is :=>"+startx);
          
            int starty=ps.getY();
            
            System.out.println("the y position is :=>"+starty);
 
 
          //now if you want to set the position so first we have to create an object of point then pass the x and y argument
 
 
          Point setlocation=new Point(100,100);
          driver.manage().window().setPosition(setlocation);
 
            int newstartx=setlocation.getX();
            System.out.println("the new  x position is :=>"+newstartx);
            int newstarty=setlocation.getY();
            System.out.println("the new y position is :=>"+newstarty);
           
            //now if you want to 
 
 
          driver.manage().window().setPosition(new Point(200,500));
 
           Thread.sleep(2000);
		
	}
	
	@AfterTest
	
	public void closeConn()
	{
		driver.quit();
	}
	
}
