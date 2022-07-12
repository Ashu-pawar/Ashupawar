package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement destination = driver.findElement(By.id("amt8"));
	 Actions act=new Actions(driver);
	 //act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
	 act.dragAndDrop(source, destination).perform();
	}

}

