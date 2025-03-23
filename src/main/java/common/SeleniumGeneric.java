package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGeneric {

	public WebDriver openBrowser(String url)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
	}
	
	public void refreshPage(WebDriver driver) 
	{
		driver.navigate().refresh();
	}
	
	public void closeBrowser(WebDriver driver) 
	{
		driver.close();
	}
}
