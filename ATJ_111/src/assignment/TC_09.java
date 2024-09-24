//https://demoqa.com/automation-practice-form

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_09 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		// FirstName
		driver.findElement(By.id("firstName")).sendKeys("Sanket");
		
		// LastName
		driver.findElement(By.id("lastName")).sendKeys("Naik");
		
		//Email
		driver.findElement(By.id("userEmail")).sendKeys("sanketnaik123@gmail.com");
		
		// Gender
//		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		
		// mobile number
		driver.findElement(By.id("userNumber")).sendKeys("12233220");
		
		// Hobbies
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		
		// Address
		driver.findElement(By.id("currentAddress")).sendKeys("Address : ");
		
		// Submit
		driver.findElement(By.id("submit")).click();
		
	}

}
