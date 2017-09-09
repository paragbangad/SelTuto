package SelBasic;

import org.junit.Test;
import org.openqa.selenium.By;

public class dataTable extends base {
	@Test
	public void DataTableRead(){
		driver.get("http://automationsite.azurewebsites.net/DataTable.aspx");
		String firstValue = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[4]")).getText();
		String secondValue = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[5]")).getText();
		int result = Integer.parseInt(firstValue)+Integer.parseInt(secondValue);
		System.out.println(firstValue + " "+ secondValue+" "+result);
	}
}
