package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.SeleniumGeneric;

public class FramesConcept extends SeleniumGeneric {


	public WebDriver driver = null;
	
	public void handleFrames() throws InterruptedException 
	{
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("intl001");
		
		WebElement framewEle = driver.findElement(By.xpath("//iframe[@src='button-frames.php']"));
		
		driver.switchTo().frame(framewEle);
		WebElement ele = driver.findElement(By.name("normalalerts"));
		ele.click();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().alert().accept();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		FramesConcept obj = new FramesConcept();
		obj.driver = obj.openBrowser("https://playground.intellectsoftwaretechnologies.com/frames");
		obj.handleFrames();
	}

}
