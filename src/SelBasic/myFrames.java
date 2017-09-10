package SelBasic;

import javafx.scene.control.Alert;

import org.junit.Test;
import org.openqa.selenium.By;

public class myFrames extends base{
@Test
public void iFrameTest() throws InterruptedException{
	OpenURL("http://automationsite.azurewebsites.net/");
	driver.manage().window().maximize();
	driver.findElement(By.id("HyperLink2")).click();
driver.switchTo().frame(driver.findElement(By.id("Frame1")));
driver.findElement(By.xpath(".//*[@id='form1']/div[7]/input")).click(); 
Thread.sleep(5000);
driver.switchTo().alert().accept();
driver.switchTo().defaultContent();
}
	
}
