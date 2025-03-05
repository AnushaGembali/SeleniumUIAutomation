package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(3));
		
//		WebElement f1 = driver.findElement(By.id("pact1"));
//		WebElement f2 = driver.findElement(By.id("pact2"));
//		WebElement f3 = driver.findElement(By.id("pact3"));
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Anusha");
		Thread.sleep(Duration.ofSeconds(1));
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Bellala");
		Thread.sleep(Duration.ofSeconds(1));
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Bellala");
		Thread.sleep(Duration.ofSeconds(1));
		
		driver.switchTo().parentFrame(); //f2
		driver.findElement(By.id("jex")).sendKeys(" Bellala");
		Thread.sleep(Duration.ofSeconds(1));
		
		driver.switchTo().parentFrame(); //f1
		driver.findElement(By.id("inp_val")).sendKeys(" Anusha");
		Thread.sleep(Duration.ofSeconds(1));
		
		driver.switchTo().parentFrame(); //added from selenium 4.x
		System.out.println(driver.findElement(By.cssSelector("h3:nth-child(1)")).getText());
		driver.quit();
		
		/*
		 * Page -> f1: yes
		 * f1 -> f2: yes
		 * f2 -> f3: yes
		 * page -> f2: no
		 * page -> f3: no
		 * f1 -> f3: no
		 * page -> f1 -> f2 -> f3: yes
		 * 
		 * f3 -> f2: yes (PF)
		 * f2 -> f1: yes (PF)
		 * f1 -> page: yes (PF, DC)
		 * f3 -> f2 -> f1 -> page
		 * 
		 * f3 -> page:yes (DC)
		 * f2 -> page:yes (DC)
		 *
		 */
		
		
	}

}