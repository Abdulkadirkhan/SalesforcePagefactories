package Testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Core.Page;
import Pages.LandingPage;
import Pages.LoginPage;
import Util.TestUtil;

public class ImportContactTest {

	@BeforeTest
	public void isSkip()
	{
		Page.initconfigration();
		  if(!TestUtil.isExecutable("ImportContactTest",Page.excel)){
				
				throw new SkipException("Skipping the test case as the Run mode is not Y");
			}
		
	}
	
	@Test(dataProvider="getData")
	public void ImportContactTest(Hashtable<String,String> data)
	{
		LandingPage lp = Page.topmenu.gotohome();
		lp.importcontact();
	}
	
	@DataProvider
	public Object[][] getData(){
		
		return TestUtil.getData("ImportContactTest", Page.excel);
		
	}
}
