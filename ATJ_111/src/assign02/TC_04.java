/*/
 * Test Case_04
//Steps
// 1. Launch Chrome browser.
// 2. Launch the URL "https://www.python.org/downloads/"
//3. Capture the link text of all the links present on the page by using find_elements_by_tag_name
// 4. Print the total count of the links present on the page.
// 5. Create a list of the links that contain Python in the LINK_TEXT and Print the count of the Python
Links
//6. Close the browser.
 */

package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// 2. Launch the URL "https://www.python.org/downloads/"
		driver.get("https://www.python.org/downloads/");
		
		
		//3. Capture the link text of all the links present on the page by using find_elements_by_tag_name
		List<WebElement> Tag = driver.findElements(By.tagName("a"));
		
		// 4. Print the total count of the links present on the page.
		
		int count = Tag.size();
		System.out.println("Total Number of links : "+count);
		
		
		// 5. Create a list of the links that contain Python in the LINK_TEXT and Print the count of the Python Links
		
		for(int i=0; i<Tag.size(); i++) {
			
			String AnchorTag = Tag.get(i).getText();
			System.out.println(AnchorTag);
		}
		
		driver.close();
		
		//6. Close the browser.
		

	}

}
