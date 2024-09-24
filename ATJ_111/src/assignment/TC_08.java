/*Test_Case_08 (Use Relative XPATH)
// Steps
// 1. Launch Chrome browser.
// 3. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
// 4. Click on the registration link using Relative XPATH.
// 5. Enter registration details using Relative XPATH.
// Gender, FirstName, LastName, Email, Password, Confirm Password. (Enter the password as
password123)
// 6. Click on the register button using Relative XPATH.
// 7. Close the browser.*/

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_08 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 3. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// 3. Click on the registration link using the CSS SELECTOR.
				driver.findElement(By.xpath("//a[@href='/register']")).click();

				// 4. Enter registration details using CSS SELECTOR
				// male radio button
				driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
				
				// first name 
				driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Sanket");
				
				// last name
				driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Naik");
				
				// Email 
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sanket123@gmail.com");
				
				// Password 
				driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("password123");
				
				// Confirm Password 
				driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("password123");
				
				
				// 6. Click on the register button using CSS SELECTOR. 
				driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

//				7. Close the browser. */
				driver.close();
		

	}

}
