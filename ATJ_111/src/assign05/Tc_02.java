///Test_Case_02 Steps 
		 // // 1. Launch Chrome browser. 
		 // // 2. Launch the demo.html page URL. 
		 // // 3. Perform Double click on the 'Double click me 
		 // 4. Close the
		 // browser button.
		 ///
package assign05;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_02 {

	public static void main(String[] args) throws Exception {

		// 1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the demo.html page URL OR Use This URL "https://www.tutorialspoint.com/selenium/practice/buttons.php".
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		
		// 3. Perform Double click on the 'Double click me 
		WebElement DoubleClick = driver.findElement(By.xpath("//button[@ondblclick='myDoubleclick()']"));
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.doubleClick(DoubleClick).perform();
		Thread.sleep(4000);
		
		// 4. Close the browser button.
		
		String text = driver.findElement(By.xpath("//p[@id=\"doublec\"]")).getText();
		System.out.println(text);
		driver.close();
	}

}
