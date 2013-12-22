package Testcases;

import java.util.Date;
import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Core.Page;
import ErrorCollectors.ErrorCollector;
import Pages.LandingPage;
import Pages.LoginPage;
import Util.HTMLReport;
import Util.TestUtil;

public class LoginTest {
	
	
	
	@BeforeTest
	public void isSkip()
	{
		Page.initconfigration();
		
           if(!TestUtil.isExecutable("LoginTest",Page.excel)){
			
			throw new SkipException("Skipping the test case as the Run mode is not Y");
			
		}
	}
	
	@Test(dataProvider="getData")
	public void dologin(Hashtable<String,String> data)
	{
		String startTime = TestUtil.now("hh:mm:ss").toString();
		
		LoginPage page = PageFactory.initElements(Page.driver, LoginPage.class);
		page.dologin(data.get("Username"), data.get("Password"));
		ErrorCollector.verifyEquals(page.ValidateTitle(), data.get("title"));
		
		String endTime = TestUtil.now("hh:mm:ss").toString();
		HTMLReport.LogResult(data.get("serial"),data.get("TestName"),"Pass", startTime, endTime);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		return TestUtil.getData("LoginTest", Page.excel);
		
	}


}
