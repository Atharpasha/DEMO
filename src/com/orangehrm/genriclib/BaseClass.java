package com.orangehrm.genriclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	public Utility getUtilityObject() {
		Utility readData = new Utility();
		return readData;
		//

	}

	public WebDriverGenericMethod getWebdriverGenericMethod() {
		WebDriverGenericMethod webdriverMethod = new WebDriverGenericMethod(driver);
		return webdriverMethod;
	}

	@BeforeClass
	public void configBeforeClass() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		report = new ExtentReports("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\Reports\\Test.html");
		test = report.startTest("OrangeHRMProject");
		test.log(LogStatus.PASS, "chrome Browser Opening");

		test.log(LogStatus.INFO, "Maixmize Browser");
		getWebdriverGenericMethod().maximizeWindow();
		test.log(LogStatus.INFO, "wait for page load");
		getWebdriverGenericMethod().waitForPageLoad();
		test.log(LogStatus.INFO, "navigate to application");
		driver.get(getUtilityObject().readPropertyData().getProperty("url"));
	}

	@AfterClass
	public void configAfterClass() throws Throwable {
		test.log(LogStatus.INFO, "closing browser");
		driver.quit();
		report.endTest(test);
		report.flush();
	}

	@Test
	public void ff() {
		;

		System.out.println("jjj");
	}

}
