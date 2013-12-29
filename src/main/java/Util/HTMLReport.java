package Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Core.Page;

public class HTMLReport extends Page {

	public static String testStartTime = now("hh:mm:ss").toString();
	public static String RUN_DATE = now("dd.MMMMM.yyyy").toString();
	public static String sTestname;
	public static String filename = System.getProperty("user.dir")+"\\target\\Reports.html";
    public static String mailscreenshotpath;
	public static void HTMLReports() {
		
			
		
		FileWriter fstream =null;
		BufferedWriter out =null;
		try
		{
		fstream = new FileWriter(filename);
	    out = new BufferedWriter(fstream);

	   
	   
	   
	   //String ENVIRONMENT = env;//SeleniumServerTest.ConfigurationMap.getProperty("environment");
	   //String RELEASE = rel;//SeleniumServerTest.ConfigurationMap.getProperty("release");
	   
	   out.newLine();
	 
	   out.write("<html>\n");
	   out.write("<HEAD>\n");
	   out.write(" <TITLE>Automation Test Results by QA Team</TITLE>\n");
	    out.write("</HEAD>\n");
	    
	    out.write("<body>\n");
	    out.write("<table  border=0 cellspacing=0 cellpadding=0 >\n");
	    out.write("<tr>\n");
	    
	   out.write("<td width=150 align=left><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75> <img src='C:\\Abdulkadirkhan1\\report.jpg' align=right></img></td>\n"); 
	    
	        
	    out.write("</tr>\n");
	    
	    out.write("</table>\n");
	    out.write("<h2 align=center><FONT COLOR=660066 FACE=AriaL SIZE=6><b>Automation Test Results</b></h2>\n");
	    //-------------------------------------      
	    out.write("<h4> <FONT COLOR=660000 FACE= Arial  SIZE=4.5> <u>"+"SuiteName"+" Report :</u></h4>\n");
        out.write("<table  border=1 cellspacing=1 cellpadding=1 width=100%>\n");
    	//out.write("<tr>\n");
        out.write("<td width=10%  align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>Test Script#</b></td>\n");

        out.write("<td width=40% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>Test Case Name</b></td>\n");
        out.write("<td width=10% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>Status</b></td>\n");
        out.write("<td width=20% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>Run Start Time</b></td>\n");
        out.write("<td width=20% align= center  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2><b>Run End Time</b></td>\n");

        out.write("</tr>\n");
        
        
	    //-----------------------------
        
        out.write("</table>\n");
        out.write("</body>\n");
        out.write("</html>\n");
        out.close();
 	    
        
        //------------------------------
	    
	    
		}
		
		catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		
		}finally{
		    	
			    fstream=null;
			    out=null;
		    }
	}
	//-------------------------------------------------------------------
	public static void AddIndividualReport(String TestPath, String Testname)
	{
		FileWriter fstream =null;
		BufferedWriter out =null;
		try
		{
		fstream = new FileWriter(TestPath);
		out = new BufferedWriter(fstream);
		out.write("<html>");
		out.write("<head>");
		out.write("<title>");
		out.write(Testname + " Detailed Reports");
		out.write("</title>");
		out.write("</head>");
		out.write("<body>");
	
	
	out.write("<h4> <FONT COLOR=660000 FACE=Arial SIZE=4.5>" +Testname + " Detailed Report :</h4>");
 	 out.write("<table  border=1 cellspacing=1    cellpadding=1 width=100%>");
 	 out.write("<tr> ");
        //out.write("<td align=center width=10%  align=center bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2><b>Step/Row#</b></td>");
        out.write("<td align=center width=60% align=center bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2><b>Description</b></td>");
        out.write("<td align=center width=10% align=center bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2><b>Keyword</b></td>");
        out.write("<td align=center width=15% align=center bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2><b>Result</b></td>");
 		out.write("<td align=center width=15% align=center bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2><b>Screen Shot</b></td>");
 	 out.write("</tr>");
 	 out.write("</table>\n");
     out.write("</body>\n");
     out.write("</html>\n");
     out.close();
		}
		catch(Throwable t)
		{
			
		}
	}
	
	/*
	public static String returntestname(String testname)
	{
		sTestname = testname;
		return sTestname;
	}
	*/
	
	//------------------------------------------------------------------------------------
	public static void AddIndividualReportSteps(String testCaseName,String Description,String Keyword,String status)
	{
		String STestName = System.getProperty("user.dir")+"\\target\\"+testCaseName+".html";
		
	//  returntestname(STestName);
		
		FileWriter fstream =null;
		BufferedWriter out =null;
		try
		{	
			fstream = new FileWriter(STestName, true);
			out = new BufferedWriter(fstream);
			out.write("<table  border=1 cellspacing=1    cellpadding=1 width=100%>");
		 	 out.write("<tr> ");
			//out.write("<td align=center width=10%><FONT COLOR=#153E7E FACE=Arial SIZE=1><b>&nbsp;</b></td>");
			 out.write("<td align=center width=60%><FONT COLOR=#153E7E FACE=Arial SIZE=1><b>"+Description+"</b></td>");
			 out.write("<td align=center width=10%><FONT COLOR=#153E7E FACE=Arial SIZE=1><b>"+Keyword+"</b></td>");
			 if(status == "Pass"){
 			     out.write("<td width=15% align= center  bgcolor=#BCE954><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+"Pass"+"</b></td>\n");
 			    out.write("<td align=center width=15%><FONT COLOR=#153E7E FACE=Arial SIZE=1><b>&nbsp;</b></td>");	 
 			     out.write("</tr>");
	 			out.write("</table>\n");
	 		     out.write("</body>\n");
	 		     out.write("</html>\n");
	 		     out.close();
	 		     
 			}else if(status == "Fail")
 			{
 				
			  	 out.write("<td width=15% align= center  bgcolor=Red><FONT COLOR=#153E7E FACE= Arial  SIZE=2><b>"+"Fail"+"</b></td>\n");
			  	 captureScreenshot();
			  	if(mailscreenshotpath != null){
			  		String sspath = mailscreenshotpath;

		 			 out.write("<td align=center width=15%><FONT COLOR=#153E7E FACE=Arial SIZE=1><b><a href="+sspath+" target=_blank>Screen Shot</a></b></td>");
		 			out.write("</tr>");
		 			out.write("</table>\n");
		 		     out.write("</body>\n");
		 		     out.write("</html>\n");
		 		     out.close();
		 			 }
		 			
			}
		}
		catch(Throwable t)
		{
			
		}
		
	
	}
	
	//------------------------------------------------------------------------------------
	
	public static void captureScreenshot() {
		
		 Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //4
		  int year = cal.get(Calendar.YEAR); //2013
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		
		
	
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	    	mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	   
	}
	
	
	//------------------------------------------------------------------------
	
	// returns current date and time
	public static String now(String dateFormat) {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	    //System.out.println("this is the localhost ip"+Handeler());
	    //System.out.println("this is the localhost newip"+localhost_IP);
	//  System.out.println("Bhai ye hi hai apna IP"+TestConfig.attachmentName);
	  
	    return sdf.format(cal.getTime());
	    
	}
	
	public static void LogResult(String Step, String TestName, String Status, String startTime, String endTime)
		{
		    //String STestName = System.getProperty("user.dir")+"\\target\\"+TestName+".html";
		   // String STestName = "C:\\Abdul kadir khan1\\Selenium Architecture\\WorkSpace\\MavenSaleForcePageFactories\\target\\"+TestName+".html";
		   
		    FileWriter fstream =null;
			BufferedWriter out =null;
			try
			{
			fstream = new FileWriter(filename, true);
			
		    out = new BufferedWriter(fstream);
		    out.write("<table  border=1 cellspacing=1 cellpadding=1 width=100%>\n");
		    out.write("<tr>\n");
	        out.write("<td align=center width=10%  align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+Step+"</b></td>");
	        //out.write("<td align=center width=40% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+TestName+"</b></td>");
	        out.write("<td align=center width=40% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b><a href="+TestName+".html target="+"_blank"+">"+TestName+"</a></td>");
	        if (Status == "Fail"){
	        out.write("<td align=center width=10% align=center bgcolor=Red><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+Status+"</b></td>");
	        }
	        else
	        {
	        	out.write("<td align=center width=10% align=center bgcolor=#BCE954><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+Status+"</b></td>");
	        }
	        out.write("<td align=center width=20% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+startTime+"</b></td>");
	 		out.write("<td align=center width=20% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+endTime+"</b></td>");
	 		out.write("</tr>\n");
	 	 out.write("</table>\n");
	     out.write("</body>\n");
	     out.write("</html>\n");
	     out.close();
	     
	     
			}
			catch(Throwable t)
			{
				
			}	
	}
		public static void EndTimeReport()
		{
			
			FileWriter fstream =null;
			BufferedWriter out =null;
			
			String ENDTIME = now("hh:mm:ss").toString();
			
			    try
				{
				fstream = new FileWriter(filename, true);
				
			    out = new BufferedWriter(fstream);

			    
			    out.write("<table  border=1 cellspacing=1 cellpadding=1 >\n");
			    		          
			    out.write("<tr>\n");
                out.write("<h4> <FONT COLOR=660000 FACE=Arial SIZE=4.5> <u>Test Executive Summary :</u></h4>\n");
			          //out.write("<h4> <FONT COLOR=660000 FACE= Arial  SIZE=4.5> <u>"+"SuiteName"+" Report :</u></h4>\n");
			    out.write("<td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75><b>Run Date</b></td>\n");
			    out.write("<td width=150 align=left><FONT COLOR=#153E7E FACE=Arial SIZE=2.75><b>"+RUN_DATE+"</b></td>\n");
			    out.write("</tr>\n"); 
			    out.write("<tr>\n");
			  //  out.newLine();
			 
			    out.write("<tr>\n");			    
		        out.write("<td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75><b>Run StartTime</b></td>\n");
                out.write("<td width=150 align=left><FONT COLOR=#153E7E FACE=Arial SIZE=2.75><b>"+testStartTime+"</b></td>\n");
		        out.write("</tr>\n");

			    out.write("<tr>\n");
				   // out.newLine();   
				        out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Run EndTime</b></td>\n");
				          out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>"+ENDTIME+"</b></td>\n");
				    out.write("</tr>\n");

			    
			          out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Environment</b></td>\n");
			          out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>"+"ENVIRONMENT"+"</b></td>\n");
			    out.write("</tr>\n");
			    out.write("<tr>\n");
			          
			          out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Release</b></td>\n");
			          out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>"+"RELEASE"+"</b></td>\n");
			    out.write("</tr>\n");

			    out.write("</table>\n");

			    
			    //---------------------------
				     out.write("</body>\n");
				     out.write("</html>\n");
				     out.close();
				    
				}
				catch(Throwable t)
				{
					
				}
			    
			    
		}

}
