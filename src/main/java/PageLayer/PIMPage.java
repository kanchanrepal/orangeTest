package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilLayer.ActionClassMethod;
import UtilLayer.ExcelReader;

public class PIMPage extends BaseClass{
	
	
	@FindBy(xpath="//b[text()='PIM']")
	WebElement PIMButton;
	
    @FindBy(xpath="//a[text()='Employee List']")
    WebElement emplist;
    
    @FindBy(id="menu_pim_Configuration")
    WebElement  configurationMenu;
    
    @FindBy(id="menu_admin_pimCsvImport")
    WebElement  Dataimport;
    
    
    @FindBy(id="pimCsvImport_csvFile")
    WebElement  chooseFile;              //dataimport menu choose file
    
	public PIMPage()throws IOException
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void PIMfun()
	{
		ActionClassMethod.mouseOverElement(PIMButton);
		emplist.click();
	}
	
	public void Dataimportfun()
	{
		ActionClassMethod.mouseOverElement(PIMButton);
		ActionClassMethod.mouseOverElement(configurationMenu);
		Dataimport.click();
		//chooseFile.click();
		
	}

}
