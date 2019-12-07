package cucumberStepsDefinition;

import cucumberSupportCode.CucumberPageLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberSteps {
	public CucumberPageLoader instance;
	 public CucumberSteps(CucumberPageLoader instance) {
		this.instance =instance;
	}
	
	
	@Given("I am on the amazon home page")
	public void i_am_on_the_amazon_home_page() {
		instance.getHomePage();
	}

	@When("I am on the amazon home page and validate the amazon logo")
	public void i_am_on_the_amazon_home_page_and_validate_the_amazon_logo() {
		instance.getHomePage().logoValidate();;
	}

	@When("I am searching pen in the search box and click search button")
	public void i_am_searching_pen_in_the_search_box_and_click_search_button() {
	   instance.homePage.typeOnSearch();
	}


	@Then("I landed on the search page I saw all the result of pen")
	public void i_saw_all_the_result_of_pen() {
		 instance.homePage.clickOnSearch();
	}

	@When("I select one of the pen from search result and click that pen")
	public void i_select_one_of_the_pen_from_search_result_and_click_that_pen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I landed on the sepcific pen page")
	public void i_landed_on_the_sepcific_pen_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I validate the sepcific pens price")
	public void i_validate_the_sepcific_pens_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	
	

}
