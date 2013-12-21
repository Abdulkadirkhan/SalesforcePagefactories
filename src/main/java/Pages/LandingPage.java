package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Core.Constants;
import Core.Page;

public class LandingPage extends Page{
	
	@FindBy(xpath=Constants.taketour)
	public WebElement taketour;
	

	@FindBy(xpath=Constants.ImportContact)
	public WebElement Importcontact;
	
	public void taketour()
	{

		driver.switchTo().frame("itraget");
		taketour.click();
		driver.switchTo().defaultContent();
	}
	
	public void importcontact()
	{
	driver.switchTo().frame("itarget");
	Importcontact.click();
	driver.switchTo().defaultContent();
	}

}
