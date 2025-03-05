package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementTopic {

	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		1. Create Web Element and perform action ---->  This style is not good, as this code is not reusable 
//		and you have to create the web element again if you need to perform any other operation on the same web element
		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		
//		2. First create the Web Element and perform the action
//		But this style also is not good, if you have created 100 web element even when you need only 10,
//		you would be putting a lot of load on server even when it is not necessary
//		Also, the element may get staled if for nay reason the DOn got refreshed
		
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		
//		3. The lines of code has increased. So we can reduce code by created methods for repetitive actions		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailEle = driver.findElement(emailId);
//		WebElement passwordEle = driver.findElement(password);
//		
//		emailEle.sendKeys("test@gmail.com");
//		passwordEle.sendKeys("test@123");
		
		
//		4. By locator + generic method Creating the Web element using method
//		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailEle = getWebElement(emailId);
//		WebElement passwordEle = getWebElement(password);
//		
//		emailEle.sendKeys("test@gmail.com");
//		passwordEle.sendKeys("test@123");
		
//		5. By locator + Use methods for creating web element and to perform the action
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "test@gmail.com");
//		doSendKeys(password, "test@123");		
		
		
//		6. By locator + generic method for creating web element and performing the action in ElementUtil class
		
		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initWebDriver("chrome");	
		bUtil.launchURl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		eleUtil.doSendKeys(emailId, "test@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		
		Thread.sleep(Duration.ofSeconds(1));
		System.out.println(bUtil.getPageTitle());
		bUtil.quitBrowser();

		
	}
	


}