package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoInvocationTimeOutTest extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage();
	}
	
	@Test(enabled = false, invocationCount = 3 )
	public void verifyTitleTest()
	{
		 String actualTitle = login.verifyTitle();
		 String expectedTitle ="Swag Labs";
		 Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@Test(enabled= true, timeOut = 200)
	public void verifyCurrentUrlTest() throws Exception
	{
		String actualUrl = login.verifyUrl();
		String expectedUrl ="https://www.saucedemo.com/";
		Thread.sleep(2000);
		Assert.assertEquals(actualUrl,expectedUrl);
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}

}
