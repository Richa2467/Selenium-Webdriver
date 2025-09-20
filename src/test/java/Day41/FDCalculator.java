package Day41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FDCalculator {

    public static void main(String[] args) throws Exception {
        
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        String filePath = System.getProperty("user.dir") + "\\TestData\\data.xlsx";
        String sheetName = "Sheet1";

        int rowCount = ExcelUtils.getRowCount(filePath, sheetName);

        for (int i = 1; i <= rowCount; i++) { // Starting from 1 to skip header row

            // Read data from Excel
            String usernameData = ExcelUtils.getCellData(filePath, sheetName, i, 0);
            String passwordData = ExcelUtils.getCellData(filePath, sheetName, i, 1);

            // Open login page
            driver.get("https://practicetestautomation.com/practice-test-login/");

            // Enter username
            WebElement username = driver.findElement(By.id("username"));
            username.clear();
            username.sendKeys(usernameData);

            // Enter password
            WebElement password = driver.findElement(By.id("password"));
            password.clear();
            password.sendKeys(passwordData);

            // Click login button
            WebElement submitBtn = driver.findElement(By.id("submit"));
            submitBtn.click();

            // Wait for page to load
            Thread.sleep(2000); // Can be replaced with WebDriverWait if needed

            // Validate login result
            boolean loginSuccess = driver.findElements(By.xpath("//h1[text()='Logged In Successfully']")).size() > 0;

            if (loginSuccess) {
                ExcelUtils.setCellData(filePath, sheetName, i, 2, "Pass");
                ExcelUtils.fillGreenColor(filePath, sheetName, i, 2);
            } else {
                ExcelUtils.setCellData(filePath, sheetName, i, 2, "Fail");
                ExcelUtils.fillRedColor(filePath, sheetName, i, 2);
            }
        }

        driver.quit();
    }
}
