
	
	package Day46;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class ExtentReportManager implements ITestListener {

	    public ExtentSparkReporter SparkReporter; // UI of the report
	    public ExtentReports extent;              // Populates common info on the report
	    public ExtentTest test;                   // Creates test case entries and updates status

	    @Override
	    public void onStart(ITestContext context) {
	        SparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extentReport.html");

	        // Report configuration
	        SparkReporter.config().setDocumentTitle("Simple Automation Report");
	        SparkReporter.config().setReportName("Test Report");
	        SparkReporter.config().setTheme(Theme.STANDARD);
	        SparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	        extent = new ExtentReports();
	        extent.attachReporter(SparkReporter);

	        // System/environment info
	        extent.setSystemInfo("Computer Name", System.getenv("COMPUTERNAME"));
	        extent.setSystemInfo("Environment", "Qa");
	        extent.setSystemInfo("Tester Name", System.getProperty("user.name"));
	        extent.setSystemInfo("OS", System.getProperty("os.name"));
	        extent.setSystemInfo("Browser Name", "chrome");
	    }

	    public void onTestSuccess(ITestResult result) {
	        test = extent.createTest(result.getName());
	        test.log(Status.PASS, "Test Passed: " + result.getName());
	    }

	    public void onTestFailure(ITestResult result) {
	        test = extent.createTest(result.getName());
	        test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
	        test.log(Status.FAIL, result.getThrowable()); // Log the exception/stack trace
	    }

	    
	    public void onTestSkipped(ITestResult result) {
	        test = extent.createTest(result.getName());
	        test.log(Status.SKIP, "Test Skipped: " + result.getName());
	        test.log(Status.SKIP, result.getThrowable()); // Log the reason if any
	    }

	public void onFinish(ITestContext context) {
		
			extent.flush();
		
		}
	}


