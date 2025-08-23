package Day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsAndwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        
        //Selenium4.x
//        driver.switchTo().newWindow(WindowType.TAB);           //open new TAB
        driver.switchTo().newWindow(WindowType.WINDOW);           //open new window
        
        
        driver.get("https://orangehrm.com/");
     

	}

}
