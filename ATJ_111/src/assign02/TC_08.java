/*
 * Test_Case_08
// Steps
// 1. Launch Chrome browser.
// 2. Launch the amazon.in
//3. Search for Samsung Galaxy
// 4. Find the product Xpath related to 4 and above rating (Use ancestor Xpath)
//5. Print the product count and the product link text.
// 6. Close the browser.
 */
package assign02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_08 {

	public static void main(String[] args) {
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the amazon.in
		driver.get("https://www.amazon.in/");
		
		//3. Search for Samsung Galaxy
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Samsung Galaxy");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		
		// 4. Find the product Xpath related to 4 and above rating (Use ancestor Xpath)
		String  Xpath = "//span[starts-with( text(), '4.')]";
		List<WebElement> FourStar = driver.findElements(By.xpath(Xpath));
		
		
		
		//5. Print the product count and the product link text.
		System.out.println("Count Is : "+FourStar.size());
		
		for(int i=0; i<FourStar.size(); i++) {
			
			String FourStartText = FourStar.get(i).getText();
			System.out.println(FourStartText);
		}
		
		
		// 6. Close the browser.
		
		driver.close();

	}

}
