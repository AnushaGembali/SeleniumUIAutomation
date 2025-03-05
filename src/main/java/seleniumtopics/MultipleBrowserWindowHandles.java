package seleniumtopics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Thread.sleep(Duration.ofSeconds(3));
		Actions actions = new Actions(driver);
		String parentIdHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		List<WebElement> aboutUsLinks = driver.findElements(By.xpath("//h5[text()='About Us']/following-sibling::ul//a"));
		Set<String> allWindowHandles;
		for(WebElement element : aboutUsLinks) {
			actions.click(element)
				.perform();
			allWindowHandles = driver.getWindowHandles();
			Iterator<String> it = allWindowHandles.iterator();
			it.next();
			String childWindowId = it.next();
			driver.switchTo().window(childWindowId);
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentIdHandle);
			Thread.sleep(Duration.ofSeconds(3));
		}
		
	}

}