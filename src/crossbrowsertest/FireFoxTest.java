package crossbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void myMethod() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	  Thread.sleep(2000);
	  
  }
}
