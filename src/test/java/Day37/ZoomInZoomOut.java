package Day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
//        driver.manage().window().minimize();
//        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom= '50%'");     //set zoom level 50%
        Thread.sleep(5000);
        
        js.executeScript("document.body.style.zoom= '80%'");     //set zoom level 80%
        Thread.sleep(5000);

	}

}
