package Com.Appname.Basepage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anontation1 
{

	@BeforeTest
	public void logIn()
	{
		System.out.println("this is the  before test anpntation ");
		
	}
	@AfterTest
	public void logOut()
	{
		System.out.println("this is the after test anotation");
	}
	@BeforeMethod 
	public void open()
	{
		System.out.println("this is the before method annotation");
	}
	@AfterMethod
	public void close()
	{
		System.out.println("this is the close after annotation");
	}
	
	@Test
	
	public void bLoogIn()
	{
		System.out.println("this is test method 1");
	}
	@Test
	public void ALogIn()
	{
		System.out.println("this is test mehtod 2");
	}
	
}
