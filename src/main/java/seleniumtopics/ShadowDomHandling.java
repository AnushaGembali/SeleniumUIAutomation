package seleniumtopics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.manage().window().maximize();
		
//		Browser -> Page -> Shadow Dom -> Shadow DOM -> input#pizza
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String jsPath = "return document.querySelector(\".jackPart\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		WebElement element = (WebElement)js.executeScript(jsPath);
		element.sendKeys("Anusha Bellala");
		
	}

}