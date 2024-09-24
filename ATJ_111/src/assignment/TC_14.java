// test Form only xpath 
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_14 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// Lauch form url
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// first name  
		WebElement firstName = driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-1\"]"));
		firstName.sendKeys("Sanket");
		
		// Last name 
		WebElement lastName = driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
		lastName.sendKeys("Naik");
		
		// Phone Number
		WebElement phone = driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']"));
		phone.sendKeys("1234567890");
		
		// Country
		WebElement country = driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']"));
		country.sendKeys("India");
		
		// City
		WebElement city = driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']"));
		city.sendKeys("Mumbai");
		
		// Email Address
		WebElement	email = driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']"));
		email.sendKeys("sanketnaik123@gmail.com");
		
//		// Gender
//		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='Radio-0']"));
//		gender.click();
//		
		
		
		// Day of week
		driver.findElement(By.xpath("//input[@id='RESULT_CheckBox-8_4']")).click();
		
		// Submit
		WebElement submit = driver.findElement(By.xpath("//input[@id='FSsubmit']"));
		submit.submit();
		Thread.sleep(3000);
		
		
		
		driver.close();
		
	}

}
