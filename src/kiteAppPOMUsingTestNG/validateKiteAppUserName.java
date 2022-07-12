package kiteAppPOMUsingTestNG;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validateKiteAppUserName{
	
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("LaunchingBrowser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myFile = new File("C:\\Users\\Dell\\Desktop\\Ashu\\selenium labraries\\textExelbatch.xlsx");
		mySheet=WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		}
	
	@BeforeMethod
	public void loginToKiteApp()
	{
		String UN=mySheet.getRow(4).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(4).getCell(1).getStringCellValue();
		String PIN=mySheet.getRow(4).getCell(2).getStringCellValue();
		
		login.sendUserName(UN);
		Reporter.log("sending userName",true);
		login.sendPassword(PWD);
		Reporter.log("sending Password",true);
		login.clickOnLoginButton();
		Reporter.log("clicklin on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		pin.sendPin(PIN);
		Reporter.log("sending Pin",true);
		pin.clickOnContinueButton();
		Reporter.log("clicking on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		}
 @Test
  public void validateUserName()
  {
	 String expectedUN=mySheet.getRow(4).getCell(0).getStringCellValue();
	 String actualUN=home.getActualUserName();
	 Reporter.log("validateUserName",true);
	 Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC is failed");
	 Reporter.log("Actual and Expected UN are matching TC Passed",true);
	 }
 
 @AfterMethod
 public void logoutFromKiteApp() throws InterruptedException
 { Thread.sleep(1000);
	 home.logOut();
	 Reporter.log("loging out ",true);
	
	 
}
 
 @AfterClass
 public void closeBrowser() throws InterruptedException
 {
	 Thread.sleep(2000);
	 Reporter.log("closeing Browser",true);
	 driver.close();
 }
 
}
