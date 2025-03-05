package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		Set<String> handles = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}