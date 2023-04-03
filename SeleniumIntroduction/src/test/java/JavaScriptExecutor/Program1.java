package JavaScriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 {

//java Script Executor 

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.edge.driver",
//				"E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
//
//		WebDriver driver = new EdgeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		// we will take a example of git hub button and this button is enable after some
//		// time but now i don't want to wait
//		// and i want to click this button
//
//		driver.get("https://temqa.sakonapps.com/Automation3130X/Client/ClientSetup/Notification");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		driver.findElement(By.xpath("//input[@name='LoginUserName']")).sendKeys("temqa.automation@sakon.com");
//		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Sakon@123");
//		driver.findElement(By.xpath("//input[@value='GET STARTED']")).click();
//		WebElement element1 = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
//		js.executeScript("arguments[0].click()", element1);
//		WebElement element2 = driver.findElement(By.xpath("//a[@data='QA2 Automation']/i"));
//		js.executeScript("arguments[0].click()", element2);
//
//		driver.findElement(By.xpath("//a[@title=\"Admin\"]")).click();
//		driver.findElement(By.xpath("//span[text()='Notifications']")).click();
//
//		// now i have to wait for this button and click it
//
//		WebElement element = driver.findElement(By.xpath(
//				"//input[@id='txtassetContractAutoExpiryafter' and @ng-model='NotificationData.TrigerAutoExpirysDayss' ]"));
//
//		// WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(20));
//
//		// wt.until(ExpectedConditions.visibilityOf(element));
//
//		// now i have to use java script executor
//
//		// JavascriptExecutor js=(JavascriptExecutor)driver;
//
//		js.executeScript("arguments[0].value='20'", element);
//
//		WebElement element3 = driver
//				.findElement(By.xpath("//input[@ng-model='NotificationData.TrigerassetAutoExpiryDays']"));
//		js.executeScript("arguments[0].value='50'", element3);
//		
//		WebElement element4=driver.findElement(By.xpath("//h3[@id='ui-id-15']"));
//		js.executeScript("arguments[0].scrollIntoView(false);",element4);
//		
		// driver.quit();
		main();

	}

	public static void main() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://temqa.sakonapps.com/Automation3130X/Client/ClientSetup/Notification");

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='LoginUserName']")).sendKeys("temqa.automation@sakon.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Sakon@123");
		driver.findElement(By.xpath("//input[@value='GET STARTED']")).click();

		WebElement contract = driver.findElement(By.xpath("//a[@id='moduleContractOverview']"));

		wt.until(ExpectedConditions.visibilityOf(contract));
		js.executeScript("arguments[0].click()", contract);

		WebElement subcontract = driver.findElement(By.xpath("//a[@id='subModuleContractOverview']"));
		wt.until(ExpectedConditions.visibilityOf(subcontract));
		js.executeScript("arguments[0].click()", subcontract);

		WebElement existContract = driver.findElement(By.xpath("//a[@title='Existing Contracts']"));
		wt.until(ExpectedConditions.visibilityOf(existContract));
		js.executeScript("arguments[0].click()", existContract);

		driver.findElement(
				By.xpath("//div[@id='row00jqxgridExistingContract']//input[@tabindex='9']//following-sibling::div"))
				.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='option']/span"));

//       WebElement elemnt= driver.findElement(By.xpath("//div[@id='listitem13innerListBoxjqxWidgetb1d0c56ff419']"));
//         js.executeScript("arguments[0].click()",elemnt);
//        

		System.out.println(list.size());
//		
//        for(int i=0;i<list.size();i++)
//        {
//           Thread.sleep(2000);
//           
//          // System.out.println(list.get(i).getText()+"=="+list.get(i).getAttribute("style").contains("inherit"));
//           
//          WebElement master= driver.findElement(By.xpath("(//div[@role='option']/span)["+1+"]"));
//          
//           boolean flag=master.getText().contains("ends with");
//           
//           System.out.println(flag);
//           while(!flag)
//           {
//        	  driver.findElement(By.xpath("(//div[@role='listbox']//*[contains(@id,'jqxScrollBtnDownverticalScrollBarinnerListBoxjqxWidget')]/div)[4]")).click();
//        	   
//        	  System.out.println(list.get(i).getText());
//        	  
//        	  if(master.getText().contains("ends with"))
//        			  {
//        		  
//        		  flag=true;
//        		  i=i-1;
//        			  }
//        	  
//           }
//           
		int j = 0;

		boolean flag = false;

		driver.findElement(By.xpath("//input[@tabindex='9']")).sendKeys("Alaska");
		while (j != -1) {

			WebElement master1 = driver.findElement(By.xpath("(//div[@role='option']/span)[" + 1 + "]"));

			if (master1.getText().equals("equal")) {
				System.out.println(master1.getText());

				master1.click();
				break;
			} else {
				int k = 0;
				while (!(master1.getText().equals("equal"))) {

					driver.findElement(By.xpath(
							"(//div[@role='listbox']//*[contains(@id,'jqxScrollBtnDownverticalScrollBarinnerListBoxjqxWidget')]/div)[4]"))
							.click();

					if (k == 20) {

						flag = true;
						break;
					}

					k++;

				}
				if (flag == true) {
					int l = 1;

					while (l <= 14) {

						master1 = driver.findElement(By.xpath("(//div[@role='option']/span)[" + l + "]"));

						if (master1.getText().contains("equal")) {
							System.out.println(master1.getText());

							master1.click();

							break;
						}

						l++;
					}
					break;

				}

				else if ((master1.getText().equals("equal"))) {

					master1.click();

					System.out.println("loop breaks in else condition");
					break;

				}

			}

		}

	}

}
