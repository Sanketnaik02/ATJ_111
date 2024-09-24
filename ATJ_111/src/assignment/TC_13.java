package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_13 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		
		//2. Launch Naukri.com website "https://www.naukri.com/"
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// 3. In the Search text field, enter Software Testing
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Software Testing");
		
		//4. Click on the Search button
		driver.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
		
		
		// 5. Click on the first searched result from the options.
		// Method 1 
		WebElement firstBox = driver.findElement(By.xpath("//div[@class='srp-jobtuple-wrapper' and @data-job-id='280824009683']"));
		firstBox.click();
		Thread.sleep(2000);
		
		//div[@class='srp-jobtuple-wrapper' and @data-job-id='050824005264']
		// Method 2
//		WebElement click = driver.findElement(By.xpath("(//div[contains(@class,'cust-job-tuple layout-wrapper lay-2 sjw__tuple')])[1]"));
//		click.click();
		
		// 6. Close all the windows and quit the browser.*/
		driver.quit();
}}
