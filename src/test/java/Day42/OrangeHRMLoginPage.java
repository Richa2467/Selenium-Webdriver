package Day42;
/*
 * open app
 * test logo presence
 * login
 * close
 * 
 */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OrangeHRMLoginPage {
	WebDriver driver;
	@Test(priority=1)
	void openapp()
	
	{
		ChromeOptions option=new ChromeOptions();
	  driver=new ChromeDriver(option);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	
	@Test(priority=2)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed: " +status);
	}
	
	@Test(priority=3)
	void testlogin()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test(priority=4)
	void testLogout()
	{
		driver.quit();
	}
	

	  
	  
  
}
