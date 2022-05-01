package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open leafground URL
		driver.get("http://leafground.com/pages/Button.html");
		// Maximize window
		driver.manage().window().maximize();
		// Click button to travel home page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		// Navigating to previous page
		driver.navigate().back();
		// Find position of button (x,y)
		System.out.println("The position of the button is : "
				+ driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		// Find Button color
		System.out.println("The colour of the button is : "
				+ driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		// Find the height and width
		System.out.println("The height and width of the button is : "
				+ driver.findElement(By.xpath("//button[@id='size']")).getSize());
		driver.close();
	}

}
