package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.github.javafaker.Faker;

import Pages.HomePage;
import Pages.RegistrationPage;
import Utils.DriverManager;
import Utils.ReadExcel;
import io.cucumber.java.en.*;

public class RegistrationSteps{
	
	private WebDriver driver;
	

	@Given("the user is on the Magento website")
	public void the_user_is_on_the_magento_website() {
		driver= DriverManager.getDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@When("the user clicks on the create account link")
	public void the_user_clicks_on_the_link() {
		driver.findElement(HomePage.createAccountLink).click();
	}

	@Then("the user should be redirected to the create account page")
	public void the_user_should_be_redirected_to_the_page() {
		Assert.assertTrue(driver.findElement(RegistrationPage.createAccountPageTitle).isDisplayed());
	}

	@When("the user fills in the generated details")
	public void the_user_fills_in_the_generated_details() throws IOException {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String email = faker.internet().emailAddress();
        String pass = faker.internet().password(8,10, true, true, true);
		driver.findElement(RegistrationPage.firstNameInput).sendKeys(firstName);
		driver.findElement(RegistrationPage.lastNameInput).sendKeys(lastName);
		driver.findElement(RegistrationPage.emailInput).sendKeys(email);
		driver.findElement(RegistrationPage.passwordInput).sendKeys(pass);
		driver.findElement(RegistrationPage.confirmPassInput).sendKeys(pass);
		System.out.println(firstName+" "+lastName+" "+email+" "+pass);
		ReadExcel.writeTheUserDetails( firstName, lastName, email, pass);
	}

	@When("the user clicks on the submit button")
	public void the_user_clicks_on_the_submit_button() {
		driver.findElement(RegistrationPage.createAccountBtn).click();
	}

	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
		Assert.assertTrue(driver.findElement(HomePage.homepageTitle).isDisplayed());
	}
	
	@Then("the user should be successfully registered")
	public void the_user_should_be_successfully_registered() {
		Assert.assertTrue(driver.findElement(RegistrationPage.regSuccessMsg).isDisplayed());
	}



}
