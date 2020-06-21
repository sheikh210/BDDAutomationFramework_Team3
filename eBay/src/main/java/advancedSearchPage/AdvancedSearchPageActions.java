package advancedSearchPage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static advancedSearchPage.AdvancedSearchPageElements.*;

public class AdvancedSearchPageActions extends WebAPI {

    @FindBy (id = webElementLinkAdvancedSearch)
    public WebElement linkAdvancedSearch;

    @FindBy (id = webElementInputKeywords)
    public WebElement inputKeywords;

    @FindBy (css = webElementSelectCategory)
    public WebElement selectCategory;

    @FindBy (css = webElementbuttonSearchTop)
    public WebElement buttonSearchTop;

    @FindBy (id = webElementbuttonSearchBottom)
    public WebElement buttonSearchBottom;

    @FindBy (css = webElementCheckboxTitleAndDescription)
    public WebElement checkboxTitleAndDescription;

    @FindBy (xpath = webElementCheckboxCompletedListings)
    public WebElement checkboxCompletedListings;

    @FindBy (xpath = webElementCheckboxSoldListings)
    public WebElement checkboxSoldListings;


    public void navigateToAdvancedSearchPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(linkAdvancedSearch));
        linkAdvancedSearch.click();
    }

    public void enterKeysKeywordField(String keys) {
        inputKeywords.sendKeys(keys);
    }

    public void selectCategory(String category) {

        Select select = new Select(selectCategory);
        select.selectByVisibleText(category);
    }


    public void checkCheckbox(String checkboxName) {

        if (checkboxName.equals("Title and Description")){
            selectCheckboxTitleAndDescription();
        } else if (checkboxName.equals("Completed listings")){
            selectCheckboxCompletedListings();
        } else if (checkboxName.equals("Sold listings")){
            selectCheckboxSoldListings();
        }

//        switch (checkboxName){
//            case "Title and Description": selectCheckboxTitleAndDescription();
//            break;
//            case "Completed listings": selectCheckboxCompletedListings();
//            break;
//            case "Sold listings": selectCheckboxSoldListings();
//        }
    }

    public void selectCheckboxCompletedListings() {
        clickOnElement(checkboxCompletedListings);
    }

    public void selectCheckboxSoldListings() {
        clickOnElement(checkboxSoldListings);
    }

    public void selectCheckboxTitleAndDescription() {
        clickOnElement(checkboxTitleAndDescription);
    }

    public void clickOnTopSearchButton() {
        clickOnElement(buttonSearchTop);
    }

    public void clickOnBottomSearchButton() {
        clickOnElement(buttonSearchBottom);
    }

}
