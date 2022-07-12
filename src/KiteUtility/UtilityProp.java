package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Dell\\Pictures\\Camera Roll\\ScreenShot\\MyScreenShot"+TCID+".png");
		FileHandler.copy(scr, dest);
		
		
	}
	public static String getDataFromPropertyFile(String key) throws IOException 
	{
		Properties prop=new Properties();//create object of properties
	    FileInputStream myfile=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\26March_B_Selenium\\myPropertie.properties");
		
		prop.load(myfile);
		String value=prop.getProperty(key);
	
		return value;
		
	}
	
}
