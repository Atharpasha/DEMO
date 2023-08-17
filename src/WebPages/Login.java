package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement Login;

	public void usernameMethod(String user) {
		username.sendKeys(user);
	}

	public void passwordMethod(String pass) {
		password.sendKeys(pass);
	}

	public void clickLogin() {
		Login.click();

	}
}
