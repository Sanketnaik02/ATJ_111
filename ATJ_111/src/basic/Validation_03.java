package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_03 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		// open URL 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		// Validation key 
		
		// is Displayed
		boolean firstName = driver.findElement(By.id("firstName")).isDisplayed();
		System.out.println("First NAme is displayed :"+firstName);
		
		
		// is Enabled
		boolean email = driver.findElement(By.id("userEmail")).isEnabled();
		System.out.println("Email ID testBox is Enabled or not : "+email);
		
		// is Selected
		boolean gender = driver.findElement(By.xpath("//input[@id='gender-radio-1']")).isSelected();
		System.out.println("Gender Male radio button is selected or not : "+gender);
		
		
		// Title 
		String title = driver.getTitle();
		System.out.println("WebPage Title is : "+title);
		
		// Get Current URL
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL Is : "+URL);
		
		//get attribute
		WebElement MobileNUmber =  driver.findElement(By.id("userNumber"));
		
		String typeValue = MobileNUmber.getAttribute("type");
		System.out.println("The Mobile Number Attribute is :"+typeValue);
		
		// get Tag Name
		
		String TagName = driver.findElement(By.id("dateOfBirthInput")).getTagName();
		System.out.println("The TAG name is :" + TagName);
		
		// get Size
		
		Dimension Size = driver.findElement(By.id("uploadPicture")).getSize();
		System.out.println("Upload Document Tag SIZE : "+Size);
		
		// get Text
		
		String GetText = driver.findElement(By.id("currentAddress")).getText();
		System.out.println("The Text is :"+GetText);
		
		
		
		
		
	}

}
