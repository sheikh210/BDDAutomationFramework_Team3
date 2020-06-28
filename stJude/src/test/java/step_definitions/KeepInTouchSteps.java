package step_definitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keep_in_touch.KeepInTouch;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class KeepInTouchSteps extends WebAPI {

    static KeepInTouch keepInTouch;

    public static void getInItElements() {

        keepInTouch = PageFactory.initElements(driver, KeepInTouch.class);
    }

    @Before
    public void setUp() throws IOException {

        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83",
                "https://www.stjude.org");
    }

    @Given("Clients is at homepage")
    public void clientsIsAtHomepage() {
       // getInItElements();
        System.out.println("Clients are in Homepage");
    }

    @When("Clients click on sign up for Email or text update button")
    public void clientsClickOnSignUpForEmailOrTextUpdateButton() {
        getInItElements();
        keepInTouch.navToKeepInTouchPage();
    }


    @Then("Clients input their first names{string}")
    public void clientsInputTheirFirstNames(String firstName) {
        getInItElements();
        keepInTouch.enterFirstNameInField(firstName);
    }

    @And("Clients input their last names{string}")
    public void clientsInputTheirLastNames(String lastName) {
        getInItElements();
        keepInTouch.enterLastNameInField(lastName);
    }

    @And("Clients input their mobile phone numbers{string}")
    public void clientsInputTheirMobilePhoneNumbers(String mobilePhoneNumber) {
        getInItElements();
        keepInTouch.enterMobilePhoneNumberInField(mobilePhoneNumber);
    }

    @And("Clients inputs their Emails{string}")
    public void clientsInputsTheirEmails(String eMail) {
        getInItElements();
        keepInTouch.enterEmailInField(eMail);
    }

    @When("Clients Click on submitButton")
    public void clientsClickOnSubmitButton() {
        getInItElements();
        keepInTouch.clickOnSubmitButton();
    }

    @Then("Clients would see expectedText")
    public void clientsWouldSeeExpectedText() {
        getInItElements();
        String actualText=keepInTouch.getExpectedInvalidText();
        String expectedText="For security purposes, please check the box above and complete the challenge.";
        Assert.assertEquals(actualText,expectedText,"Expected text not Found");

    }
    @After
    public static void cleanUp() {
        // driver.close();

        driver.quit();
    }
}
