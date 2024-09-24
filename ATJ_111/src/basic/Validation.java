package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open facebook website
		driver.get("https://www.facebook.com/");
		
		// check email address section in enabled or not
		Boolean email = driver.findElement(By.id("email")).isDisplayed();
		
		System.out.println("Email Address section is enabled : "+email);
		if(email== true) {
			System.out.println("Validation is Successful");
		}else {
			System.out.println("Validation is Unsuccessful");
		}
		
		
		// Validate Login button is enabled or not
		
		Boolean login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).isEnabled();
		
		System.out.println("Login button is Enabled : "+login);
		
		if(login== true) {
			System.out.println("Validation is Successful");
		}else {
			System.out.println("Validation is Unsuccessful");
		}
		
		
		// Validate Radio button is selected or not
		
			// open create account form for checking radio butoon
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//			driver.findElement(By.xpath("//input[@value='2']")).click();
			
		Boolean radio = driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).isSelected();
		
		System.out.println("Radio button is selected or not :" +radio);
		
		if(radio== true) {
			System.out.println("Validation is Successful");
		}else {
			System.out.println("Validation is Unsuccessful");
		}
		
		
		
		
		driver.close();
	}

}
