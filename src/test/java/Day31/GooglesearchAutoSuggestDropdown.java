package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglesearchAutoSuggestDropdown {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("selenium");

        // Wait for the suggestion box to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));

        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        System.out.println("Suggestions found: " + list.size());

        for (WebElement suggestion : list) {
            String text = suggestion.getText();
            System.out.println(text);

            if (text.equalsIgnoreCase("selenium")) {
                suggestion.click();
                break;
            }
        }

        // Optional: close the browser after action
        // driver.quit();
    }
}
