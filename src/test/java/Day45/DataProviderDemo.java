package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider="dp")
	void testlogin(String email,  String pwd) throws InterruptedException
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       //pause the execution.
		
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	    boolean status=driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']")).isDisplayed();
	    
	    if (status==true)
	    {
	    	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[text()=\"Logout\"]")).click();
	    	Assert.assertTrue(true);
	    	
	    	
	    }else
	    {
	    	Assert.fail();
	    }
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,1,4})
	Object[][] loginData()
	{
		Object  data[][]= {
				
				{"ad1","admin123"},
				
				{"Admin", "teeeeb"},
				{"Strong", "Adminqqwe"},
				{"Arong", "Admin123"},
				{"Admin", "admin123"},
				
					
		};
		
		
		return data;
		
		
	}
	
	
	
}

