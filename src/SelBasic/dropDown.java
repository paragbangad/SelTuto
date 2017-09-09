package SelBasic;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropDown extends base {
	@Test
	public void dropDownTest() throws InterruptedException{
		driver.get("http://automationsite.azurewebsites.net/DataTable.aspx");
		WebElement dropDownHandle = driver.findElement(By.id("ContentPlaceHolder1_DropDownList1"));
		new Select(dropDownHandle).selectByValue("twov");
		Thread.sleep(2000);
		WebElement dropDownHandleNew = driver.findElement(By.id("ContentPlaceHolder1_DropDownList1"));
		new Select(dropDownHandleNew).selectByValue("onev");
		Thread.sleep(2000);
		
	}

}
