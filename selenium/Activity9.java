import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Activity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement textField = driver.findElement(By.id("input-text"));
        System.out.println("Is Text Field Enabled? " + textField.isEnabled());
        WebElement enableButton = driver.findElement(By.id("enableInput"));
        enableButton.click();
        System.out.println("Is Text Field Enabled after clicking 'Enable Input'? " + textField.isEnabled());
        driver.quit();
    }
}



    
