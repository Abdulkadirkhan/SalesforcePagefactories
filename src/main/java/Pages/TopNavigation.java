package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Constants;
import Core.Page;

public class TopNavigation {

	@FindBy(xpath=Constants.contacts)
	public WebElement contacts;
	
	@FindBy(xpath=Constants.accounts)
	public WebElement accounts;
	
	@FindBy(xpath=Constants.chatter)
	public WebElement chatter;
	
	@FindBy(xpath=Constants.home)
	public WebElement home;
	
	public void gotocontacts()
	{
		contacts.click();
	}
	
	public void gotoaccounts()
	{
		accounts.click();
	}
	
	public ChatterPage gotochatter()
	{
		chatter.click();
		
		return PageFactory.initElements(Page.driver, ChatterPage.class);
	}
	
	//Getting Started Tab
	public LandingPage gotohome()
	{
		home.click();
		return PageFactory.initElements(Page.driver,LandingPage.class);
	}
	
}
