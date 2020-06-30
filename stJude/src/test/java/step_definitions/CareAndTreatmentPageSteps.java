package step_definitions;

import careAndTreatmentPage.CareAndTreatmentPageActions;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class CareAndTreatmentPageSteps extends WebAPI {
    static CareAndTreatmentPageActions careAndTreatmentPageActions;
    public static void getInItElements() {
        careAndTreatmentPageActions= PageFactory.initElements(driver, CareAndTreatmentPageActions.class);
    }

    @Before
    public void setUp() throws IOException {
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83", "https://www.stjude.org/");
    }

    @Given("user are in Homepage")
    public void userAreInHomepage() {
        getInItElements();
        System.out.println("user in homepage");
    }

    @When("user clicks on care and treatment")
    public void userClicksOnCareAndTreatment(){
        getInItElements();
        careAndTreatmentPageActions.doClickOnCareAndTreatment();
    }

    @Then("user clicks on brain tumors")
    public void userClicksOnBrainTumors() {
        getInItElements();
        careAndTreatmentPageActions.doClickOnBrainTumors();
    }

    @When("user clicks on training")
    public void userClicksOnTraining() {
        getInItElements();
        careAndTreatmentPageActions.doClickOnTraining();
    }

    @Then("user will see the expected text")
    public void userWillSeeTheExpectedText() {
        getInItElements();
        boolean actualValue=careAndTreatmentPageActions.isGraduateStudentDisplayed();
        Assert.assertEquals(actualValue,true);
    }
    //2
    @Then("user will see the expected webElement")
    public void userWillSeeTheExpectedWebElement() {
        getInItElements();
        String actualText=careAndTreatmentPageActions.getWebElement();
        String expectedText="Internships";
        Assert.assertEquals(actualText,expectedText);
    }
    //3
    @Then("user will see the expected webElementMedicalStudents")
    public void userWillSeeTheExpectedWebElementMedicalStudents() {
        getInItElements();
        String actualText=careAndTreatmentPageActions.getWebElementMedicalStudents();
        String expectedText="Medical Students";
        Assert.assertEquals(actualText,expectedText);
    }
    //4
    @Then("user will see the expected webElementNursingStudents")
    public void userWillSeeTheExpectedWebElementNursingStudents() {
        getInItElements();
        String actualText=careAndTreatmentPageActions.getWebElementNursingStudents();
        String expectedText="Nursing Students";
        Assert.assertEquals(actualText,expectedText);
    }
    //5
    @Then("user will see the expected webElementUndergraduateStudents")
    public void userWillSeeTheExpectedWebElementUndergraduateStudents() {
        getInItElements();
        String actualText=careAndTreatmentPageActions.getWebElementUndergraduateStudents();
        String expectedText="Undergraduate Students";
        Assert.assertEquals(actualText,expectedText);
    }
    //6
    @Then("user will see the expected webElementEducationOutreach")
    public void userWillSeeTheExpectedWebElementEducationOutreach() {
        String actualText=careAndTreatmentPageActions.getWebElementEducationOutreach();
        String expectedText="K-12 Education Outreach";
        Assert.assertEquals(actualText,expectedText);
    }
    //7
    @Then("user will see the expected webElementOnlineResources")
    public void userWillSeeTheExpectedWebElementOnlineResources() {
        String actualText=careAndTreatmentPageActions.getWebElementOnlineResources();
        String expectedText="Online Resources";
        Assert.assertEquals(actualText,expectedText);
    }
    //8
    @Then("user will see the expected webElementSupportScientific")
    public void userWillSeeTheExpectedWebElementSupportScientific() {
        String actualText=careAndTreatmentPageActions.getWebElementSupportScientific();
        String expectedText="Support for Scientific Trainees";
        Assert.assertEquals(actualText,expectedText);
    }
    //9
    @Then("user will see the expected webElementSupportClinical")
    public void userWillSeeTheExpectedWebElementSupportClinical() {
        String actualText=careAndTreatmentPageActions.getWebElementSupportClinical();
        String expectedText="Support for Clinical Trainees";
        Assert.assertEquals(actualText,expectedText);
    }
    //10
    @Then("user will see the expected webElementClinicalFellows")
    public void userWillSeeTheExpectedWebElementClinicalFellows() {
        String actualText=careAndTreatmentPageActions.getWebElementClinicalFellows();
        String expectedText="Clinical Fellows";
        Assert.assertEquals(actualText,expectedText);
    }
    //11
    @Then("user will see the expected webElementContinuingEducation")
    public void userWillSeeTheExpectedWebElementContinuingEducation() {
        String actualText=careAndTreatmentPageActions.getWebElementContinuingEducation();
        String expectedText="Continuing Medical Education";
        Assert.assertEquals(actualText,expectedText);
    }
    //12
    @Then("user will see the expected webElementNursingFellows")
    public void userWillSeeTheExpectedWebElementNursingFellows() {
        String actualText=careAndTreatmentPageActions.getWebElementNursingFellows();
        String expectedText="Nursing Fellows";
        Assert.assertEquals(actualText,expectedText);
    }
    //13
    @When("user clicks on Ways to Give")
    public void userClicksOnWaysToGive() {
        getInItElements();
        careAndTreatmentPageActions.doClickOnWaysToGive();
    }
    //14
    @Then("user will see the expected webElementSendCard")
    public void userWillSeeTheExpectedWebElementSendCard() {
        getInItElements();
        boolean actualValue=careAndTreatmentPageActions.isSendCardDisplayed();
        Assert.assertEquals(actualValue,true);
    }
    //15
    @Then("user will see the expected webElementCreateFund")
    public void userWillSeeTheExpectedWebElementCreateFund() {
        getInItElements();
        boolean actualValue=careAndTreatmentPageActions.isCreateFundDisplayed();
        Assert.assertEquals(actualValue,true);
    }
    //16
    @Then("user will see the expected webElementDedicateABrick")
    public void userWillSeeTheExpectedWebElementDedicateABrick() {
        String actualText=careAndTreatmentPageActions.getWebElementDedicateABrick();
        String expectedText="Dedicate a Brick";
        Assert.assertEquals(actualText,expectedText);
    }
    //17
    @Then("user will see the expected webElementPayrollDeduction")
    public void userWillSeeTheExpectedWebElementPayrollDeduction() {
        String actualText=careAndTreatmentPageActions.getWebElementPayrollDeduction();
        String expectedText="Dedicate a Brick";
        Assert.assertEquals(actualText,expectedText);
    }
    //18
    @Then("user will see the expected webElementFundraising")
    public void userWillSeeTheExpectedWebElementFundraising() {
        String actualText=careAndTreatmentPageActions.getWebElementFundraising();
        String expectedText="Fundraise at Work";
        Assert.assertEquals(actualText,expectedText);
    }
    //19
    @Then("user will see the expected webElementEmployerMatch")
    public void userWillSeeTheExpectedWebElementEmployerMatch() {
        String actualText=careAndTreatmentPageActions.getWebElementEmployerMatch();
        String expectedText="Employer Gift Match";
        Assert.assertEquals(actualText,expectedText);
    }
    //20
    @Then("user will see the expected webElementCorporatePartner")
    public void userWillSeeTheExpectedWebElementCorporatePartner() {
        String actualText=careAndTreatmentPageActions.getWebElementCorporatePartner();
        String expectedText="";
        Assert.assertEquals(actualText,expectedText);
    }


    @After
    public static void cleanUp() {
// driver.close();
        driver.quit();
    }



}