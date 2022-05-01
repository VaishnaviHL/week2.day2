package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open leftaps URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize window
		driver.manage().window().maximize();
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		// Click on Create Account
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		// Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		// Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		// Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test123");
		// Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		// Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[@id='annualRevenue']"))
				.sendKeys("10000");
		// Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();

	}

}
