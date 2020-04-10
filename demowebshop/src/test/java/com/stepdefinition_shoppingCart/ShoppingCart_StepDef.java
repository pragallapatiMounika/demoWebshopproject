package com.stepdefinition_shoppingCart;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.stepdefinition_login.Login_StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demowebshop.Login;
import demowebshop.ShoppingCart;
import utility.ScreenShot;
import wrapper.BaseClass;

public class ShoppingCart_StepDef extends BaseClass {
	WebDriver driver = null;
	Login login;
	ScreenShot screenshot;
	ShoppingCart shoppingcart;
	final static Logger logger = LogManager.getLogger(Login_StepDef.class.getName());

	@Given("^tag_13User on My LoginPage$")
	public void user_is_on_my_loginpage() throws Throwable {
		driver = launchApplication("chrome");
		driver = launchApplication("firefox");
		OpenWebsite();
		login = new Login(driver);
		screenshot = new ScreenShot(driver);
		shoppingcart = new ShoppingCart(driver);
		login.account();
	}

	@Then("^tag_13User click LoginButton$")
	public void user_click_loginbutton() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		login.loginBtnElement();

	}

	@And("^tag_13User enter (.+) and (.+)$")
	public void user_enter_and(String username, String password) throws Throwable {
		login.setEmail(username);
		login.setPassword(password);

	}

	@Then("^User Click The ShoppingCart$")
	public void user_click_the_shoppingcart() throws Throwable {

		shoppingcart.cart(driver);

	}

	@Then("^click continue shopping$")
	public void click_continue_shopping() throws Throwable {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("continue shopping");
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/shopping1.png");
		shoppingcart.continueShopping(driver);
		driver.close();

	}

	@And("^Clicks gotocart$")
	public void clicks_gotocart() throws Throwable {
		logger.error("go to cart");
		driverwaits();
		shoppingcart.goToCart();
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/Shopping3.png");
	}

}
