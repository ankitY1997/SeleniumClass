package Com.Appname.Basepage;

import org.testng.annotations.Test;

public class Anotation  {

	@Test(priority=1,description="this is get url test ")
	public void getUrl()
	{

		System.out.println("test case 1");

	}
	@Test(priority=2,description ="this is get url second test ")
	public void bgetUrl()
	{
		System.out.println("test case2");
	}
	
	
	
	
}
