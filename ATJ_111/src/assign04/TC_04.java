package assign04;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_04 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the progressbar.html page.
		driver.get("file:///D:/Automation/Links/progressbar.html");

		// 3. Click on the 'click me' button.

		
		String Xpath = "/html/body/button";
		driver.findElement(By.xpath(Xpath)).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Bar = By.id("mybar");
		Wait.until(ExpectedConditions.attributeToBe(Bar, "style", "width: 100%;"));
		
		
		
		// 4. Use appropriate selenium wait to wait for the progress bar to load 100%.
		System.out.println("Wait 12 second");

		// 5. Close the browser.

		driver.close();

	}

}
