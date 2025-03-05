package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	public static void main(String[] args) throws InterruptedException {

		String browser = "chrome";
		WebDriver driver = null;
		
		switch(browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;	
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser....");
			throw new BrowserException("===== Invalid Browser Name =====");
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(Duration.ofSeconds(3));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}