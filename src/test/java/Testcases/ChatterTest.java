package Testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Core.Page;
import Pages.ChatterPage;
import Pages.LandingPage;
import Util.TestUtil;

public class ChatterTest {

	@BeforeTest
	public void isSkip()
	{
		Page.initconfigration();
		  if(!TestUtil.isExecutable("ChatterTest",Page.excel)){
				
				throw new SkipException("Skipping the test case as the Run mode is not Y");
			}
		
	}
	
	@Test(dataProvider="getData")
	public void chattertest(Hashtable<String,String> data)
	{
		ChatterPage ch = Page.topmenu.gotochatter();
		//ch.postcomments(data.get("Share"));
		ch.commentoncomment(data.get("Comment"));
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		return TestUtil.getData("ChatterTest", Page.excel);
		
	}
}
