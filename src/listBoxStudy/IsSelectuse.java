package listBoxStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelectuse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement createacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createacc.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.name("birthday_month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		Select s1=new Select(day);
		Select s2=new Select(Month);
		Select s3=new Select(Year);
		
		
		s1.selectByIndex(15);
		s2.selectByValue("12");
		s3.selectByVisibleText("1996");
		
		
	}

}

