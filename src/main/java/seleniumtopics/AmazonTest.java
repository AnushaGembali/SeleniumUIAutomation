package seleniumtopics;

import org.openqa.selenium.WebDriver;

public class AmazonTest {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		BrowserUtil bUtil = new BrowserUtil();
		
		driver = bUtil.initWebDriver("chrome");
		bUtil.launchURl("https://www.amazon.com");
		
		driver.quit();
		
	}

}