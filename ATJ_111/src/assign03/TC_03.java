package assign03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_03 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the Amazon.in "https://www.amazon.in/"
		driver.get("https://www.amazon.in/");
		
		// 3. Create a variable for the Search dropdown Select class.
		WebElement searchDropdownBox = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(searchDropdownBox);
		
		
		// 4. Check if multiple selection is possible for the created dropdown Select Class.
		select.isMultiple();
		
		// 5. Print True or False in the console.
		System.out.println("Multiple selection is possible or not : "+ select.isMultiple());
		
		// 6. Print the count of all the options available under the dropdown menu.
		
		int count = select.getOptions().size();
		System.out.println("Select Options Size is :"+count);
		
		// Also, print the text of all the options.
		
		for (WebElement options : select.getOptions()) {
			
			String textOption = options.getText();
			System.out.println("Option Text : "+ textOption);
		}
		
		// 7. Select the 'Electronics' option from the dropdown list
		select.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		
		// 8. After selecting, Search for 'Mobile Phones'.
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Mobile Phones");
		SearchBox.submit();
		Thread.sleep(2000);
		
		// 9. Validate page title. It should contain 'Mobile Phones'.
		String PageTitle = driver.getTitle();
		
		if(PageTitle.contains("Mobile Phones")) {
			
			System.out.println("Title Is Correct");
		}
		else {
			System.out.println("Title is Wrong");
		}
		
		System.out.println("Current Page Title Is :"+PageTitle);
		
		// 9. Close the browser. 
		driver.close();
	}

}
