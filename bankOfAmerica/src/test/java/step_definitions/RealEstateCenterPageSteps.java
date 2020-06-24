package step_definitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
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





}
