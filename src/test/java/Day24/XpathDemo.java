package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ChromeOptions options = new ChromeOptions();                //to handle ssl error
	        options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();   
		
		//xpath with single attribute
//		driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("laptop");
		
//		//xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@name=\"q\"][@placeholder=\"Search store\"]")).sendKeys("laptop");
//		
//		//xpath with and operator
//		driver.findElement(By.xpath("//input[@name=\"q\" and @placeholder=\"Search store\"]")).sendKeys("laptop");	
//		
//		//xpath with or operator
//		driver.findElement(By.xpath("//input[@name=\"q\" or @placeholder=\"Search store\"]")).sendKeys("laptop");	
		
		
		//xpath with text()
		
//		driver.findElement(By.xpath("//a[text()='Computers ']")).click();	
		String value=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(value);
		
		
//		//xpath with contains
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Laptop");
//		
//		//xpath with start-with
//		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Laptop");
		
		
		//chained xpath
		boolean status=driver.findElement(By.xpath( "//div[@id='logo']/a/img\n")).isDisplayed();
		System.out.println(status);
		
		
				

	}

}
