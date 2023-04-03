package Alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.basepage.BasePage;

public class Alert_Class extends BasePage {
	
	
	/*
	 * alert =>in seleninum we have a three types of alert
	 * 
	 * 1)javaScript alert=>its a type of alert when you can't inspect it
	 * 
	 * a)confirmation pop-up=>this kind of pop up you see only ok or cancel button
	 * b)prompt pop-up=>its type of pop up when you see a text field over the pop up
	 * 
	 * 2)Hidden-division popup=>this kind of pop up you can handle easily with help
	 * of seleninum
	 * 
	 * 3)notification pop-up=>this kind of pop up if you want to handle so we have
	 * to use Robot class which is provided by java . lets see how we can handle it
	 */

	@Test(priority = 1)

	public void ConfirmationAlert() throws InterruptedException {
		openBrowser("Edge");
		openUrl("https://demoqa.com/alerts");
		// for wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement element = driver.findElement(By.xpath("//button[text()='Click me' and @id='alertButton']"));
		element.click();
		// for accepting
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(5000);
		// for dismiss
		element.click();
		driver.switchTo().alert().dismiss();

	}
	
}
