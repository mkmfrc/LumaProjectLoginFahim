package luma.nyc.stepdefinitions;

import io.cucumber.java.en.*;
import luma.nyc.basepage.SuperClass;
import luma.nyc.elementspage.LumaPageFactory;
import luma.nyc.generic.CommonUtil;
import org.testng.Assert;

public class LumaStepDef extends SuperClass {

	LumaPageFactory pf;

	@Given("Navigate to url {string}")
	public void navigate_to_url(String string) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.get(prop.getProperty("QA_ENV"));
	}

	@When("User able to click on Sign In button")
	public void user_able_to_click_on_sign_in_button() throws InterruptedException {
		Thread.sleep(1000);
		pf = new LumaPageFactory();
		CommonUtil.actionClick(pf.getClickSigninButtion());
	}

	@Then("Verify Customer Login text are available on the screen")
	public void verify_customer_login_text_are_available_on_the_screen() {

		String loginText = pf.getCustLoginText().getText();
		Assert.assertEquals(loginText, "Customer Login");
		System.out.println("Validation Text : " + loginText);
	}

	@When("Enter correct email address and password")
	public void enter_correct_email_address_and_password() throws InterruptedException {
		Thread.sleep(1000);
		pf.getEnterUserID().sendKeys(prop.getProperty("UserName"));
		
		Thread.sleep(1000);
		pf.getEnterPass().sendKeys(prop.getProperty("Password"));
	}

	@When("Click {string} button")
	public void click_button(String string) throws InterruptedException {
		Thread.sleep(1000);
		CommonUtil.actionClick(pf.getClickSignIn());
	}

	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String string) throws InterruptedException {
		Thread.sleep(2000);
		String welcomeText = pf.getwelcomeText().getText();
		Assert.assertEquals(welcomeText, "Welcome, Selenium ProjectUser!");
		System.out.println("Validation Text : " + welcomeText);
		Thread.sleep(1000);
	}
}
