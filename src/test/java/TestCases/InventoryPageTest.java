package TestCases;


import org.apache.poi.hssf.record.FooterRecord;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {
	LoginPage login;
	InventoryPage inventory ;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		inventory = new InventoryPage();
		login.loginToApp();
		
	}
	@Test(enabled=false)
	public void verifyPeekLogoTest()
	{
		boolean actResult = inventory.verifyPeekLogo();
		Assert.assertEquals(actResult, true);
		Reporter.log("peekLogo is displayed");
	}

	@Test(enabled=false)
	public void verifyFooterLogo()
	{
		boolean actResult = inventory.verifyFooterLogo();
		Assert.assertEquals(actResult, true);
	}
	
	@Test(groups = {"smoke","regression"})
	public void addProductTest() throws Exception
	{
		String actResult = inventory.addProduct();
		String expResult = "4";
		Assert.assertEquals(actResult, expResult);
		Reporter.log("Total no of product added="+actResult);
	}
	
	
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}

}
