package Testcases;

import org.testng.annotations.BeforeSuite;

import Util.HTMLReport;

public class BegainingTestSuite {
	String STestName1 = System.getProperty("user.dir")+"\\target\\"+"LoginTest"+".html";
	String STestName2 = System.getProperty("user.dir")+"\\target\\"+"ImportContactTest"+".html";
	String STestName3 = System.getProperty("user.dir")+"\\target\\"+"ChatterTest"+".html";
	
	@BeforeSuite
	public void loadReports()
	{
		HTMLReport.HTMLReports();
		HTMLReport.AddIndividualReport(STestName1,"LoginTest" );
		HTMLReport.AddIndividualReport(STestName2,"ImportContactTest" );
		HTMLReport.AddIndividualReport(STestName2,"ChatterTest" );
	}

}
