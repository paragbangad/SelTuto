package SelBasic;

import org.junit.Test;
import org.openqa.selenium.By;

public class myFrames extends base{
@Test
public void iFrameTest(){
	driver.manage().window().maximize();
driver.switchTo().frame("iframe1");
driver.findElement(By.xpath("//input[@name='firstname']")).click(); 
driver.switchTo().defaultContent();}
	
}
