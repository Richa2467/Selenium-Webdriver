package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		// Setup Chrome options to avoid SSL errors
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		// Launch browser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// FluentWait configuration
		Wait<WebDriver> myWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		// Use FluentWait to locate the username field
		WebElement txtUsername = myWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.name("username")); // or use xpath if needed
				if (element.isDisplayed()) {
					return element;
				}
				return null;
			}
		});

		txtUsername.sendKeys("Admin");
		
		
	}}