package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class cartPage extends TestBase {
	
	//object repository
	@FindBy(xpath="//div[@class='app_logo']")private WebElement appLogo;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement removeBtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cartCount;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkoutBtn;
	
	public cartPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyCartPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public boolean verifyLogo()
	{
	    return appLogo.isDisplayed();
	}
	
	public void removeProduct()
	 {
		 removeBtn.click();
	 }
	 
	public String cartCountAfterRemove()
	{
		return cartCount.getText();
	}
	public String checkoutButton() throws Exception 
	{
		checkoutBtn.click();
		Thread.sleep(5000);
		 return driver.getCurrentUrl();
	}

}
