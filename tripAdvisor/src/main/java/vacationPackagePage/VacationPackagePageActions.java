package vacationPackagePage;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static vacationPackagePage.VacationPackagePageElements.*;

public class VacationPackagePageActions extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementFromField)
    public WebElement fromField;
    @FindBy(how = How.XPATH, using = webElementToField)
    public WebElement toField;
    @FindBy(how = How.XPATH, using = webElementPackageButton)
    public WebElement packageButton;
    @FindBy(how = How.XPATH, using = webElementInputVacationPackage)
    public WebElement inputVacationPackage;
    @FindBy(how = How.XPATH, using = webElementDepartureField)
    public WebElement departureField;
    @FindBy(how = How.XPATH, using = webElementReturnField)
    public WebElement returnField;
    @FindBy(how = How.XPATH, using = webElementGuestsField)
    public WebElement guestsField;
    @FindBy(how = How.XPATH, using = webElementExpectedText)
    public WebElement expectedText;
    @FindBy(how = How.XPATH, using = webElementMoreButton)
    public WebElement moreButton;
    @FindBy(how = How.XPATH, using = webElementVacationPackage)
    public WebElement vacationPackage;

    public void doClickOnMoreButton() throws InterruptedException {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(moreButton));
        try {
            sleepFor(2000);
            clickOnElement(moreButton);

        } catch (Exception e) {
            e.getMessage();


        }
    }

    public void doClickOnVacationPackage() throws InterruptedException {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(vacationPackage));
        try {
            sleepFor(2000);
            clickOnElement(vacationPackage);
        } catch (Exception e) {
            e.getMessage();
        }


    }

    public void doWriteDeparturePlace(String departurePlaceKey) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(departureField));
        departureField.sendKeys(departurePlaceKey);

    }

    public void doWriteDestinationPlace(String destinationPlaceKey) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(toField));
        toField.sendKeys(destinationPlaceKey);

    }
    public void doClickOnFindPackageButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(packageButton));
        packageButton.click();
    }
    public String doGetExpectedText(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(expectedText));
        return expectedText.getText();
    }


//    public void enterFromPlaceNameInField(String fromPlaceKey){
//        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(fromField));
//        fromField.sendKeys(fromPlaceKey);
//    }
//    public void enterToPalceNameInField(String toPlaceKey){
//        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(toField));
//        toField.sendKeys(toPlaceKey);
//    }
//
//    public void enterGuestsInField(String guestsKey){
//        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(guestsField));
//        guestsField.sendKeys(guestsKey);
//    }
//    public void clickOnFindPackage() throws InterruptedException {
//        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(packageButton));
//        try{
//            sleepFor(2000);
//            clickOnElement(packageButton);
//
//        } catch(Exception e){
//            e.getMessage();
//
//
//        }
//
//    }
//    public String getExpectedText(){
//        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(expectedText));
//        return expectedText.getText();
//    }


}

