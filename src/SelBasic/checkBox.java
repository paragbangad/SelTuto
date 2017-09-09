package SelBasic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class checkBox extends base{
	@Test
	public void test4() throws InterruptedException{
		OpenURL(_objRep.URLListBox);
		Thread.sleep(2000);
		assertEquals("text",driver.findElement(By.id("ContentPlaceHolder1_ChkBx1")).getAttribute("Text"));
	}

}
