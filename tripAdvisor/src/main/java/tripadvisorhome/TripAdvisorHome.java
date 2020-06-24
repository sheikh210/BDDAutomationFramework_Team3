package tripadvisorhome;

import common.WebAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static tripadvisorhome.TripAdvisorElements.*;

public class TripAdvisorHome extends WebAPI {


    @FindBy(how = How.CSS, using = webElementSearchField)
    public WebElement searchField;
    @FindBy(how = How.XPATH, using = webElementButtonSearchResult)
    public WebElement buttonSearchResult;
    @FindBy(how = How.CSS, using = webElementTextSearchResult)
    public WebElement textSearchResult;


    public void enterKeysSearchField(String keys) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(keys);
    }

    public void clickOnSearchResult() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearchResult));

        try {
            sleepFor(2);
            clickOnElement(buttonSearchResult);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public String getSearchResultText() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(textSearchResult));
        return textSearchResult.getText();
    }


}
