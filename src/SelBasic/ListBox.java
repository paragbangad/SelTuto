package SelBasic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBox extends base  {
	@Test
	public void ListBoxValidation() throws InterruptedException{
		driver.get("http://automationsite.azurewebsites.net/ListBox.aspx");
		WebElement element =  driver.findElement(By.id("ContentPlaceHolder1_ListBox1"));
		new Select(element).selectByVisibleText("Item2");
		String selectedValue =  driver.findElement(By.id("ContentPlaceHolder1_TextBox1")).getAttribute("value");
		assertEquals("Item2",selectedValue);

		//Thread.sleep(2000);
		WebElement elementRefresh =  driver.findElement(By.id("ContentPlaceHolder1_ListBox1"));
		new Select(elementRefresh).selectByVisibleText("Item4");
		String selectedValue4 =  driver.findElement(By.id("ContentPlaceHolder1_TextBox1")).getAttribute("value");
		assertEquals("Item4",selectedValue4);
	}
	public void ValidateTextInTextBoxSelectedFromList(){
	OpenURL(_objRep.URLListBox);
	assertEquals(_objRep.textInItem1, getTextFromListBox());
}

	private String getTextFromListBox() {
		WebElement elmnt = driver.findElement(By.id(_objRep.listBox1));
		
		new Select(elmnt).selectByVisibleText(_objRep.textInItem1);
		
		WebElement elmntOfTextToBeVerified= driver.findElement(By.id(_objRep.TEXTBOX1));
		
		String textToBeVerified = elmntOfTextToBeVerified.getAttribute(_objRep.tagValue);
		return textToBeVerified;
	}


}
