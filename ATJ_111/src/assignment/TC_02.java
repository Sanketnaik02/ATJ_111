/*
 * Test Case_02 (Use ID locator)
# Steps
# 1. Launch Chrome browser.
#2. Maximize window
# 3. Launch URL "http://demowebshop.tricentis.com/"
# 4. Insert text "test.user@company.com" in the Sign up for newsletter text box
#5. Click on the subscribe button
#6. Close browser.
 * */

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) {
//		# 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		
//		#2. Maximize window
		driver.manage().window().maximize();
		
//		# 3. Launch URL "http://demowebshop.tricentis.com/"
		driver.get("http://demowebshop.tricentis.com/");
		
//		# 4. Insert text "test.user@company.com" in the Sign up for newsletter text box
		WebElement txt =  driver.findElement(By.id("newsletter-email"));
		txt.sendKeys("test.user@company.com");
		
//		#5. Click on the subscribe button
		WebElement sub = driver.findElement(By.id("newsletter-subscribe-button"));
		sub.click();
		
//		#6. Close browser.
		driver.close();
		
		

	}

}
