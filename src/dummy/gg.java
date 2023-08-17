package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangehrm.genriclib.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class gg {
  WebDriver driver;
 static ExtentTest test;
 static ExtentReports report;
	@BeforeClass
	public void startTest()
	{
	report = new ExtentReports("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Reports\\ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Resources\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	}
	@Test
	public void extentReportsDemo()
	{
	
	driver.get("https://www.facebook.com");
	
	}@AfterMethod
	public void rr(ITestResult result) throws Throwable
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			String m=result.getName();
			
			new ScreenShot().getPageScreenshot(driver,m);
			System.out.println(m);
		}
		
	}
	@AfterClass
	public void endTest()
	{
	driver.close();
	report.endTest(test);
	report.flush();
	
	}
	
}
