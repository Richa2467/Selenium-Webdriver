package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeOptions options = new ChromeOptions();                //to handle ssl error
	     options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();  
		
		Thread.sleep(5000);         //pause the execution.
		
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    
		
		
		
		
		
	
	}

}
