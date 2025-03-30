package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.SeleniumGeneric;

public class ActionClassExample extends SeleniumGeneric {

	
	public WebDriver driver =null;
	
	public void moveToElement() 
	{
		Actions act = new Actions(driver);
		
		WebElement courseEle = driver.findElement(By.xpath("//a[text()=' Courses']"));
		//act.moveToElement(courseEle).perform();
		
		WebElement testingEle = driver.findElement(By.xpath("//a[text()=' Software Testing']"));
		//act.moveToElement(testingEle).perform();
		
		WebElement seleniumEle = driver.findElement(By.xpath("//a[text()='Selenium']"));
		//act.moveToElement(seleniumEle).click().build().perform();
		
		act.moveToElement(courseEle).moveToElement(testingEle).moveToElement(seleniumEle).click().build().perform();
		
	}
	
	public void rightClickElemeentAndOpenTheLinkWithRobotClass() throws Exception 
	{
		Actions act = new Actions(driver);
		
		WebElement serviceEle = driver.findElement(By.xpath("//a[text()='Services']"));
		act.moveToElement(serviceEle).contextClick().build().perform();
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	public void doubleClickEle()
	{
		
		driver.navigate().to("https://playground.intellectsoftwaretechnologies.com/actionclass");
		Actions act = new Actions(driver);
		
		WebElement doubleclickEle = driver.findElement(By.xpath("//button[contains(@style, '#0d6efd')]"));
		act.doubleClick(doubleclickEle).build().perform();
		
	}
	
	public void dragAndDrop()
	{
		
		Actions act = new Actions(driver);
		WebElement srcEle = driver.findElement(By.id("123"));
		WebElement targetEle = driver.findElement(By.id("456"));
		act.dragAndDrop(srcEle, targetEle).perform();
		
	}
	
	public static void main(String[] args) throws Exception {
		
		ActionClassExample obj = new ActionClassExample();
		obj.driver = obj.openBrowser("https://intellectsoftwaretechnologies.com/");
		//obj.moveToElement();
		//obj.rightClickElemeentAndOpenTheLinkWithRobotClass();
		obj.doubleClickEle();
	}
}
