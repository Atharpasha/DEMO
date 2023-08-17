package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangehrm.genriclib.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Generallib.Data;
import Generallib.WebbdriverMethods;

public class Testscript {
	public ExtentReports report;
	public ExtentTest test;
	
	WebDriver driver;
	 public WebbdriverMethods getWebbdriverMethodsOject()
	 {
		WebbdriverMethods wMethod=new WebbdriverMethods(driver);
		 return wMethod;
	 }
	public Data getDataObject()
	{
		Data data=new Data();
		return data;
		
	}
	 @BeforeClass
	 public void launch() throws Throwable 
	
	 {
//		 report=new ExtentReports("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Reports\\Test.html");				
			test=report.startTest("OrangeHRMProject");
		 if ((getDataObject().readPropertyData().getProperty("browser")).equals("chrome"))
		 {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Resources\\chromedriver.exe");
			
			 driver=new ChromeDriver();
		 }
		 else 
		 {
			 System.out.println("no browser");
		 }
			
		 getWebbdriverMethodsOject().winMax();
		 getWebbdriverMethodsOject().impWait(); 
		 driver.get(getDataObject().readPropertyData().getProperty("url")); 
		 test.log(LogStatus.PASS, "chrome Browser Opening");
		 
	 }

	@Test
	public void createUserTest() throws Throwable {
		System.out.println("==login==");
	}

	@Test
	public void modifyUserTest() {
		System.out.println("==modify login==");
	}
	@AfterClass
	public void configAfterClass() throws Throwable {
		test.log(LogStatus.INFO, "closing browser");
		driver.quit();
		report.endTest(test);
		report.flush();
}
}
