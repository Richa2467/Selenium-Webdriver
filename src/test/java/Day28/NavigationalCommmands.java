package Day28;

<<<<<<< HEAD
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
=======
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
>>>>>>> fb9a66625262aee513df7d4b064b0de22fb0219a

public class NavigationalCommmands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		

		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/register");   // accept URL only in the string format.
		
		driver.navigate().to("https://demo.nopcommerce.com/register");    //accept URL accepts in string and string format.
		
//		URL url=new URL("https://demo.nopcommerce.com/register");
//		driver.navigate().to(url);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
=======
        System.setProperty("webdriver.chrome.driver", "/home/richatyagi/Downloads/chromedriver-linux64/chromedriver");
		
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
      
       Set<String> windowIDs=driver.getWindowHandles();
      
       //Approach 1      (set method don't have a get method to access indivisual ids)
       List<String> windowList=new ArrayList(windowIDs);
       String parentID=windowList.get(0);
       String childID=windowList.get(1);
       
       System.out.println(driver.getTitle());    //return the title of parent window because driver is focused on parent window only
      
      
       //switch to child window
       driver.switchTo().window(childID);
       System.out.println(driver.getTitle());
      
      
       //switch to parent window
       driver.switchTo().window(parentID);
       System.out.println(driver.getTitle());
      
      
      //Approach 2
      
       for(String winId:windowIDs)
       {
       	String title=driver.switchTo().window(winId).getTitle();
       	
       	if(title.equals("OrangeHRM"))
       	{
            System.out.println(driver.getCurrentUrl());
            driver.close();        //closing specifice browser window
            // some validation on the parent window.
       	}
       }
>>>>>>> fb9a66625262aee513df7d4b064b0de22fb0219a

	
	}

}
