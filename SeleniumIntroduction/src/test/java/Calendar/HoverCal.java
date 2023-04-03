package Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HoverCal {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://emicalculator.net/");

	}

}
