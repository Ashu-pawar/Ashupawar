package testNGstudykit;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoTationStudy {
  @Test
  public void validateUserID()
  {
	  Reporter.log("user ID Validate",true);
  }
  @Test 
  public void validateDashBoard()
  {
	  Reporter.log("Dash Board Validate",true);
	  
  }
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("login success",true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("browser launched",true);
  }
  @AfterMethod
  public void logoutFromeKitApp()
  {
	  Reporter.log("loging out",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser closed",true);
  }
}
