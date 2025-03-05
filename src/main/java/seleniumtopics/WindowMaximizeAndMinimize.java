package seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeAndMinimize {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getSize().toString());
		driver.quit();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize().toString());
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
		
		driver = new ChromeDriver();
		Dimension dimension = new Dimension(1296, 696);
		driver.manage().window().setSize(dimension);
		System.out.println(driver.manage().window().getSize().toString());
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
		
		driver = new ChromeDriver();
		System.out.println(driver.manage().window().getPosition().toString());
		Thread.sleep(Duration.ofSeconds(3));
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getPosition().toString());
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
		
		driver = new ChromeDriver();
		driver.manage().window().minimize(); 
		Thread.sleep(Duration.ofSeconds(3));
//		After the window is minimized, it should be maximized before performing any operation
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
	}

}