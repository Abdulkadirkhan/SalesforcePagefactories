package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Core.Constants;

public class ChatterPage {
	
	@FindBy(xpath=Constants.addcomment)
	public WebElement addcomment;
	
	@FindBy(xpath=Constants.sharebutton)
	public WebElement sharebutton;
	
	//@FindBy(xpath="//*[@title='Comment on this post']")
	//public WebElement clickcomment;
	
	@FindBy(xpath=Constants.clickcomment)
    List<WebElement> clickcomment;
	
	@FindBy(xpath=Constants.writecommentoncomment)
	public WebElement writecommentoncomment;
	
	@FindBy(xpath=Constants.sharecommentoncomment)
	public WebElement sharecommentoncomment;
	
	
	
	
	
	
	public void postcomments(String comment)
	{
		addcomment.sendKeys(comment);
		sharebutton.click();
	}
	
	public void commentoncomment(String comment)
	{

		int total = clickcomment.size();
		int last = total-1;
		clickcomment.get(last).click();
		writecommentoncomment.sendKeys(comment);
		sharecommentoncomment.click();
		
	}
	
}
