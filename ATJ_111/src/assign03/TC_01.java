package assign03;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {

		
		//Test_Case_01
		// Steps
		// 1. Launch Chrome browser.
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		// 2. Launch the URL for the demo.html page.
		 driver.get("D:\\Automation\\Links\\demo.html");
		 Thread.sleep(2000);
		 
		// 3. Create a variable for a multi-select listbox. (id="multiple_cars")
		 WebElement cars = driver.findElement(By.id("multiple_cars"));
		 
		 Select select1 = new Select(cars);
		 
		// 4. Check if multiple selections are possible for the created listbox by using the 's.multiple' method.
		boolean Multiple = select1.isMultiple();
		
		
		// Print the result in the console.
		System.out.println(Multiple);
		
		// 5. Select different options from the listbox using different 'select' methods. (any 3)
		select1.selectByIndex(1);
		
		select1.selectByValue("jgr");
		
		select1.selectByVisibleText("Mini");
		
		// 6. Capture all the selected options using the 's.all_selected_options' method. print the result.
		List<WebElement> AllCars = select1.getAllSelectedOptions();
		for(int i=0; i<AllCars.size(); i++) {
			String PrintAllCars = AllCars.get(i).getText();
			System.out.println("Car : "+PrintAllCars);
		}
		// 7. Deselect all the selected options one by one using different 'deselect' methods.
		select1.deselectByIndex(1);
		
		select1.selectByValue("jgr");
		
		select1.selectByVisibleText("Mini");	
		
		// 8. Again, select all the options one by one using the 's.options' method.
		for(WebElement all : select1.getOptions()){
			
			int i = select1.getOptions().indexOf(all);
			select1.selectByIndex(i);
		}
		
		// 9. Deselect All the options using the 's.deselect_all()' method.
		select1.deselectAll();
		
		// 10. Close the browser.
//		driver.close();
	}

	

}
