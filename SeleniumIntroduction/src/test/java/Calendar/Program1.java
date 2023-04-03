package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program1 {

	public static void main(String[] args) throws Exception {
		
//1. you need to validate the input date 
		
	System.setProperty("webdriver.edge.driver","E:\\object oriented programin language\\SeleniumIntroduction\\Driver\\msedgedriver.exe");
		String targetdate="19-Dec-2023";
		
	SimpleDateFormat targetdateFormat=new SimpleDateFormat("dd-MMM-yyyy"); 
	
	//now i want to convert my date into targetdateFormat
	Calendar calendar=Calendar.getInstance();
	Date formated_date;
	try {
	targetdateFormat.setLenient(false);
	 formated_date=targetdateFormat.parse(targetdate);
	 calendar.setTime(formated_date);
	 //now i want to find the day what is the day is it Monday or Tuesday
	 int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
	 System.out.println(targetDay);
	 int targetMonth=calendar.get(Calendar.MONTH);
	 System.out.println(targetMonth);
	 int targetYear=calendar.get(Calendar.YEAR);
	 System.out.println(targetYear);
	 
	 WebDriver driver=new EdgeDriver();
	 
	 driver.get("https://www.tripodeal.com/flight-deal?utm_source=bing_tpk&utm_medium=cpc&utm_campaign=bing_c_tpk&msclkid=b30ff49882cb17ca30aa97ef9b920dc0");
	 
	 driver.findElement(By.xpath("//input[@name=\"trip_start_date\"]")).click();
	 
	
	
	 String actMonth=driver.findElement(By.xpath("//div[@aria-hidden=\"false\"]/div/div/div/div/div/div[1]")).getText();

	 SimpleDateFormat actMonthFormat=new SimpleDateFormat("MMM");
	 Date formated_month=actMonthFormat.parse(actMonth);
	 int actMonthNo=calendar.get(Calendar.MONTH);
	 //System.out.println(formated_year);
	 System.out.println(formated_month);
	 
	 
	 
	 String actyear=driver.findElement(By.xpath("//div[@aria-hidden=\"false\"]/div/div/div/div/div/div[2]")).getText();
	 
	int actYearNo=calendar.get(Calendar.YEAR);
	
	
	while((actYearNo!=targetYear)&&(actMonthNo!=targetMonth))
	{
		  actMonth=driver.findElement(By.xpath("//div[@aria-hidden=\"false\"]/div/div/div/div/div/div[1]")).getText();

		  actMonthFormat=new SimpleDateFormat("MMM");
		  formated_month=actMonthFormat.parse(actMonth);
		  actMonthNo=calendar.get(Calendar.MONTH);
		  actyear=driver.findElement(By.xpath("//div[@aria-hidden=\"false\"]/div/div/div/div/div/div[2]")).getText();
		 
			 actYearNo=calendar.get(Calendar.YEAR);
			 driver.findElement(By.xpath("//div[@aria-controls=\"dateNew_table\"]/following-sibling::div")).click();
			 
			
	}
	
	
	
	
	 
	}
	catch(ParseException e)
	{
		throw new Exception("its invalid date please input valid date ");
	}
	
	                   //converted
	// now i want to validate my date is it right or not 
	//so i will use is it right or not
	
	
	System.out.println(formated_date);//
	
	

	
	
	
		
		
	}

}
