package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class UtilityMethod1 extends TestBase {

	public static void selectAddProduct(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	public static String readPropertyChechoutOne(String value) throws Exception 
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\91928\\eclipse-workspace\\MavenProject\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(value);
	}
	
	public static void captureScreenShot(String name) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91928\\eclipse-workspace\\MavenProject\\ScreenShots/"+name+".jpeg");
		FileHandler.copy(source, destination);
	}
}
