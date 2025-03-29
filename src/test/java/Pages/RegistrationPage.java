package Pages;

import org.openqa.selenium.By;

public class RegistrationPage {

	public static By createAccountPageTitle = By.xpath("//span[text()='Create New Customer Account']");
	public static By firstNameInput = By.xpath("//input[@id='firstname']");
	public static By lastNameInput = By.xpath("//input[@id='lastname']");
	public static By emailInput = By.xpath("//input[@id='email_address']");
	public static By passwordInput = By.xpath("//input[@id='password']");
	public static By confirmPassInput = By.xpath("//input[@id='password-confirmation']");
	public static By createAccountBtn = By.xpath("//button[@title='Create an Account']");

	public static By inputField(String fieldName) {
		return By.xpath("//input[@id='" + fieldName + "']");
	}

	public static By alertMsg = By.xpath("//div[contains(text(),'There is already an account with this email address.')]");
	public static By regSuccessMsg = By.xpath("//div[contains(text(),'Thank you for registering with Main Website Store')]");
}
