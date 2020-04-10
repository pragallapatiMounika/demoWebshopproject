package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(className = "ico-login")
	WebElement login;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginBtnElement;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// To click login Button
	public void account() {

		login.click();
	}

	// To enter Email
	public void setEmail(String Email) {
		email.sendKeys(Email);

	}

	// To enter password
	public void setPassword(String Password) {
		password.sendKeys(Password);
	}

	// To click login Button
	public void loginBtnElement() {
		loginBtnElement.click();

	}

}
