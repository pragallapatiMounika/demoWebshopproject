package com.stepdefinition_logout;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.stepdefinition_login.Login_StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demowebshop.LogOut;
import demowebshop.Login;
import demowebshop.WishList;
import utility.ScreenShot;
import wrapper.BaseClass;

public class Logout_StepDef extends BaseClass {
	WebDriver driver = null;
	Login login;
	ScreenShot screenshot;
	WishList wishlist;
	LogOut logout;
	final static Logger logger = LogManager.getLogger(Login_StepDef.class.getName());

	@Given("^1User on My LoginPage$")
	public void user_is_on_my_loginpage() throws Throwable {
		driver = launchApplication("chrome");
		driver = launchApplication("firefox");
		OpenWebsite();
		login = new Login(driver);
		wishlist = new WishList(driver);
		logout = new LogOut(driver);
		screenshot = new ScreenShot(driver);
		login.account();
	}

	@Then("^1User click LoginButton$")
	public void user_click_loginbutton() throws Throwable {
		driverwaits();
		login.loginBtnElement();

	}

	@And("^1User enter (.+) and (.+)$")
	public void user_enter_and(String username, String password) throws Throwable {
		login.setEmail(username);
		login.setPassword(password);

	}

	@Then("^click wishlist$")
	public void click_wishlist() throws Throwable {

		wishlist.wishlist();
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/WishList.png");

	}

	@Then("^click Logout$")
	public void click_logout() throws Throwable {
		logout.logout();
		logger.debug("click logout");
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/logout.png");
		driver.close();
	}

}
