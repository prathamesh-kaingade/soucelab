package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod1;

public class InventoryPage extends TestBase {

	
//	Object repository
	@FindBy(xpath="//div[@class='peek']")private WebElement peekLogo;
	@FindBy(xpath ="//img[@class='footer_robot']")private WebElement footerLogo;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement backPack;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement boltTshirt;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement fleeceJacket;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sortProduct;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cartLink;
	public InventoryPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifyFooterLogo()
	{
		return footerLogo.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		
		UtilityMethod1.selectAddProduct(sortProduct, "Price (low to high)");
//		Select s = new Select(sortProduct);
//		s.selectByVisibleText("Price (low to high)");
		Thread.sleep(5000);
		backPack.click();
		bikeLight.click();
		boltTshirt.click();
		fleeceJacket.click();
		Thread.sleep(5000);
		cartLink.click();
		Thread.sleep(5000);
		return cartLink.getText();
		
		}
	
	
	
	
	
	
}
