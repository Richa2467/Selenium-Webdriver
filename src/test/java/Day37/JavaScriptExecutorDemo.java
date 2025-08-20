package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
        WebElement inputbox=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        
       
        
//		ChromeDriver driver = new ChromeDriver(options);
//        JavascriptExecutor js=driver;                       if we use ChromeDriver then we can directly assign the driver to javascriptExecutor variable
        
        
        // passing the text into inputbox - alternate of sendkeys method.
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value', 'Ram')",inputbox);
        
        
        WebElement chechbox=driver.findElement(By.xpath("//input[@value='Male']"));
        
        js.executeScript("arguments[0].click()", chechbox);
        
        
        
        
        
        
        
        
        

	}

}
