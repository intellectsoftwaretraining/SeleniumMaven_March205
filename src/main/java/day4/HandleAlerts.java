package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.SeleniumGeneric;

public class HandleAlerts extends SeleniumGeneric {


	public WebDriver driver = null;

	public void acceptAlertBox() throws InterruptedException 
	{
		WebElement ele = driver.findElement(By.name("normalalerts"));
		ele.click();

		Thread.sleep(4000);

		Alert at = driver.switchTo().alert();
		at.accept();
	}

	public void dismissAlertBox() throws InterruptedException 
	{
		WebElement ele = driver.findElement(By.name("confirmalerts"));
		ele.click();

		Thread.sleep(4000);

		Alert at = driver.switchTo().alert();
		String value =	at.getText();
		System.out.println(value);
		at.dismiss();
	}
	
	public void sendKeysAlertBox() throws InterruptedException 
	{
		WebElement ele = driver.findElement(By.name("prompt"));
		ele.click();

		Thread.sleep(4000);

		Alert at = driver.switchTo().alert();
		String value =	at.getText();
		System.out.println(value);
		at.sendKeys("Balamurugan");
		at.accept();
	}

	public static void main(String[] args) throws InterruptedException {

		HandleAlerts obj = new HandleAlerts();
		obj.driver = obj.openBrowser("https://playground.intellectsoftwareacademy.com/alert");
		//obj.acceptAlertBox();
		//obj.dismissAlertBox();
		obj.sendKeysAlertBox();
	}
}
