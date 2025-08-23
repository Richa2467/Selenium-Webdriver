package Day36;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SliderDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		
		
		//Min slider
//	    WebElement min_slider=	driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
//	    System.out.println("Default loaction of the min slider is " +min_slider.getLocation()); //(58,249)    
//	    act.dragAndDropBy(min_slider, 100,250).perform();
//	    
//	    System.out.println("Loaction of the min slider after moving " +min_slider.getLocation()); //(161,249)    
	    
	    //Max slider
	    WebElement max_slider= driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
	    System.out.println("Default loaction of the min slider is " +max_slider.getLocation()); //(740,249)    
	    act.dragAndDropBy(max_slider,-100,250).perform();
	    
	    System.out.println("Loaction of the min slider after moving " +max_slider.getLocation()); 
	    
	    
	    
	    
        }
    }

