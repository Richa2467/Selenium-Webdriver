package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		driver.manage().window().maximize();
		
		
		//total number of pages
		
		String s=driver.findElement(By.xpath("//div[@id='example_info']")).getText();       //Showing 1 to 3 of 10 entries

		
		System.out.println(s);
		int total_pages=Integer.parseInt(s.substring(s.indexOf("of")+2,s.indexOf("entries")-1).trim());          //10
		 
		
		//repeating pages
		
		for (int p = 1; p <= total_pages; p++) {
		    // Process table rows here if needed

		    if (p < total_pages) {
		        WebElement nextBtn = driver.findElement(By.xpath("//a[@data-dt-idx='next']"));

		        // Scroll to the element
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);

		        // Wait for it to be clickable
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));

		        // Click using JS as a fallback
		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn);
		        
		        
		        //reading data from the page
		        
		        
		        int noofrows=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tbody//tr")).size();		        
		   
		        for(int r=1; r<=noofrows; r++)
		        {
		        String Studentname=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tr["+r+"]//td[1]")).getText();		        
		        String Studentgender=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tr["+r+"]//td[2]")).getText();		       
		        String classlevel=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered dataTable no-footer']//tr["+r+"]//td[3]")).getText();		       
		        
		        System.out.println(Studentname+"\t"+Studentgender+"\t"+classlevel);
		        
		        
		        }
		    
		    }
		}
	}
}	
	
	
	
