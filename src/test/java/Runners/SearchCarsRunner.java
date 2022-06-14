package Runners;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions( features= "C:./src/test/resources/features/SearchCars.feature",
				  glue= "stepdefinitions")


public class SearchCarsRunner extends AbstractTestNGCucumberTests {
	
	 private TestNGCucumberRunner testNGCucumberRunner;


	    @BeforeClass(alwaysRun = true)
	    public void setUpCucumber() {
	         testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }

}
