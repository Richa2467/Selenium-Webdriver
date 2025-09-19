package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://www.testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        
        
        //1. find total number of rows in a table
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();          //multiple tables in the web page.
//        int rows=driver.findElements(By.tagName("tr")).size();            //single table
        System.out.println("No of rows are  "     +rows);
        
        
        //2. find total number of rows in a table
        int colums=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();          //multiple tables in the web page.
//        int colums=driver.findElements(By.tagName("th")).size();            //single table        
        System.out.println("No of colums are  "     +colums);
        
       //3. Read data from specific row and column
        
        System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[2]")).getText());     //3rd row and 2 column
        
        System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText());      //5 th row and 1 column
        
       
        //4.Read data from rows and column
//        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
//        for(int i=2; i<=rows; i++)
//        {
//        	
//        	for(int j=1; j<=colums; j++)
//        	{
//        
//        
//        	System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText() + "\t");
//        }
//        System.out.println();
//        	}
//	
//     
//        driver.quit();
        
        //5. Print only book name if the author is mukesh
//        System.out.println("BookName\tAuthor\tSubject\tPrice");
//
//        for (int i = 2; i <= rows; i++) {
//            String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[2]")).getText();
//
//            if (author.equals("Mukesh")) {
//                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[1]")).getText();
//                String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[3]")).getText();
//                String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[4]")).getText();
//
//                System.out.println(bookName + "\t" + author + "\t" + subject + "\t" + price);
//            }
//        }
//        
        
        //6. i want to capture all the prices and find the total 
        int sum=0;
        for (int i = 2; i <= rows; i++) {
            String prizeStr = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[4]")).getText();
            System.out.println(prizeStr);
            
            int price = Integer.parseInt(prizeStr);  // Use parseInt here
            sum += price;
        }
            

System.out.println(sum);

driver.close();
     
        }
                
       
        
        

	}

                                                                                                       