package SelBasic;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class toolTip extends base{
@Test
public void toolTipTest() throws InterruptedException
{
	OpenURL("http://automationsite.azurewebsites.net/ListBox.aspx");
	WebElement button = driver.findElement(By.id("ContentPlaceHolder1_Btn1"));
	Actions act = new Actions(driver);
	act.moveToElement(button).build().perform();
	Thread.sleep(2000);
	System.out.println(button.getAttribute("title"));
}
}
