package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrolliingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        
        //Scroll down page by the pixel number
        
        js.executeScript("window.scrollBy(0,3000)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        
        //Scroll the page till element is visible
        
        WebElement  ele=driver.findElement(By.xpath("//td[normalize-space()='Spain']"));
        
        js.executeScript("arguments[0].scrollIntoView();",ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        
        
        //Scroll down till end of the page
        
       
        
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);
        
        
        //Scrolling upto initail position
        
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        

	}

}
