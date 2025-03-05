package seleniumtopics;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {
WebDriver driver;
	
	public WebDriver initWebDriver(String browserName) {
		
		switch(browserName.trim().toLowerCase()) {
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
		driver.manage().window().maximize();
		return driver;
	}
	
	public void launchURl(String url) {
		
		if((url.indexOf("http://") != 0 && url.indexOf("https://") != 0) || url.length() == 0) {
			throw new BrowserException("http(s)  is missing in the url");
		}
		
		driver.get(url);
	}
	
	public void launchURl(URL url) {
		driver.navigate().to(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageURl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	 
	 /**
	  * An expectation for checking the title of a page. The tile should be exact match
	  * @param title
	  * @param time
	  * @return
	  */
	 public boolean doTitleIsPresent(String expectedTitle, int time) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 try {
			 return wait.until(ExpectedConditions.titleIs(expectedTitle)); //if the title is not matched, it will throw Timeout Exception
		 }
		 catch(TimeoutException e) {
			 System.out.println("title is not present");
			 return false;
		 }	 
	 }
	 
	 public String doGetPageTitle(String expectedTitle, int timeOut) {
		 return doTitleIsPresent(expectedTitle, timeOut) ? getPageTitle() : "-1";
	 }
	 
	 /**
	  * An expectation for checking that the title contains a case-sensitive substring
	  * @param title
	  * @param time
	  * @return
	  */
	 public boolean doTitleContainsString(String fractionTitle, int time) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 try {
			 return wait.until(ExpectedConditions.titleContains(fractionTitle)); //if the title is not matched, it will throw Timeout Exception
		 }
		 catch(TimeoutException e) {
			 System.out.println("title does not contain the given string");
			 return false;
		 }	
	 }
	 
	 
	 public String doGetPageTitleContains(String fractionTitle, int timeOut) {
		 return doTitleContainsString(fractionTitle, timeOut) ? getPageTitle() : "-1";
	 }
	 
	 /**
	  * An expectation for the URL of the current page to contain specific text.
	  * @param fractionURL
	  * @param time
	  * @return
	  */
	 public boolean doURLContainsString(String fractionURL, int time) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 try {
			 return wait.until(ExpectedConditions.urlContains(fractionURL)); //if the URL is not matched, it will throw Timeout Exception
		 }
		 catch(TimeoutException e) {
			 System.out.println("URL does not contain the given string");
			 return false;
		 }	
	 }
	 
	 
	 public String doGetPageURLContains(String fractionURL, int timeOut) {
		 return doURLContainsString(fractionURL, timeOut) ? getPageURl() : "-1";
	 }
	 
	 public Alert doWaitForAlert(int time) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 return wait.until(ExpectedConditions.alertIsPresent());
	 }
	 
	 public Alert doWaitForAlertUsingFluentWait(int time) {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 						.withTimeout(Duration.ofSeconds(time))
				 						.pollingEvery(Duration.ofSeconds(2))
				 						.ignoring(NoAlertPresentException.class)
				 						.withMessage("Alert is not present");
		 return wait.until(ExpectedConditions.alertIsPresent());
	 }
	 
	 public String getAlertText(int timeOut) {
		 return doWaitForAlert(timeOut).getText();
	 }
	 
	 public void doAlertAccept(int timeOut) {
		 doWaitForAlert(timeOut).accept();
	 }
	 
	 public void doEnterValueOnAlert(int timeOut, String text) {
		 Alert alert = doWaitForAlert(timeOut);
		 alert.sendKeys(text);
		 alert.accept();
	 }

}
