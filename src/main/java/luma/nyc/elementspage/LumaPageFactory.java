package luma.nyc.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.nyc.basepage.SuperClass;
import luma.nyc.generic.CommonUtil;

public class LumaPageFactory extends SuperClass {

	
	public LumaPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Sign In")
	@CacheLookup
	private WebElement clickSigninAtHomePage;

	public WebElement getClickHomePageSignin() {
		return clickSigninAtHomePage;
	}

	@FindBy(xpath = "//*[@id= 'email']")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(xpath = "//*[@id= 'pass']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(id = "send2")
	@CacheLookup
	private WebElement clickFinalSignin;

	public WebElement getClickSignin() {
		return clickFinalSignin;
	}
	
	public void getLogin() {
		CommonUtil.actionClick(clickSigninAtHomePage);
		enterEmail.sendKeys(prop.getProperty("UserName"));
		enterPassword.sendKeys("Password");
		CommonUtil.actionClick(clickFinalSignin);
	}
}
