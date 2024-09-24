/*Test_Case_04 (Use LINK_TEXT & PARTIAL_LINK_TEXT)
		 Steps
		 1. Launch Chrome browser.
		 2. Launch the URL for the demo.html page.
		 3. Click on the Google link available under the website section using Link_Text
		 4. Click on the Continue Shopping link from the Dynamic Linktext section using link_text.
			5. Click on Apple Website from the Website section using partial_link_text. (App)
			6. Close all the browser windows. */
		
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {

	public static void main(String[] args) throws InterruptedException {
		
//		 1. Launch Chrome browser.
			WebDriver driver = new ChromeDriver();
			
//		 2. Launch the URL for the demo.html page.
			driver.get("file:///D:/Automation/AT_111/HTML_Pages/demo.html");
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
//		 3. Click on the Google link available under the website section using Link_Text
			driver.findElement(By.linkText("Google")).click();
			Thread.sleep(2000);
			
//		 4. Click on the Continue Shopping link from the Dynamic Linktext section using link_text.
			driver.findElement(By.linkText("Continue Shopping")).click();
			Thread.sleep(2000);
			
//			5. Click on Apple Website from the Website section using partial_link_text. (App)
			driver.findElement(By.partialLinkText("App")).click();
			Thread.sleep(5000);
			
//			6. Close all the browser windows. 
			driver.quit();
		


	}

}
