package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		List<WebElement> detailsFields = driver.findElements(By.xpath("//input[@class='form-control']/parent::div/preceding-sibling::label"));
		System.out.println(detailsFields.size());
		for(WebElement ele : detailsFields) {
			String text = ele.getText();
			System.out.println(text);
		}
		
		driver.quit();
		
//		List<WebElement> eles = driver.findElements(By.xpath("//span[text()='Josh Inglis']/ancestor::td/following-sibling::td"));
//		
//		for(WebElement e : eles) {
//			System.out.println(e.getText());
//		}
		
//		List<WebElement> tablesList = driver.findElements(By.xpath("//tbody[@class='ds-text-right']"));
//		
//		for(WebElement table : tablesList ) {			
//			List<WebElement> rowsList = getWebElements(table ,By.tagName("tr"));
//			for(WebElement row : rowsList) {
//				List<WebElement> colList = getWebElements(row ,By.tagName("td"));
//				printColsText(colList);
//			}
//		}
		
		
		
	}
	public static List<WebElement> getWebElements(WebElement ele, By locator){
		return ele.findElements(locator);
	}
	
	public static void printColsText(List<WebElement> colsList) {
		for(WebElement col : colsList) {
			System.out.print(col.getText() + "\t");
		}
		System.out.println();
	}

}