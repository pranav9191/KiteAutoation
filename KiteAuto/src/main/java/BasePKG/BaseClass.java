package BasePKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver launchchromebrowser()
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_Ver101\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  return driver;
	}
	
	public static WebDriver launchedgebrowser()
	{
		  System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		  WebDriver driver= new EdgeDriver();
		  return driver;
	}
}
