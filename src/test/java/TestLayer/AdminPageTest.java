package TestLayer;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.AdminPage;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import UtilLayer.ActionClassMethod;
import UtilLayer.UtilClass;

public class AdminPageTest extends BaseClass{
	
	LoginPage loginpage;
	HomePage homepage;
	AdminPage adminpage;
 	ActionClassMethod actionclassmethod;
 	public static UtilClass utilclass;
	
	public AdminPageTest() throws FileNotFoundException 
	{
		super();
		
	}
    
	@BeforeClass
	public void setup() throws IOException
	{
      initialization();
    
	    loginpage=new LoginPage();

        homepage=new HomePage();
        adminpage=new AdminPage();
        actionclassmethod=new ActionClassMethod();
        homepage=loginpage.LoginPageFunctionality(prop.getProperty("username"),prop.getProperty("password"));

	}
	
	@Test(priority=1)
	public void adminVerify() throws InterruptedException, IOException
	{
		adminpage.adminbtn();
			
		
	}
	@Test(priority = 2)
	public void userinfoVerify() throws InterruptedException
	{  
		
		Thread.sleep(2000);
	   //employee_name
        String  new_user="David_Morris"+Math.random();

		adminpage.userinfoEnter("Admin","David_Morris",new_user,"Enabled", "kanchan@1234", "kanchan@1234");
		
    }
	

		
	@AfterClass
	public void teardown()
	{
		driver.close();
		
	}
		
}



















