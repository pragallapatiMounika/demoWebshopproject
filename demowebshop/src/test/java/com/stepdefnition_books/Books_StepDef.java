package com.stepdefnition_books;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.Login;
import demowebshop.SelectBooks;
import utility.ScreenShot;
import wrapper.BaseClass;

public class Books_StepDef extends BaseClass {
	WebDriver driver = null;
	Login login;
	SelectBooks selectbooks;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(Books_StepDef.class.getName());

	@Given("^User clicks the books$")
	public void user_clicks_the_books() throws Throwable {

		driver = launchApplication("chrome");
		driver = launchApplication("firefox");
		OpenWebsite();
		login = new Login(driver);
		selectbooks = new SelectBooks(driver);
		screenshot = new ScreenShot(driver);

		logger.trace("Select books ");
		selectbooks.books();
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/select2.png");

	}

	@When("^Click Computing$")
	public void click_computing() throws Throwable {
		logger.info("take Screenshot");
		driverwaits();
		selectbooks.computing();
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/Select3.png");

	}

	@Then("^Click CompareList$")
	public void click_comparelist() throws Throwable {

		driverwaits();
		logger.debug("Selecting the books ");
		screenshot.takeSnapShot("src/test/resources/SSdemoweb/Select1.png");

		selectbooks.compare();
		driver.close();
	}

}
