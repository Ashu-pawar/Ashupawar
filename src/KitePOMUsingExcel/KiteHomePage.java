package KitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//1
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
	
	
	//2
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	//3
	
	public void validateUserName(String expectedUserID)
	{
		String expectedUserName=expectedUserID;
		String actualUserName=userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and Expected user ID is Matching TC is PASSED");
			
		}
		else
		{
			System.out.println("Actrual and Expected user ID is not matching TC is FALIED");
			
		}
	}
	public void logOut() throws InterruptedException
	{
		userName.click();
	
	Thread.sleep(1000);
	logOutButton.click();
	
	}
	

}
