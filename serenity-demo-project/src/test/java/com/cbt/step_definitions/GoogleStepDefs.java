package com.cbt.step_definitions;

import com.cbt.page_objects.HomePage;
import com.cbt.steps.HomePageSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleStepDefs {
	@Steps
	HomePageSteps homePageSteps;

	HomePage homePage;

	@Given("^I search for (.*)$")
	public void i_search_for_selenium(String searchTerm) throws Exception {
		homePageSteps.openGoogle();
		homePageSteps.iEnterSearchTerm(searchTerm);
		homePageSteps.iClickOnSearch();
	}

	@When("^I sort the results by Books$")
	public void i_sort_the_results_by_Books() throws Exception {
		homePageSteps.iClickLink("More");
		homePageSteps.iClickLink("Books");
	}

	@Then("^results should only include books$")
	public void results_should_only_include_books() throws Exception {
		homePage.shouldContainText("Book");
		homePage.shouldBeVisible(homePage.searchField);
	}

}


