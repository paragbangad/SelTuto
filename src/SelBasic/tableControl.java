package SelBasic;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class tableControl extends base{
	
	@Test
	public void table(){
		OpenURL("http://automationsite.azurewebsites.net/DataTable.aspx");
		List<WebElement> elements = driver.findElements(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr[1]/th"));
		int colCount = elements.size();
		System.out.println("Col Count "+colCount);
		List<WebElement> rowElements = driver.findElements(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr"));
		int rowCount = rowElements.size();
		System.out.println("RowCount "+rowCount);
		for (WebElement webElement : rowElements) {
			System.out.println(webElement.getText());
		}
		
		
		
	}

}
