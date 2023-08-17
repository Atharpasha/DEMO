package com.orangehrm.genriclib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public void getPageScreenshot(WebDriver driver, String methodName) throws Throwable {
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File scrFile = screen.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		String timeStamp = date.toString().replace(":", "_").replace(" ", "_");
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\ScreenShots\\"
				+ methodName+".png"));
	}

}
