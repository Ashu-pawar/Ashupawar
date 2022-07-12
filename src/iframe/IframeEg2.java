package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(0);//changing focus from main page to frame1
		String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(text1);
		
		driver.switchTo().parentFrame();//switch focus from frame to main page
		String text2 = driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(text2);
		

	}

}
