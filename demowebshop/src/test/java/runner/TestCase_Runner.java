package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = { "pretty", "html:target/cucumber",
		"json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport2.html" }, glue = {
				"com.stepdefinition_login", "com.stepdefinition_select", "com.stepdefinition_shoppingCart",
				"com.stepdefnition_books", "com.stepdefinition_logout" },

		tags = { "@tag_1" }, monochrome = true)

public class TestCase_Runner {
	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src/test/resources/testdata/extent_reports.xml");

		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
