package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	
	WebDriver driver;
	public Admin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//span[text()='Admin']")
WebElement Admin;
@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
WebElement add;
@FindBy(xpath="//label[text()='User Role']//../following-sibling::div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
WebElement useroll;
@FindBy(xpath="//label[text()='Status']//../following-sibling::div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
WebElement status;
@FindBy(xpath="//label[text()='Password']//../following-sibling::div/input[@type='password']")
WebElement password;
@FindBy(xpath="//label[text()='Confirm Password']//../following-sibling::div/input[@type='password']")
WebElement confirm_password;
@FindBy(xpath="//label[text()='Username']//../following-sibling::div/input[@class='oxd-input oxd-input--active']")
WebElement username;
@FindBy(xpath="//input[@placeholder='Type for hints...']")
WebElement Employename;
@FindBy(xpath="//button[@type='submit']")
WebElement save;

public void admin()
{
	Admin.click();
	add.click();
	
}
public void addUser()
{
	add.click();
	
}


















} 
