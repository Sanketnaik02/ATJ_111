/*/
 * Test Case_05
//Steps
// 1. Launch Chrome browser.
//2. Launch the URL "https://practice.cinutedigital.com/magento/gear/bags.html"
//3. Pass username and password.
//4. Capture all the links available on the page
//4. Capture a list of Products links
//5. Print the Total count of the links and Product links.
//5. Print the Product links text.
//6. Close the browser.
 */

package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//2. Launch the URL "https://www.meesho.com/"
		driver.get("https://www.meesho.com/");
		
		//3. Capture all the links available on the page
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		
		int count = Link.size();
		
		
		//4. Capture a list of Products links
		String Xpath = "//div[contains(@class,'sc-bjfHbI')]";
		List<WebElement> Product = driver.findElements(By.xpath(Xpath));
		
		int count1 = Product.size();
		
		
		//5. Print the Total count of the links and Product links.
		System.out.println("Total Link Is : "+count);
		System.out.println("Total Product is :"+count1);
		
		//5. Print the Product links text.
		
		for(int i=0; i<Product.size(); i++) {
			
			String ProductName = Product.get(i).getText();
			System.out.println(ProductName);
		}
		
		
		//6. Close the browser.
		driver.close();
		
		
	}

}
