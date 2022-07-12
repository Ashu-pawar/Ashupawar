package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		seleniumButton.click();

		Actions act = new Actions(driver);
		
		//act.moveToElement(seleniumButton).perform();
		//act.click().perform();
		
		//act.moveToElement(seleniumButton).click().build().perform();
		//act.click(seleniumButton).perform();
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		act.contextClick(rightClickButton).perform();
		
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//act.moveToElement(doubleClickButton).doubleClick().build().perform();
		act.doubleClick(doubleClickButton).perform();
		
		
		
		
		
		

	}

}
