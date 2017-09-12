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
	String childWindowHandle=driver.getWindowHandle();
	driver.switchTo().window(childWindowHandle);
	driver.findElement(By.id("form1")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();	
	
//	Set<String> handles = driver.getWindowHandles();
//
//	for(String handle:handles){
//	WebDriver newDriver = driver.switchTo().window(handle);
//	driver.findElement(By.id("form1")).click();
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();	
//	System.out.println(driver.getTitle());
//	System.out.println(newDriver.getTitle());
//	
//}	

	Thread.sleep(2000);
	driver.switchTo().window(parentWindowHandle);
	driver.findElement(By.id("ContentPlaceHolder1_NewWindow")).click();
//	Thread.sleep(3000);
	
}
}
