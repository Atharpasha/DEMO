package com.orangehrm.genriclib;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverGenericMethod {

	
		WebDriver driver;
		   public WebDriverGenericMethod(WebDriver driver) {
			 this.driver=driver;
			}
		   public void maximizeWindow() {
			   driver.manage().window().maximize();
		   }
		   public void normalWait(long time) throws Throwable {
			   Thread.sleep(time);
		   }
		   
		   public void waitForPageLoad() {
			   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   }
		   
		   public void waitForElemet(WebElement locator)
		   {
			   WebDriverWait wait=new WebDriverWait(driver,20);
			   wait.until(ExpectedConditions.elementToBeClickable(locator));
		   }
		   
		   public String gettitle() {
			   String title=driver.getTitle();
			   return title;
		   }
		   public String getUrl() {
			   String url=driver.getCurrentUrl();
			   return url;
		   }
		   
		   public String getSingleWindowId() {
			   String windowId=driver.getWindowHandle();
			   return windowId;
		   }
		   
		   public List<String> getmultipleWindowId() {
			   List<String>lst=new ArrayList<String>();
			  Set<String>se= driver.getWindowHandles();
			  Iterator<String>it=se.iterator();
			  lst.add(it.next());
			  return lst;
		   }

		   public void enterTxt(WebElement we,String input) {
			   clearTxt(we);
			   we.sendKeys(input);   
		   }
		   public void clearTxt(WebElement we) {
			   we.clear();   
		   }
		   public void clickLink(WebElement we) {
			   we.click();   
		   }
		   public boolean isdisplayElement(WebElement we) {
			    return we.isDisplayed();
		   }
		   public boolean isEnableElement(WebElement we) {
			    return we.isEnabled();
		   }
		   public boolean isSelectedElement(WebElement we) {
			    return we.isSelected();
		   }
		   public String getTextElement(WebElement we) {
			    return we.getText();
		   }
		   public String getAttributeElement(WebElement we,String attribute) {
			    return we.getAttribute(attribute);
		   }
		   
		   public void selectDropdownVisibleText(WebElement we,String text) {
			   Select se=new Select(we);
			   se.selectByVisibleText(text);
		   }
		   public void selectDropdownIndex(WebElement we,int index) {
			   Select se=new Select(we);
			   se.selectByIndex(index);
		   }
		   
		   public void deselectDropdownVisibleText(WebElement we,String text) {
			   Select se=new Select(we);
			   se.deselectByVisibleText(text);
		   }
		   public void deselectDropdownIndex(WebElement we,int index) {
			   Select se=new Select(we);
			   se.deselectByIndex(index);
		   }
		   public List<String> captureAllDropdownTxt(WebElement we) {
			   List<String>expLst=new ArrayList<String>();
			   Select se=new Select(we); 
			   List<WebElement>lst=se.getOptions();
			   for(WebElement ele:lst)
			   {
				   expLst.add(ele.getText());	   
		       }
		   		return expLst;
		   }
		    
		   public void rightClick(WebElement we) {
			   Actions act=new Actions(driver);
			   act.contextClick(we).perform();
		   }
		   public void doubleClickElement(WebElement we) {
			   Actions act=new Actions(driver);
			   act.doubleClick(we).perform();
		   }
		   public void moveElement(WebElement we) {
			   Actions act=new Actions(driver);
			   act.moveToElement(we).perform();
		   }
		   public void dragAndDropElement(WebElement we1,WebElement we2) {
			   Actions act=new Actions(driver);
			   act.dragAndDrop(we1,we2).perform();
		   }
		   
		   public void arrowDown(WebElement we) {
			   Actions act=new Actions(driver);
			   act.click(we).perform();
			   act.sendKeys(Keys.ARROW_DOWN).perform(); 
			   act.sendKeys(Keys.ARROW_DOWN).perform(); 
			   act.sendKeys(Keys.ARROW_DOWN).perform(); 
			   act.sendKeys(Keys.ENTER);
			   
		   }
		 
		   public void switchWindow(String windowId) {
			   driver.switchTo().window(windowId);
		   }
		   public void switchFrame(String frameId) {
			   driver.switchTo().frame(frameId);
		   }
		   public void switchFrame(int index) {
			   driver.switchTo().frame(index);
		   }
		   public void switchFrame(WebElement we) {
			   driver.switchTo().frame(we);
		   }
		   
		   public void switchToAlertPopup() {
			   driver.switchTo().alert();
		   }
		   public void switchToAlertPopupAndClose() {
			   driver.switchTo().alert().dismiss();
		   }
		   public void switchToAlertPopupAndClickOk() {
			   driver.switchTo().alert().accept();
		   }
		   public String switchToAlertPopupAndcaptureTxt() {
			   return driver.switchTo().alert().getText();
		   }
		   
		   public List<WebElement> findAllElement(String locator) {
			 List<WebElement>lst=driver.findElements(By.xpath(locator));
			 return lst;
		   }
		   
		   public void scrollDown(WebDriver driver) {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,200)", "");
		   }
		   public void scrollup(WebDriver driver) {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(200,0)", "");
		   }
	}



