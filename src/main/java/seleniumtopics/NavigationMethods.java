package seleniumtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		//Both are same and are synonyms to each other
		//navigate().to() internally calls for get() only
		// Only difference is navigate().to() is overloaded and we can give url as both string and url format using to()
		// But get() is not overloaded and accept only string as input
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.navigate().forward();
		
		driver.quit();
		
	}

}