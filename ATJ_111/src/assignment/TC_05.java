/*Test_Case_05 (Use CSS_SELECTOR (Cascaded Style Sheet))
 // Steps
 // 1. Launch Chrome browser
 // 2.Go to Google search.
 // 3.Type Amazon in the search text box.
 // 4.Click on the Amazon link using CSS_SELECTOR
 // 5.Close the browser. */

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05 {

	public static void main(String[] args) throws InterruptedException {
		
		 // 1. Launch Chrome browser
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		 // 2.Go to Google search.
			driver.get("https://www.google.com");
			
		 // 3.Type Amazon in the search text box.
			WebElement search = driver.findElement(By.id("APjFqb"));
			search.sendKeys("Amazon");
			search.submit();
		 // 4.Click on the Amazon link using CSS_SELECTOR
			driver.findElement(By.cssSelector("#rso > div.hlcw0c > div > div > div > div > div > div > div > div.yuRUbf > div > span > a > h3")).click();
			Thread.sleep(5000);
			
		 // 5.Close the browser.
			driver.quit();
			

	}

}
