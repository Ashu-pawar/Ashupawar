package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestNGclass {
  @Test
  public void mymethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
  }
  @Test
  public void mymethod1() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://skpatro.github.io/demo/links/");
  }
}
