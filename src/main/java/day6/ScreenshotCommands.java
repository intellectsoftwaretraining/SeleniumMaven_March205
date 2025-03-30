package day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCommands {

	WebDriver driver = null;

	public void openBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
	}

	public void navigateTo() 
	{
		driver.navigate().to("https://playground.intellectsoftwaretechnologies.com/checkbox");

	}

	// Step 1 : Download common IO jar - https://mvnrepository.com/artifact/commons-io/commons-io/2.18.0
	// Step 2: Copy the maven dependency and add to POM>xml file


	public void takeScreenShot(String screeshotName) throws Exception 
	{	
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile method from common io jar
		FileUtils.copyFile(src, new File("./Screenshot/"+screeshotName+".png"));
	}
	
	public void takeElementScreenshot(String screeshotName) throws IOException 
	{
		WebElement ele = driver.findElement(By.linkText("DROPDOWN"));
		
		File src= ele.getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile method from common io jar
		FileUtils.copyFile(src, new File("./Screenshot/"+screeshotName+".png"));
	}

	public static void main(String[] args) throws Exception {

		ScreenshotCommands obj = new ScreenshotCommands();
		obj.openBrowser();
		obj.takeScreenShot("GoogleHomePage");
		obj.navigateTo();
		obj.takeScreenShot("CheckBoxPage");
		obj.takeElementScreenshot("CheckBoXElementScreenshot");
	}
}
