package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;

public class DriverManager {

	private static WebDriver driver;

	private DriverManager() {
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
	public static void quitDriver() {
        if (driver != null) {
            driver.quit(); 
            driver = null; 
        }
	}
	
}
