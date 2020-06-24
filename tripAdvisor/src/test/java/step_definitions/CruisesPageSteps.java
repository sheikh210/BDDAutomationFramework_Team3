package step_definitions;

import cruisesSearchPage.CruisesSearchPageActions;
import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.io.IOException;

public class CruisesPageSteps extends WebAPI {

    CruisesSearchPageActions cruisesSearchPageActions = new CruisesSearchPageActions();

    public void getInItElements () {
        cruisesSearchPageActions = PageFactory.initElements(driver, CruisesSearchPageActions.class);
    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83",
                "www.tripadvisor.com");
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @Given("user is at trip advisors homepage www.tripadvisor.com")
    public void user_is_at_trip_advisors_homepage_www_tripadvisor_com() {
        System.out.println("Navigated to tripadvisor Homepage");
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks More dropdown and selects Cruises option")
    public void user_clicks_More_dropdown_and_selects_Cruises_option() {
        getInItElements();
        cruisesSearchPageActions.navigateToCruisesSearchPage();
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects {string} from where to dropdown")
    public void user_selects_from_where_to_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects {string} from calender menu")
    public void user_selects_from_calender_menu(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks Search button")
    public void user_clicks_Search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be navigated to {string} page")
    public void user_should_be_navigated_to_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
