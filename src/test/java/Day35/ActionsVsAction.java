package Day35;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		   driver.get("https://demoqa.com/buttons");	
		   driver.manage().window().maximize();
		   
		   WebElement button =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		   
		   
		   Actions act=new Actions(driver);
		   
		   //Right click on button
		  Action myaction= act.contextClick(button).build(); //building/creating an action and storing into a variable
		  myaction.perform();          //we are performing/completing action     

//		   act.contextClick(button).perform();
		   
		
	}

}
