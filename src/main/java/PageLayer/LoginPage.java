package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	 
	
	 //page factory or OR  
	@FindBy(id= "txtUsername")
	 WebElement username;
	 
	 @FindBy(id= "txtPassword")
	 WebElement password;
	 
     @FindBy(id= "btnLogin")
     WebElement loginButton;
     
	 //initializa page object
     public LoginPage() throws IOException {
 		PageFactory.initElements(driver,this);
 	}
     
	 public HomePage LoginPageFunctionality(String uname,String pass) throws IOException
	 {
		 username.sendKeys(uname);
	     password.sendKeys(pass);
         loginButton.click();
         return new HomePage();
		
	}
	

}
