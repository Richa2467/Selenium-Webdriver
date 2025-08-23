package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenLinkInTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        Actions act=new Actions(driver);
        
        
        //CTRL + Reglink
        act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
        
        //swiching to registration page
//        Set<String> ids=driver.getWindowHandles();
        
        List<String> ids=new ArrayList(driver.getWindowHandles());                 //convert set into Arraylist
        
        driver.switchTo().window(ids.get(1));      //witch to registration page
        
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ram");
        
        driver.switchTo().window(ids.get(0));            //switch to home page
        
        
        
        
        
        

	}

}
