package SelBasic;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowHandle extends base{
@Test
public void switchWindow() throws InterruptedException{
	OpenURL("http://automationsite.azurewebsites.net/Frames/main.aspx");
	String parentWindowHandle=driver.getWindowHandle();
	
	driver.findElement(By.id("ContentPlaceHolder1_NewWindow")).click();
	Set<String> handles = driver.getWindowHandles();
	String parentTitle = driver.getTitle();
	String handleAfterOpeningWindow=driver.getWindowHandle();
	
	for (String s : handles) {
		if (s!=parentWindowHandle) {
			driver.switchTo().window(s);
		}
	}
	String childTitle = driver.getTitle();		
	
	
//	driver.findElement(By.id("form1")).click();
//	Thread.sleep(2000);

	System.out.println("Parent Handle: "+parentWindowHandle + " Parent Title: "+parentTitle);
	System.out.println("All Handles: "+handles);
	System.out.println("Handle after new window: "+handleAfterOpeningWindow+" ");	
	System.out.println("Child Window Handle: "+driver.getWindowHandle()+" Child Title: "+childTitle);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(parentWindowHandle);
	
}
}
