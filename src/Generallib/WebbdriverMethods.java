package Generallib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebbdriverMethods {

	WebDriver driver;

	public WebbdriverMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void winMax() {
		driver.manage().window().maximize();
	}

	public void impWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void nornalWait(long time) throws Throwable 
	{
		Thread.sleep(time);
	}
	public void expWait(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public String getTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public String geturl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	public String getSingleWindow()
	{
		String window=driver.getWindowHandle();
		return window;
	}
	public List<String> getMultipleWindows()
	{   List<String> lst=new ArrayList<String>();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		lst.add(it.next());
		return lst;
	}
	//WEBelement methods
	public void enterText(WebElement we, String input)
	{
		we.sendKeys(input);
	}
	public void clearText(WebElement we)
	{
		we.clear();
	}
	public boolean display(WebElement we)
	{
		return we.isDisplayed();
	}
	public boolean enable(WebElement we)
	{
		return we.isEnabled();
	}
	public boolean select(WebElement we)
	{
		return we.isSelected();
	}
	public String getText(WebElement we)
	{
		return we.getText();
	}
	public String getAttri(WebElement we,String attriute)
	{
		return we.getAttribute(attriute);
	}
	public String getCss(WebElement we,String attriute)
	{
		return we.getCssValue(attriute);
	}
	//dropdown
	public void selectDropVisbleText(WebElement we,String text)
	{
		Select se=new Select(we);
		se.selectByVisibleText(text);
	}
	public void selectDropindex(WebElement we,int index)
	{
		Select se=new Select(we);
		se.selectByIndex(index);
	}
	public void deSelectDropVisbleText(WebElement we,String text)
	{
		Select se=new Select(we);
		se.deselectByVisibleText(text);
	}
	public void deSelectDropindex(WebElement we,int index)
	{
		Select se=new Select(we);
		se.deselectByIndex(index);
	}
	public void deSelectAll(WebElement we)
	{
		Select se=new Select(we);
		se.deselectAll();
	}
	public boolean isMulti(WebElement we)
	{
		Select se=new Select(we);
		return se.isMultiple();
	}
	public List<String> captureOptions(WebElement we)
	{
		List<String> lst=new ArrayList<String>();
		Select se=new Select(we);
		List<WebElement> b=se.getOptions();
		for (WebElement a : b) 
		{
			
			lst.add(a.getText());
		}
		return lst;
		
	}
	public List<String> captureAllOptions(WebElement we)
	{
		List<String> lst=new ArrayList<String>();
		Select se=new Select(we);
		List<WebElement> b=se.getAllSelectedOptions();
		for (WebElement a : b) 
		{
			
			lst.add(a.getText());
		}
		return lst;
	}
	//actions class
	
	public void doubleClick(WebElement we)
	{
		Actions act=new Actions(driver);
		act.doubleClick(we).perform();
	}
	public void contextClick(WebElement we)
	{
		Actions act=new Actions(driver);
		act.contextClick(we).perform();
	}
	public void moveToElement(WebElement we)
	{
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
	}
	public void moveToElement(WebElement we1,WebElement we2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(we1,we2).perform();
	}
	public void switchToWinndow(String winid)
	{
		driver.switchTo().window(winid);
	}
	public void switchToFrame(String frmid)
	{
		driver.switchTo().frame(frmid);
	}
	public void switchToFrame(int frmindex)
	{
		driver.switchTo().frame(frmindex);
	}
	public void switchToFrame(WebElement we)
	{
		driver.switchTo().frame(we);
	}
	public void switchToAlertPopup()
	{
		driver.switchTo().alert();
	}
	public void switchToAlertPopupAndClose()
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchToAlertPopupAndAccept()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void switchToAlertPopupAndSendAccept(String text)
	{
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(text);
		alt.accept();
	}
	public Alert switchToAlertPopupAndGetText()
	{
		 Alert alt=driver.switchTo().alert();
	alt.getText();
		return alt;
		
	}
	public void javaScriptMethod()
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrolly(0,200)", "");
	}
	
	
}
