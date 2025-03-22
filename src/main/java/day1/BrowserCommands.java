package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	
	//Interface - Abstract Method and Static Constants
	public void openBrowser() throws Exception 
	{
		//Interfacename objname = new classname();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//Dimension dim = new Dimension(200, 600);
		//driver.manage().window().setSize(dim);
		
		driver.get("https://intellectsoftwaretechnologies.com/");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
			
		driver.navigate().refresh();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		String actualPageSrc = driver.getPageSource();
		System.out.println(actualPageSrc);
		
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		
		BrowserCommands obj = new BrowserCommands();
		obj.openBrowser();
	}
}
