package seleniumtopics;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsAndLambdas {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://www.flipkart.com");
//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		
////		allLinks.stream().forEach(e -> System.out.println(e.getText()));
//		
//		allLinks.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
//		
		
//		driver.get("https://classic.freecrm.com/");
//		List<WebElement> headers = driver.findElements(By.tagName("h3"));
//		
//		List<String> headerText = headers.stream().map(e -> e.getText()).collect(Collectors.toList());
//		headerText.stream().forEach(System.out :: println);
		
//		
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		List<WebElement> priceLists = driver.findElements(By.className("inventory_item_price"));
//		
//		priceLists.stream().forEach(e -> System.out.println(e.getText()));
//		
//		System.out.println();
//		System.out.println("==========");
//		System.out.println();
//		priceLists.stream().map(e -> e.getText().substring(1)).forEach(System.out :: println);
//		
//		System.out.println();
//		System.out.println("==========");
//		System.out.println("Sorted order");
//		priceLists.stream()
//					.map(e -> e.getText())
//						.map(e -> e.substring(1))
//							.map(e -> Double.parseDouble(e))
//								.sorted()
//									.forEach(e -> System.out.println(e));
//		
//		System.out.println();
//		System.out.println("==========");
//		System.out.println("Reverse Sorted order");
//		priceLists.stream()
//					.map(e -> e.getText())
//						.map(e -> e.substring(1))
//							.map(e -> Double.parseDouble(e))
//								.sorted(Comparator.reverseOrder())
//									.forEach(e -> System.out.println(e));
//		
//		System.out.println();
//		System.out.println("==========");
//		System.out.println("Max Price");
//		Double maxPrice = priceLists.stream()
//										.map(e -> e.getText())
//											.map(e -> e.substring(1))
//												.map(e -> Double.parseDouble(e))
//													.max(Double::compareTo)
//														.get();
//		System.out.println("Max Price is: " + maxPrice);
//		
//		System.out.println("==========");
//		System.out.println("Min Price");
//		Double minPrice = priceLists.stream()
//										.map(e -> e.getText())
//											.map(e -> e.substring(1))
//												.map(e -> Double.parseDouble(e))
//													.min(Double::compareTo)
//														.get();
//		System.out.println("Min Price is: " + minPrice);
//		
//		System.out.println("==========");
//		System.out.println("First Price");
//		String firstPrice = priceLists.stream()
//											.map(e -> e.getText())
//												.findFirst()
//													.get();
//		System.out.println("First Price is: " + firstPrice);
//		
//		System.out.println("==========");
//		System.out.println("last Price");
//		String lastPrice = priceLists.stream()
//											.map(e -> e.getText())
//												.reduce((first,second) -> second)
//													.get();
//		System.out.println("Last Price is: " + lastPrice);
//		
//		
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	
		List<WebElement> companiesList = driver.findElements(By.cssSelector("div#leftcontainer>table tr>td:nth-child(1)"));
		
		companiesList.stream().map(e -> e.getText()).forEach(System.out::println);
		System.out.println("=====================================");
		companiesList.stream().map(e -> e.getText())
									.sorted()
										.forEach(System.out::println);
		System.out.println("=====================================");
		companiesList.stream().map(e -> e.getText())
									.sorted(Comparator.reverseOrder())
										.forEach(System.out::println);
		
		driver.quit();
		
	}

}
