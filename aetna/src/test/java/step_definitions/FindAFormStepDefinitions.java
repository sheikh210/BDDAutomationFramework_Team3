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
                "https://www.aetna.com/health-care-professionals.html");
    }

    @Given("user are in home page")
    public void userAreInHomePage() {
        getInItElements();
        System.out.println("You are in home page now");
    }

    @When("user click on Find a form button")
    public void userClickOnFindAFormButton() {
        getInItElements();
        findAForm.navigateToFindAFormPage();
    }

    @Then("user clicks on tri angle One button")
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
        boolean actualValue = findAForm.isTranscranialMagneticStimulationButtonDisplayed();
        Assert.assertEquals(actualValue, true);

    }


    @When("user click on EAP menu button")
    public void userClickOnEAPMenuButton() {
        getInItElements();
        findAForm.doClickOnEAPMenu();
    }

    @Then("user will see Dispute Resulation Request is displayed")
    public void userWillSeeDisputeResulationRequestIsDisplayed() {
        getInItElements();
        boolean actualValue = findAForm.isDisputeResulaionRequest_Displayed();
        Assert.assertEquals(actualValue, true);

    }



    @Then("user click on Network Application Requests menu")
    public void userClickOnNetworkApplicationRequestsMenu() {
        getInItElements();
        findAForm.doClickOnNetworkApplicationRequests();
    }

    @And("user click on Medical requests Button")
    public void userClickOnMedicalRequestsButton() {
        getInItElements();
        findAForm.doClickOnMedicalRequestButton();
    }

    @And("user write last name in the field {string}")
    public void userWriteLastNameInTheField(String lastName) {
        getInItElements();
        findAForm.doWriteLastName(lastName);
    }

    @And("user write first name in the field {string}")
    public void userWriteFirstNameInTheField(String firstName) {
        getInItElements();
        findAForm.doWriteFirstName(firstName);
    }

    @And("user write month of birth in the field{string}")
    public void userWriteMonthOfBirthInTheField(String dayOfBirth) {
        getInItElements();
        findAForm.doWriteDayOfBirth(dayOfBirth);
    }

    @And("user write date of birth in the field{string}")
    public void userWriteDateOfBirthInTheField(String monthOfBirth) {
        getInItElements();
        findAForm.doWriteMonthOfBirth(monthOfBirth);
    }

    @And("user write year of birth in the field{string}")
    public void userWriteYearOfBirthInTheField(String yearOfBirth) {
        getInItElements();
        findAForm.doWriteYearOfBirth(yearOfBirth);
    }

    @And("user write Email in the field{string}")
    public void userWriteEmailInTheField(String eMail) {
        getInItElements();
        findAForm.doWriteEmail(eMail);
    }

    @And("user write again Email in the field{string}")
    public void userWriteAgainEmailInTheField(String confirmEmail) {
        getInItElements();
        findAForm.doWriteEmailAgain(confirmEmail);
    }

    @And("user click on tax type button")
    public void userClickOnTaxTypeButton() {
        getInItElements();
        findAForm.clickONTaxTypeButton();
    }

    @And("user select Select social security button")
    public void userSelectSelectSocialSecurityButton() {
        getInItElements();
        findAForm.selectSocialSecurityButton();
    }

    @And("user click on Specialist button")
    public void userClickOnSpecialistButton() {
        getInItElements();
        findAForm.clickOnSpecialist();
    }

    @When("user click on submit button")
    public void userClickOnSubmitButton() {
        getInItElements();
        findAForm.clickOnSubmitButton();
    }

    @Then("user will see the text")
    public void userWillSeeTheText() {
        getInItElements();
        boolean actualValue=findAForm.isTextDisplayed();
        Assert.assertEquals(actualValue,true);
    }

    @After
    public static void cleanUp() {
        // driver.close();

        driver.quit();
    }
}