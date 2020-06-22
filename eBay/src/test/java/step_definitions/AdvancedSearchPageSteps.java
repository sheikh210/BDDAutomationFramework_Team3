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

public class AdvancedSearchPageSteps extends WebAPI {

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
        advancedSearchPageActions.clickCheckbox(string);
    }


    // Advanced Seach - Price
    @And("user selects 'Show Items Priced From' checkbox")
    public void user_selects_Show_Items_Priced_From_checkbox() {
        getInItElements();
        advancedSearchPageActions.clickCheckboxShowItemsPricedFrom();
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


    // Advanced Search - Find Store
    @And("user clicks on Find Stores button")
    public void user_clicks_on_Find_Stores_button() {
        getInItElements();
        advancedSearchPageActions.clickOnFindStoreButton();
    }

    @And("user inputs {string} in Enter Store Name input field")
    public void user_inputs_in_Enter_Store_Name_input_field(String storeName) {
        getInItElements();
        advancedSearchPageActions.enterKeysFindStoreField(storeName);
    }

    @And("user clicks Find Store Search button")
    public void user_clicks_Find_Store_Search_button() {
        getInItElements();
        advancedSearchPageActions.clickOnFindStoreSearchButton();
    }


    // Advanced Search - On Ebay Motors
    @And("user clicks on On Ebay Motors button")
    public void user_clicks_on_On_Ebay_Motors_button() {
        getInItElements();
        advancedSearchPageActions.clickOnEbayMotorsButton();
    }

    @And("user selects {string} from Vehicle Type select menu")
    public void user_selects_from_Vehicle_Type_select_menu(String vehicleType) {
        getInItElements();
        advancedSearchPageActions.selectVehicleType(vehicleType);
    }

    @And("user selects {string} from Vehicle Make dropdown")
    public void user_selects_from_Vehicle_Make_dropdown(String vehicleMake) {
        getInItElements();
        advancedSearchPageActions.selectVehicleMake(vehicleMake);
    }

    @And("user selects {string} from Vehicle Model dropdown")
    public void user_selects_from_Vehicle_Model_dropdown(String vehicleModel) {
        getInItElements();
        advancedSearchPageActions.selectVehicleModel(vehicleModel);
    }

    @And("user inputs {string} in From Year input field")
    public void user_inputs_in_From_Year_input_field(String fromYear) {
        getInItElements();
        advancedSearchPageActions.enterKeysFromYearVehicle(fromYear);
    }

    @And("user inputs {string} in To Year input field")
    public void user_inputs_in_To_Year_input_field(String toYear) {
        getInItElements();
        advancedSearchPageActions.enterKeysToYearVehicle(toYear);
    }

    @And("user selects {string} from Vehicle Transmission dropdown")
    public void user_selects_from_Vehicle_Transmission_dropdown(String vehicleTransmission) {
        getInItElements();
        advancedSearchPageActions.selectVehicleTransmission(vehicleTransmission);
    }

    @And("user selects {string} from Sort By field")
    public void user_selects_from_Sort_By_field(String sortBy) {
        getInItElements();
        advancedSearchPageActions.selectSortBy(sortBy);
    }

    @And("user clicks On Ebay Motors Search button")
    public void user_clicks_On_Ebay_Motors_Search_button() {
        getInItElements();
        advancedSearchPageActions.clickOnEbayMotorsSearchButton();
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

    @Then("user should see {string} to the left of vehicle search results")
    public void user_should_see_above_vehicle_search_results(String expectedText) {
        getInItElements();
        String actualText = advancedSearchPageActions.getVehicleSearchResultText();

        Assert.assertEquals(actualText, expectedText, "SEARCH RESULT TEXT DOES NOT MATCH");
    }


}
