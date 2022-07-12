package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualUse {
  @Test
  public void myMethod() 
  {
	  String a="pune";
	  String b="pune";
//	  Assert.assertEquals(a,b,"a and b value are not matching TC is failed");
//	  Reporter.log("a and b value are matching TC passed",true);
	  
	  Assert.assertNotEquals(a,b,"a and b value are matching TC is failed");
	  Reporter.log("a and b value are not matching TC is passed",true);
  }
}
