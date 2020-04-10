package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	WebElement cart;
	@FindBy(xpath = "//input[@value='Go to cart']")
	WebElement gotocart;
	@FindBy(xpath = "//input[@name='continueshopping']")

	WebElement continueshopping;

	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Move to shopping cart

	public void cart(WebDriver driver) {

		Actions action = new Actions(driver);
		action.moveToElement(cart).build().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// Clicking go to cart

	public void goToCart() {

		gotocart.click();
	}

	// clicking continue shopping

	public void continueShopping(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		continueshopping.click();
	}

}