package Core;

import org.openqa.selenium.By;

import Util.HTMLReport;


public class Keywords extends Page {
	
	
	//Keyword for EditBox
	public static void EditBox(String Keyword, String Keys)
	{
		try
		{
		driver.findElement(By.xpath(Keyword)).sendKeys(Keys);
		HTMLReport.AddIndividualReportSteps("LoginTest","Editbox Operation successful ","EditBOX","Pass");
		}
		catch(Throwable t)
		{
		HTMLReport.AddIndividualReportSteps("LoginTest","Editbox Operation not successful ","EditBOX","Fail");
			
		}
	}
	
	public static void Click(String Keyword)
	{
		try
		{
		driver.findElement(By.xpath(Keyword)).click();
		HTMLReport.AddIndividualReportSteps("LoginTest","Click Operation successful ","Click","Pass");
		}
		catch(Throwable t)
		{
			HTMLReport.AddIndividualReportSteps("LoginTest","Click Operation not successful ","Click","Fail");	
			
		}
	}

}




