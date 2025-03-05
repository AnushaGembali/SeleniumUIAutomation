package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksInpage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By eleLocator = By.tagName("a");
		System.out.println(eleUtil.doGetElementsListCount(eleLocator));;
		eleUtil.doPrintElementsText(eleLocator);
		List<String> eleTextList = eleUtil.doGetElementsText(eleLocator);
		System.out.println(eleTextList.size());
//		int linksWithText = 0;
//		for(WebElement e : linkElements) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				linksWithText ++;
//				System.out.println("Link at index: " + linksWithText + " and the text is " + e.getText())	;	
//			}		
//		}
		
//		System.out.println("Total Links: " + linkElements.size() + "\nLinks with text are: " + linksWithText + "\nLinks without text are: " + (linkElements.size()  - linksWithText));
		
//		linkElements.stream()
//					.map(e -> e.getText())
//					.filter(e -> e.length()!=0)
//					.forEach(System.out:: println);
		
		
//		WebElement emailText = driver.findElement(By.id("input-email"));
//		emailText.sendKeys("anusha");
//		Thread.sleep(Duration.ofSeconds(3));
//		System.out.println(emailText.getDomAttribute("value"));
//		System.out.println(emailText.getDomProperty("value"));
		
		
//		driver.quit();
		
		
	}

}