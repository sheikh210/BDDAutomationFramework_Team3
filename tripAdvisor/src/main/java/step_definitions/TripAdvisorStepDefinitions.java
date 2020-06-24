package step_definitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tripadvisorhome.TripAdvisorHome;

import java.io.IOException;

public class TripAdvisorStepDefinitions extends WebAPI {

    static TripAdvisorHome tripAdvisorHome;
    public static void getInItElements(){

        tripAdvisorHome= PageFactory.initElements(driver,TripAdvisorHome.class);
    }
    @Before
    public void setUp () throws IOException {

        // setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.tripadvisor.com/");
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83",
                "https://www.tripadvisor.com/");
    }

    @Given("visitor at TripAdvisor Homepage")
    public void visitor_at_TripAdvisor_Homepage() throws IOException {
        System.out.println("Navigated to homepage");



    }
    @And("visitor inputs {string} in the keyword field")
    public void visitorInputsTheKeywordField(String keyWord) {
        getInItElements();
        tripAdvisorHome.enterKeysSearchField(keyWord);
    }


    @When("visitor clicks on first search result button")
    public void visitorClicksSearchResult() {
        getInItElements();
        tripAdvisorHome.clickOnSearchResult();

    }

    @Then("visitor should see {string}")
    public void visitorShouldSee(String ExpectedOutcome) {
        getInItElements();

        String actualText=tripAdvisorHome.getSearchResultText();
        Assert.assertEquals(actualText,ExpectedOutcome, "CITY NAME DOES NOT MATH");

    }



    @After
    public static void cleanUp() {
        // driver.close();

        driver.quit();
    }





}
