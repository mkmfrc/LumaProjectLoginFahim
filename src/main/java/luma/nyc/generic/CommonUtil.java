package luma.nyc.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import luma.nyc.basepage.SuperClass;

public class CommonUtil extends SuperClass{
	
	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
}
