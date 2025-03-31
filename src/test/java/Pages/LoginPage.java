package Pages;

import org.openqa.selenium.By;

public class LoginPage {

	public static By customerLoginPageTitle = By.xpath("//span[text()='Customer Login']");
	public static By emailInput = By.xpath("//input[@id='email']");
	public static By passwordInput = By.xpath("//input[@id='pass']");
	public static By signInBtn = By.xpath("//button[@id='send2']");
	public static By alert = By.xpath("//div[@role='alert']");
	public static By errorMsg = By.xpath("//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']");
	public static By invalidEmailMsg = By.xpath("//div[text()='Please enter a valid email address (Ex: johndoe@domain.com).']");
	public static By emailErrorMsg = By.xpath("//div[@id='email-error']");
	public static By passErrorMsg = By.xpath("//div[@id='pass-error']");
}

