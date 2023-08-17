package Generallib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import WebPages.Login;
import WebPages.Logout;
public class BaseClass {
	 WebDriver driver;
	public Data getDataObject()
	{
		Data data=new Data();
		return data;
	}
//public Login getLoginObject()
//	{
//		Login login=new Login(driver);
//		return login;
//	}
//	public Logout getLogoutObject()
//	{
//		Logout logout=new Logout(driver);
//		return logout;
//	}
	 public WebbdriverMethods getWebbdriverMethodsOject()
	 {
		WebbdriverMethods wMethod=new WebbdriverMethods(driver);
		 return wMethod;
	 }
	 @BeforeClass
	 public void launch() throws Throwable 
	 {
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
		 
	 }
//      @BeforeMethod
//	 public void beforeMethod() throws Throwable
//	 {
//		 getLoginObject().usernameMethod(getDataObject().readPropertyData().getProperty("username"));
//		 getLoginObject().passwordMethod(getDataObject().readPropertyData().getProperty("password"));
//		 getLoginObject().clickLogin();	 	 
//
//	 }
//      @AfterMethod
// 	 public void afterMethod() throws Throwable
// 	 {
// 	 getLogoutObject().logDrop();
// 	 getLogoutObject().logout();
// 	 
// 	 }
//      @AfterClass
//      public void close()
// 	 {
// 		driver.close(); 
// 	 }
//     
//	
//
}
//
//
