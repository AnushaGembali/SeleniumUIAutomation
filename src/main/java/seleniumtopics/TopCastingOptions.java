package seleniumtopics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {
	
	public static void main(String args[]) {
		
		//Ctrl + Shift + o --- auto import
//		1. valid but only for specific and local -- only for chrome
//		ChromeDriver driver = new ChromeDriver();
		
//		2. Recommended and valid -- Local
//		WebDriver driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		
//		3. Recommended and valid -- When using remote machine (cloud, AWS, server, machine) -- GRID
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
//		4. Not Recommended but valid -- Can access only FindElement and FindElements
//		SearchContext driver = new ChromeDriver();
		
//		5. Recommended  and valid
//		RemoteWebDriver driver = new ChromeDriver();
		
//		6. Valid but not recommended --- can access only Chrome/edge as only these two are child of ChromiumDriver
		ChromiumDriver driver = new ChromeDriver();
		
		
		
	}

}