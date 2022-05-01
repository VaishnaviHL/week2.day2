package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open URL
		driver.get("https://www.opencart.com/index.php?route=account/register");
		// Maximize window
				driver.manage().window().maximize();
				driver.findElement(By.id("input-country")).sendKeys("Australia");
				driver.close();
	}

}
