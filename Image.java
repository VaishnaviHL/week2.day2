package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open leafground URL
		driver.get("http://leafground.com/pages/Image.html");
		// Maximize window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='home']/following::img[@src='../images/home.png']")).click();
		// Navigating to previous page
		driver.navigate().back();
		// Verify broken image
		String str = driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/abcd.jpg']"))
				.getAttribute("OnClick");
		if (str == null) {
			System.out.println("The image is broken");
		} else {
			System.out.println("The image is not broken");
		}
		// Clicking on the image using
		driver.findElement(By.xpath("//label[@for='position']/following::img[@src='../images/keyboard.png']")).click();
		// Navigating to previous page
		driver.navigate().back();
		driver.close();
	}
}
