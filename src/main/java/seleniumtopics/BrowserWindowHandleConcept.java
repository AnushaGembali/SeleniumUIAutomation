package seleniumtopics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();	
		JavascriptExecutorUtil jsUtil = new JavascriptExecutorUtil(driver);		
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//footer//a[normalize-space(text())='Our Partners']"));
//		element.click(); WIth normal click, getting ElementClickInterceptedException: element click intercepted: Element is not clickable at point (133, 1229)
		jsUtil.scrollToElementUsingJs(element);
		Thread.sleep(Duration.ofSeconds(3));
		jsUtil.drawBorderUsingJs(element);
		jsUtil.flashElement(element);		
		actions.click(element).perform();
//		actions.contextClick(element)
//				.sendKeys(Keys.ARROW_DOWN)
//				.sendKeys(Keys.ARROW_DOWN)
//				.click()
//				.build()
//				.perform();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childId);
		Thread.sleep(Duration.ofSeconds(3));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentId);
		Thread.sleep(Duration.ofSeconds(3));
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}