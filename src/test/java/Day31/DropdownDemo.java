package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();                //to handle ssl error
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();  

		WebElement drpCountryEle=driver.findElement(By.tagName("select"));
		Select drpcountry=new Select(drpCountryEle);
		
		
		//Select Options from the dropdown
		
		
//		drpcountry.selectByValue("COL");
		
//		drpcountry.selectByVisibleText("Canada");
		
		
		drpcountry.selectByIndex(2);
		
		
		
		
		//count all the options in the dropdown
		
		List<WebElement> drpoptions=drpcountry.getOptions();
		
		System.out.println("Total number of Options are: "+drpoptions.size());
		
		
		//printing the options
		
		
//		for(int i=0; i<drpoptions.size(); i++)
//		{
//			System.out.println(drpoptions.get(i).getText());
//			
//		}
		
		
		//enhanced for loop
		for(WebElement op:drpoptions)
		{
			System.out.println(op.getText());
		}
		
		
		
	}

}
