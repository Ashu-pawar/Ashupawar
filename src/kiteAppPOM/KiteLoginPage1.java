package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 

	{
		//1
		@FindBy(id="userid")private WebElement userName;
		@FindBy(id="password")private WebElement password;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
		
		
		//2
		public  KiteLoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//3
		
		public void sendUserName()
		{
			userName.sendKeys("ELR321");
			
		}
		public void sendPassword()
		{
			password.sendKeys("Dhana1111");
		}
		public void clickOnLoginButton()
		{
			loginButton.click();
		}
	

	}


