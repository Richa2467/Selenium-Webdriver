package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeOptions options = new ChromeOptions();                //to handle ssl error
	     options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));     // if the element is available with in 2 seconds then it will not wait till 5 seconds.
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();  
		
       //pause the execution.
		
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    
		
		

	}

}
