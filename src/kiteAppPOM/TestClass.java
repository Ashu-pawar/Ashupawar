package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Ashu\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
        KiteLoginPage1 login=new KiteLoginPage1(driver);
        login.sendUserName();
        login.sendPassword();
        login.clickOnLoginButton();
        Thread.sleep(1000);
        
        
        KitePinPage1 pin=new KitePinPage1(driver);
        pin.sendPin();
        pin.clickOnContinueButton();
        Thread.sleep(1000);
        
        KiteHomePage1 home=new KiteHomePage1(driver);
        home.validateUserName();
        home.logOut();
        
        
        driver.close();
	}

}
