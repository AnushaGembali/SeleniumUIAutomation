package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementTesting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.cssSelector(".form-control")).sendKeys("Anusha Bellala"); 
		//The above selector returns 7 elements
		//Enters Anusha Bellala into the first retrieved element which is the search box
	}

}