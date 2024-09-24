/*
 * Test_Case_09
// Steps
// 1. Launch Chrome browser.
//2. Launch the Flipkart.com "https://www.flipkart.com/"
// 3. Search for Samsung Galaxy
//4. Find the product Xpath related to 4 and above rating (Use ancestor Xpath concept)
// 5. Print the product count and the product link text.
// 6. Close the browser.

 */
package assign02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_09 {

	public static void main(String[] args) {
	
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//2. Launch the Flipkart.com "https://www.flipkart.com/"
		driver.get("https://www.flipkart.com/");
		
		// 3. Search for Samsung Galaxy
		WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		SearchBar.sendKeys("Samsung Galaxy");
		SearchBar.submit();
		
		//4. Find the product Xpath related to 4 and above rating (Use ancestor Xpath concept)
		
		
		// 5. Print the product count and the product link text.
		
		
		// 6. Close the browser.
		

	}

}
