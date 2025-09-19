package Day39;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginWithEmailOtp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();                //to handle ssl error
        options.setAcceptInsecureCerts(true);
//	   ChromeDriver driver=new ChromeDriver();      //done by constructer in chromedriver class
	    WebDriver driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://mfa-dev.surepassid.com/default.aspx");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//*[@id='tbxDomain_Name']")).sendKeys("volansys.com");
	   driver.findElement(By.xpath("//*[@id='tbxUser_Name']")).sendKeys("richatyagi");
	   driver.findElement(By.xpath("//*[@id='tbxPassword']")).sendKeys("Acldigital@2025");
	   
	   driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	   
	   Properties props = new Properties();
	   props.put("mail.imap.host", host);
	   props.put("mail.imap.port", "993");
	   props.put("mail.imap.ssl.enable", "true");
	   
	   Session session = Session.getInstance(props);
	   Store store = session.getStore("imap");
	   store.connect(host, username, password);


	   
	   driver.findElement(By.xpath("//*[@id='tbxOTP']")).sendKeys("");
	   
}
}

   