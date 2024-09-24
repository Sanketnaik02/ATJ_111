//https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407
// using xpath
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		
		// FirstName
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Sanket");
		
		// LastName
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Naik");

		//Phone
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("123456778");
		
//		Country
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		
		// City
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Mumbai");
		
		// Email
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("sanket123@gmail.com");
		
		// Gender
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
		
		// Day
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']")).click();
		
		// Submit
		driver.findElement(By.xpath("//input[@id='FSsubmit']")).click();
		
		
		
		
	}

}
