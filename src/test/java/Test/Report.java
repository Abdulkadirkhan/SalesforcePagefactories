package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;

import Util.TestUtil;

public class Report {
public static String filename;
	public static void main(String[] args) {
		
			
		
		filename = System.getProperty("user.dir")+"\\target\\Reports.html";
		FileWriter fstream =null;
		BufferedWriter out =null;
		try
		{
		fstream = new FileWriter(filename);
	    out = new BufferedWriter(fstream);

	   String RUN_DATE = TestUtil.now("dd.MMMMM.yyyy").toString();
	   
	   //String ENVIRONMENT = env;//SeleniumServerTest.ConfigurationMap.getProperty("environment");
	   //String RELEASE = rel;//SeleniumServerTest.ConfigurationMap.getProperty("release");
	   
	   out.newLine();
	 
	   out.write("<html>\n");
	   out.write("<HEAD>\n");
	   out.write(" <TITLE>ClearMetrix 3.0 Automation Test Results by QA Team</TITLE>\n");
	    out.write("</HEAD>\n");
	    
	    out.write("<body>\n");
	    out.write("<table  border=0 cellspacing=0 cellpadding=0 >\n");
	    out.write("<tr>\n");
	    
	   out.write("<td width=150 align=left><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75> <img src='cm_logo.png' align=right></img></td>\n"); 
	    
	        
	    out.write("</tr>\n");
	    
	    out.write("</table>\n");
	    out.write("<h2 align=center><FONT COLOR=660066 FACE=AriaL SIZE=6><b>Automation Test Results</b></h2>\n");
	    
	    
	    out.write("<table  border=1 cellspacing=1 cellpadding=1 >\n");
	    out.write("<tr>\n");
	  
	    		
	          out.write("<h4> <FONT COLOR=660000 FACE=Arial SIZE=4.5> <u>Test Details :</u></h4>\n");
	          out.write("<td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75><b>Run Date</b></td>\n");
	          out.write("<td width=150 align=left><FONT COLOR=#153E7E FACE=Arial SIZE=2.75><b>"+RUN_DATE+"</b></td>\n");
	    out.write("</tr>\n");
	    out.write("<tr>\n");
	          
	          out.write("<td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Arial SIZE=2.75><b>Run StartTime</b></td>\n");

	          out.write("<td width=150 align=left><FONT COLOR=#153E7E FACE=Arial SIZE=2.75><b>"+"testStartTime"+"</b></td>\n");
	    out.write("</tr>\n");
	    out.write("<tr>\n");
	   // out.newLine();   
	          out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Run EndTime</b></td>\n");
	          out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>END_TIME</b></td>\n");
	    out.write("</tr>\n");
	    out.write("<tr>\n");
	  //  out.newLine();
	        
	          out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Environment</b></td>\n");
	          out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>"+"ENVIRONMENT"+"</b></td>\n");
	    out.write("</tr>\n");
	    out.write("<tr>\n");
	          
	          out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Arial  SIZE=2.75><b>Release</b></td>\n");
	          out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Arial  SIZE=2.75><b>"+"RELEASE"+"</b></td>\n");
	    out.write("</tr>\n");

	    out.write("</table>\n");
	  //-------------------------------------      
	    out.write("<h4> <FONT COLOR=660000 FACE= Arial  SIZE=4.5> <u>"+"suiteName"+" Report :</u></h4>\n");
        out.write("<table  border=1 cellspacing=1 cellpadding=1 width=100%>\n");
    	out.write("<tr>\n");
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
        
        LogResult("1","SampleTest","Pass","Starttime","EndTime");
 	    
        
        //------------------------------
	   // out.close();
	    
		}
		
		catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		
		}finally{
		    	
			    fstream=null;
			    out=null;
		    }
		
		
		
	}
	
	public static void LogResult(String Step, String TestName, String Status, String StartTime, String EndTime)
	{
		
		FileWriter fstream =null;
		BufferedWriter out =null;
		try
		{
		fstream = new FileWriter(filename, true);
		
	    out = new BufferedWriter(fstream);
	    out.write("<table  border=1 cellspacing=1 cellpadding=1 width=100%>\n");
	    out.write("<tr>\n");
        out.write("<td align=center width=10%  align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+Step+"</b></td>");
        out.write("<td align=center width=40% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+TestName+"</b></td>");
        out.write("<td align=center width=10% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+Status+"</b></td>");
        out.write("<td align=center width=20% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+StartTime+"</b></td>");
 		out.write("<td align=center width=20% align=center ><FONT COLOR=#153E7E FACE=Arial SIZE=2><b>"+EndTime+"</b></td>");
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
	
	public static void detailedreport()
	{
		
	}

}
