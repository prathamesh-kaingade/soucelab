package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.cartPage;


public class cartPageTest extends TestBase {
	LoginPage login;
	 InventoryPage inventory;
	 cartPage cart;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new LoginPage();
	    inventory = new InventoryPage();
	    login.loginToApp();
	    inventory.addProduct();
	    cart = new cartPage();
	  }
	
	@Test(enabled=false)
	public void verifyCartPageUrlTest() throws Exception
	{
	 	String actUrl = cart.verifyCartPageUrl();
	 	String expUrl = "https://www.saucedemo.com/cart.html";
	 	Assert.assertEquals(actUrl,expUrl);
	}
	
	@Test(enabled=false)
	public void verifyLogoTest()
	{
		boolean actResult = cart.verifyLogo();
		Assert.assertEquals(actResult, true);
	}
	
	@Test
	public void cartCountAfterRemoveTest()
	{
		cart.removeProduct();
		String actCount = cart.cartCountAfterRemove();
		String expCount = "3";
		Assert.assertEquals(actCount,expCount);
	}
	
	@Test(priority=1)
	public void checkoutButtonTest() throws Exception
	{
		String actResult = cart.checkoutButton();
		String expResult = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(actResult,expResult);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();	
	}

}
