package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationClass {
  @Test
  public void ValidUserID()
  {
	  Reporter.log("Vlidated User ID",true);
  }
}
