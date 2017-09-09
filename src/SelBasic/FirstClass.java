package SelBasic;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;


public class FirstClass 
{

	ObjRep _objRep = new ObjRep();
	
	WebDriver driver;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.google.co.in");
				
	}

	//@Test
	public void ListBoxValidation() throws InterruptedException{
		driver.get("http://automationsite.azurewebsites.net/ListBox.aspx");
		WebElement element =  driver.findElement(By.id("ContentPlaceHolder1_ListBox1"));
		new Select(element).selectByVisibleText("Item2");
		String selectedValue =  driver.findElement(By.id("ContentPlaceHolder1_TextBox1")).getAttribute("value");
		assertEquals("Item2",selectedValue);
//		Thread.sleep(2000);
		WebElement elementRefresh =  driver.findElement(By.id("ContentPlaceHolder1_ListBox1"));
		new Select(elementRefresh).selectByVisibleText("Item4");
		String selectedValue4 =  driver.findElement(By.id("ContentPlaceHolder1_TextBox1")).getAttribute("value");
		assertEquals("Item4",selectedValue4);
	}

	//@Test
	public void DataTableRead(){
		driver.get("http://automationsite.azurewebsites.net/DataTable.aspx");
		String firstValue = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[4]")).getText();
		String secondValue = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[5]")).getText();
		int result = Integer.parseInt(firstValue)+Integer.parseInt(secondValue);
		System.out.println(firstValue + " "+ secondValue+" "+result);
	}

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
	
	
	//@Test
	public void test() throws InterruptedException{
		
//		String title=driver.getTitle();
		assertEquals("Google",driver.getTitle());
		driver.findElement(By.id("lst-ib")).sendKeys("google");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		assertEquals("About", driver.findElement(By.id("resultStats")).getText().substring(0,5));
	}
	
	//@Test
	public void test2() throws InterruptedException{
		driver.get("http://demos.telerik.com/aspnet-ajax/checkbox/server-side-api/server-side-events/defaultvb.aspx");
		assertEquals("I agree to the Terms & Conditions.", driver.findElement(By.id(_objRep.checkBoxID)).getAttribute(_objRep.tagValue));
		Thread.sleep(2000);
		driver.findElement(By.id(_objRep.checkBoxID)).click();//"checked":true
		Thread.sleep(3000);
		//assertEquals(true, driver.findElement(By.id("ctl00_ContentPlaceholder1_RadCheckBox1_ClientState")).getAttribute("checked"));
		
	}
	
	//@Test
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
	
	//@Test
	public void test4() throws InterruptedException{
		OpenURL(_objRep.URLListBox);
		Thread.sleep(2000);
		assertEquals("text",driver.findElement(By.id("ContentPlaceHolder1_ChkBx1")).getAttribute("Text"));
	}
	
	
		public void ValidateTextInTextBoxSelectedFromList(){
		OpenURL(_objRep.URLListBox);
		assertEquals(_objRep.textInItem1, getTextFromListBox());
	}
	
		
	private void OpenURL(String url) {
		driver.get(url);
	}

	private String getTextFromListBox() {
		WebElement elmnt = driver.findElement(By.id(_objRep.listBox1));
		
		new Select(elmnt).selectByVisibleText(_objRep.textInItem1);
		
		WebElement elmntOfTextToBeVerified= driver.findElement(By.id(_objRep.TEXTBOX1));
		
		String textToBeVerified = elmntOfTextToBeVerified.getAttribute(_objRep.tagValue);
		return textToBeVerified;
	}
	
	@After
	public void tearDown(){
		driver.close();
	}

}
//WebDriverWait wait = new WebDriverWait(driver, 6); 

//new Select(driver.findElement(By.id(_objRep.listBox1))).selectByVisibleText(_objRep.ITEM1);
//assertEquals(ITEM1,driver.findElement(By.id(TEXTBOX1)).getAttribute(tagValue));