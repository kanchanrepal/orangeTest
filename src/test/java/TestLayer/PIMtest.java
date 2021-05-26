package TestLayer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.PIMPage;
import UtilLayer.ActionClassMethod;
import UtilLayer.ExcelReader;

public class PIMtest extends BaseClass {
	
	public PIMtest() throws FileNotFoundException {
		super();
		
	}

	HomePage homepage;
	LoginPage loginpage;
	PIMPage pimpage;
	ActionClassMethod actionclassmethod;
	ExcelReader reader;
	String csvFile="‪C:\\Users\\Sarang-PC\\Desktop\\excelfile\\fbcsv.csv";
    CSVReader csvreader;
    @BeforeClass
	public void setUp() throws IOException
	{
    	
		initialization();
		homepage=new HomePage();
		loginpage=new LoginPage();
	    actionclassmethod=new ActionClassMethod();
        loginpage.LoginPageFunctionality(prop.getProperty("username"),prop.getProperty("password"));
        pimpage=new PIMPage();
        
		
	}
	
    @Test(priority = 1,enabled = false)
    public void PIMfunverify()
    {
    	pimpage.PIMfun();
    }
	@Test
    public void DataimportVerify() throws FileNotFoundException
    {
    	pimpage.Dataimportfun();
               
       
    }
    
    @AfterClass
    public void tearDown()
    {
    	driver.close();
    }
    
    

}
