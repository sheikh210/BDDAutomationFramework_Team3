package keep_in_touch;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static keep_in_touch.KeepInTouchElements.*;

public class KeepInTouch extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementFirstNameField)
    public WebElement firstNameField;
    @FindBy(how = How.XPATH,using = webElementLastNameField)
    public WebElement lastNameField;
    @FindBy(how = How.XPATH,using = webElementMobilePhoneNumberField)
    public WebElement mobilePhoneNumberField;
    @FindBy(how = How.XPATH,using = webElementEmailField)
    public WebElement emailField;
    @FindBy(how = How.XPATH,using = webElementSubmitButton)
    public WebElement submitButton;
    @FindBy(how = How.XPATH,using = webElementExpectedInvalidText)
    public WebElement expectedInvalidText;

    public void enterFirstNameInField(String firstNameKey){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(firstNameField));
        firstNameField.sendKeys(firstNameKey);
    }
    public void enterLastNameInField(String lastNameKey){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(lastNameField));
        lastNameField.sendKeys(lastNameKey);
    }
    public void enterMobilePhoneNumberInField(String mobilePhoneNumberKey){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(mobilePhoneNumberField));
        mobilePhoneNumberField.sendKeys(mobilePhoneNumberKey);
    }

    public void enterEmailInField(String eMailKey){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(eMailKey);
    }
    public void clickOnSubmitButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(submitButton));

        try {
            sleepFor(2);
            clickOnElement(submitButton);
        } catch (Exception e) {
            e.getMessage();
        }
    }
        public String getExpectedInvalidText() {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(expectedInvalidText));
            return expectedInvalidText.getText();
        }

    }


