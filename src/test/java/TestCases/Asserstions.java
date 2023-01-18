package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;

public class Asserstions extends TestBase{
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage();
	}
	//Hard assertion 
	@Test(enabled=false)
	public void verifyTitleTest()
	{
		System.out.println("hard assertion started");
		 String actualTitle = login.verifyTitle();
		 String expectedTitle ="Swag Labs";
		 Assert.assertEquals(actualTitle,expectedTitle);
		 System.out.println("hard assertion ended");
	}
	//Soft Assertion 
	@Test
	public void verifyCurrentUrlTest() throws Exception
	{
		System.out.println("Execution started");
		SoftAssert soft = new SoftAssert();
		String actualUrl = login.verifyUrl();
		String expectedUrl ="https://www.saucedemo1.com/";
		soft.assertEquals(actualUrl,expectedUrl);
		System.out.println("Execution ended");
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}

}
