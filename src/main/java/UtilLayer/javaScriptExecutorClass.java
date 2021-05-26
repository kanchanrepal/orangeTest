package UtilLayer;

import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class javaScriptExecutorClass extends BaseClass{
	
	public javaScriptExecutorClass() throws FileNotFoundException {
		super();
	}
	public static JavascriptExecutor js;
	
	public static void ClickOnElementUsingJS(WebElement wb)
	{
       js=(JavascriptExecutor)driver;
       js.executeScript("argument[0].click();",wb);
       
	}
	public static void rightClickOnElementUsingJS(WebElement wb)
	{
		   js=(JavascriptExecutor)driver;
	       js.executeScript("argument[0].contextClick();",wb);
	       
	}
	public static void doubleClickOnElementUsingJS(WebElement wb)
	{
		   js=(JavascriptExecutor)driver;
	       js.executeScript("argument[0].D();",wb);
	       
	}
	
	//genrate alert pop
	
	public static void generateAleartWindow(WebElement wb,String message)
	{
		js.executeScript("argument[0].click();",wb);
		js.executeScript("aleart(message);");
		
	}
	//scroll down by 600pixel
	public static void scrollWindow(int pixel)
	{
		js.executeScript("window.scrollBy(0,pixel);");
		
	}
	
	

}
