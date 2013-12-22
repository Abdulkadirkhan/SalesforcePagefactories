package Testcases;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.mail.MessagingException;

import org.testng.annotations.AfterSuite;

import Core.Page;
import Util.HTMLReport;
import Util.TestConfig;
import Util.TestUtil;

public class EndingTestSuite {
	
	
	@AfterSuite
	public void finaltest()
	{
		//Reporting End Time of Report
		HTMLReport.EndTimeReport();    
		    
		
		//Making Zip Folder of screenshots
		TestUtil.zip(System.getProperty("user.dir")+"\\screenshots");
		
		
		//Sending Mail to gmail
		try {
			Page.mail.sendMail(TestConfig.server,TestConfig.from,TestConfig.to,TestConfig.subject, TestConfig.messageBody,TestConfig.attachmentPath,TestConfig.attachmentName);
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
