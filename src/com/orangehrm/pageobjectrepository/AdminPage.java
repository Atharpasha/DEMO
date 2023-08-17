package com.orangehrm.pageobjectrepository;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genriclib.WebDriverGenericMethod;

public class AdminPage {
	
	WebDriverGenericMethod webdriverMethod;
		WebDriver driver;
		public AdminPage(WebDriver driver) {
			 this.driver=driver;
			PageFactory.initElements(driver,this);
			 this.webdriverMethod = new WebDriverGenericMethod(driver);
			}
		
		@FindBy(xpath = "//span[text()='Admin']")
		WebElement adminLink;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
		WebElement addLink;

		@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
		WebElement userRoleDropdown;

		@FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
		WebElement essDropdownValue;

		@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
		WebElement statusDropdown;
		
		@FindBy(xpath = "//span[text()='Disabled']")
		
		WebElement statusDropdownValue;

		
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		WebElement empnameTxtBox;

		@FindBy(xpath = "//label[text()='Username']/../following-sibling::div/input")
		WebElement usernameTxtBox;

		@FindBy(xpath = "//label[text()='Password']/../following-sibling::div/input")
		WebElement passwordTxtBox;

		@FindBy(xpath = "//label[text()='Confirm Password']/../following-sibling::div/input")
		WebElement confirmPwdTxtBox;
		

		@FindBy(xpath = "//button[@type='submit']")
		WebElement submitButton;
		
		@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
		WebElement selectLink;


		 public void createUser(String username,String pwd,String confirmPwd,String empName) throws Throwable
		 {
			 webdriverMethod.clickLink(adminLink);
			 webdriverMethod.normalWait(3000);
			 webdriverMethod.clickLink(addLink);
			 webdriverMethod.normalWait(3000);
			 webdriverMethod.clickLink(userRoleDropdown);
			 webdriverMethod.normalWait(6000);
			 List<WebElement>lst1=webdriverMethod.
					 findAllElement("//div[@role='listbox']");
			 lst1.get(0).click();
			 webdriverMethod.normalWait(2000);
			 
			 webdriverMethod.clickLink(statusDropdown);
			 webdriverMethod.scrollDown(driver);
			 webdriverMethod.normalWait(10000);
			 List<WebElement>lst2=webdriverMethod.
					 findAllElement("//div[@role='listbox']");
			
			 
			 for (int i=0;i<lst2.size();i++) {
				 System.out.println(i+"=="+lst2.get(i).getText());
				 if (lst2.get(i).getText().contains("Enabled"))
				 {
					 lst2.get(i).click();
				 }
				
				 
			 }
			 webdriverMethod.scrollup(driver);
			 webdriverMethod.normalWait(2000);
			 webdriverMethod.enterTxt(empnameTxtBox, empName); 
			 webdriverMethod.normalWait(5000);
			 List<WebElement>lst3=webdriverMethod.
					 findAllElement("//div[@role='listbox']");
			 lst3.get(0).click(); 
			 webdriverMethod.enterTxt(usernameTxtBox,username );
			 webdriverMethod.normalWait(2000);
			 webdriverMethod.enterTxt(passwordTxtBox, pwd);
			 webdriverMethod.normalWait(2000);
			 webdriverMethod.enterTxt(confirmPwdTxtBox, confirmPwd);
			 webdriverMethod.normalWait(2000);
			 webdriverMethod.clickLink(submitButton);
		 }
		 
		 public void searchUser(String username,String empName) throws Throwable 
		 {
			 webdriverMethod.clickLink(adminLink);
			 webdriverMethod.normalWait(3000);
			 webdriverMethod.enterTxt(usernameTxtBox, username);
			 webdriverMethod.clickLink(userRoleDropdown);
			 webdriverMethod.normalWait(6000);
			 List<WebElement>lst1=webdriverMethod.
					 findAllElement("//div[@role='listbox']");
			 lst1.get(0).click();
			 webdriverMethod.normalWait(2000);
			 webdriverMethod.enterTxt(empnameTxtBox, "and"); 
			 webdriverMethod.normalWait(5000);
			 List<WebElement>lst3=webdriverMethod.
					 findAllElement("//div[@role='listbox']");
			 lst3.get(0).click(); 
			 webdriverMethod.clickLink(statusDropdown);
			 webdriverMethod.normalWait(10000);
			 List<WebElement>lst2=webdriverMethod.
					 findAllElement("//div[@role='listbox']");
			
			 
			 for (int i=0;i<lst2.size();i++) {
				 System.out.println(i+"=="+lst2.get(i).getText());
				 if (lst2.get(i).getText().contains("Enabled"))
				 {
					 lst2.get(i).click();
				 }	
				 
				 
			 }
			 webdriverMethod.clickLink(submitButton); 
			 webdriverMethod.normalWait(2000);
			 webdriverMethod.scrollDown(driver);
			 webdriverMethod.normalWait(10000);
		 }
		
		
	}


