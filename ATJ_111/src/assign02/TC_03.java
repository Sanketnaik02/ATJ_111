/*/
 * Test Case_03
//Steps
// 1. Launch Chrome browser.
// 2. Launch the URL "https://services.smartbear.com/samples/TestComplete14/smartstore/"
// 3. Capture all the images available on the page by using find_elements_by_tag_name.
//4. Print the total count of the images.
// 5. Iterate over a list and print all the items of the list. (Images 'alt' property name).
//6. Close the browser.

 */

package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// 2. Launch the URL "https://www.flipkart.com/"
		driver.get("https://www.flipkart.com/");
		
		// 3. Capture all the images available on the page by using find_elements_by_tag_name.
		
		List<WebElement> Images =  driver.findElements(By.tagName("img"));
		
		//4. Print the total count of the images.
		int count = Images.size();
		
		// 5. Iterate over a list and print all the items of the list. (Images 'alt' property name).
		
			
		//6. Close the browser.
		

		
		
		
	}

}
