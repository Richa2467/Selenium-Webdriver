package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedChromemessageOnScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();                
		 options.setExperimentalOption("excludeSwitches", new String[]  {"enable-automation"});


	 
	        
		
//		ChromeDriver driver=new ChromeDriver();      //done by constructer in chromedriver class
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.opencart.com/");
		
		String act_title=driver.getTitle();

		
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
