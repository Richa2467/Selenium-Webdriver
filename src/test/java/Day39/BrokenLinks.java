package Day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



//1)link should have href attribute
//Link   href=”https://xyz.com”;
//
//
//2)https://xyz.com” —--- server—-- status code;
//
//
//3)If status code >= 400 then it is a broken link.
//If status code < 400 then it is not a broken link.




public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();                //to handle ssl error
        options.setAcceptInsecureCerts(true);
//	   ChromeDriver driver=new ChromeDriver();      //done by constructer in chromedriver class
	    WebDriver driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demoqa.com/broken");
	   driver.manage().window().maximize();
	   
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   
	   System.out.println("Total number of links: " +links.size());
	   
	   int noofbrokenlink=0;
	   for(WebElement linkElement:links)
	   {
		   String hrefattValue=linkElement.getAttribute("href");
		   
		   
		   if(hrefattValue == null ||   hrefattValue.isEmpty())
		   {
			   System.out.println("href attribute value is null or empty, Not possible to check");
			   continue;
		   }
		   
		   
		   
		   
		   //hit url to Server
		  try { 
		   URL linkURL=new URL(hrefattValue);         //converted href value from string to URL format
		   HttpURLConnection  conn=(HttpURLConnection) linkURL.openConnection();                //open connection to the server
		   conn.connect();   //connect to server and sent request to the server.
		   
		   if(conn.getResponseCode()>=400)
		   {
			   System.out.println(hrefattValue+  "=======>It is a broken link");
			   noofbrokenlink++;
		   }
		   else
		   {
			   System.out.println(hrefattValue+  "=======>it is not a broken link");
		   }
		   
		  }
		  catch(Exception e)
		  {
			  
		  }
		  
		
		   
		   
	   }
	   
	   System.out.println("No of broken links are ===>"+noofbrokenlink);

	}

}
