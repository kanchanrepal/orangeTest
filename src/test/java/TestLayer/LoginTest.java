package TestLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
public class LoginTest extends BaseClass{
	HomePage homepage;
	LoginPage loginpage;
	
	//it call  super call constructor
	public LoginTest() throws FileNotFoundException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException
	{
		initialization();
		try {
			loginpage =new LoginPage();
			
		    } catch (IOException e) {
			e.printStackTrace();
		  }
		
	}
	
	@Test
	 public void LoginPageFunctionality() throws IOException {
			
		   homepage = loginpage.LoginPageFunctionality(prop.getProperty("username"),prop.getProperty("password"));
			
			
		}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
    

}
