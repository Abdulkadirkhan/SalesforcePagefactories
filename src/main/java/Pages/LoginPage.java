package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Constants;
import Core.Page;

public class LoginPage extends Page {

	
	@FindBy(xpath=Constants.username)
	public WebElement username;
	
	@FindBy(xpath=Constants.password)
	public WebElement password;
	
	@FindBy(xpath=Constants.login)
	public WebElement signin;
	
	public LandingPage dologin(String Username, String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		signin.click();
		
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public static String ValidateTitle(){
		
		return driver.getTitle();
	
}
}
