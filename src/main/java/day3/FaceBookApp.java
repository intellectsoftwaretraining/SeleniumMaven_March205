package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookApp {


	WebDriver driver =null;

	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get(url);
	}

	public void createAccount() 
	{
		WebElement createNewAccEle = driver.findElement(By.linkText("Create new account"));
		createNewAccEle.click();
		WebElement genderEle =	driver.findElement(By.xpath("//input[ @id='sex' and @value='2']"));
		genderEle.click();
	}
	
	public void selectMonthDropdown() 
	{
		WebElement monthEle = driver.findElement(By.xpath("//select[@title='Month']"));
		Select st = new Select(monthEle);
		//st.selectByIndex(5);
		//st.selectByValue("9");
		//st.selectByVisibleText("Nov");
		
		String actualValue = st.getFirstSelectedOption().getText();
		System.out.println(actualValue);
		if(actualValue.equals("March"))
		{
			System.out.println("Default value from month dropdown is matched");
		}else 
		{
			System.out.println("Default value from month dropdown is not matched");
		}
	}
	
	public void getOptionsFromMonth() 
	{
		WebElement monthEle = driver.findElement(By.xpath("//select[@title='Month']"));
		Select st = new Select(monthEle);
		
	 List<WebElement> optionsEle =	st.getOptions();
	 System.out.println("Values from Month elemnt is "+ optionsEle);
	 System.out.println(optionsEle.size());
	 
	 for (WebElement optionEle : optionsEle) {
		
		 System.out.println(optionEle.getText());
	}
	}

	public static void main(String[] args) {
		FaceBookApp obj = new FaceBookApp();
		obj.openBrowser("https://www.facebook.com/");
		obj.createAccount();
		obj.selectMonthDropdown();
		obj.getOptionsFromMonth();
	}
}
