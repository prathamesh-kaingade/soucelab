package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod1;

public class CaptureScreenShot extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage();
	}
	
	@Test(enabled=true)
	public void verifyTitleTest()
	{
		 String actualTitle = login.verifyTitle();
		 String expectedTitle ="Swag1 Labs";
		 Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@Test(enabled=true)
	public void verifyCurrentUrlTest()
	{
		String actualUrl = login.verifyUrl();
		String expectedUrl ="https://www.saucedemo.com/";
		Assert.assertEquals(actualUrl,expectedUrl);
	}
	@Test(enabled=false)
	public void verifyLoginLogoTest()
	{
		 boolean loginLogo = login.verifyLoginlogo();
		 Assert.assertEquals(loginLogo,true);
	}
	@Test(enabled=false)
	public void verifyBotLogoTest()
	{
		boolean botLogo = login.verifyBotLogo();
		Assert.assertEquals(botLogo, true);
	}
	@Test(enabled = false)
	public void verifyLoginToAppTest() throws Exception
	{
	 String actUrl = login.loginToApp();
	 String expUrl = "https://www.saucedemo.com/inventory.html";
	 Assert.assertEquals(actUrl, expUrl);
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE==a.getStatus())
		{
			UtilityMethod1.captureScreenShot(a.getName());
		}
		driver.close();
	}

}
