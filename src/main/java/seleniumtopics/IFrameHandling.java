package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(Duration.ofSeconds(9));
				
		System.out.println(driver.findElements(By.cssSelector("iframe,frame")).size()); //finds all frames and iframes		
		System.out.println(driver.findElements(By.cssSelector("frame,iframe:not(iframe[style*='none'])")).size());// finds all frames and iframes which does not have style attribute with value as none
		
		WebElement imgLink = driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']"));
		imgLink.click();
		Thread.sleep(Duration.ofSeconds(9));
		
		WebElement iframeEle = driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]"));
		driver.switchTo().frame(iframeEle);
//		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Anusha Bellala");
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Anusha Bellala");

		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();
		
	}

}