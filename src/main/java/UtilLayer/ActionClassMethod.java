package UtilLayer;

import java.io.FileNotFoundException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClassMethod extends BaseClass {
	
	public ActionClassMethod() throws FileNotFoundException {
		super();
	
	}

	public static Actions action;
	
	public static void mouseOverElement(WebElement wb)
	{
		Actions action=new Actions(driver);
		action.moveToElement(wb).build().perform();
	}
	//double click on element
	public static void doubleClickOnElement(WebElement wb)
	{
		action.doubleClick(wb).build().perform();
		
	}
	//click on element
	public static void ClickOnElement(WebElement wb)
	{
		action.click(wb).build().perform();
		
	}

    //Right Click on Element
	public static void rightClickOnElement(WebElement wb)
	{
		action.contextClick(wb).build().perform();
		
	}
   //drag and drop Element
	public static void dragAndDropElement(WebElement source,WebElement target)
	{ 
		
		action.dragAndDrop(source,target).build().perform();
		
	}
	public static void clickAndHoldElement(WebElement wb)
	{
		action.clickAndHold(wb);
		
	}
	
	//keyboardEvent scroll down
	public static void scrollPageDown()
	{
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
	}

	//scrollUp 
	public static void scrollPageUp()
	{
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	}
	
	
}
