package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.cartPage;
import Pages.checkoutStepOnePage;

public class CheckoutStepOnePageTest extends TestBase{
	
	LoginPage login;
	InventoryPage inventory;
	cartPage cart;
	checkoutStepOnePage checkout1;
	@BeforeMethod
	public void setup() throws Exception 
	{
		initalization();
		 login = new LoginPage();
		 login.loginToApp();
		  inventory =new InventoryPage();
		  inventory.addProduct();
		   cart = new cartPage();
		   cart.checkoutButton();
		    checkout1 = new checkoutStepOnePage();
	}
	
	@Test
	public void verifyCheckoutTextTest()
	{
	  String actResult = checkout1.verifyCheckoutText();
	  String expResult = "CHECKOUT: YOUR INFORMATION";
	  Assert.assertEquals(actResult, expResult);
	  
	}
	
	@Test
	public void  checkOutDetailsTest() throws Exception
	{
		String actResult = checkout1.checkOutDetails();
		String expResult = "https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(actResult,expResult);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
