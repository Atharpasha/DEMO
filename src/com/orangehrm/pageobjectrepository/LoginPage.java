package com.orangehrm.pageobjectrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genriclib.WebDriverGenericMethod;

public class LoginPage {

		WebDriver driver;
		WebDriverGenericMethod webdriverMethod;
		public LoginPage(WebDriver driver) {
		 this.driver=driver;
		  this.webdriverMethod=new WebDriverGenericMethod(driver);
		PageFactory.initElements(driver,this);
		}
		 @FindBy(name="username")
		 private WebElement usernameTxtBox;

		 @FindBy(name="password")
		 private WebElement passwordTxtBox;
		 
		 @FindBy(xpath="//button[@type='submit']")
		 private WebElement loginBtn;
		  
		 public void loginToApplication(String username,String password)
		 {
			 webdriverMethod.enterTxt(usernameTxtBox, username);
			 webdriverMethod.enterTxt(passwordTxtBox, password);
			 webdriverMethod.clickLink(loginBtn);	 
		 }
		 

	}


