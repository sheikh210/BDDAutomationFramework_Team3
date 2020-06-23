package step_definitions.helpPage;
import common.WebAPI;
import helpPage.HelpPageActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

public class HelpPageSteps extends WebAPI {

    HelpPageActions helpPageActions = new HelpPageActions();

    public void getInItElements() {
        helpPageActions = PageFactory.initElements(driver, HelpPageActions.class);
    }

    @Before
    public void setUp() throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83",
                "http://ebay.com");
    }

    @After
    public void cleanUp() {

         driver.quit();
    }
//    @Given ("user is at Ebay Homepage www.ebay.com")
//    public void user_is_at_Ebay_Homepage_www_ebay_com() {
//        System.out.println("Navigated to Ebay Homepage");
//    }

    /**
     * Background
     */
    @Given("user is at Ebay Homepage www.ebay.com")
    public void user_is_at_Ebay_Homepage_www_ebay_com() {
        getInItElements();
        System.out.println("Navigated to Ebay Homepage");

    }

    @When("user clicks on Help & Contact button")
    public void user_clicks_on_Help_Contact_button() {
        getInItElements();
        helpPageActions.navigateToHelpPage();

    }

    /**
     * Scenario 1
     *
     * @param string
     */

    @And("user inputs {string} in search field")
    public void user_inputs_in_search_field(String string) {
        getInItElements();
        helpPageActions.enterKeysKeywordSearch("Return an item for a refund");

    }

    @And("user selects specific topic from suggested topics")
    public void user_selects_specific_topic_from_suggested_topics() {
        getInItElements();
        helpPageActions.selectReturnTopicFromList();
    }

    @Then("user should be navigated to {string}")
    public void user_should_be_navigated_to(String title) {
        getInItElements();
        Assert.assertEquals(helpPageActions.getHelpfulArticlesPageTitles(title), title, "Title does not match");

    }

    /**
     * Scenario 2
     */

    @When("user clicks on Sign in")
    public void user_clicks_on_Sign_in() {
        getInItElements();
        helpPageActions.clickSignInButton();
    }

    @Then("user should see please verify your self to continue")
    public void user_should_see_please_verify_your_self_to_continue() {
        Assert.assertTrue(helpPageActions.isVerifyDisplayed());

    }
    /**
     * Scenario 3
     */
    @When("user click register button")
    public void user_click_register_button() {
       helpPageActions.clickRegisterButton();
    }
    /**
     * Scenario 4
     */
    @When("user click on Additional Support during COVID19")
    public void user_click_on_Additional_Support_during_COVID19() {
        helpPageActions.clickCOVIDarticle();
    }
    /**
     * Scenario 5
     */
    @And("user clicks on buying as a guest")
    public void user_clicks_on_buying_as_a_guest() {
     helpPageActions.clickBuyingAsGuest();
    }
    /**
     * Scenario 6
     */
    @And("user clicks on {string}")
    public void user_clicks_on(String article) {
        helpPageActions.clickHelpfulArticles(article);

    }

    /**
     * scenario 7
     */
    @And("user clicks on contact us button")
    public void user_clicks_on_contact_us_button() {
      getInItElements();
      helpPageActions.clickContactUsButton();
    }
    @And("user click on Report and item that hasn't arrived")
    public void user_click_on_Report_and_item_that_hasn_t_arrived() {
        getInItElements();
        helpPageActions.reportAnItem();

    }
    @And("user clicks on Start a return")
    public void user_clicks_on_Start_a_return()  {
        getInItElements();
        helpPageActions.startReturn();

    }
    @And("user clicks on About Ebay")
    public void user_clicks_on_About_Ebay() {
       getInItElements();
       helpPageActions.clickAboutEbay();
    }
    @And("user clicks Announcements")
    public void user_clicks_Announcements() {
      helpPageActions.clickAnnouncement();
    }
    @And("user clicks on Community")
    public void user_clicks_on_Community() {
        getInItElements();
        helpPageActions.clickCommunity();
    }
    @And("user clicks on security center")
    public void user_clicks_on_security_center() {
        getInItElements();
        helpPageActions.clickSecurityCenter();
    }
    @And("user clicks on resolution center")
    public void user_clicks_on_resolution_center() {
        getInItElements();
        helpPageActions.clickResolutionCenter();

    }
    }