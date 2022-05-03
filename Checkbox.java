package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Open leafground URL
		driver.get("http://leafground.com/pages/checkbox.html");
		// Maximize window
		driver.manage().window().maximize();
		// Selecting known languages
		driver.findElement(By.xpath("(//label[contains(text(),'languages ')]/following::input[@type='checkbox'])[1]"))
				.click();
		driver.findElement(By.xpath("(//label[contains(text(),'languages ')]/following::input[@type='checkbox'])[3]"))
				.click();
		// Confirm Selenium is checked
		boolean chk1 = driver
				.findElement(By.xpath("(//label[contains(text(),'Selenium')]/following::input[@type='checkbox'])[1]"))
				.isSelected();
		if (chk1 == true) {
			System.out.println("The CheckBox is Selected");
		}

		else {
			System.out.println("The CheckBox is not Selected");
		}
		// Checking first checkbox is selected or not
		boolean chk2 = driver
				.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][1]"))
				.isSelected();

		// if true it will deselect checkbox
		if (chk2 == true) {
			driver.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][1]"))
					.click();
			System.out.println("The Check is Deselected");
		}

		// Checking second checkbox is selected or not
		boolean chk3 = driver
				.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][2]"))
				.isSelected();

		// if true then deselect checkbox
		if (chk3 == true) {
			driver.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][2]"))
					.click();
			System.out.println("The Check is Deselected");
		}

		// Selecting all checkboxes
		List<WebElement> elements = driver
				.findElements(By.xpath("//label[contains(text(),'all')]//following::input[@type='checkbox']"));
		int size = elements.size();

		for (int i = 0; i < size; i++) {
			elements.get(i).click();
		}
		driver.close();
	}
}
