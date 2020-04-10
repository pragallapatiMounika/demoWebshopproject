package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectBooks {
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
	WebElement books;
	@FindBy(linkText = "Computing and Internet")
	WebElement computingandInternet;
	@FindBy(xpath = "//input[@class='button-2 add-to-compare-list-button']")
	WebElement comparelistBtnElement;

	public SelectBooks(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Select books Categary

	public void books() {
		books.click();
	}

	// Selecting the book

	public void computing() {
		computingandInternet.click();

	}

	// Add to compare list

	public void compare() {
		comparelistBtnElement.click();
	}
}
