package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fb {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.linkText("Create New Account")).click();
	   Thread.sleep(2000);
	   WebElement day = driver.findElement(By.id("day"));
	 
	   Actions act=new Actions(driver);
	   Thread.sleep(2000);
	   act.click(day).perform();
	   
	   for(int i=1;i<=4;i++)
	   {
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   Thread.sleep(2000);
	   }
	   act.sendKeys(Keys.ENTER).perform();
	   
	   WebElement firstname = driver.findElement(By.name("firstname"));
	  // firstname.sendKeys("Ashwini");
	   act.keyDown(firstname,Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("shwini").build().perform();
	   

	}

}
