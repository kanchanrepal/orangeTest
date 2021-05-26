package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import UtilLayer.WebEventListner;

public class BaseClass {
	
	public static WebDriver  driver;
	public static Properties prop;
	public static WebEventListner listener;
	public static EventFiringWebDriver eventDriver;
	public BaseClass() throws FileNotFoundException {
		 prop=new Properties();
		 try {
			
			FileInputStream fis=new FileInputStream("C:\\Users\\Sarang-PC\\eclipse-workspace\\com.orangeHRMHybrid.com\\src\\main\\java\\ConfigLayer\\config.Properties");
			
				prop.load(fis);
			   } catch (IOException e) 
		       {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
		 
	}
	
	public static void initialization() throws FileNotFoundException 
	{
	   String browsername=prop.getProperty("browser");   //read the  properties
	   if(browsername.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   
		   
	   }
	   else if(browsername.equals("edge"))
	   {
		   System.setProperty("webdriver.edge.driver","");
		   driver=new EdgeDriver();
 
	   }
	   else if(browsername.equals("firefox"))
	   {
		   System.setProperty("webdriver.firefox.driver","");
		   driver=new FirefoxDriver();
		   
	   }
	   
	
		 listener=new WebEventListner();
		 EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
		 eventDriver.register(listener);
		 driver=eventDriver;
		 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url")); //path of proprties fie
	
    
	
	

}
    

}
