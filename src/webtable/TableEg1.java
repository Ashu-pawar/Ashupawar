package webtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
	     
		List<WebElement> Rows = driver.findElements(By.xpath("//table//tr"));
		int totalNumberofRows=Rows.size();
		System.out.println("Total Number of Rows in table "+totalNumberofRows);
		
		List<WebElement> columns =driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalNumberOfcolumns=columns.size();
		System.out.println("Total Number of columns are"+totalNumberOfcolumns);
		
		for(WebElement header:columns)
		{
			System.out.println(header.getText()+" ");
			
		}
		
	   List<WebElement> allrowsData = driver.findElements(By.xpath("//table//tr"));
	   Iterator<WebElement> it = allrowsData.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next().getText()+" ");
		   System.out.println();
	   }
		
	

	}

}
