package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String text1 = "anusha";
		StringBuilder text2 = new StringBuilder("bellala");
		StringBuffer text3 = new StringBuffer("gembali");
		String text4 = null;
		
		
		driver.findElement(By.id("input-email")).sendKeys(text1,text2,text3);
		
//		driver.findElement(By.id("input-email")).sendKeys(text1,text2,text3,text4);
//		java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		
//		driver.quit();
	}

}