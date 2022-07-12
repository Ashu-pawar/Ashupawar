package KitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	
	{ 
		File myFile = new File("C:\\Users\\Dell\\Desktop\\Ashu\\selenium labraries\\textExelbatch.xlsx");
		Sheet mySheet=WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		String UN=mySheet.getRow(4).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(4).getCell(1).getStringCellValue();
		String PIN=mySheet.getRow(4).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
				login.sendUserName(UN);
		        login.sendPasssword(PWD);
		        login.clickOnLoginButton();
		        
		        Thread.sleep(1000);
		        KitePinPage pin=new KitePinPage(driver);
		        pin.sendPin(PIN);
		        pin.clickOnContinueButton();
		        
		        Thread.sleep(1000);
		        KiteHomePage home=new KiteHomePage(driver);
		        home.validateUserName(UN);
		        home.logOut();
		        
		        driver.close();
		        
		
		
		

	}

}
