package SelBasic;

import org.junit.Test;
import org.openqa.selenium.By;

public class alerts extends base {
	@Test
	public void test3(){
		driver.get("http://automationsite.azurewebsites.net/javascript.aspx");
		driver.findElement(By.id("txtValue")).sendKeys("10");
//		driver.findElement(By.id("btnSearc")).click();
		try{
			driver.switchTo().alert().accept();
			}
		catch(Exception e)
		{
			System.out.println("NoAlert");
			driver.findElement(By.id("btnSearc")).click();
			String text = driver.switchTo().alert().getText();
			if(text.equals("15")){
			driver.switchTo().alert().accept();}
		}
		
		
	}

}
