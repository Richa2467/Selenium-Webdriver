package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement mhover=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		WebElement mobile=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(mhover).moveToElement(mobile).click().build().perform();
		
		act.moveToElement(mhover).moveToElement(mobile).click().perform();

		

	}

}
