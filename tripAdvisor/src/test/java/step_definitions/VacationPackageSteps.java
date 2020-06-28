package step_definitions;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import vacationPackagePage.VacationPackagePageActions;

import java.io.IOException;

public class VacationPackageSteps extends WebAPI {

    static VacationPackagePageActions vacationPackagePageActions;
    public void getInItElements(){
        vacationPackagePageActions = PageFactory.initElements(driver,VacationPackagePageActions.class);
    }
    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83",
                "https://www.tripadvisor.com/");
    }




    @Given("user is in trip advisor homepage")
    public void userIsInTripAdvisorHomepage() {
        getInItElements();
        System.out.println("User are in trip advisor homepage");

    }

    @When("user clicks on more button")
    public void userClicksOnMoreButton() throws InterruptedException {
        getInItElements();
        vacationPackagePageActions.doClickOnMoreButton();
    }

    @Then("user click on vacation package")
    public void userClickOnVacationPackage() throws InterruptedException {
        getInItElements();
        vacationPackagePageActions.doClickOnVacationPackage();
    }

    @And("user write departure place {string}")
    public void userWriteDeparturePlace(String departurePlace) {
        getInItElements();
        vacationPackagePageActions.doWriteDeparturePlace(departurePlace);


    }

    @And("user write destination place {string}")
    public void userWriteDestinationPlace(String destinationPlace) {
        getInItElements();
        vacationPackagePageActions.doWriteDestinationPlace(destinationPlace);
    }

    @When("user click on find packages")
    public void userClickOnFindPackages() {
        getInItElements();
        vacationPackagePageActions.doClickOnFindPackageButton();
    }

    @Then("user should see {string}")
    public void userShouldSee(String ExpectedText) {
        getInItElements();
        String actualText = vacationPackagePageActions.doGetExpectedText();
        Assert.assertEquals(actualText,ExpectedText);
    }

    @After
    public void cleanUp() {
        driver.quit();

    }


}
