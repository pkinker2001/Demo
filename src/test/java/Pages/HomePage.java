package Pages;

import org.openqa.selenium.By;

public class HomePage {
	
	public static By homepageTitle = By.xpath("//span[text()='Home Page']");
	public static By signInLink = By.xpath("//a[contains(text(),'Sign In')]");
	public static By createAccountLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Create an Account')]");	
}
