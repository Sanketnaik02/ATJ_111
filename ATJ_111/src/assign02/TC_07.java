/*/
 * Test_Case_07
// Steps
// 1. Launch Chrome browser.
//2. Launch the demo.html page.
// 3. Find check boxes available under the select section and print the total count
// 4. Check all the checkboxes.
//5. Then check the checkboxes in reverse order.
// 6. Then check the first check box.
//7. Check the last check box.
// 6. Close the browser.
 */
package assign02;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_07 {

	public static void main(String[] args) throws InterruptedException {

		// Steps
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2. Launch the demo.html page.
		driver.get("D:\\Automation\\Links\\demo.html");

		// 3. Find check boxes available under the select section and print the total
		// count
		List<WebElement> Option = driver.findElements(By.tagName("option"));
		System.out.println("check boxes available under the select section and the total count:" + Option.size());

		// 4. Check all the checkboxes.
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < checkBox.size(); i++) {

			checkBox.get(i).click();
			Thread.sleep(2000);

		}
		Thread.sleep(2000);

		// 5. Then check the checkboxes in reverse order.
		for (int j = checkBox.size()-1; j>=0 ; j--) {

			checkBox.get(j).click();
			Thread.sleep(1000);

		}
		Thread.sleep(2000);
//		
		// 6. Then check the first check box.
		// 7. Check the last check box.
		driver.navigate().refresh();
		
		for(int i=0; i<checkBox.size(); i++) {
			
			if(i==1 || i== (checkBox.size()-1)) {
				checkBox.get(i).click();
				Thread.sleep(1000);
				System.out.println("First And Last Check Box Done");
			}
		}
		
		

		// 6. Close the browser.
		driver.close();
	}

}
