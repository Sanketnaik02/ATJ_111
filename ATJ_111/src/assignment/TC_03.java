/*
 * Test Case_03 (Use ID, NAME & CLASS_NAME locators)
# Steps
# 1. Launch Chrome browser.
# 3. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
#4. Click on registration link
#5. Enter registration details
# Gender, FirstName, LastName, Email, Password, Confirm Password. (Enter the password as -
password123)
# 6. Click on the register button.
#7. Close the browser.
 */
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03 {

	public static void main(String[] args) throws InterruptedException {

//		Test Case_03 (Use ID, NAME & CLASS_NAME locators)
//		# Steps
//		# 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		# 3. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
//		#4. Click on registration link
		WebElement reg = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		reg.click();
		
//		#5. Enter registration details
		//Gender, 
		driver.findElement(By.id("gender-male")).click();
		
		// FirstName,
		driver.findElement(By.id("FirstName")).sendKeys("Sanket");
		
		// LastName
		driver.findElement(By.id("LastName")).sendKeys("Naik");
		
		//   Email, 
		driver.findElement(By.id("Email")).sendKeys("sanket123@gmail.com");
		
		// Password,
		driver.findElement(By.id("Password")).sendKeys("password123");
		
		//Confirm Password. 
		driver.findElement(By.id("ConfirmPassword")).sendKeys("password123");
		Thread.sleep(3000);
		
//		# 6. Click on the register button.
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		
//		#7. Close the browser.
		driver.close();

	}

}
