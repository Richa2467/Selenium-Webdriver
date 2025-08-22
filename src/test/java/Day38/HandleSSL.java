package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ChromeOptions options = new ChromeOptions();                //to handle ssl error
	        options.setAcceptInsecureCerts(true);
	  
		
//		ChromeDriver driver=new ChromeDriver();      //done by constructer in chromedriver class
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		String act_title=driver.getTitle();
		System.out.println(act_title);

		
		
		
		driver.close();
	}

}
