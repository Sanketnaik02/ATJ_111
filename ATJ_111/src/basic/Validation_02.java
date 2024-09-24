package basic;

import org.openqa.selenium.Dimension ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_02 {

	public static void main(String[] args) {
		
		// open URL 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		// Go to the SearchBar Size 
		WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		SearchBar.sendKeys("iPhone 13");
		
		
		Dimension search = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).getSize();
		
		System.out.println("The Size is :"+search);
		
		
		String text = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).getText();
		
		System.out.println("Text Is :"+text);
		
		driver.close();

	}

}
