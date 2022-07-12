package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium_2
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://vctcpune.com/selenium/practice.html");
	     driver2.findElement(By.xpath("//input[@name='radio']")).click();
	     driver2.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ashu");
	     driver2.manage().window().maximize();
	 
	     //driver2.manage().window().minimize();
	    
	     

	}

}
