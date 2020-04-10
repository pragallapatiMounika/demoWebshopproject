package com.stepdefinition_login;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demowebshop.Login;
import utility.ScreenShot;
import wrapper.BaseClass;

public class Login_StepDef extends BaseClass {
	WebDriver driver = null;
	Login login;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(Login_StepDef.class.getName());

	@Given("^User on My LoginPage$")
	public void user_is_on_my_loginpage() throws Throwable {
		driver = launchApplication("chrome");
		driver = launchApplication("firefox");
		OpenWebsite();
		logger.debug("Login page");
		login = new Login(driver);
		screenshot = new ScreenShot(driver);
		login.account();
	}

	@Then("^User click LoginButton$")
	public void user_click_loginbutton() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("logged in");
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/select2.png");
		login.loginBtnElement();
		driver.close();

	}

	@And("^User enter (.+) and (.+)$")
	public void user_enter_and(String username, String password) throws Throwable {
		login.setEmail(username);
		login.setPassword(password);

	}

}