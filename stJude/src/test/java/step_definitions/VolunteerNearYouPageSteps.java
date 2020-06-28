package step_definitions;

import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
                "http://stjude.org/");
    }

    @After
    public void cleanUp() {
        driver.quit();
    }


    /**
     * Background
     */
    @Given("user is on St. Jude Volunteer Near You page")
    public void user_is_on_St_Jude_Volunteer_Near_You_page() {
        getInItElements();
        volunteerNearYouPageActions.navigateToVolunteerNearYouPage();
    }

    /**
     * Volunteer Registration
     */
    @When("user clicks on Register To Volunteer button")
    public void user_clicks_on_Register_To_Volunteer_button() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonRegisterToVolunteer();
    }

    @And("user switches to the newly opened tab")
    public void user_switches_to_the_newly_opened_tab() {
        getInItElements();
        volunteerNearYouPageActions.switchTabs();
    }

    @And("user inputs {string} in First Name input field")
    public void user_inputs_in_First_Name_input_field(String firstName) {
        getInItElements();
        volunteerNearYouPageActions.inputFirstName(firstName);
    }

    @And("user inputs {string} in Last Name input field")
    public void user_inputs_in_Last_Name_input_field(String lastName) {
        getInItElements();
        volunteerNearYouPageActions.inputLastName(lastName);
    }

    @And("user clicks Calendar button Date of Birth input field")
    public void user_clicks_Calendar_button_Date_of_Birth_input_field() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonCalendar();
    }

    @And("user clicks Left Arrow in calendar header section")
    public void user_clicks_Left_Arrow_in_calendar_header_section() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonLeftCalendarYear();
    }

    @And("user clicks {string}{string} to select year")
    public void user_clicks_to_select_year(String yearRow, String yearCell) {
        getInItElements();
        volunteerNearYouPageActions.clickButtonCalendarYear(yearRow, yearCell);
    }

    @And("user clicks {string}{string} to select month")
    public void user_clicks_February_to_select_month(String monthRow, String monthCell) {
        getInItElements();
        volunteerNearYouPageActions.clickButtonCalendarMonth(monthRow, monthCell);
    }

    @And("user clicks {string}{string} to select day")
    public void user_clicks_to_select_day(String dayRow, String dayCell) {
        getInItElements();
        volunteerNearYouPageActions.clickButtonCalendarDay(dayRow, dayCell);
    }

    @And("user selects {string} from Ethnicity dropdown")
    public void user_selects_from_Ethnicity_dropdown(String ethnicity) {
        getInItElements();
        volunteerNearYouPageActions.selectEthnicity(ethnicity);
    }

    @And("user selects {string} from Gender dropdown")
    public void user_selects_from_Gender_dropdown(String gender) {
        getInItElements();
        volunteerNearYouPageActions.selectGender(gender);
    }

    @And("user inputs {string} in Street Address input field")
    public void user_inputs_in_Street_Address_input_field(String address) {
        getInItElements();
        volunteerNearYouPageActions.inputAddress(address);
    }

    @And("user inputs {string} in City input field")
    public void user_inputs_in_City_input_field(String city) {
        getInItElements();
        volunteerNearYouPageActions.inputCity(city);
    }

    @And("user selects {string} from State dropdown")
    public void user_selects_from_State_dropdown(String state) {
        getInItElements();
        volunteerNearYouPageActions.selectState(state);
    }

    @And("user inputs {string} in Zip Code input field")
    public void user_inputs_in_Zip_Code_input_field(String zipcode) {
        getInItElements();
        volunteerNearYouPageActions.inputZipCode(zipcode);
    }

    @And("user inputs {string} in Primary Phone input field")
    public void user_inputs_in_Primary_Phone_input_field(String phoneNum) {
        getInItElements();
        volunteerNearYouPageActions.inputPrimaryPhone(phoneNum);
    }

    @And("user selects {string} from Phone Type dropdown")
    public void user_selects_from_Phone_Type_dropdown(String phoneType) {
        getInItElements();
        volunteerNearYouPageActions.selectPhoneType(phoneType);
    }

    @And("user enters {string} in Email input field")
    public void user_enters_in_Email_input_field(String email) {
        getInItElements();
        volunteerNearYouPageActions.inputEmail(email);
    }

    @And("user enters {string} in Password input field")
    public void user_enters_in_Password_input_field(String password) {
        getInItElements();
        volunteerNearYouPageActions.inputPassword(password);
    }

    @And("user enters {string} in Verify Password input field")
    public void user_enters_in_Verify_Password_input_field(String password) {
        getInItElements();
        volunteerNearYouPageActions.inputVerifyPassword(password);
    }

    @And("user clicks Waiver Agreements button")
    public void user_clicks_Waiver_Agreements_button() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonWaiverAgreements();
    }

    @And("user clicks checkbox to agree to Release and Waiver of Liability")
    public void user_clicks_checkbox_to_agree_to_Release_and_Waiver_of_Liability() {
        getInItElements();
        volunteerNearYouPageActions.clickCheckboxReleaseWaiverLiability();
    }

    @And("user clicks Submit Application button")
    public void user_clicks_Submit_Application_button() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonSubmitReleaseWaiverLiability();
    }

    @Then("user should be navigated to url {string}")
    public void user_should_be_navigated_to_url(String expectedURL) {
        getInItElements();
        String actualURL = volunteerNearYouPageActions.getURLVolunteerRegistrationPage(expectedURL);

        Assert.assertEquals(actualURL, expectedURL, "REGISTRATION SUCCESS PAGE URL DOES NOT MATCH");
    }

    @And("user should see {string}")
    public void user_should_see(String expectedText) {
        getInItElements();
        String actualText = volunteerNearYouPageActions.getTextVolunteerRegistrationPage();

        Assert.assertEquals(actualText, expectedText, "REGISTRATION SUCCESS PAGE TEXT DOES NOT MATCH");
    }

    @And("user should see {string}{string} in top right of header")
    public void user_should_see_in_top_right_of_header(String hello, String expectedFirstName) {
        getInItElements();
        String actualName = volunteerNearYouPageActions.getNameVolunteerRegistrationPage();

        Assert.assertEquals(actualName, hello+expectedFirstName, "NAME DOES NOT MATCH");
    }


    /**
     * Search Volunteer Opportunities
     */
    @And("user clicks on Search Volunteer Opportunities button")
    public void user_clicks_on_Search_Volunteer_Opportunities_button() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonSearchVolunteerOpportunities();
    }

    @And("user inputs {string} in Location input field")
    public void user_inputs_in_Location_input_field(String location) {
        getInItElements();
        volunteerNearYouPageActions.inputLocationSearchVolunteerOpportunitiesPage(location);
    }

    @And("user selects {string} from Distance dropdown")
    public void user_selects_from_Distance_dropdown(String distance) {
        getInItElements();
        volunteerNearYouPageActions.selectDistanceSearchVolunteerOpportunitiesPage(distance);
    }

    @And("user clicks Search button")
    public void user_clicks_Search_button() {
        getInItElements();
        volunteerNearYouPageActions.clickButtonEnabledSearchVolunteerOpportunities();
    }

    @Then("user should see {string} on top left")
    public void user_should_see_on_top_left(String expectedHeaderText) {
        getInItElements();
        String actualHeaderText = volunteerNearYouPageActions.getHeaderTextOpportunitySearchPage();

        Assert.assertEquals(actualHeaderText, expectedHeaderText, "OPPORTUNITY SEARCH PAGE HEADER TEXT DOES NOT MATCH");
    }


    /**
     * Play Video
     */
    @When("user clicks play button on embedded video")
    public void user_clicks_play_button_on_embedded_video() {
        getInItElements();
        volunteerNearYouPageActions.clickPlayEmbeddedVideo();
    }

    @Then("user should be able to pause video while it's playing")
    public void user_should_be_able_to_pause_video_while_it_s_playing() {
        getInItElements();
        volunteerNearYouPageActions.clickPauseEmbeddedVideo();

        Assert.assertTrue(volunteerNearYouPageActions.isVideoPlayerPaused());
    }

    /**
     * Search Regional Offices
     */
    @When("user inputs {string} in search input field")
    public void user_inputs_in_search_input_field(String state) {
        getInItElements();
        volunteerNearYouPageActions.inputStateRegionalOfficeLookup(state);
    }

    @And("user clicks on {string} in the dropdown that appears")
    public void user_clicks_on_in_the_dropdown_that_appears(String state) {
        getInItElements();
        volunteerNearYouPageActions.clickSearchResultStateRegionalOffice(state);
    }

    @Then("user should see {string} on the next page")
    public void user_should_see_on_the_next_page(String expectedState) {
        getInItElements();
        String actualText = volunteerNearYouPageActions.getTextRegionalOfficeResultPage();

        Assert.assertEquals(actualText, expectedState, "STATE NAME DOES NOT MATCH");
    }
}
