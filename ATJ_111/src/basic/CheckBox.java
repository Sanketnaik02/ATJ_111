package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class CheckBox {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the DemoQA Checkbox page
            driver.get("https://demoqa.com/checkbox");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Wait until the checkbox is clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement expandAllButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".rct-option-expand-all")));
            
            // Expand all to make the checkboxes visible
            expandAllButton.click();

            // Locate the checkbox element by XPath
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']")));

            // Highlight the checkbox for debugging
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", checkbox);

            // Approach 1: Click using Actions class for precise interaction
            Actions actions = new Actions(driver);
            actions.moveToElement(checkbox).click().perform();

            // Approach 2: Use JavaScript click if the standard click fails
            // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
//            driver.quit();
        }
    }
}
