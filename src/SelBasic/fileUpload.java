package SelBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class fileUpload extends base{
//@Test
public void fileUploadTest() throws InterruptedException{
	OpenURL("https://angular-file-upload.appspot.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.ng-pristine.ng-invalid.ng-invalid-required")).sendKeys("C:\\Personal\\temp\\myTimeStamp.png");
	driver.findElement(By.cssSelector("button[ng-click=\"uploadPic(picFile)\"]")).click();
	TakesScreenshot screenShotter = (TakesScreenshot) driver;
	File srcFile=  screenShotter.getScreenshotAs(OutputType.FILE);
	try {Thread.sleep(2000);
		FileUtils.copyFile(srcFile, new File("C:\\Personal\\temp\\"+"verifyUpload"+".png"));
		} catch (Exception e) 
		{
		e.printStackTrace();
		}	
}

@Test
public void fileuploaer() throws InterruptedException{
	OpenURL("http://demos.telerik.com/kendo-ui/upload/index");
	driver.findElement(By.id("files")).sendKeys("C:\\Personal\\temp\\datatable.png");
	driver.findElement(By.cssSelector("input.k-button.k-primary")).click();
	Thread.sleep(5000);
	TakesScreenshot fileupload = (TakesScreenshot)driver;
	File screenshot = fileupload.getScreenshotAs(OutputType.FILE);
	try {
		
		FileUtils.copyFile(screenshot, new File("C:\\Personal\\temp\\"+"fileUploadValidation.png"));
		} catch (Exception e) 
		{
				e.printStackTrace();
		}
	
	
}
}
