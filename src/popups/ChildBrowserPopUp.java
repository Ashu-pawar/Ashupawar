package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);
		
		System.out.println("================================");
		//to open child window
	    driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		//to handle multiple windows/to get multiple ids
		Set<String> childPageId = driver.getWindowHandles();
		//System.out.println(childPageId);
		
		Iterator<String> it = childPageId.iterator();
		//while(it.hasNext())
		//{
		//	System.out.println(it.next());
	//	}
		String mainpageid1=it.next();
		String childpageid = it.next();
		
		
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("selenuim");
		
		driver.switchTo().window(mainpageid1);
		WebElement myelement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(myelement.getText());
		
		

	}




}
