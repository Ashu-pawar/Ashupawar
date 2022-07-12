package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//find element
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys("Good Morning");    using WebElement method
		//How to send Keys using actions class
		//create object of actions class and pass driver method
		Actions act=new Actions(driver);
		// using send keys method of actions class perform sendkeys task
		act.sendKeys(textBox, "GOOD MORNING").perform();
		
		//How To handle drop down using actions class
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		// using action class method handle drop down
		Thread.sleep(2000);
		act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		

	}

}
