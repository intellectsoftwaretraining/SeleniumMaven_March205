package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.SeleniumGeneric;

public class ElementConditions extends SeleniumGeneric {

	public WebDriver driver = null;

	public void checkIfInputIsEnabled() 
	{
		WebElement inputEle = driver.findElement(By.id("intl567"));

		if(inputEle.isEnabled())
		{
			inputEle.sendKeys("Bala");

		}else 
		{
			System.out.println("The input box is disabled");
		}
	}

	public void checkIfEleIsSelected() 
	{
		driver.navigate().to("https://playground.intellectsoftwaretechnologies.com/checkbox");
		WebElement checkboxEle = driver.findElement(By.id("int033"));

		if(checkboxEle.isSelected())
		{
			System.out.println("Element is already selected");

		}else 
		{
			checkboxEle.click();
		}
	}

	public void checkIfEleIsDisplayed() 
	{
		driver.navigate().to("https://playground.intellectsoftwaretechnologies.com/checkbox");

		try 
		{
			WebElement checkboxEle = driver.findElement(By.id("int0338888888"));

			if(checkboxEle.isDisplayed())
			{
				System.out.println("Element is present in the webpage");
			}
		}
		catch(NoSuchElementException e)
		{
				System.out.println("Element is not found in the web page");
		}
	}
	public static void main(String[] args) {
		ElementConditions obj = new ElementConditions();
		obj.driver = obj.openBrowser("https://playground.intellectsoftwaretechnologies.com/send_keys");
		//obj.checkIfInputIsEnabled();
		//obj.checkIfEleIsSelected();
		obj.checkIfEleIsDisplayed();
	}
}
