package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMthode() 
  {
	  boolean a= true;
	  boolean b=false;
//	  Assert.assertTrue(b,"TC is failed value is false");
//	  Reporter.log("TC is passed value is true ",true);
//  
	  Assert.assertNotEquals(a,b,"a and b values are not matching TC failed");
      Reporter.log("a and b values are not martching TC passsed ",true);
  }
}
