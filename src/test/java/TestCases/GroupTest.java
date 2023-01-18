package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {
	LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage();
	}
	
	@Test(groups = "sanity",priority = 1 )
	public void verifyTitleTest()
	{
		 String actualTitle = login.verifyTitle();
		 String expectedTitle ="Swag Labs";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 Assert.assertTrue(true);
	}
	
	@Test(groups = "smoke", dependsOnMethods = "verifyTitleTest",priority = 2)
	public void verifyCurrentUrlTest()
	{
		String actualUrl = login.verifyUrl();
		String expectedUrl ="https://www.saucedemo.com/";
		Assert.assertEquals(actualUrl,expectedUrl);
	}
	@Test(groups = "sanity",enabled = true,priority = 3)
	public void verifyLoginLogoTest()
	{
		 boolean loginLogo = login.verifyLoginlogo();
		 Assert.assertEquals(loginLogo,true);
	}
	@Test(groups = "smoke", enabled = true)
	public void verifyBotLogoTest()
	{
		boolean botLogo = login.verifyBotLogo();
		Assert.assertEquals(botLogo, true);
	}
	@Test(groups = {"sanity","regression"},enabled=false)
	public void verifyLoginToAppTest() throws Exception
	{
	 String actUrl = login.loginToApp();
	 String expUrl = "https://www.saucedemo.com/inventory.html";
	 Assert.assertEquals(actUrl, expUrl);
	}
	@Test(groups = {"smoke","regression"},enabled = false)
	public void verifyInventryPageLabelTest() throws Exception
	{
		 String actResult = login.verifyInventryPageLabel();
		 String expresult = "PRODUCTS";
		 Assert.assertEquals(actResult, expresult);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
}
