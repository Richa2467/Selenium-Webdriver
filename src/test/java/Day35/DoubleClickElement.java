package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Welcome");
		
		//double click action on the button
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform();
		
		//validation : box2 should contains  "WELCOME"
		
//		String txt=box2.getText();
		String txt=box2.getAttribute("value");

		System.out.println(txt);
		if(txt.equals("Welcome"))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}
		

	}

}
