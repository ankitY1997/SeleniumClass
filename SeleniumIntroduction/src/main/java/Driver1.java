import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\chromedriver.exe");
		ChromeDriver m1=new ChromeDriver();
		m1.get("http://www.google.com");

	}

}
