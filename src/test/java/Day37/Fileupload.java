package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        
        
        //Single file upload
//        
//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/home/parth-jani/Downloads/TOTP_3358200001039 .csv");
//        
//        
//       if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("TOTP_3358200001039 .csv"))
//       {
//    	   System.out.println("Succesfull validation");
//       }else
//       {
//    	   System.out.println("Upload Failed");
//       }
        
       //multiple file Upload
       String file1="/home/parth-jani/Downloads/TOTP_3358200001039 .csv";
       String file2= "/home/parth-jani/Downloads/HOTP_ 56 (1).csv";
       
       driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
       
       int nooffiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
       
       
       //Validation 1 - Number of files
    if(nooffiles==2)
         {
      	   System.out.println("Succesfull validation");
         }else
         {
      	   System.out.println("Upload Failed");
         }
       
       
    
    // Validation 2- file names
    
    
  if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("TOTP_3358200001039 .csv") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("HOTP_ 56 (1).csv"))
  {
	   System.out.println("Succesfull Name validation");
  }else
  {
	   System.out.println("Upload Failed");
 }
    
	}

}
