package step_definitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import realEstateCenterPage.RealEstateCenterPageActions;

import java.io.IOException;

public class RealEstateCenterPageSteps extends WebAPI {

    RealEstateCenterPageActions realEstateCenterPageActions = new RealEstateCenterPageActions();

    public void getInItElements() {
        realEstateCenterPageActions = PageFactory.initElements(driver, RealEstateCenterPageActions.class);
    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83",
                "http://bankofamerica.com/");
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    /**
     * Background
     */
    @Given("user is at Real Estate Center page")
    public void user_is_at_Real_Estate_Center_page() {
        getInItElements();
        realEstateCenterPageActions.navigateToRealEstateCenterPage();
    }

    /**
     * For Sale
     */
    @And("user inputs {string} in search input")
    public void user_inputs_in_search_input(String searchTerm) {
        getInItElements();
        realEstateCenterPageActions.inputSearchTermLocationInputField(searchTerm);
    }

    @And("user clicks on search result corresponding to {string} in dropdown results")
    public void user_clicks_on_search_result_corresponding_to_in_dropdown_results(String searchTerm) {
        getInItElements();
        realEstateCenterPageActions.clickSearchResultLocationInputFieldDropdown();
    }

    @And("user clicks Continue in modal container to be navigated to partner site")
    public void user_clicks_Continue_in_modal_container_to_be_navigated_to_partner_site() {
        getInItElements();
        realEstateCenterPageActions.clickContinueModalContainer();
    }

    @And("user should be navigated to partner site with page title {string}")
    public void user_should_be_navigated_to_partner_site_with_page_title(String expectedPageTitle) {
        getInItElements();
        String actualPageTitle = realEstateCenterPageActions.getPageTitle(expectedPageTitle);

        Assert.assertEquals(actualPageTitle, expectedPageTitle, "PAGE TITLE DOES NOT MATCH");
    }

    @And("user should see {string} in filter tag next to search bar")
    public void user_should_see_in_filter_tag_next_to_search_bar(String searchTerm) {
        getInItElements();
        String actualFilterTagText = realEstateCenterPageActions.getTextPartnerSiteFilterTag();

        Assert.assertEquals(actualFilterTagText, searchTerm, "FILTER TAG TEXT ON PARTNER SITE DOES NOT MATCH");
    }




}
