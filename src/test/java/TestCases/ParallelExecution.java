package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {
	@Test
	public void Test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
	}
	@Test
	 public void Test2 () throws Exception 
	 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://meet.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		  driver.close();
	 }
	@Test
	 public void Test3 () throws Exception 
	 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		  driver.close();
	 }
	@Test
	 public void Test4 () throws Exception 
	 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		  driver.close();
	 }

}
