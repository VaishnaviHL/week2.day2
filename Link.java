package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open leafground URL
		driver.get("http://leafground.com/pages/Link.html");
		// Maximize window
		driver.manage().window().maximize();
		// Go to Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();
		// Navigating to previous page
		driver.navigate().back();
		// Find where am supposed to go without clicking me?
		System.out.println("The page I am supposed to be is" + " "
				+ driver.findElement(By.xpath("//a[contains(text(),'Find')]")).getAttribute("href"));
		// Verify am I broken?
		driver.findElement(By.xpath("//a[contains(text(),'Verify')]")).click();
		String str1 = driver.findElement(By.tagName("h1")).getText();
		if (str1.contains("404")) {
			System.out.println("The page is broken");
		} else {
			System.out.println("The page is not broken");
		}
		// Navigating to previous page
		driver.navigate().back();
		// Go to Home Page (Interact with same link name)
		driver.findElement(By.linkText("Go to Home Page")).click();
		// Navigating to previous page
		driver.navigate().back();
		// Get links count
		int linksCount = driver.findElements(By.tagName("a")).size();
		System.out.println("The Total No.of links in this page is" + " " + linksCount);
		driver.close();
	}
}