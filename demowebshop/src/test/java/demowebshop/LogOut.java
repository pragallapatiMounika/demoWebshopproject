package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	@FindBy(linkText = "Log out")
	WebElement logout;

	public LogOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver = driver;
	}

	// logout
	public void logout() {
		logout.click();
	}

}
