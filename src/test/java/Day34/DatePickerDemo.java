package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
  
	//selecting future date
	static void selectFutureDate(WebDriver driver, String mont, String year,String date)
	{
		
		//select month & year
		while(true)
		{
		String curr_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();     //month
		
		String curr_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();        //year
		
		if(curr_month.equals(mont) && curr_year.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();            //next button for future year
//		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();           //prev button for past year

		}
				//Select Date
				List<WebElement> alldates=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
				for(WebElement dt:alldates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
				
				
	}
	
	//selecting future date
	static void selectPastDate(WebDriver driver, String mont, String year,String date)
	{
		
		//select month & year
		while(true)
		{
		String curr_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();     //month
		
		String curr_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();        //year
		
		if(curr_month.equals(mont) && curr_year.equals(year))
		{
			break;
		}
		
//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();            //next button for future year
		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();           //prev button for past year

		}
				//Select Date
				List<WebElement> alldates=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
				for(WebElement dt:alldates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
        
		driver.switchTo().frame(0);
		
//		Method1 : using sendkeys()
//		driver.findElement(By.id("datepicker")).sendKeys("04/05/2025");       //mm/dd/yyyy
		
		
		//Method 2 : Using Datepicker
		//expected data
		String year="2025";
		String mont="May";
		String date="20";
		
		driver.findElement(By.id("datepicker")).click();
		
		
//		selectPastDate(driver,mont,year,date);
        selectFutureDate(driver,"November","2026","18");		
		
		
		
		
		

		
		
		                                                                          
	}

}
