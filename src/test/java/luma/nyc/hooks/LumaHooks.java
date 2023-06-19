package luma.nyc.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.nyc.basepage.SuperClass;

public class Hooks extends SuperClass {

	@Before
	public void setUp() {
		getOpenBrowser();

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
