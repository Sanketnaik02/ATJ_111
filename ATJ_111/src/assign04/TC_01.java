package assign04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the loading.html URL
		driver.get("D:\\Automation\\Links\\loading.html");
		
		// 3. Wait for the webpage to load. (This web page takes around 13 secs to load.) Use implicit wait.
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		
		// 4. Enter Test User in FirstName & LastName text box correspondingly.
		driver.findElement(By.name("fname")).sendKeys("TestUser");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lname")).sendKeys("Testing");
		Thread.sleep(2000);
		// 5. Click on the login button.
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		// 6. Close the browser. 
		driver.close();

	}

}
