package SelBasic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class tagValue extends base {
	
	@Test
	public void test2() throws InterruptedException{
		driver.get("http://demos.telerik.com/aspnet-ajax/checkbox/server-side-api/server-side-events/defaultvb.aspx");
		assertEquals("I agree to the Terms & Conditions.", driver.findElement(By.id(_objRep.checkBoxID)).getAttribute(_objRep.tagValue));
		Thread.sleep(2000);
		driver.findElement(By.id(_objRep.checkBoxID)).click();//"checked":true
		Thread.sleep(3000);
		//assertEquals(true, driver.findElement(By.id("ctl00_ContentPlaceholder1_RadCheckBox1_ClientState")).getAttribute("checked"));
		
	}

}
