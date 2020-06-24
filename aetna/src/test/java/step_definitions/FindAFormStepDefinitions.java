package step_definitions;

import common.WebAPI;
import find_a_form.FindAForm;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import java.io.IOException;

public class FindAFormStepDefinitions extends WebAPI {

    static FindAForm findAForm;

    public void getInItElements() {
        findAForm = PageFactory.initElements(driver, FindAForm.class);
    }


    @Before
    public void setUp() throws IOException {


        // setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.tripadvisor.com/");
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83",
                "https://www.aetna.com/health-care-professionals/health-care-professional-forms.html");
    }


    @Given("user are in Find A Form page")
    public void userAreInFindAFormPage() {
        getInItElements();
        System.out.println("User are in Find a form page");

    }

    @And("user clicks on tri angle One button")
    public void userClicksOnTriAngleOneButton() {
        getInItElements();
        findAForm.doClickOnTriAngleButton();

    }

    @When("user click on Online provider button")
    public void userClickOnOnlineProviderButton() {
        getInItElements();
        findAForm.doClickOnOnlineProviderButton();
    }

    @Then("user would see Request Changes to Provider Data page")
    public void userWouldSeeRequestChangesToProviderDataPage() {
        getInItElements();
        String actualUrl = findAForm.getExpectedUrl();
        String expectedUrl = "https://www.aetna.com/dsepublicContent/assets/html/content.html?resource=provider/data-correction";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected url not found");

    }

    @Then("user would see expected Text")
    public void userWouldSeeExpectedText() {
        getInItElements();
        String actualText = findAForm.getExpectedText();
        String expectedText = "Request Changes to Provider Data";
        Assert.assertEquals(actualText, expectedText);

    }

    @When("user click on Behavioral Health Precertification")
    public void userClickOnBehavioralHealthPrecertification() {
        getInItElements();
        findAForm.doClickOnBehavioralHealthPrecertificationMenu();
    }

    @Then("user would see ABA Request Button")
    public void userWouldSeeABARequestButton() {
        getInItElements();
        boolean aBARequestButtonIsDisplayed = findAForm.isABARequestButtonDisplayed();
        Assert.assertEquals(aBARequestButtonIsDisplayed, true);
    }

    @And("user click on ABA Request Button")
    public void userClickOnABARequestButton() {
        getInItElements();
        findAForm.doClickABARequestButton();
    }

    @Then("user will see the page")
    public void userWillSeeThePage() {
        String actuoalUrl = findAForm.getThePageUrl();
        String expectedUrl = "http://www.aetna.com/pharmacy-insurance/healthcare-professional/documents/outpatient-behavioral-health-BH-ABA-assessment-precert.pdf";
        Assert.assertEquals(actuoalUrl, expectedUrl, "Expected url not found");

    }
    @Then("user would see Transcranial Magnetic Stimulation Button")
    public void userWouldSeeTranscranialMagneticStimulationButton() {
        getInItElements();
        boolean actualValue=findAForm.isTranscranialMagneticStimulationButtonDisplayed();
        Assert.assertEquals(actualValue,true);

    }

    @After
    public static void cleanUp() {
        // driver.close();

        driver.quit();
    }


}



