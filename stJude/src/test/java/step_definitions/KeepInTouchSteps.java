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
                "https://www.stjude.org/get-involved/other-ways/stay-connected.html");
    }


    @Given("Clients are in SignUp page")
    public void clientsAreInSignUpPage() {
        System.out.println("Navigated to homepage");
    }

    @Then("Clients input {string}")
    public void clientsInputFirstNameInField(String firstName) {
        getInItElements();
        keepInTouch.enterFirstNameInField(firstName);
    }

    @And("Clients inputs their {string}")
    public void clientsInputsTheirLastNameInField(String lastName) {
        getInItElements();
        keepInTouch.enterLastNameInField(lastName);
    }
    @And("Clients input {string} Mobile phone number in field")
    public void clientsInputMobilePhoneNumberInField(String mobilePhoneNumber) {
        getInItElements();
        keepInTouch.enterMobilePhoneNumberInField(mobilePhoneNumber);
    }

    @And("Clients inputs their {string} eMail in field")
    public void clientsInputsTheirEmailInField(String eMail) {
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
