package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class PriorityUse {
  @Test(priority=-1)
  public void d()
  {
	  Reporter.log("d is running",true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a is running",true);
  }
  @Test
  public void v()
  {
	  Reporter.log("v is running",true);
  }
}
