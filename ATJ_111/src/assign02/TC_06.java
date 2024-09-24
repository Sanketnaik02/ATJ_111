/*
 * Test_Case_06
// Steps
// 1. Launch Chrome browser.
//2. Launch the demo.html page.
// 3. Find text boxes with the attribute name as 'fname'.
//4. Print the count of total text boxes.
//5. Enter data in the text boxes using the Python zip function. (Use Python list to hold the data)
//texts = ["hello", "batch", "welcome", "to", "python", "selenium", "Web", "browser", "automation"]
// 6. Close the browser./
 */
package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06 {

	public static void main(String[] args) {
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//2. Launch the demo.html page.
		driver.get("D:/Automation/Links/demo.html");
		
		
		// 3. Find text boxes with the attribute name as 'fname'.
		String Xpath = "//input[contains(@name,'fname')]";
		List<WebElement> TextBox = driver.findElements(By.xpath(Xpath));
		
		
		//4. Print the count of total text boxes.
		System.out.println("Total Count of Text Boxes : "+TextBox.size());
		
		for(int i=0; i<TextBox.size(); i++) {
			
			String TextName = TextBox.get(i).getText();
			System.out.println(TextName);
			
		}
		
		// 6. Close the browser./
		driver.close();
		 
		
		

	}

}
