package Day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsRunTime {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome options
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // Accept SSL certificates

        // Load Chrome extension (SelectorsHub)
        File extensionFile = new File("/home/parth-jani/Downloads/SelectorsHub-Chrome-Web-Store.crx");
        if (extensionFile.exists()) {
            options.addExtensions(extensionFile);
            System.out.println("Extension added: " + extensionFile.getName());
        } else {
            System.out.println("Extension file not found: " + extensionFile.getAbsolutePath());
            return;
        }

        // Launch Chrome with options
        WebDriver driver = new ChromeDriver(options);

        Thread.sleep(5000);  // Wait to see if it loads


        // Navigate to OpenCart
        driver.get("https://www.opencart.com/");

        
        
    }
}
