package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {

	@FindBy(xpath = "//span[contains(text(),'Wishlist')]")
	WebElement wishlist;

	public WishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void wishlist() {
		wishlist.click();
	}

}