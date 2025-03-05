package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpHandlers {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(3));
		
		WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement cnfrmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement promptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));	
		
		alertBtn.click();
		Thread.sleep(Duration.ofSeconds(3));		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(Duration.ofSeconds(3));
		
		cnfrmBtn.click();
		Thread.sleep(Duration.ofSeconds(3));	
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(Duration.ofSeconds(3));
		
		cnfrmBtn.click();
		Thread.sleep(Duration.ofSeconds(3));	
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(Duration.ofSeconds(3));
		
		promptBtn.click();
		Thread.sleep(Duration.ofSeconds(3));	
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Anusha Bellala");
		alert.accept();
		Thread.sleep(Duration.ofSeconds(3));
		
		
		promptBtn.click();
		Thread.sleep(Duration.ofSeconds(3));	
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
//		alert.sendKeys("Anusha Bellala");
		alert.accept();
		Thread.sleep(Duration.ofSeconds(3));
		
		promptBtn.click();
		Thread.sleep(Duration.ofSeconds(3));	
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Anusha Bellala");
		alert.dismiss();
		Thread.sleep(Duration.ofSeconds(3));
		
		
	}

}