package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	WebDriver driver;

	public ScreenShot(WebDriver driver) {
		this.driver = driver;
	}
	// To take screenshot

	public void takeSnapShot(String path) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File Source = screenshot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(Source, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
