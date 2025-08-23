package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.util.List;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize(); ]
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='OrangeHRM, Inc']")));
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
//		
//		//Approach1
//		List<String>  windowList=new ArrayList(windowIDs);
//		
//		String parentID=windowList.get(0);
//		String childID=windowList.get(1);
//		
//		
//		//switch to child window
//		driver.switchTo().window(childID);
//		System.out.println(driver.getTitle());
//		
//		
//		//switch to parent window
//		driver.switchTo().window(parentID);
//		System.out.println(driver.getTitle());
		

		//Approach 2
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}else
			{
				System.out.println(driver.getCurrentUrl());
			}
			
		}
		
		
	}

}
