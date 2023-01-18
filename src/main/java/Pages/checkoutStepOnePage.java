package Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod1;

public class checkoutStepOnePage extends TestBase {
	
	@FindBy(xpath="//span[@class='title']")private WebElement chechOutText;
	@FindBy(xpath="//input[@id='first-name']")private WebElement firstNameTextbox;
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastNameTextbox;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement postalCodeTextbox;
	@FindBy(xpath="//input[@id='continue']")private WebElement continueBtn;
	
	
	public checkoutStepOnePage()
	{
	  PageFactory.initElements(driver,this);	
	}
	
	public String verifyCheckoutText()
	{
		return chechOutText.getText();
	}
	
	public String checkOutDetails() throws Exception
	{
//		firstNameTextbox.sendKeys("prathamesh");
//		lastNameTextbox.sendKeys("kaingade");
//		postalCodeTextbox.sendKeys("416114");
//		Thread.sleep(5000);
		
		firstNameTextbox.sendKeys(UtilityMethod1.readPropertyChechoutOne("firstname"));
		lastNameTextbox.sendKeys(UtilityMethod1.readPropertyChechoutOne("lastname"));
		postalCodeTextbox.sendKeys(UtilityMethod1.readPropertyChechoutOne("postalcode"));
		Thread.sleep(5000);
		continueBtn.click();
		return driver.getCurrentUrl();
		
	}
	

	
	
	
}
