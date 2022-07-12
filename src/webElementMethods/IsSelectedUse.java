package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
		checkBox1.click();
		if(checkBox1.isSelected())
		{
			System.out.println("CheckBox is already selected");
		}
		else
		{
			checkBox1.click();
			
			System.out.println("ckeckBox is now selected");
		}
		

	}

}
