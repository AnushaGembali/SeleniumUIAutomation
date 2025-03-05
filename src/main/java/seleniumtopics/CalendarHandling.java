package seleniumtopics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.findElement(By.id("datepicker")).click();
		
		String date = "28 February 2022";
		Date isDateValid = isDateValid(date);
		if(isDateValid != null) {
			selectDateFromCalender(date);
		}
		else {
			throw new BrowserException("The given date is invalid");
		}
		
		
//		driver.quit();
	}

	public static void selectDateFromCalender(String date) {
		String[] dateArray = date.split(" ");
		selectYear(dateArray[2]);
		selectMonth(dateArray[1]);
		selectDay(dateArray[0]);
		
	}
	
	public static void selectDay(String day) {
		driver.findElement(By.linkText(day)).click();
	}
	
	public static void selectMonth(String month) {
		
		Date givenMonthObj = isDateValid("01 "+month+" 2000");
		WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
		WebElement prevBtn = driver.findElement(By.xpath("//span[text()='Prev']"));
		String currMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		Date currMonthObj;
		
		while(!currMonth.equalsIgnoreCase(month)) {
			currMonthObj = isDateValid("01 "+currMonth+" 2000");			
			if(givenMonthObj.after(currMonthObj)) {
				 nextBtn.click(); 
			}
			else {
				 prevBtn.click();
			}
			currMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
			prevBtn = driver.findElement(By.xpath("//span[text()='Prev']"));
		}		
	}
	
	public static void selectYear(String year) {
		WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
		WebElement prevBtn = driver.findElement(By.xpath("//span[text()='Prev']"));
		String currYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!currYear.equalsIgnoreCase(year)) {
			if(currYear.compareTo(year) < 0) {
				 nextBtn.click(); 
			}
			else {
				 prevBtn.click();
			}
			currYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
			prevBtn = driver.findElement(By.xpath("//span[text()='Prev']"));
		}		
	}
	
	
	public static Date isDateValid(String date) {
		SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
		format.setLenient(false);
		try {
			return format.parse(date);
//			System.out.println("The given date is valid");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			System.out.println("The given date is not valid");
			return null;
		}
		
	}
	
}
