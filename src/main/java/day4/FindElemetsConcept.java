package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.SeleniumGeneric;

public class FindElemetsConcept extends SeleniumGeneric {


	public WebDriver driver = null;

	public void getTextFromAllLinkElements() 
	{
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println(allLinks.size());


		for (WebElement link : allLinks)
		{
			String linkText = link.getText();
			System.out.println(linkText);
		}
	}

	public void getOptionsFromFaceBookPage() 
	{
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		// List<WebElement> allLinks = driver.findElements(By.tagName("option"));
		List<WebElement> allLinks = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(allLinks.size());
		for (WebElement link : allLinks)
		{
			String linkText = link.getText();
			System.out.println(linkText);
		}
	}


	public static void main(String[] args) {

		FindElemetsConcept obj = new FindElemetsConcept();
		System.out.println(obj.driver);
		obj.driver = obj.openBrowser("https://www.google.com/");
		System.out.println(obj.driver);

		//obj.getTextFromAllLinkElements();

		obj.getOptionsFromFaceBookPage();
		obj.closeBrowser(obj.driver);




	}
}
