package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
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
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='currencyUomId']")));
		s1.selectByValue("INR");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[@id='annualRevenue']"))
				.sendKeys("10000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(text);
		driver.close();

	}

}
