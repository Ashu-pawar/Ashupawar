package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiplevereification {
  @Test
  public void Mymethod()
  {
	  
	  String a="Pune1";
	  String b="Pune1";
	  String c=null;
	  
	  Assert.assertNotEquals(a,b," TC is failed values are equal");
	  
	  Assert.assertNull(c,"value is not null TC is failed ");
	  
			  
  }
}
