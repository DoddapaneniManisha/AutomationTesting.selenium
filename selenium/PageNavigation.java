import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageNavigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.FireFox.driver", "path/to/FireFoxdriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://example.com");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        WebElement aboutUsButton = driver.findElement(By.id("aboutUsButton"));
        aboutUsButton.click();
        String newPageTitle = driver.getTitle();
        System.out.println("New Page Title: " + newPageTitle);
        driver.quit();
    }


}

