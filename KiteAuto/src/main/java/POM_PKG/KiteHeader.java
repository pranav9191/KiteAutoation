package POM_PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KiteHeader {
	
	@FindBy (xpath = "//span[@class='user-id']") private WebElement UserId;

	@FindBy (xpath = "//a[@href = '/orders']") private WebElement orders;
	
	@FindBy (xpath = "//a[@href = '/holdings']") private WebElement holdings;
	
	@FindBy (xpath = "//a[@href = '/positions']") private WebElement positions;
	
	@FindBy (xpath = "//a[@href = '/funds']") private WebElement funds;

	public KiteHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Logout(WebDriver driver) throws InterruptedException
	{
		UserId.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
	}
	
	public void clickordertab()
	{
		orders.click();
	}
	
	public void clickholdingstab()
	{
		holdings.click();
	}
	
	public void clickpositionstab()
	{
		positions.click();
	}
	
	public void clickfundstab()
	{
		funds.click();
	}
	public void holdingsdropdown(WebDriver driver) throws InterruptedException
	{
		WebElement hlddropdwn=driver.findElement(By.xpath("//select"));
		Select option=new Select(hlddropdwn);
		  option.selectByIndex(1);
		  Thread.sleep(4000);
		  option.selectByIndex(2);
		  Thread.sleep(4000);
		  option.selectByIndex(0);
		  Thread.sleep(4000);
	}
}
