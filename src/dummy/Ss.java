package dummy;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Ss {
	public WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports report;

	// Create Webdriver reference
	@BeforeClass
	public void hh() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

	}

	@Test
	public void captureScreenshot() throws Exception {

		System.out.println("jj");

	}

	@AfterMethod
	public void ff(ITestResult result) throws Throwable {
		String mname = result.getName();
		System.out.println(mname);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		 Date date = new Date();
		 String d=date.toString().replace(",", "_");
		 String f=mname+d;
		 System.out.println(d);
		File path = new File("C:\\Users\\Athar\\Desktop\\New folder\\"+f+".png");
		FileUtils.copyFile(source, path);
		// System.out.println(timestamp);

	}

	@AfterClass
	public void gg() {
		driver.close();
//		report.endTest(test);
//		report.flush();
//		
	}

//	// It will execute after every test execution 
//	@AfterMethod
//	public void tearDown(ITestResult result) throws Throwable
//	{
//
//	// Here will compare if test is failing then only it will enter into if condition
//	
//
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File source=ts.getScreenshotAs(OutputType.FILE);
//
//	FileUtils.copyFile(source, new File("C://Users//Athar//eclipse-workspace//myprogrram//ScreenShots//ffff.png"));
//	System.out.println("Screenshot taken");
//	 
//	
//	
//	// close application

}