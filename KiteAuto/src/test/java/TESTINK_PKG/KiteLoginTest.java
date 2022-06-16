package TESTINK_PKG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePKG.BaseClass;
import POM_PKG.KiteHeader;
import POM_PKG.LoginPage;
import POM_PKG.VarificationCode;
import UtilPKG.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class KiteLoginTest extends BaseClass {
	WebDriver driver;
	int testnum = 1;
	
@Parameters ("browsername")
  @BeforeTest
  public void launchbrwser1(String browsername) {
	  if(browsername.equals("chromeBrowser"))
	  {
		  driver = launchchromebrowser();
	  }
	  if(browsername.equals("edgeBrowser"))
	  {
		  driver = launchedgebrowser();
	  }
  }

  @BeforeMethod
	public void login2kite()
	{		  
	  System.out.println("test " +testnum + " started");
	}
   
  @BeforeClass
	public void launchbrwser() throws IOException
	{
	  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
			LoginPage loginpage = new LoginPage(driver);
			driver.manage().window().maximize();
			loginpage.logintokite();
		//	List<WebElement> liksonloginpage = driver.findElements(By.xpath("//a[@href]"));
		//	System.out.println("total links on login page " + liksonloginpage.size());
		//	Utility.screensnap(driver);
			VarificationCode varificationcode = new VarificationCode(driver);
			varificationcode.VARIFYPIN();
	}
  @AfterMethod
  public void testcomp()
  {
	  System.out.println("Test nuber " + testnum + " comleted");
	  testnum++;
  }
  
  @AfterClass
  public void closedriver() throws InterruptedException
  {
	KiteHeader kiteheader = new KiteHeader(driver);
	kiteheader.Logout(driver);
	driver.close();
  }
  
  @Test (enabled = false)
  public void ordertabvalidation()
  {
	  SoftAssert softassert = new SoftAssert();
	  KiteHeader kiteheader = new KiteHeader(driver);
	  kiteheader.clickordertab();
	  String Url = driver.getCurrentUrl();
	  String title = driver.getTitle();
	  softassert.assertEquals(Url, "https://kite.zerodha.com/orders");
	  softassert.assertEquals(title, "Orders / Kite");
	  System.out.println("Orders tab validation completed");
	  softassert.assertAll();
  }
  
  @Test (priority = 2)
 public void holdingstabvalidation() throws InterruptedException
  {
	  SoftAssert softassert = new SoftAssert();
	  KiteHeader kiteheader = new KiteHeader(driver);
	  kiteheader.clickholdingstab();
	  String Url = driver.getCurrentUrl();
	  String title = driver.getTitle();
	  softassert.assertEquals(Url, "https://kite.zerodha.com/holdings");
	  softassert.assertEquals(title, "Holdings / Kite");
	  kiteheader.holdingsdropdown(driver);
	  System.out.println("Holdings tab validation completed");
	  softassert.assertAll();
  }
  
  @Test (enabled = false)
 public void positionstabvalodation()
  {
	  SoftAssert softassert = new SoftAssert();
	  KiteHeader kiteheader = new KiteHeader(driver);
	  kiteheader.clickpositionstab();
	  String Url = driver.getCurrentUrl();
	  String title = driver.getTitle();
	  softassert.assertEquals(Url, "https://kite.zerodha.com/positions");
	  softassert.assertEquals(title, "Positions / Kite");
	  System.out.println("Position tab validation completed");
	  softassert.assertAll();
  }
  
  @Test (enabled = false)
  public void fundstabvalodation()
  {
	  SoftAssert softassert = new SoftAssert();
	  KiteHeader kiteheader = new KiteHeader(driver);
	  kiteheader.clickfundstab();
	  String Url = driver.getCurrentUrl();
	  String title = driver.getTitle();
	  softassert.assertEquals(Url, "https://kite.zerodha.com/funds");
	  softassert.assertEquals(title, "Funds / Kite");
	  System.out.println("Funds tab validatation completed");
	  softassert.assertAll();
  }
}
