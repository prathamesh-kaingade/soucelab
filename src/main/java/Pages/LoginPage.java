package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	
//	Object Repositary
	@FindBy(xpath="//input[@id='user-name']")private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement passward;
	@FindBy(xpath="//div[@class='login_logo']")private WebElement Loginlogo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement botlogo;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath="//span[@class='title']")private WebElement inventryLabel;
	
	//Constructor	to	initialize	the	elements	of	page
	public LoginPage()
	{
		PageFactory.initElements(driver , this);
	}
	
	public boolean verifyLoginlogo()
	{
		return Loginlogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
		return botlogo.isDisplayed();
	}
	
	
	public  String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public  String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	public String loginToApp() throws Exception
	{
//		username.sendKeys("standard_user");
		username.sendKeys(ReadData.readProperty("username"));
//		passward.sendKeys("secret_sauce");
		passward.sendKeys(ReadData.readExcelFile(1,0));
	    loginBtn.click();
	    return driver.getCurrentUrl();
	}
	public String verifyInventryPageLabel() throws Exception
	{
		loginToApp();
		return inventryLabel.getText();
		
		
	}

}
