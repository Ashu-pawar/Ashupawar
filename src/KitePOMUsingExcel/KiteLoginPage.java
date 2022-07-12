package KitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	//1
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	
	//2
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//3
	
	public void sendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	public void sendPasssword(String passWord)
	{
		password.sendKeys(passWord);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	

}
