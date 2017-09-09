package SelBasic;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	protected WebDriver driver;
	ObjRep _objRep = new ObjRep();

	@Before
	public void setUp() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//		driver.get("https://www.google.co.in");
					
		}

	@After
	public void tearDown() {
		driver.close();
	}
	protected void OpenURL(String url) {
		driver.get(url);
	}
}