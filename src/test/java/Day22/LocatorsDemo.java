package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ChromeOptions options = new ChromeOptions();                //to handle ssl error
        options.setAcceptInsecureCerts(true);

        //ChromeDriver driver=new ChromeDriver();      //done by constructer in chromedriver class
        WebDriver driver=new ChromeDriver(options);
//        driver.get("https://demo.opencart.com/");
//        driver.manage().window().maximize();
//        
//        //name
//        driver.findElement(By.xpath("search")).sendKeys("Mac");
        
        

         //linktest &partialLinktext
//        driver.findElement(By.linkText("Tablets")).click();
//        driver.findElement(By.partialLinkText("Table")).click();
////        
//        List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
//        
//        System.out.println("Total number of links " +headerLinks.size());
//        
//        //tagname
//        List<WebElement> links=driver.findElements(By.tagName("a"));
//        System.out.println("total number of links: "+links.size());
//        
//        
//        List<WebElement> images=driver.findElements(By.tagName("img"));
//        System.out.println("total number of images: "+images.size());
        
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links in the page: " +links.size());
        
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("Total number of images in the web page are: "+images.size());
        
        driver.findElement(By.linkText("Contact")).click();
        
        
        
}
}