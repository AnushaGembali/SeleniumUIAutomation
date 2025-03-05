package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutorUtil jsUtil = new JavascriptExecutorUtil(driver);
		driver.get("https://www.bigbasket.com/pc/fruits-vegetables/fresh-fruits/fruit-baskets/?nc=nb");
		
		System.out.println(jsUtil.getTitleUsingJs());
		System.out.println(jsUtil.getURLUsingJs());
		System.out.println(jsUtil.getPageTextUsingJs());
		
//		driver.get("https://google.com");
//		jsUtil.pageRefreshUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
//		
//		jsUtil.goBackUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
//		
//		jsUtil.goForwardUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
//		
//
//		jsUtil.goBackUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
		
//		jsUtil.generateAlertUsingJs("Hi, Anusha Bellala");
		
//		jsUtil.doZoomUsingJs("400.0%");
		
//		jsUtil.scrollToPageBottomUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
//		
//		jsUtil.scrollToPageTopUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
//		
//		jsUtil.scrollToHeightUsingJs(800);
//		Thread.sleep(Duration.ofSeconds(2));
//		
//		jsUtil.scrollToPageMiddileUsingJs();
//		Thread.sleep(Duration.ofSeconds(2));
//		
//		jsUtil.scrollToElementUsingJs(element);
//		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Green bigbasket']"));	
		jsUtil.scrollToElementUsingJs(element);
		jsUtil.drawBorderUsingJs(element);
		jsUtil.flashElement(element);
		
		driver.quit();
	}

}