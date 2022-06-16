package POM_PKG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilPKG.Utility;

public class VarificationCode {
	@FindBy (xpath = "//input[@type='password']") private WebElement VARIFICATIONPIN;
	@FindBy (xpath = "//button[@type='submit']") private WebElement CONTINUEBUTTON;
	
	public VarificationCode(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VARIFYPIN()
	{
	//	VARIFICATIONPIN.sendKeys(Utility.getexcelvalue("Sheet1", 1, 2));
		VARIFICATIONPIN.sendKeys("911991");
		CONTINUEBUTTON.click();
	}
}
