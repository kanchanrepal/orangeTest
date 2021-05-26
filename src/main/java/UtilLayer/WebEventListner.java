package UtilLayer;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import BaseLayer.BaseClass;

public class WebEventListner extends BaseClass implements WebDriverEventListener {

	public WebEventListner() throws FileNotFoundException {
		super();
		
	}

	public void beforeAlertAccept(WebDriver driver) {
		
	}

	public void afterAlertAccept(WebDriver driver) {
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		

	}

	public void beforeAlertDismiss(WebDriver driver) {

	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		

	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("after navigation to:"+ url +"");

	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("before navigation back");
	}

	public void afterNavigateBack(WebDriver driver) {
		

	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before Trying to find Element : "+ by.toString());

	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After Trying to find Element : "+ by.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before typing to click on "+element.toString());

	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Clicking to click on "+element.toString());
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("before changing value to element "+ element.toString() );
		

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("After changing value to element "+ element.toString() );
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("after switching to frame "+windowName);

	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("exception occurs in script : " +throwable );

		UtilClass.takeScreenshot();
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub

	}

}
