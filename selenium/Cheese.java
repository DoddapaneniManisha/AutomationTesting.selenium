import  io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Cheese {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        FirefoxOptions firefoxOptions= new FirefoxOptions();
        firefoxOptions.setHeadless(true);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cheese");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        String fun=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
        //System.out.println(fun);
        //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[7]/div/div/div[1]/div/div/span/a/h3")).click();
        String[] words = fun.split("\\s+");
        //if (words.length >= 2) {
        String secondWord = words[1];
        System.out.println(secondWord);
        //} else {
        //System.out.println("There is no second word in the string.");
        //}

    }
}
