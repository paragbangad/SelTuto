package SelBasic;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.junit.*;


public class FirstClass extends base 
{
//@Test 
//public void screenshotTest(){
//	OpenURL("http://www.google.com");
//	TakesScreenshot screenShotter = (TakesScreenshot) driver;
//	File srcFile=  screenShotter.getScreenshotAs(OutputType.FILE);
//	try {
//		FileUtils.copyFile(srcFile, new File("C:\\Personal\\temp\\"+"myTimeStamp"+".png"));
//		} catch (IOException e) 
//		{
//		e.printStackTrace();
//		}
//}

@Test
public void screenGrabTest() throws IOException{
	driver.get("http://automationsite.azurewebsites.net/DataTable.aspx");
	TakesScreenshot scobject = (TakesScreenshot)driver;
	File somefilename = scobject.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(somefilename, new File("C:\\Personal\\temp\\"+"datatable.png"));
}
	

}
//WebDriverWait wait = new WebDriverWait(driver, 6); 

//new Select(driver.findElement(By.id(_objRep.listBox1))).selectByVisibleText(_objRep.ITEM1);
//assertEquals(ITEM1,driver.findElement(By.id(TEXTBOX1)).getAttribute(tagValue));