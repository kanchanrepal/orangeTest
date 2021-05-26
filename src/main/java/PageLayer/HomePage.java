package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//img[@alt='OrangeHRM']")
	
	WebElement OrangeLogo;

	@FindBy(xpath="//*[text()='Admin']")
	WebElement AdminButton;
	
	@FindBy(xpath="//b[text()='PIM']")
	WebElement PIMButton;
	

	@FindBy(xpath="//b[text()='Leave']")
	WebElement LeaveButton;
     
   
	
	public HomePage() throws IOException
	{
	PageFactory.initElements(driver, this);

    }
	public  boolean VerifyLogo()
	{
	    boolean orangelogo= OrangeLogo.isDisplayed();
		return orangelogo;
	}
	public String VerifyTitle()
	{
		String actualTitle=driver.getTitle();
		
		return actualTitle;
		
	}
	public  AdminPage ClickOnAdmin() throws IOException 
	{
		AdminButton.click();
		return new AdminPage();
	
	}
	
	
}