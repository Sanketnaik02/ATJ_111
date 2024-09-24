/*Test_Case_06 (Use CSS_SELECTOR)
//assignment
Steps
 Launch Chrome browser.
 Launch the URL for the selector.html page.
 Click on the UserName text box by using CSS_SELECTOR and enter "TestUser"
 Click on the Password text box by using CSS_SELECTOR and enter "Sample Password@123"
 Close the browser.*/

package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06 {

	public static void main(String[] args) {
	
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		// Launch the URL for the selector.html page.
		driver.get("");
		

	}

}
