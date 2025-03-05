package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BigBasketMultiMenuHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-PAN-Jan25&gad_source=1&gclid=CjwKCAiAlPu9BhAjEiwA5NDSAwv16Ii9DS2NbY2NxWpsRHptTHlgwfSzmx1nUkjed0TatVYDZOkRzxoCyRsQAvD_BwE");
		driver.manage().window().maximize();
		
		By menu1 = By.xpath("(//span[text()='Shop by'])[2]");
		driver.findElement(menu1).click();
		Thread.sleep(Duration.ofSeconds(6));
		
		String menu2 = "Fruits & Vegetables";
		String menu3 = "Fresh Fruits";
		String menu4 = "Fruit Baskets";
		handleMultiMenu( menu2, menu3, menu4);
		
//		By menu2 = By.linkText("Fruits & Vegetables");
//		By menu3 = By.linkText("Fresh Fruits");
//		By menu4 = By.linkText("Fruit Baskets");		
//		handleMultiMenu( menu2, menu3, menu4);
		
		driver.quit();
	}
	
	public static void handleMultiMenu(By...locators) throws InterruptedException {
		Actions action = new Actions(driver);
		
		for(By locator : locators) {
			action.moveToElement(driver.findElement(locator))
					.build()
					.perform();
			Thread.sleep(Duration.ofSeconds(4));
		} 		
		driver.findElement(locators[locators.length -1]).click();
	}

	 public static void handleMultiMenu(String...locators) throws InterruptedException {
			Actions action = new Actions(driver);
			
			for(String locator : locators) {
				By menu = By.linkText(locator);
				WebElement menuEle = driver.findElement(menu);
				action.moveToElement(menuEle)
						.build()
						.perform();
				Thread.sleep(Duration.ofSeconds(2));
			} 		
			driver.findElement(By.linkText(locators[locators.length-1])).click();
		}
}