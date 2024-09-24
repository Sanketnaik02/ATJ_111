/*
 * Test Case_01
// Steps
// 1. Launch Chrome browser.
// 2. Launch the URL "http://demowebshop.tricentis.com/"
I
// 3. Performing Page down action by 'actions.send_keys(Keys.PAGE_DOWN).perform()' method.
// 4. Performing Page Up action.
// 5. Again, performing Page-down action
// 6. Perform Arrow Up action.
//7. Perform Arrow Down action.
//8. Perform Page Up action.
//9. Perform, pressing the TAB key action multiple times till you reach to 'register' link.
// 10. Perform, pressing ENTER key action. This action will take us to the registration page.
// 11. Perform, Page END action.
// 12. Perform, pressing TAB key action.
// 13. Perform, pressing Escape key action.
// 14. Perform keys.END action.
// 15. Perform keys.UP action.
// 16. Perform, browser back action.
// 17. Print "Action Completed Successfully"
// 18. Close the browser.
 */
package assign05;

import java.awt.Desktop.Action;
import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_01 {

	public static void main(String[] args) throws Exception {
		
		
		// 1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the URL "http://demowebshop.tricentis.com/"
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		// 3. Performing Page down action by 'actions.send_keys(Keys.PAGE_DOWN).perform()' method.
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);		
		
		// 4. Performing Page Up action.
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		
		// 5. Again, performing Page-down action
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		// 6. Perform Arrow Up action.
		action.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		//7. Perform Arrow Down action.
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		//8. Perform Page Up action.
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		
		//9. Perform, pressing the TAB key action multiple times till you reach to 'register' link.
		for(int i=0; i<2; i++) {
			action.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
		}
		
		// 10. Perform, pressing ENTER key action. This action will take us to the registration page.
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		// 11. Perform, Page END action.
		action.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		// 12. Perform, pressing TAB key action.
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		// 13. Perform, pressing Escape key action.
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		
		// 14. Perform keys.END action.
		action.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		// 15. Perform keys.UP action.
		action.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		
		// 16. Perform, browser back action.
		driver.navigate().back();
		Thread.sleep(2000);
		
		// 17. Print "Action Completed Successfully"
		System.out.println("Action Completed Successfully");
		
		// 18. Close the browser.
		
		driver.close();

	}

}
