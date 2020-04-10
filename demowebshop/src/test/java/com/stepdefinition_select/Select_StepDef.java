package com.stepdefinition_select;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.Login;
import demowebshop.Select;
import utility.ScreenShot;
import wrapper.BaseClass;

public class Select_StepDef extends BaseClass {

	WebDriver driver;
	Login login;
	Select select;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(Select_StepDef.class.getName());

	@Given("^User Clicks Electronics$")
	public void user_clicks_electronics() throws Throwable {

		driver = launchApplication("chrome");
		driver = launchApplication("firefox");
		OpenWebsite();
		login = new Login(driver);
		screenshot = new ScreenShot(driver);
		select = new Select(driver);
		select.clickElectronics();
		logger.debug("choose the electronics");
		screenshot.takeSnapShot(
				"C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Smartphones.png");
	}

	@When("^click cellphones$")
	public void click_cellphones() throws Throwable {
		select.clickCellphones();
		logger.info("click the cellphones");
		screenshot.takeSnapShot(
				"C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/electronics1.png");

	}

	@Then("^click addtoCart$")
	public void click_addtocart() throws Throwable {
		select.addToCart();
		logger.info("add to cart ");
		screenshot.takeSnapShot(
				"C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/addcart.png");

	}

	@And("^click smartPhones$")
	public void click_smartphones() throws Throwable {
		select.clickSmartphones();

	}

}