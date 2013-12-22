
package Util;

public class TestConfig{


	
	public static String server="smtp.gmail.com";
	public static String from = "selenium4fun@gmail.com";
	public static String password = "passwordseleniu";
	public static String[] to ={"abdulkadir786@gmail.com"};
	public static String subject = "Test Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath=System.getProperty("user.dir")+"\\Reports.zip";
	public static String attachmentName="Reports.zip";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "pas";
	public static String mysqlurl = "jdbc:mysql://192.20.4.3/monitor_dm";
	
	
	
	
	
	
	
	
	
}
