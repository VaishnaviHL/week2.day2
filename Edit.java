package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open leafground URL
		driver.get("http://leafground.com/pages/Edit.html");
		// Maximize window
		driver.manage().window().maximize();
		// Enter the email address
		driver.findElement(By.id("email")).sendKeys("vaish09nithi@gmail.com");
		// Append the value with the existing value
		driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).sendKeys("Test");
		// Press Keyboard tab
		driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).sendKeys(Keys.TAB);
		// Clear the text
		driver.findElement(By.xpath("(//label[@for='uname']/following-sibling::input)[2]")).clear();
		// Confirm edit field is disabled
		boolean str = driver.findElement(By.xpath("(//label[@for='disabled']/following-sibling::input)")).isEnabled();
		if(str==false)
		{
			System.out.println("The edit field is disabled");
			
		}
		else
		{
			System.out.println("The edit field is enabled");
		}
		driver.close();

	}

}
