package kiteapptesting;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://kite.zerodha.com/");
	   
	   Thread.sleep(2000);
	   WebElement userID = driver.findElement(By.id("userid"));
	   WebElement passWard = driver.findElement(By.id("password"));
	   WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	   
	   userID.sendKeys("ELR321");
	   passWard.sendKeys("Dhana1111");
	   LoginButton.click();
	   
	   Thread.sleep(1000);
	   WebElement PIN = driver.findElement(By.id("pin"));
	   WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	   
	   PIN.sendKeys("982278");
	   continueButton.click();
	   Thread.sleep(1000);
	   WebElement userName = driver.findElement(By.xpath("//Span[@class='user-id']"));
	   String actualUserId = userName.getText();
	  String expectedUserId = "ELR321";
	  if(actualUserId.equals(expectedUserId))
	  {
		  System.out.println("Userd ID matching TC is Passed");
		  
	  }
	  else
	  {
		  System.out.println("User ID not matching TC is failed");
	  }
	  userName.click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@target='_self']")).click();
	  
	  Thread.sleep(3000);
	  driver.close();
	  
	  
	   
	

	}

}
