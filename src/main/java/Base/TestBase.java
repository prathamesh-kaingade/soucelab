package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
//	To open url through chrome driver
	public void initalization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ReadData.readProperty("url"));
//		driver.get("https://www.saucedemo.com/");
// 		i have updated
		
	}
	


}
