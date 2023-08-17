package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "oxd-userdropdown")
	WebElement logoutdropdown;
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;

	public void logDrop() {
		logoutdropdown.click();
	}

	public void logout() {
		logout.click();
	}

}
