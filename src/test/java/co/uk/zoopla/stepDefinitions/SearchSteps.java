package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BasePage


{
    HomePage homePage = new HomePage(driver);

    @Given("I navigate to Zoopla homepage")
    public void i_navigate_to_zoopla_homepage()
    {
        navigateToHomepage();
        homePage.acceptCookiePolicy();

    }
    @When("I enter location as {string}")
    public void i_enter_location_as(String location)
    {
        homePage.enterLocation(location);
        homePage.clickFirstOption();
    }
    @When("I select minimum bed as {string}")
    public void i_select_minimum_bed_as(String mini)
    {
        homePage.dropBedSelector();
        homePage.selectMinBed(mini);
    }
    @When("I select maximum bed {string}")
    public void i_select_maximum_bed(String maxi)
    {
        homePage.selectMaxBed(maxi);
    }
    @When("I select minimum price as {string}")
    public void i_select_minimum_price_as(String minPrice) throws InterruptedException {
        homePage.dropPriceSelector();
        homePage.selectMinPrice(minPrice);

    }
    @When("I select maximum price as {string}")
    public void i_select_maximum_price_as(String maximPrice)
    {
        homePage.selectMaxPrice(maximPrice);
    }
    @When("I click on {string} as property type")
    public void i_click_on_as_property_type(String propType) throws InterruptedException {
        homePage.propertyTypeSelector();
        homePage.checkPropertyTypes(propType);

    }
   @When("I click on Search button")
    public void i_click_on_search_button()
    {
        homePage.clickOnSearchButton();
    }
    @Then("search result is displayed")
    public void search_result_is_displayed()
    {

    }

}
