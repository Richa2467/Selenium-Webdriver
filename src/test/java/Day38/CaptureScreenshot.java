package Day38;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CaptureScreenshot {


	    public static void main(String[] args) throws IOException {
	    	ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true);

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(options);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Navigate and maximize
	        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	        driver.manage().window().maximize();

	   
	        //1) Full page Screenshot

	        // Take screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
//	        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//
//	        // Define target file
//	        File targetFile = new File(System.getProperty("user.dir") + "/Screenshot/fullpage.png");
//
//	        // Copy file
//	        Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//	        System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());
	        
	        
	        
	        //2 capture the screenshot of specific section
	        WebElement mainwrap= driver.findElement(By.xpath("//div[@id='mainwrap']"));
	        
//	        File sourceFile=mainwrap.getScreenshotAs(OutputType.FILE);
//
//	        // Define target file
//	        File targetFile = new File(System.getProperty("user.dir") + "/Screenshot/fullpage.png");
//
//	        // Copy file
//	        Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//	        System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());
//	        
	        
	        //3 Specific web Element
	        
	       WebElement flag_logo= driver.findElement(By.xpath("//img[@alt='Flag of Nepal']"));
	       File sourceFile=flag_logo.getScreenshotAs(OutputType.FILE);
	    // Define target file
	        File targetFile = new File(System.getProperty("user.dir") + "/Screenshot/fullpage.png");

	        // Copy file
	        Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("Screenshot saved at: " + targetFile.getAbsolutePath());

	        
	        
	        
	        
	        
	        
	        
	        
	        // Close the browser
	        driver.quit();


	}

}
