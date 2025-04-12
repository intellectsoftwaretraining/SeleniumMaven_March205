package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.SeleniumGeneric;

public class Webtable  extends SeleniumGeneric {

	public WebDriver driver = null;
	
	public void getAllDataFromWebTable() 
	{
		// //div[@class='card']//table 
		// //table[contains(@class,'table-bordered')]
		
		WebElement tableEle = driver.findElement(By.xpath("//table[contains(@class,'table-bordered')]/tbody"));
		
		List<WebElement> rows = tableEle.findElements(By.tagName("tr"));
		int i = 0;
		for (WebElement row : rows) 
		{
			i = i+1;//2
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement columnEle : columns)
			{
				String data = columnEle.getText();
				System.out.print(data +" | ");
				if(data.equals("ADMIN"))
				{
					System.out.println("(//input[@name='active'])["+i+"]");
					WebElement checkbox = driver.findElement(By.xpath("(//input[@name='active'])["+i+"]"));
					checkbox.click();
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Webtable obj = new Webtable();
		obj.driver = obj.openBrowser("https://playground.intellectsoftwaretechnologies.com/webtable");
		obj.getAllDataFromWebTable();
	}

}
