package ScreenshootAndCalender;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverInitilization {

	private static WebDriver driver = null;
	private static final String URL = "http://facebook.com";
	private static final String alertURL = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	private static final String calender = "https://www.hotels.com";
	private static final String autoComplete = "https://www.expedia.com";
	private static final String hoverOver = "https://dhtmlx.com";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		getDriver().manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

}
