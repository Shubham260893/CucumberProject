package stepdefinitions;

import org.openqa.selenium.WebDriver;

import CommonSeleniumMethods.SeleniumActions;
import PageLocators.CarGuideHomepage;
import PageLocators.SearchCarLocator;
import TestBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCars extends SeleniumActions{
	
	SearchCarLocator scl;
	CarGuideHomepage cghome;
	
	@Given("I am on the home page of cars guide")
	public void i_am_on_the_home_page_of_cars_guide() {
		TestBase.setUpDriver();
	}

	@When("I click on menu and click on Search cars")
	public void i_click_on_menu_and_click_on() {
		
		
		cghome= new CarGuideHomepage();
		cghome.hoverElement();
		scl= cghome.clickonSearchCar();
	   
	}

	@When("select car brand as {string} from Anymake dropdown")
	public void select_car_brand_as_from_anymake_dropdown(String maker) throws InterruptedException {
		Thread.sleep(5000);
	    scl.selectmaker(maker);
	}

	@When("select car model as {string} from model dropdown")
	public void select_car_model_as_from_model_dropdown(String model) {
		scl.selectmodel(model);
	}

	@When("select location as {string} from location dropdown")
	public void select_location_as_from_location_dropdown(String location) {
	    scl.selectlocation(location);
	}

	@Then("I click on Find my new car")
	public void i_click_on_find_my_new_car() {
	   scl.clickSearch();
	}

	@Then("validate the title")
	public void validate_the_title() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
