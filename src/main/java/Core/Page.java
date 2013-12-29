package Core;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.TopNavigation;
import Util.HTMLReport;
import Util.Xls_Reader;
import Util.monitoringMail;

public class Page {
	
	public static WebDriver driver;
	public static String filename = System.getProperty("user.dir")+"\\target\\Reports.html";
	
	public static Xls_Reader excel = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\resources\\testdata.xlsx");;
	public static TopNavigation topmenu = null;
	public static monitoringMail mail = null;
	public static HTMLReport Report = null;
	public static Logger app_logs = Logger.getLogger("devpinoyLogger");
	
	public static void initconfigration()
	{
			
					
			if(driver == null){
				
				
				if(Constants.browser.equals("firefox")){
					
					driver = new FirefoxDriver();
				}
				else if(Constants.browser.equals("ie")){
					
					System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					
					
				}else if(Constants.browser.equals("chrome")){
					
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					driver = new ChromeDriver();
				}
				
				driver.get(Constants.testsite);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(25L, TimeUnit.SECONDS);
		
			topmenu = PageFactory.initElements(driver, TopNavigation.class);
			mail = PageFactory.initElements(driver, monitoringMail.class);
			Report = PageFactory.initElements(driver, HTMLReport.class); 
			
		}
			
		
	}

}
