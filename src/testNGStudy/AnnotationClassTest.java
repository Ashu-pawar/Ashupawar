package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationClassTest {
  @BeforeMethod
  public void kiteapplogin()
  {
	  Reporter.log("LogIN success",true);
  }

  @AfterMethod
  public void Kiteapplogout() 
  {
	  Reporter.log("Logout success",true);
  }

  @BeforeClass
  public void LaunchBrowser() 
  {
	  Reporter.log("browser launched",true);
  }

  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("close Browser");
  }


  @Test
  public void ValidUserIDTest()
{
	  Reporter.log("Validaed User ID",true);
    
  }
}
