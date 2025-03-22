package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInterations {
	
	WebDriver driver =null;

	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/send_keys");
	}
	
	public void loginFacebookApp() throws InterruptedException 
	{
	 WebElement emailElement = driver.findElement(By.id("email-bala"));
	 emailElement.sendKeys("Bala@test.com");
	 Thread.sleep(3000);
	 emailElement.clear();
	 emailElement.sendKeys("John@test.com");
	 
	 WebElement passwordEle = driver.findElement(By.id("pass"));
	 passwordEle.sendKeys("Test@123454547");
	 
	 WebElement loginButtonEle = driver.findElement(By.name("login"));
	 
	 String actualTextFromEle = loginButtonEle.getText();
	 System.out.println(actualTextFromEle);
	 
	 String actualTagName = loginButtonEle.getTagName();
	 System.out.println(actualTagName);
	 loginButtonEle.click();
	}
	
	public void createNewAccount() 
	{
		WebElement createNewAccEle = driver.findElement(By.linkText("Create new account"));
		createNewAccEle.click();
		
		driver.navigate().to("https://playground.intellectsoftwareacademy.com/buttons");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		ElementInterations obj = new ElementInterations();
		obj.openBrowser();
		//obj.loginFacebookApp();
		obj.createNewAccount();
	}
	
}
