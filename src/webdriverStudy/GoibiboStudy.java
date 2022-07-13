package webdriverStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/");
		driver.findElement(By.xpath("//a[@class='nav-link active']"));
		driver.get("https://www.goibibo.com/bus/");
		driver.findElement(By.xpath("(//input[@spellcheck='false'])[1]")).sendKeys("pune");
		
	System.out.println("ashu");

	}

}
