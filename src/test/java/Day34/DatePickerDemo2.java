package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");	
		driver.manage().window().maximize();
		
		
		//input DOB
		
		String requiredYear="2021";
		String requiredMonth="Jun";
		String requireddate="15";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		
		//select year
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		
		Select selectYear=new Select(yearDropDown);
		selectYear.selectByVisibleText(requiredYear);
		
		
		//select month
		WebElement monthDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select selctMonth=new Select(monthDropDown);
		selctMonth.selectByVisibleText(requiredMonth);
		

		//Select Date
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(requireddate))
			{
				dt.click();
				break;
			}
		
		
		
		
		
		
	}

}
}