package advancedSearchPage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static advancedSearchPage.AdvancedSearchPageElements.*;

public class AdvancedSearchPageActions extends WebAPI {

    @FindBy (id = webElementLinkAdvancedSearch)
    public WebElement linkAdvancedSearch;

    @FindBy (id = webElementInputKeywords)
    public WebElement inputKeywords;

    @FindBy (css = webElementSelectCategory)
    public WebElement selectCategory;

    @FindBy (css = webElementButtonSearchTop)
    public WebElement buttonSearchTop;

    @FindBy (id = webElementButtonSearchBottom)
    public WebElement buttonSearchBottom;

    @FindBy (css = webElementCheckboxTitleAndDescription)
    public WebElement checkboxTitleAndDescription;

    @FindBy (xpath = webElementCheckboxCompletedListings)
    public WebElement checkboxCompletedListings;

    @FindBy (xpath = webElementCheckboxSoldListings)
    public WebElement checkboxSoldListings;

    @FindBy (id = webElementCheckboxShowItemsPricedFrom)
    public WebElement checkboxShowItemsPricedFrom;

    @FindBy (css = webElementInputMinimumPrice)
    public WebElement inputMinimumPrice;

    @FindBy (css = webElementInputMaximumPrice)
    public WebElement inputMaximumPrice;

    @FindBy (css = webElementResultPriceRange)
    public WebElement resultPriceRange;


    public void navigateToAdvancedSearchPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(linkAdvancedSearch));
        linkAdvancedSearch.click();
    }

    public void enterKeysKeywordField(String keys) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputKeywords));

        inputKeywords.click();
        try {
            sleepFor(1);
            inputKeywords.sendKeys(keys);
            sleepFor(1);
        } catch (Exception e) {
            inputKeywords.sendKeys(keys);
            System.out.println("Could not enter \"" + keys + "\" into Keyword Input Field");
        }
    }

    public void selectCategory(String category) {
        Select select = new Select(selectCategory);

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(selectCategory));
        select.selectByVisibleText(category);
    }

    public void checkCheckbox(String checkboxName) {

        switch (checkboxName){
            case "Title and Description": new WebDriverWait(driver, 10).until(ExpectedConditions.elementSelectionStateToBe(checkboxTitleAndDescription, false));
                selectCheckboxTitleAndDescription();
            break;
            case "Completed listings": new WebDriverWait(driver, 10).until(ExpectedConditions.elementSelectionStateToBe(checkboxCompletedListings, false));
                selectCheckboxCompletedListings();
            break;
            case "Sold listings": new WebDriverWait(driver, 10).until(ExpectedConditions.elementSelectionStateToBe(checkboxSoldListings, false));
                selectCheckboxSoldListings();
        }
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
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearchTop));
        clickOnElement(buttonSearchTop);
    }

    public void clickOnBottomSearchButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearchBottom));
        clickOnElement(buttonSearchBottom);
    }

    public void selectCheckboxShowItemsPricedFrom() {
        new WebDriverWait(driver,10).until(ExpectedConditions.elementSelectionStateToBe(checkboxShowItemsPricedFrom, false));
        clickOnElement(checkboxShowItemsPricedFrom);
    }

    public void enterKeysMinimumPriceField(String minPrice) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputMinimumPrice));

        inputKeywords.click();
        try {
            sleepFor(1);
            inputMinimumPrice.sendKeys(minPrice);
            sleepFor(1);
        } catch (Exception e) {
            inputMinimumPrice.sendKeys(minPrice);
            System.out.println("Could not enter \"" + minPrice + "\" into Minimum Price Input Field");
        }
    }

    public void enterKeysMaximumPriceField(String maxPrice) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputMaximumPrice));

        inputKeywords.click();
        try {
            sleepFor(1);
            inputMaximumPrice.sendKeys(maxPrice);
            sleepFor(1);
        } catch (Exception e) {
            inputMaximumPrice.sendKeys(maxPrice);
            System.out.println("Could not enter \"" + maxPrice + "\" into Minimum Price Input Field");
        }
    }

}
