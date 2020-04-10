package demowebshop;

import org.testng.annotations.Test;

import wrapper.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class LoginUi extends BaseClass {
	WebDriver driver;
	Login login;
	Select select;
	ShoppingCart shoppingCart;
	SelectBooks selectbooks;
	WishList wishlist;
	LogOut logout;

	@BeforeSuite
	public void initDriver() {
		driver = launchApplication("chrome");
		OpenWebsite();
	}

	@Test
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new Login(driver);
		select = new Select(driver);
		shoppingCart = new ShoppingCart(driver);
		selectbooks = new SelectBooks(driver);
		wishlist = new WishList(driver);
		logout = new LogOut(driver);

	}

	// Test case 1 Login
	@Test(priority = 1)
	public void login() {
		login.account();
		login.setEmail("email");
		login.setPassword("password");
		login.loginBtnElement();
	}

	// Test case 2 select the desired phone and adding to cart

	@Test(priority = 2)
	public void select() {
		select.clickElectronics();
		select.clickCellphones();
		select.clickSmartphones();
		select.addToCart();
	}

	// Checking the cart items

	@Test(priority = 4)
	public void shoppingCart() {
		shoppingCart.cart(driver);
		shoppingCart.goToCart();

		shoppingCart.continueShopping(driver);

	}

	// Select the required book and adding to comparelist

	@Test(priority = 3)
	public void books() {
		selectbooks.books();
		selectbooks.computing();
		selectbooks.compare();
	}
	// Checking the wishlist items

	@Test(priority = 5)
	public void wishlist() {
		wishlist.wishlist();
	}

	// Logging Out

	@Test(priority = 6)
	public void logout() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logout.logout();
	}

}
