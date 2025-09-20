package Day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleSvgElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);  // Accept insecure SSL certificates

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open the OrangeHRM demo page
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the window
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[name()='circle' and contains(@cx,'15')]")).click();
        

	   
	   

	}

}

