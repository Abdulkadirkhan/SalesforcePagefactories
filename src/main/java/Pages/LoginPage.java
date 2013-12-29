package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Constants;
import Core.Keywords;
import Core.Page;

public class LoginPage extends Page {

	
	//@FindBy(xpath=Constants.username)
	//public WebElement username;
	
	@FindBy(xpath=Constants.password)
	public WebElement password;
	
	@FindBy(xpath=Constants.login)
	public WebElement signin;
	
	public LandingPage dologin(String Username, String Password)
	{
		//username.sendKeys(Username);
		Keywords.EditBox(Constants.username, Username);
		//password.sendKeys(Password);
		Keywords.EditBox(Constants.password, Password);
		//signin.click();
		Keywords.Click(Constants.login);
		
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public static String ValidateTitle(){
		
		return driver.getTitle();
	
}
}
