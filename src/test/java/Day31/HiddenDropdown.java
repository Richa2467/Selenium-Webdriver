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

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {


		        // Handle SSL certificate errors if any (optional here)
		        ChromeOptions options = new ChromeOptions();
		        options.setAcceptInsecureCerts(true);

		        WebDriver driver = new ChromeDriver(options);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            driver.get("https://opensource-demo.orangehrmlive.com/web/");
		            driver.manage().window().maximize();

		            // Wait for username field and enter username
		            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		            username.sendKeys("Admin");

		            // Wait for password field and enter password
		            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		            password.sendKeys("admin123");

		            // Wait for login button and click it
		            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		            loginButton.click();

		            // Wait a moment for login to process (optional)
		            wait.until(ExpectedConditions.urlContains("/dashboard"));  // Wait until dashboard URL loads

		            System.out.println("Login successful!");

		            
<<<<<<< HEAD
		          //clicking on PIM
		    		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();//clicking on PIM
		    		
		    		
		    		//clicking on dropdown
		    		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		    		 Thread.sleep(5000);
		    				//clicking on single option
//		    				driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		    				
		    		//count number of options
		    				List<WebElement> doptions=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		    				System.out.println(doptions.size());
		    				
		    				//printing options in the console window
		    				
		    				for(WebElement dp:doptions)
		    				{
		    					System.out.println(dp.getText());
		    				}

		    		
		    		
		    
		    		}
=======
		            WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='PIM']")));
		            pimMenu.click();
		            
		            WebElement dropdownIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(@class,'bi-caret-down-fill')]")));
		            dropdownIcon.click();

		            // Wait until the options list is visible
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']")));

>>>>>>> fb9a66625262aee513df7d4b064b0de22fb0219a
		    		

		           
		

	}
<<<<<<< HEAD
=======
}
>>>>>>> fb9a66625262aee513df7d4b064b0de22fb0219a
