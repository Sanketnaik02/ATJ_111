/*
 * Test Case_01
# Steps
# 1. Launch Chrome browser.
#2. Launch the URL "http://demowebshop.tricentis.com//"
#3. Mention XPATH to fetch all the links available under footer_menu
# 4. Capture all the footer links in a list
# 5. Iterate over a list and print all the items on the list.
#6. Close the browser.
 */

package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) {
		
		// 1. Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		// 2. Launch the URL "http://demowebshop.tricentis.com//"
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com//");
		
		
		//3. Mention XPATH to fetch all the links available under footer_menu
		String Xpath = "//div [contains(@class,'column')]";
		
		
		// 4. Capture all the footer links in a list
		List<WebElement> elements = driver.findElements(By.xpath(Xpath));
		
		// 5. Iterate over a list and print all the items on the list.
		
		for(int i=0; i<elements.size(); i++) {
			
			String Text = elements.get(i).getText();
			System.out.println(Text);
		}
		
		// close 
		driver.close();
		
		
		
		
		
		
	}

}
