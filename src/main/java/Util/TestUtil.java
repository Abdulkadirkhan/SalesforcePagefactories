package Util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Core.Page;

public class TestUtil extends Page{
	
	public static String mailscreenshotpath;
	
	
	//Validating if the Run mode in Excel file is set as Yes or No
		public static boolean isExecutable(String tcid, Xls_Reader excel){
			
			for(int rowNum=2; rowNum<=excel.getRowCount("test_suite"); rowNum++){
				if(excel.getCellData("test_suite","TCID", rowNum).equals(tcid)){
					if(excel.getCellData("test_suite","Runmode", rowNum).equalsIgnoreCase("Y")){
						return true;
					}
					else{
						return false;
					}
						
				}
			}
			return false;
		}
		
		
		//TestNG Parameterization
		
		public static Object[][] getData(String testName,Xls_Reader excel){
			
			/*
			 * this will tell you where the test starts from
			 */
			int testCaseStartIndex=0;
			for(int rNum=1;rNum<=excel.getRowCount("test data"); rNum++){
			if(testName.equals(excel.getCellData("test data", 0, rNum))){
			testCaseStartIndex=rNum;
			break;
			} }

			System.out.println("Test Starts from - "+testCaseStartIndex);

			/*
			 * Logic for finding total number of cols in each testcase
			 * 
			 */
			int colStartIndex = testCaseStartIndex+1;
			int cols=0;
			while(!excel.getCellData("test data", cols, colStartIndex).equals("")){

			cols++;
			}
			System.out.println("Total cols are : "+cols);
			
			/*
			 * 
			 * Logic for finding total number of rows in each testcase
			 * 
			 */
			int dataStartIndex = testCaseStartIndex+2;
			int rows=0;
			while(!excel.getCellData("test data", 0, (dataStartIndex+rows)).equals("")){
			rows++;
			}

			System.out.println("Total rows are : "+rows);
			
			/*
			 * 
			 * Print data from the test case
			 * 
			 * 
			 */
			
			Object[][] data = new Object[rows][1];
			Hashtable<String, String> table = null;
			for(int rNum=dataStartIndex; rNum<(dataStartIndex+rows);rNum++){
			table = new Hashtable<String, String>();
			for(int cNum=0; cNum<cols; cNum++){
			table.put(excel.getCellData("test data", cNum, colStartIndex), excel.getCellData("test data", cNum, rNum));
			//System.out.print(excel.getCellData("test data", cNum, rNum)+"---");

			}
			data[rNum-dataStartIndex][0]=table;


			}
			System.out.println(); // Debug at this point
			return data;

			
			
		}
		
		
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
		
		// make zip of reports
		public static void zip(String filepath){
		 	try
		 	{
		 		File inFolder=new File(filepath);
		 		File outFolder=new File("Reports.zip");
		 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
		 		BufferedInputStream in = null;
		 		byte[] data  = new byte[1000];
		 		String files[] = inFolder.list();
		 		for (int i=0; i<files.length; i++)
		 		{
		 			in = new BufferedInputStream(new FileInputStream
		 			(inFolder.getPath() + "/" + files[i]), 1000);  
		 			out.putNextEntry(new ZipEntry(files[i])); 
		 			int count;
		 			while((count = in.read(data,0,1000)) != -1)
		 			{
		 				out.write(data, 0, count);
		 			}
		 			out.closeEntry();
	  }
	  out.flush();
	  out.close();
		 	
	}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  } 
	 }	
		
		// returns current date and time
		public static String now(String dateFormat) {
		    Calendar cal = Calendar.getInstance();
		    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		  
		    return sdf.format(cal.getTime());
		    
		}
		
		
         
}



