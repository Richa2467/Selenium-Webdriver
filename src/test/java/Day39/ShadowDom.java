package Day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();                //to handle ssl error
        options.setAcceptInsecureCerts(true);
//	   ChromeDriver driver=new ChromeDriver();      //done by constructer in chromedriver class
	    WebDriver driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://books-pwakit.appspot.com/");
	   driver.manage().window().maximize();
	   
	   
	   //this Element is insisde single shadow DOM
//	   String cssSelectorForhost1= "book-app[apptitle='BOOKS']";
//	   Thread.sleep(1000);
	   SearchContext shadow= driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	   Thread.sleep(1000);
	   shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
//	   
//	   driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME");        //NoSuchElementException
	   
	   

	}

}
