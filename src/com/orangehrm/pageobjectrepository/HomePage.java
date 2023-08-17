package com.orangehrm.pageobjectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	WebDriver driver;
		
		public HomePage(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		 @FindBy(xpath ="//span[@class='oxd-userdropdown-tab']")
		 private WebElement logoutDropdown;

		 @FindBy(xpath ="//a[text()='Logout']")
		 private WebElement logoutLink;
		 
		
		 
		 public void logoutFromApplication()
		 {
			 logoutDropdown.click();
			 logoutLink.click();
		 }

	}


