import com.fasterxml.jackson.core.JsonParser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example{
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/search?q=cheese&rlz=1C1GCEU_enIN1092IN1092&oq=cheese&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIQCAEQLhiDARixAxjJAxiABDIQCAIQLhjHARixAxjRAxiABDINCAMQABiDARixAxiABDIKCAQQABiSAxiABDINCAUQABiSAxiABBiKBTIKCAYQABixAxiABDIKCAcQABixAxiABDIKCAgQABixAxiABDIKCAkQABixAxiABNIBCDIzMDJqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Cheese");
        searchBox.sendKeys(Keys.RETURN);
        WebElement results = driver.findElement(By.id("result-stats"));
        String resultsText = results.getText();
        System.out.println("Search Results:"+ resultsText);
        driver.quit();

    }
}
