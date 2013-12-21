package Testcases;

import org.testng.annotations.BeforeSuite;

import Util.HTMLReport;

public class BegainingTestSuite {
	
	@BeforeSuite
	public void loadReports()
	{
		HTMLReport.HTMLReports();
	
	
	}

}
