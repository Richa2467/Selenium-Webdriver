package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeOptions options = new ChromeOptions();                //to handle ssl error
	        options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();  
		
		
//		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Display status of logo: "+logo.isDisplayed());
		
		
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status of logo: "+status);
		
		boolean inputboxstatus=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Input box is enabled ? " + inputboxstatus);
		
		
		WebElement malecheckbox=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("is selected "+malecheckbox.isSelected());
		
		WebElement femalecheckbox=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("is selected "+femalecheckbox.isSelected());
		
	
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		Thread.sleep(5000);
		
		System.out.println(femalecheckbox.isSelected());
		System.out.println(malecheckbox.isSelected());
		
		boolean newlettersstatus=driver.findElement(By.xpath("(//input[@id='Newsletter'])[1]")).isSelected();
		System.out.println("News letter checkbox status: "+newlettersstatus);


	
		
		

	}

}
