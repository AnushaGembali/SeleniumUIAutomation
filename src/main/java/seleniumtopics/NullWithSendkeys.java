package seleniumtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendkeys {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver.findElement(By.id("input-email")).sendKeys(null);
//		java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
//		String text = "";
//		driver.findElement(By.id("input-email")).sendKeys(text);
		
	}

}