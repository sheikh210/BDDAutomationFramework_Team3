package step_definitions;

import advancedSearchPage.AdvancedSearchPageActions;
import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.io.IOException;

public class AdvancedSearchSteps extends WebAPI {

    AdvancedSearchPageActions advancedSearchPageActions = new AdvancedSearchPageActions();

    public void getInItElements () {
        advancedSearchPageActions = PageFactory.initElements(driver, AdvancedSearchPageActions.class);
    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83",
                "http://ebay.com");
    }

    @After
    public void cleanUp() {
        driver.quit();
    }



    // Background
    @Given ("user is at Ebay Homepage www.ebay.com")
    public void user_is_at_Ebay_Homepage_www_ebay_com() {
        System.out.println("Navigated to Ebay Homepage");
    }

    @When("user clicks on Advanced Search button")
    public void user_clicks_on_Advanced_Search_button() {
        getInItElements();
        advancedSearchPageActions.navigateToAdvancedSearchPage();
    }

    // Advanced Search
    @And("user inputs {string} in Keywords field")
    public void user_inputs_in_Keywords_field(String keyword) {
        getInItElements();
        advancedSearchPageActions.enterKeysKeywordField(keyword);
    }

    @And("user selects {string} from Category dropdown")
    public void user_selects_from_Category_dropdown(String category) {
        getInItElements();
        advancedSearchPageActions.selectCategory(category);
    }

    @And("user clicks top Search button")
    public void user_clicks_top_Search_button() {
        getInItElements();
        advancedSearchPageActions.clickOnTopSearchButton();
    }

    @And("user clicks bottom Search button")
    public void user_clicks_bottom_Search_button(){
        getInItElements();
        advancedSearchPageActions.clickOnBottomSearchButton();
    }

    // Advanced Search - Search Including Checkboxes
    @And("user selects {string} from Search Including section")
    public void user_selects_from_Search_Including_section(String string) {
        getInItElements();
        advancedSearchPageActions.checkCheckbox(string);
    }


    // Advanced Seach - Price
    @And("user selects 'Show Items Priced From' checkbox")
    public void user_selects_Show_Items_Priced_From_checkbox() {
        getInItElements();
        advancedSearchPageActions.selectCheckboxShowItemsPricedFrom();
    }

    @And("user inputs {string} in Minimum Price input field")
    public void user_inputs_in_Minimum_Price_input_field(String minPrice) {
        getInItElements();
        advancedSearchPageActions.enterKeysMinimumPriceField(minPrice);
    }

    @And("user inputs {string} in Maximum Price input field")
    public void user_inputs_in_Maximum_Price_input_field(String maxPrice) {
        getInItElements();
        advancedSearchPageActions.enterKeysMaximumPriceField(maxPrice);
    }





    // Asserts
    @Then("user should be navigated to {string} page")
    public void user_should_be_navigated_to_page(String title) {
        getInItElements();
        Assert.assertEquals(driver.getTitle(), title, "PAGE TITLE DOES NOT MATCH");
    }

    @Then("user should see {string} above search results")
    public void user_should_see_above_search_results(String expectedPriceRange) {
        getInItElements();
        String actualPriceRange = advancedSearchPageActions.resultPriceRange.getText();

        Assert.assertEquals(actualPriceRange, expectedPriceRange, "PRICE RANGE DOES NOT MATCH");
    }


}
