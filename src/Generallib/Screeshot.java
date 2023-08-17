package Generallib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screeshot  {
	
	public void screenShot(WebDriver driver,String methodName) throws Throwable
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		Date date=new Date();
		String timestamp=date.toString().replace(" ", "_").replace(".", "_");
		File target=new File("C:\\Users\\Athar\\eclipse-workspace\\myprogrram\\ScreenShots\\"+methodName+"_"+timestamp+".png");
		FileUtils.copyFile(source, target);
	}

}
