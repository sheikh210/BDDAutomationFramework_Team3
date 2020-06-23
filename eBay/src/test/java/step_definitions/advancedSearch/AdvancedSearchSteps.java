//package step_definitions.advancedSearch;
//
//import advancedSearchPage.AdvancedSearchPageActions;
//import common.WebAPI;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import java.io.IOException;
//import java.util.List;
//
//public class AdvancedSearchSteps extends WebAPI {
//
//    AdvancedSearchPageActions advancedSearchPageActions = new AdvancedSearchPageActions();
//
//    public void getInItElements () {
//        advancedSearchPageActions = PageFactory.initElements(driver, AdvancedSearchPageActions.class);
//    }
//
//    @Before
//    public void setUp () throws IOException {
//        setUp(false, "browserstack", "windows", "10", "chrome", "83",
//                "http://ebay.com");
//    }
//
//    @After
//    public void cleanUp() {
//        driver.quit();
//    }
//
//
//    @Given ("user is at Ebay Homepage www.ebay.com")
//    public void user_is_at_Ebay_Homepage_www_ebay_com() {
//        System.out.println("Navigated to Ebay Homepage");
//    }
//
//    @When("user clicks on Advanced Search button")
//    public void user_clicks_on_Advanced_Search_button() {
//        getInItElements();
//
////        wait.until(ExpectedConditions.elementToBeClickable(advancedSearchPageActions.linkAdvancedSearch));
//        advancedSearchPageActions.navigateToAdvancedSearchPage();
//    }
//
//    @And("user inputs {string} in Keywords field")
//    public void user_inputs_in_Keywords_field(String keyword) {
//        getInItElements();
//
////        wait.until(ExpectedConditions.visibilityOf(advancedSearchPageActions.inputKeywords));
//        advancedSearchPageActions.enterKeysKeywordField(keyword);
//
//    }
//
//    @And("user selects {string} from Category dropdown")
//    public void user_selects_from_Category_dropdown(String category) {
//        getInItElements();
//
////        wait.until(ExpectedConditions.visibilityOf(advancedSearchPageActions.selectCategory));
//        advancedSearchPageActions.selectCategory(category);
//
//    }
//
//    @And("user clicks Search button")
//    public void user_clicks_Search_button() {
//        getInItElements();
//
////        wait.until(ExpectedConditions.elementToBeClickable(advancedSearchPageActions.buttonSearch));
//        advancedSearchPageActions.clickOnTopSearchButton();
//    }
//
//    @Then("user should be navigated to {string} page")
//    public void user_should_be_navigated_to_page(String title) {
//        getInItElements();
//        Assert.assertEquals(driver.getTitle(), title, "PAGE TITLE DOES NOT MATCH");
//    }
//
//}
