package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
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
		 String expectedTitle ="Swag Labs";
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
	@Test(enabled=false)
	public void verifyLoginToAppTest() throws Exception
	{
	 String actUrl = login.loginToApp();
	 String expUrl = "https://www.saucedemo.com/inventory.html";
	 Assert.assertEquals(actUrl, expUrl);
	}
	@Test(enabled=false)
	public void verifyInventryPageLabelTest() throws Exception
	{
		 String actResult = login.verifyInventryPageLabel();
		 String expresult = "PRODUCTS";
		 Assert.assertEquals(actResult, expresult);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
