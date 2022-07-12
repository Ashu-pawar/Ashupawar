package KiteTest;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.BaseNew;
import KiteUtility.UtilityProp;
import kiteAppPOMUsingTestNG.KiteHomePage;
import kiteAppPOMUsingTestNG.KiteLoginPage;
import kiteAppPOMUsingTestNG.KitePinPage;

public class ValidateKiteIDUseingProperties extends BaseNew {

	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="555";
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		 openBrowser();
		
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
	}
	
	

	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	
  @Test
  public void validateUserID () throws IOException
  {
	  Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	UtilityProp.captureScreenShot(driver,TCID);
	  
  }
  
  @AfterMethod()
  public void logOutFromKite() throws InterruptedException
  
  {
	  home.logOut();
	  
  }
  @AfterClass()
  public void closeBrowser()
  {
	

	driver.close();
	  
  }
  
}
