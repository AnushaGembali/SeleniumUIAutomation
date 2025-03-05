package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(Duration.ofSeconds(3));
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElements(By.cssSelector("iframe , frame")).size()); //finds all frames and iframes		
		System.out.println(driver.findElements(By.cssSelector("frame,iframe:not(iframe[style *= 'none'])")).size());// finds all frames and iframes which does not have style attribute with value as none

		driver.switchTo().frame(2);		
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.switchTo().defaultContent();
		
		
		WebElement frameEle = driver.findElement(By.name("bot"));
		driver.switchTo().frame(frameEle);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("navbar");
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().defaultContent();
		driver.quit();
	}
	

}