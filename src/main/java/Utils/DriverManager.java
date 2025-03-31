package Utils;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class DriverManager {

	private static WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	public DriverManager() {
	};

	public static WebDriver getDriver() {
		if (driver == null) {
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized");
		 driver = new ChromeDriver(options);
		}
		return driver;
	}

	@After
	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void waitForElementToClickable(WebElement webElement) {
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public void waitForElementToVisible(WebElement webElement) {
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public void waitForAlertToPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
