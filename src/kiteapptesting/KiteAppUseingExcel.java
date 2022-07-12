package kiteapptesting;


import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUseingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File myfile = new File("C:\\Users\\Dell\\Desktop\\Ashu\\selenium labraries\\textExelbatch.xlsx");
  

		Sheet mysheet=WorkbookFactory.create(myfile).getSheet("sheet2");
		 String UN = mysheet.getRow(4).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(4).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(4).getCell(2).getStringCellValue();
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		 
		 WebElement userid = driver.findElement(By.id("userid"));
		 WebElement passward = driver.findElement(By.id("password"));
		 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 
		 userid.sendKeys(UN);
		 passward.sendKeys(PWD);
		 loginButton.click();
		 Thread.sleep(2000);
		 
		 WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		continueButton.click();
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserID=userName.getText();
		String expectedUserID=UN;
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("UserID is matching TC pass");
		}
		else
		{
			System.out.println("UserID is not matching TC is  failed");
		}
		userName.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(1000);
		driver.close();
		
		
		
		 
		 
	}

}
