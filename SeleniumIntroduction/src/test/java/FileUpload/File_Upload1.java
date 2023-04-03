package FileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload1 {
	
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\ankit yadav\\OneDrive\\Documents\\AutoItFileUpload\\FileUpload.exe");
		
	}
	
	
	//Steps=>
	/**
	 * 1)first we have to download auto it tool 2)then we have to extract the file
	 * and install it. 3)then we go to proramfile*86 which present in c driver
	 * 4)enter the program files autoIt files and go to scite 5)then we have to open
	 * this file and write this scripts
	 * 
	 * sleep(2000) 
	 * send("C:\Users\ankit yadav\Downloads\Girish Resume.docx")
	 * sleep(4000) 
	 * send("{ENTER}")
	 * 
	 * then save the scrips from extension .au3
	 * 
	 * then we have to go on tool otion and compile into .exe 
	 * 
	 * after doing this refresh the project and one file extra file we have to see and copy that file path
	 * 
	 */

}
