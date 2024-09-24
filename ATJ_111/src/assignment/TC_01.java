/* Test Case_01 (Basic Browser Actions.)
# Steps
#1. Launch Chrome browser.
#2. Go to Google search engine and launch URL "https://www.google.com/"
# 3. Maximize window
# 4. Minimize window
#5. Get the current webpage title & print it
#6. Get the current webpage URL & print it
#7. Close browser.
*/
package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) {

		//#1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();

		// #2. Go to Google search engine and launch URL "https://www.google.com/"
		driver.get("https://www.google.com/");

		// # 3. Maximize window
		driver.manage().window().maximize();

		// # 4. Minimize window
		driver.manage().window().minimize();

		// #5. Get the current webpage title & print it
		String Title = driver.getTitle();
		System.out.println("Current Title :" + Title);

		// #6. Get the current webpage URL & print it
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL :" + URL);

		// #7. Close browser.
		driver.close();

	}

}
