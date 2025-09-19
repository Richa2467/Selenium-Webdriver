package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//select specific chechbox
		
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all checkbox
		
		List<WebElement> chechboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		
//		1.for(int i=0; i<chechboxes.size(); i++)
//		{
//			chechboxes.get(i).click();
//		}
		
		
//		2.for(WebElement checkbox:chechboxes)
//		{
//			checkbox.click();
//		}

		
		
		//3.select last 3 checkboxes
		//total no of checkboxes - how many checkboxes want to select = starting index.
		//7-3=4
		
//		for(int i=4; i<chechboxes.size(); i++)
//		{
//			chechboxes.get(i).click();
//		}
		
		
		//4.select first 3 checkboxes
//		for(int i=0; i<3; i++)
//		{
//			chechboxes.get(i).click();
//		}
		
		
		//5. unselect checkboxes if they are selected
		
		for(int i=0; i<3; i++)
		{
			chechboxes.get(i).click();
		}
		Thread.sleep(5000);
		
		for(int i=0; i<chechboxes.size(); i++)
		{
			
			if(chechboxes.get(i).isSelected())
			{
				chechboxes.get(i).click();
			}

		}
		
		
	}
}
