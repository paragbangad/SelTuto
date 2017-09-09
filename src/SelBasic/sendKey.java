package SelBasic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class sendKey extends base{
	@Test
	public void test() throws InterruptedException{
		
//		String title=driver.getTitle();
		assertEquals("Google",driver.getTitle());
		driver.findElement(By.id("lst-ib")).sendKeys("google");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		assertEquals("About", driver.findElement(By.id("resultStats")).getText().substring(0,5));
	}
}
