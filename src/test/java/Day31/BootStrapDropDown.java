package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();                //to handle ssl error
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.htmlelements.com/demos/dropdownlist/checkboxes/");
		driver.manage().window().maximize();
		
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframeElement);

		
		//Select Single option from dropdown
		driver.findElement(By.xpath("//span[@class='smart-drop-down-button']")).click();
		
		
		
		//Capture all the options and find out the size.
		
		
		List<WebElement> doptions=driver.findElements(By.xpath(("//smart-list-item[@class='smart-element smart-list-item']")));
		
		System.out.println("No of options in dropdown are: "+doptions.size());
		
		
		//Printing options from dropdown
		
//		for(WebElement ele:doptions)
//		{
//			
//			System.out.println(ele.getText());
//		}
		
		
//		4)Select multiple options
		
		for(WebElement ele:doptions)
		{
			String opt=ele.getText();
			
//			if(ele.getText().equals("Bicerin")   || ele.getText().equals("Breve") || ele.getText().equals("Cafe macchiato"))
				if(opt.equals("Bicerin")   || opt.equals("Breve") || opt.equals("Cafe macchiato"))

			{
				ele.click();
			}
		}
		
		
		
		
		
		
		

	}

}
