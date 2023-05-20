package luma.nyc.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			plugin= {"pretty","json:target/cucumber.json" }, 
			features = { ".//Features/" },
			glue = {"luma.nyc.stepdefinitions", "luma.nyc.hooks"}
	) 
public class LumaRunner extends AbstractTestNGCucumberTests {

}
