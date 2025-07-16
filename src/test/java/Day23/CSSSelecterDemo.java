package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSSelecterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeOptions options = new ChromeOptions();                //to handle ssl error
	        options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();                     //maximize the browser window.
		
		
		//tag id           tag#id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirt");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tshirt");
		
		
		//tag Class         tag.className
//		driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("toys");
		
		
		//tag class and attribute    .class[attribute='value']
//		driver.findElement(By.cssSelector(".button-1[type='submit']")).click();
		
		
		//tag attribute
		driver.findElement(By.cssSelector("[href='/computers']")).click();
		
		
		
		

	}

}
