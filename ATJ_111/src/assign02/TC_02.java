/*/
 * Test_Case_02
// Steps
// 1. Launch Chrome browser.
//2. Launch website "http://demowebshop.tricentis.com//"
// 3. Mention XPATH to fetch all the links available in the left navigator bar
//4. Iterate over the list and print all the items on the list.
// 5. Close the browser.
 */

package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//2. Launch website "http://demowebshop.tricentis.com//"
		driver.get("http://demowebshop.tricentis.com//");
		
		// 3. Mention XPATH to fetch all the links available in the left navigator bar
		
		String Xpath = "//div[contains (@class,'leftside-3')]";
		
		List<WebElement> element = driver.findElements(By.xpath(Xpath));
		
		
		
		//4. Iterate over the list and print all the items on the list.
		
		for(int i=0; i<element.size(); i++) {
			
			String Text = element.get(i).getText();
			System.out.println(Text);
		}
		
		// 5. Close the browser.
		driver.close();
	}

}
