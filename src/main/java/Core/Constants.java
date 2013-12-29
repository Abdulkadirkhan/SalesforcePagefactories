package Core;

public class Constants {
	
	//Report Files
	public static String LoginTest = System.getProperty("user.dir")+"\\target\\LoginTest.html";
	
	
	//Config Properties
	
	public static final String browser = "firefox";
	public static final String testsite = "https://login.salesforce.com";
	
	//Object Repository
	
	//LoginPage
	public static final String username = "//*[@id='usernam']";
	public static final String password = "//*[@id='password']";
	public static final String login = "//*[@id='Login']";
	
	//LandingPage
	public static final String taketour = "//*[@id='layout']/div[2]/div[2]/div/ul/li[1]/a";
	public static final String ImportContact = "//*[@id='layout']/div[2]/div[2]/div/ul/li[2]/a";
	
	//TopNavigation
	public static final String contacts = "//*[@id='Contact_Tab']/a";
	public static final String accounts = "//*[@id='Contact_Tab']/a";
	public static final String chatter = "//*[@id='Chatter_Tab']/a";
	public static final String home = "//*[@id='01r90000000fK1O_Tab']/a";
	
	//ChatterPage
	public static final String addcomment = "//*[@id='publishereditablearea']";
	public static final String sharebutton = "//*[@id='publishersharebutton']";
	public static final String clickcomment = "//*[@title='Comment on this post']";
	public static final String writecommentoncomment = "//*[@id='ext-gen6']";
	public static final String sharecommentoncomment = "//*[@id='ext-gen3']";
	

}
