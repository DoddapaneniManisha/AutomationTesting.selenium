import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Act_3 {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @Test
    public void testLogin(){
        WebElement userNameField= driver.findElement(By.id("username"));
        WebElement passwordField= driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        userNameField.sendKeys("admin");
        passwordField.sendKeys("password");
        loginButton.click();
        WebElement confirmatiionMessage= driver.findElement(By.id("confirmationMessage"));
        String actualMessage= confirmatiionMessage.getText();
        Assert.assertEquals(actualMessage, "Login successful. Welcome, admin!");

    }
    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
