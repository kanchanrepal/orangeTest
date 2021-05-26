package TestLayer;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import junit.framework.Assert;

public class HomePageTest extends BaseClass{
   LoginPage loginpage;
   public HomePage homepage;
	
	public HomePageTest() throws FileNotFoundException {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws FileNotFoundException 
	{
		initialization();
		try {
			LoginPage loginpage=new LoginPage();
			homepage=new HomePage();
			homepage=loginpage.LoginPageFunctionality(prop.getProperty("username"),prop.getProperty("password"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
    }
	
	@Test (priority = 1)
	public void VerifyLogo()
	{
	   boolean actualLogo=homepage.VerifyLogo(); 
       Assert.assertTrue(actualLogo);
	   
	}
	@Test (priority = 2)
	public void VerifyTitle()
	{
		String actualtitle=homepage.VerifyTitle();
	//	String expectedtitle="OrangeHRM";
		Assert.assertEquals(actualtitle,"OrangeHRM");
	}
	
	
	@AfterMethod
	public void  tearDown()
	{
		driver.close();
		
	}
	
	
	
}
