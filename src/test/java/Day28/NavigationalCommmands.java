package Day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommmands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/register");   // accept URL only in the string format.
		
		driver.navigate().to("https://demo.nopcommerce.com/register");    //accept URL accepts in string and string format.
		
//		URL url=new URL("https://demo.nopcommerce.com/register");
//		driver.navigate().to(url);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

	}

}
