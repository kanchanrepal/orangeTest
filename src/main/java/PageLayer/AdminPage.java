package PageLayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import UtilLayer.ActionClassMethod;
import UtilLayer.UtilClass;

public class AdminPage extends BaseClass {

	
	@FindBy (xpath="//*[text()='Admin']")  //admin button
    WebElement adminmenu;
	 
	@FindBy(id="menu_admin_UserManagement")
	WebElement UsermanagementMenu;
	
	@FindBy(xpath="//*[text()='Users']")
	WebElement user;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement adduser;
	
	@FindBy(id="menu_admin_viewAdminModule") //admin button 
	WebElement addmenu;
	
	//dropdown
	@FindBy(xpath="//select[@id='systemUser_userType']")
	WebElement Userrol;
    
//	@FindBy(id="systemUser_emploeeName_empName")
//	WebElement employeename;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	WebElement employeename;
	
	@FindBy(id="systemUser_userName")
	WebElement user_name;
	
	
	//dropdown
	@FindBy(id="systemUser_status")
	WebElement status_drop;
	
	@FindBy(id="systemUser_password")
	WebElement add_user_password;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement add_userConfirm_password;
	
	@FindBy(id="btnSave")
	WebElement SaveButton;
	
	
	
	public AdminPage()throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	
	public void adminbtn() throws IOException
	{
		
		ActionClassMethod.mouseOverElement(adminmenu);
		ActionClassMethod.mouseOverElement(UsermanagementMenu);
        user.click();			
        adduser.click();
	}
	
	
	public void userinfoEnter(String text,String empname,String  uname, String text1,String password,String confirmpassword)
	{   
		
		UtilClass.handledropDown(Userrol,text);	
	    UtilClass.countDropDownItems(Userrol);
		employeename.sendKeys(empname);
		user_name.sendKeys(uname);
		
		UtilClass.handledropDown(status_drop,text1);
		//UtilClass.countDropDownItems(status_drop);
		add_user_password.sendKeys(password);
		add_userConfirm_password.sendKeys(confirmpassword);
		SaveButton.click();
		
	}
	
}

	
