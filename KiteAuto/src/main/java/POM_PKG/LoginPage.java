package POM_PKG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilPKG.Utility;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement username;
	
	@FindBy (xpath = "//input[@id = 'password']") private WebElement Password;
	
	@FindBy (xpath = "//button[@type = 'submit']") private WebElement LoginButton;
	
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']") private WebElement Forgotidorpassword;
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement KiteLogo;
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement Text;
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement PlayStoreLink;
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement AppleStoreLink;
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement SineUpLink;
	
	@FindBy (xpath = "//input[@id = 'userid']") private WebElement ZerodhaLink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logintokite() throws EncryptedDocumentException, IOException
	{
	//	String UN = Utility.getexcelvalue("Sheet1", 1, 0);
	//	System.out.println(UN);
		username.sendKeys("MPT851");
	//	String PD = Utility.getexcelvalue("Sheet1", 1, 1);
		Password.sendKeys("NeverGiveUp@91");
		LoginButton.click();
	}

}
