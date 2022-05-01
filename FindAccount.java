package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	public static void main(String[] args) throws InterruptedException {
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
		// Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();
		//Enter AccountName as "Credit Limited Account" 
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		//Click on Find Accounts using xpath Locator
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(10000);		
		driver.findElement(By.xpath("//a[text()='accountlimit100']")).click();
		Thread.sleep(10000);
		String text  = driver.findElement(By.xpath("//span[text()='Credit Limited Account  (accountlimit100)']")).getText();
	    if(driver.getPageSource().contains("Credit Limited Account  (accountlimit100)"))
	    {
		System.out.println("The Account name" + " " + text + " " + "is correct");
	    }
		else
		{
			System.out.println("The Account name is" + " " + text + " " + "incorrect");
		}
	    String text1  = driver.findElement(By.xpath("//td[text()='Sales account with a credit limit of $100 USD']")).getText();
	    System.out.println("The Description is" + " " + text1);
	    String title = driver.getTitle();
	    if(driver.getPageSource().contains(title))
	    {
		System.out.println("The Title" + " " + title + " " + "is correct");
	    }
		else
		{
			System.out.println("The Title" + " " + title + " " + " is incorrect");
		}
		driver.close();
		}

}
