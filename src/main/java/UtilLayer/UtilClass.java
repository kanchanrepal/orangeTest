package UtilLayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class UtilClass extends BaseClass{
	
	public UtilClass() throws FileNotFoundException {
		super();

	}
	public static Select select;
	//handle dropDown
	public static void handledropDown(WebElement wb,String text)
	{
		 select=new Select(wb);
		 select.selectByVisibleText(text);
		 
	}
	public static int countDropDownItems(WebElement wb)
	{
		select=new Select(wb);
	    List<WebElement> ls=select.getOptions();
	       int dropDownCount= ls.size();
	     return dropDownCount;
	}
	
	//TakeScreenshot 
	
	public static void takeScreenshot()
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//destination location where file store
		String destiLocation=System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(f, new File(destiLocation +"/ScreenShot/"+System.currentTimeMillis()+".png"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	//explicit wait
	
	public static void explicitWait(By wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(wb));
		
	}
	
	//implicit wait
	
	public static void implicitwait()
	{
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	}
	
   //switch to frame
	public static void switchToframe(WebElement wb)
	{
		driver.switchTo().frame(wb);
		String TitleFrame=driver.switchTo().frame(wb).getTitle();
		
	}		
	// switch to paent frame
	public static void switchTotopFrame()
	{
		driver.switchTo().defaultContent();
	}
		
	
		
}
	
	

