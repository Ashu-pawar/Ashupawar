package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
          WebDriver driver= new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://vctcpune.com/selenium/practice.html");
          
          WebElement hide = driver.findElement(By.id("hide-textbox"));
          WebElement show = driver.findElement(By.id("show-textbox"));
          WebElement textBox = driver.findElement(By.name("show-hide"));
          
         if(textBox.isDisplayed())
         {
        	 System.out.println("thank you test box is diplayed");
         }
         else
         {
        	 System.out.println("cant find textbox");
        	 
         }
         hide.click();
         if(textBox.isDisplayed());
         {
        	 System.out.println("thank you test box displayed");
        	 
        	}
         
         {
        	 System.out.println("cant find textbox");
         }
         Thread.sleep(2000);
        show.click();
        Thread.sleep(1000);
        if(textBox.isDisplayed());
        {
        	System.out.println("thank you test box displayed");
        }
        
        {
        	System.out.println("cant find textBox");
        }
        	 }
}
