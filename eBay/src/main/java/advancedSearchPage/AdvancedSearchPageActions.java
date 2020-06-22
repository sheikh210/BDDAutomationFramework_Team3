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

    @FindBy (css = webElementButtonFindStore)
    public WebElement buttonFindStore;

    @FindBy (css = webElementInputFindStore)
    public WebElement inputFindStore;

    @FindBy (css = webElementButtonSearchFindStore)
    public WebElement buttonSearchFindStore;


    public void navigateToAdvancedSearchPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(linkAdvancedSearch));
        linkAdvancedSearch.click();
        System.out.println("Clicked \"Advanced Search\" button");
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
            System.out.println("Entered \"" + keys + "\" into Keyword input field");
        } catch (Exception e) {
            inputKeywords.sendKeys(keys);
            System.out.println("Could not enter \"" + keys + "\" into Keyword input field");
        }
    }

    public void selectCategory(String category) {
        Select select = new Select(selectCategory);

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(selectCategory));
        select.selectByVisibleText(category);
        System.out.println("Selected \"" + category + "\" in Category dropdown");
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
        System.out.println("Checked \"Completed Listings\" checkbox");
    }

    public void selectCheckboxSoldListings() {
        clickOnElement(checkboxSoldListings);
        System.out.println("Checked \"Sold Listings\" checkbox");
    }

    public void selectCheckboxTitleAndDescription() {
        clickOnElement(checkboxTitleAndDescription);
        System.out.println("Checked \"Title and Description\" checkbox");
    }

    public void clickOnTopSearchButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearchTop));
        clickOnElement(buttonSearchTop);
        System.out.println("Clicked Search button (top)");
    }

    public void clickOnBottomSearchButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearchBottom));
        clickOnElement(buttonSearchBottom);
        System.out.println("Clicked Search button (bottom)");
    }

    public void selectCheckboxShowItemsPricedFrom() {
        new WebDriverWait(driver,10).until(ExpectedConditions.elementSelectionStateToBe(checkboxShowItemsPricedFrom, false));
        clickOnElement(checkboxShowItemsPricedFrom);
        System.out.println("Checked \"Show Items Priced From\" checkbox");
    }

    public void enterKeysMinimumPriceField(String minPrice) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputMinimumPrice));

        inputMinimumPrice.click();
        try {
            sleepFor(1);
            inputMinimumPrice.sendKeys(minPrice);
            sleepFor(1);
            System.out.println("Entered \"" + minPrice + "\" into Minimum Price input field");
        } catch (Exception e) {
            System.out.println("Could not enter \"" + minPrice + "\" into Minimum Price input field --- Trying again");
            inputMinimumPrice.sendKeys(minPrice);
        }
    }

    public void enterKeysMaximumPriceField(String maxPrice) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputMaximumPrice));

        inputMaximumPrice.click();
        try {
            sleepFor(1);
            inputMaximumPrice.sendKeys(maxPrice);
            sleepFor(1);
            System.out.println("Entered \"" + maxPrice + "\" into Maximum Price input field");
        } catch (Exception e) {
            System.out.println("Could not enter \"" + maxPrice + "\" into Maximum Price input field --- Trying again");
            inputMaximumPrice.sendKeys(maxPrice);
        }
    }

    public void clickOnFindStoreButton() {
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(buttonFindStore));

        try {
            sleepFor(1);
            clickOnElement(buttonFindStore);
            System.out.println("Clicked \"Find Store\" button");
        } catch (Exception e) {
            System.out.println("Unable to click on \"Find Store\" button --- Trying again");
            clickOnElement(buttonFindStore);
        }
    }

    public void enterKeysFindStoreField(String storeName) {
        String findStorePageURL = "https://www.ebay.com/sch/ebayadvsearch?_sofindtype=7";

        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.urlToBe(findStorePageURL));

        clickOnElement(inputFindStore);
        try {
            sleepFor(1);
            inputFindStore.sendKeys(storeName);
            sleepFor(1);
            System.out.println("Entered \"" + storeName + "\" into Find Store input field");
        } catch (Exception e) {
            System.out.println("Could not enter \"" + storeName + "\" into Find Store input field --- Trying again");
            inputFindStore.sendKeys(storeName);
        }
    }

    public void clickOnFindStoreSearchButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearchFindStore));

        clickOnElement(buttonSearchFindStore);
        System.out.println("Clicked \"Find Store\" button");
    }

}
