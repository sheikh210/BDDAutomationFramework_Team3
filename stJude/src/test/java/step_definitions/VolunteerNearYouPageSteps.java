package step_definitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import volunteerNearYouPage.VolunteerNearYouPageActions;
import java.io.IOException;

public class VolunteerNearYouPageSteps extends WebAPI {

    VolunteerNearYouPageActions volunteerNearYouPageActions = new VolunteerNearYouPageActions();

    public void getInItElements() {
        volunteerNearYouPageActions = PageFactory.initElements(driver, VolunteerNearYouPageActions.class);
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

}
