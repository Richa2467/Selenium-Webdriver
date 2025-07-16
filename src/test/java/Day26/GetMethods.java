package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeOptions options = new ChromeOptions();                //to handle ssl error
	        options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();   
		Thread.sleep(5000);
		
		//getTitle()           - returns title of the page.
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()        -returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()         -returns Page source
//		System.out.println(driver.getPageSource());
		
//		String windowid=driver.getWindowHandle();
//		System.out.println(windowid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();        //this  will open new browser window
		
		driver.close();   //parent window got closed.
		driver.quit();    //all window got closed.
		
//		Set<String> windowid=driver.getWindowHandles();
//		
//		System.out.println(windowid);
		
		
		
		 

	}

}
