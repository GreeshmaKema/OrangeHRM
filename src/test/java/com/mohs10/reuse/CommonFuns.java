package com.mohs10.reuse;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		public void logIn(String file, String name,String mname,String lname,String email, String cont) throws Exception 
		{
		
		StartBrowser.childTest =StartBrowser.parentTest.createNode("Orangehrm site visit");
		
		
		aDriver.navigateToApplication("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		aDriver.click(HomePage.company, "click on company");
		Thread.sleep(3000);
		aDriver.click(HomePage.carrier, "click on career");
		
		//method to perform Scroll operation
		Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    for(int i=0;i<4;i++)
	    {
	    Thread.sleep(500);
	    js.executeScript("window.scrollBy(0,250)");
	     }
	    
	    aDriver.switchToFrameByIndex(driver, 0);
	    Thread.sleep(3000);
	    WebElement a=driver.findElement(HomePage.techlead);
	    js.executeScript("arguments[0].click()",a);
		aDriver.click(HomePage.techlead,"one click on techlead");
		Thread.sleep(3000);
		aDriver.click(HomePage.apply1, "click on apply");
		aDriver.switchToNewWindow(driver);
		
		//move to new web page job filling details
		//aDriver.navigateToApplication("https://orangehrm.orangehrm.com/recruitmentApply/applyVacancyAdvanced/id/138");
		aDriver.click(HomePage.resume, "tr");
	
		
		//method for uploading file
        StringSelection upload= new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
        Thread.sleep(1000);
        Robot r= new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_ENTER);
		
        aDriver.type(HomePage.firstname, name, "name text box");
        aDriver.type(HomePage.midlename, mname, "name text box");
        aDriver.type(HomePage.lastname, lname, "name text box");
        aDriver.type(HomePage.emailid, email,"email text box");
        aDriver.type(HomePage.contact, cont,"contact text box");
		aDriver.click(HomePage.apply2, "click on Apply button");
		
		aDriver.switchToOldWindow(driver);
			
		} 
	}