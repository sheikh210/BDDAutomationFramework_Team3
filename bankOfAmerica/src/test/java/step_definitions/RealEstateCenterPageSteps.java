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
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83",
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
    public void userIsAtRealEstateCenterPage() {
        getInItElements();
        realEstateCenterPageActions.navigateToRealEstateCenterPage();
    }

    /**
     * For Sale
     */
    @And("user inputs {string} in search input")
    public void userInputs_InSearchInput(String searchTerm) {
        getInItElements();
        realEstateCenterPageActions.inputSearchTermLocationInputField(searchTerm);
    }

    @And("user clicks on search result corresponding to {string} in dropdown results")
    public void userClicksOnSearchResultCorrespondingTo_InDropdownResults(String searchTerm) {
        getInItElements();
        realEstateCenterPageActions.clickSearchResultLocationInputFieldDropdown();
    }

    @And("user clicks Continue in modal container to be navigated to partner site")
    public void userClicksContinueInModalContainerToBeNavigatedToPartnerSite() {
        getInItElements();
        realEstateCenterPageActions.clickContinueModalContainer();
    }

    @And("user should be navigated to partner site with page title {string}")
    public void userShouldBeNavigatedToPartnerSiteWithPageTitle_(String expectedPageTitle) {
        getInItElements();
        String actualPageTitle = realEstateCenterPageActions.getPageTitle(expectedPageTitle);

        Assert.assertEquals(actualPageTitle, expectedPageTitle, "PAGE TITLE DOES NOT MATCH");
    }

    @And("user should see {string} in filter tag next to search bar")
    public void userShouldSee_InFilterTagNextToSearchBar(String searchTerm) {
        getInItElements();
        String actualFilterTagText = realEstateCenterPageActions.getTextPartnerSiteFilterTag();

        Assert.assertEquals(actualFilterTagText, searchTerm, "FILTER TAG TEXT ON PARTNER SITE DOES NOT MATCH");
    }


    /**
     * Home Value
     */
    @And("user clicks Home Value button in Home Search interface")
    public void userClicksHomeValueButtonInHomeSearchInterface() {
        getInItElements();
        realEstateCenterPageActions.clickButtonHomeValue();
    }

    @And("user switches to newly opened tab")
    public void userSwitchesToNewlyOpenedTab() {
        getInItElements();
        realEstateCenterPageActions.switchTabs();
    }

    @And("user should see {string} to the left of property picture")
    public void userShouldSeeToTheLeftOfPropertyPicture(String expectedAddress) {
        getInItElements();
        String actualAddress = realEstateCenterPageActions.getTextHomeAddressHomeValueSearchResultPage();

        Assert.assertEquals(actualAddress, expectedAddress.toUpperCase(), "ADDRESS ON SEARCH RESULT PAGE DOES NOT MATCH");
    }
}