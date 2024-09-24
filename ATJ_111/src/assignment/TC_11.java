/*Test Case 11 (Use Dynamic XPATH)
// Steps
// 1. Launch Chrome browser.
// 2. Launch python.org website "https://www.python.org/downloads/"
//3. Click on the Python release note of version 3.10.9 using Dynamic Xpath.
//4. Close browser*/

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_11 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		
		// 2. Launch python.org website "https://www.python.org/downloads/"
		driver.get("https://www.python.org/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//3. Click on the Python release note of version 3.10.9 using Dynamic Xpath.
		driver.findElement(By.xpath("//a[contains(@href,'https://docs.python.org/release/3.10.9/whatsnew/changelog.html#python-3-10-9-final')]")).click();
		Thread.sleep(3000);
		//4. Close browser
		driver.close();
	}

}
