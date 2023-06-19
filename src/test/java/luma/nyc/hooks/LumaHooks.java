package luma.nyc.hooks;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.nyc.basepage.SuperClass;
import luma.nyc.elementspage.LumaPageFactory;

public class LumaHooks extends SuperClass  {
	
	@Before
	public void setUp() {
		initialization();
		
		LumaPageFactory pf = new LumaPageFactory() ;
		PageFactory.initElements(driver, pf);
		pf.getLogin();

	} 

	//@After
	public void tearDown() {
		driver.quit();
	}
}
