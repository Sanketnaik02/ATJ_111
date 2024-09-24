/*Test Case 07 (Use CSS SELECTOR)
Steps
1. Launch Chrome browser.
2. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
3. Click on the registration link using the CSS SELECTOR.
4. Enter registration details using CSS SELECTOR
Gender, FirstName, LastName, Email, Password, ConfirmPassword. (Enter the password as
password123)
6. Click on the register button using CSS SELECTOR.
7. Close the browser. */

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_07 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// 3. Click on the registration link using the CSS SELECTOR.
		driver.findElement(By.cssSelector("a[href='/register']")).click();

		// 4. Enter registration details using CSS SELECTOR
		// male radio button
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		
		// first name 
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Sanket");
		
		// last name
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Naik");
		
		// Email 
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("sanket123@gmail.com");
		
		// Password 
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("password123");
		
		// Confirm Password 
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("password123");
		
		
		// 6. Click on the register button using CSS SELECTOR. 
		driver.findElement(By.cssSelector("input[id='register-button']")).click();

//		7. Close the browser. */
		driver.close();
	
	}

}
