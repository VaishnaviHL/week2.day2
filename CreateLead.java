package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
		// Click on Leads Button
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		// Click on create Lead Button
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		// Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HVL");
		// Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		// Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		// Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
		// Get the Title of the resulting Page
		System.out.println("The page title is: " + driver.getTitle());
		// Close the browser
		driver.close();
	}

}
