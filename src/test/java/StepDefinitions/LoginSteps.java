package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.DriverManager;
import Utils.Utility;
import io.cucumber.java.en.*;

public class LoginSteps{
	
	private WebDriver driver = DriverManager.getDriver();
	
	@When("the user clicks on the Sign in link")
	public void the_user_clicks_on_the_sign_in_link() {
		driver.findElement(HomePage.signInLink).click();
	}

	@Then("the user should be redirected to the Sign In page")
	public void the_user_should_be_redirected_to_the_sign_in_page() {
		driver.findElement(LoginPage.customerLoginPageTitle).isDisplayed();
	}

	@When("the user enters the username and password")
	public void the_user_enters_the_username_and_password() throws IOException {
		String Username = Utility.readPropertiesFile().getProperty("username");
		String Password = Utility.readPropertiesFile().getProperty("password");
		driver.findElement(LoginPage.emailInput).sendKeys(Username);
		driver.findElement(LoginPage.passwordInput).sendKeys(Password);
	}
	
	@When("the user enters the invalid credentials")
	public void the_user_enters_the_invalid_credentials() throws IOException {
		String Username = Utility.readPropertiesFile().getProperty("username");
		String Password = "Pass";
		driver.findElement(LoginPage.emailInput).sendKeys(Username);
		driver.findElement(LoginPage.passwordInput).sendKeys(Password);
	}
	
	@When("the user enters the invalid email")
	public void the_user_enters_the_invalid_email() throws IOException {
		String Username = "rk1986";
		String Password = "Pass";
		driver.findElement(LoginPage.emailInput).sendKeys(Username);
		driver.findElement(LoginPage.passwordInput).sendKeys(Password);
	}

	@When("the user clicks on the Sign in button")
	public void the_user_clicks_on_the_sign_in_button() {
		driver.findElement(LoginPage.signInBtn).click();
	}
	
	@When("the user should see the error message")
	public void the_user_should_see_the_error_message() throws IOException, InterruptedException {
		Thread.sleep(10);
		Assert.assertTrue(driver.findElement(LoginPage.errorMsg).isDisplayed());
	}
	
	@When("the user should see the invalid email error message")
	public void the_user_should_see_the_invalid_email_error_message() throws IOException, InterruptedException {
		Thread.sleep(10);
		Assert.assertTrue(driver.findElement(LoginPage.emailErrorMsg).isDisplayed());
	}


}
