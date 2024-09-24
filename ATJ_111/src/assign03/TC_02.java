package assign03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_02 {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Launch the URL for the demo.html page.
		driver.get("D:\\Automation\\Links\\demo.html");
		
		// 3. Create a variable for a single select listbox. (id="standard_cars")
		WebElement SingleListBox = driver.findElement(By.id("standard_cars"));
	
		Select selcet1 = new Select(SingleListBox);
		
		// 4. Check if multiple selections are possible for the created listbox by using the 's.multiple' method.
		boolean check = selcet1.isMultiple();
		
		// Print the result in the console.
		System.out.println("multiple selections are possible "+check);
		
		
		// 5. Select different options from the listbox using different 'select' methods. (any 3)
		selcet1.selectByIndex(2);
		
		selcet1.selectByValue("min");
		
		selcet1.selectByVisibleText("Nissan");
		
		// 6. Capture the last selected options using the 's.all_selected_options' method. print the result.
		
		List<WebElement> AllSelect = selcet1.getAllSelectedOptions();
		
		for(WebElement options : selcet1.getOptions()) {
			
			
			String getText = options.getText();
			System.out.println("The Text "+getText);
		}
		
		// 7. Deselect the last selected options one by one using different 'deselect' methods.
		// 8. Again, select all the options one by one using the 's.options' method.
		
		
		driver.close();

	}

}
