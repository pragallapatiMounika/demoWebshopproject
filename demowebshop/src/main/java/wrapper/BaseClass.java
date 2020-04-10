package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	protected WebDriver driver;

	// To launch browser
	public WebDriver launchApplication(String browser) {
		{
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;
		}
	}
	// To launch Website

	public void OpenWebsite() {
		driver.get("http://demowebshop.tricentis.com");

	}
	
	public void driverwaits() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// To close the browser
	public void quit() {
		driver.quit();
	}

}
