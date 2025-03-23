package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.SeleniumGeneric;

public class GetAttributeFromElements extends SeleniumGeneric {

	
	
	public WebDriver driver  =null;
	
	public void getElementAttribute() 
	{
		WebElement ele = driver.findElement(By.id("email"));
		String actualValue = ele.getDomAttribute("placeholder");
		System.out.println(actualValue);
		
		ele.sendKeys("Balamurugan");
		String defaultText = ele.getDomAttribute("value");
		System.out.println(defaultText);
	}
	
	public static void main(String[] args) {
		
		GetAttributeFromElements obj = new GetAttributeFromElements();
		obj.driver = obj.openBrowser("https://www.facebook.com/");
		obj.getElementAttribute();
	}
	
}
