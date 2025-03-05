package seleniumtopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementsHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		JavascriptExecutorUtil jsUtil = new JavascriptExecutorUtil(driver);		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(6));
		
		Actions actions = new Actions(driver);
		WebElement iframeEle = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		jsUtil.scrollToElementUsingJs(iframeEle);
		driver.switchTo().frame(iframeEle);
		
		List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg' and @id = 'map-svg']//*[name()='g' and @class = 'region']//*[name() = 'path']"));
		System.out.println(svgElements.size());
		for(WebElement element : svgElements) {
//			jsUtil.scrollToElementUsingJs(element);
//			jsUtil.drawBorderUsingJs(element);
//			jsUtil.flashElement(element);
			Rectangle rect = element.getRect();
//			actions.moveToElement(element).perform();
//			actions.scrollByAmount(0,location).perform();
			actions.moveToElement(element, 0, rect.y).perform();
			System.out.println(element.getAttribute("name"));
			Thread.sleep(Duration.ofSeconds(1));
		}
		
		
	}

}