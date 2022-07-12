package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() 
  {
	  
	  String a="abc";
	  String b="abc";
	  
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a,b,"Both are equal TC is failed");
	  soft.assertNull(b,"value is not null TC is failed");
	  soft.assertAll();
  }
  @Test
  public void testing()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(b,"value is false Tc is failed");
	  s.assertFalse(a,"value is true TC is failed");
	  s.assertAll();
  }
}
