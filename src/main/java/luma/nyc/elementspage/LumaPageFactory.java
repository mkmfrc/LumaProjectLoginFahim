package luma.nyc.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.nyc.basepage.SuperClass;

public class LumaPageFactory extends SuperClass {

	public LumaPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class= 'authorization-link']//descendant::a")
	@CacheLookup
	private WebElement ClickSigninButtion;

	public WebElement getClickSigninButtion() {
		return ClickSigninButtion;
	}

	@FindBy(xpath = "(//*[text()= 'Customer Login'])[2]")
	@CacheLookup
	private WebElement CustLoginText;

	public WebElement getCustLoginText() {
		return CustLoginText;
	}

	@FindBy(xpath = "//*[@id= 'email']")
	@CacheLookup
	private WebElement enterUserID;

	public WebElement getEnterUserID() {
		return enterUserID;
	}

	@FindBy(xpath = "//*[@id= 'pass']")
	@CacheLookup
	private WebElement enterPass;

	public WebElement getEnterPass() {
		return enterPass;
	}

	@FindBy(xpath = "//*[@id= 'send2']")
	@CacheLookup
	private WebElement clickSignIn;

	public WebElement getClickSignIn() {
		return clickSignIn;
	}

	@FindBy(xpath = "//*[text()='Welcome, Selenium ProjectUser!']")
	@CacheLookup
	private WebElement welcomeText;

	public WebElement getwelcomeText() {
		return welcomeText;
	}
}
