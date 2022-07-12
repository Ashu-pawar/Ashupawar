package dropDrownStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEX1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
	
		Select s=new Select(day);
		s.selectByValue("16");
		List<WebElement> DayOptions = s.getOptions();
		
		System.out.println(DayOptions.size());
		
		s.selectByIndex(1);
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Thread.sleep(4000);
		Select s1=new Select(Month);
		
		s1.selectByIndex(11);
		Thread.sleep(3000);
		s1.selectByValue("3");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2=new Select (year);
		s2.selectByIndex(1);
		
	}

}
