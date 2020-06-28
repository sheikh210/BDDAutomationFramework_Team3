package keep_in_touch;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static keep_in_touch.KeepInTouchElements.*;

public class KeepInTouch extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementSignInForButton)
    public WebElement signInForButton;

    @FindBy(how = How.CSS,using = webElementFirstNameField)
    public WebElement firstNameField;
    @FindBy(how = How.CSS,using = webElementLastNameField)
    public WebElement lastNameField;
    @FindBy(how = How.CSS,using = webElementMobilePhoneNumberField)
    public WebElement mobilePhoneNumberField;
    @FindBy(how = How.CSS,using = webElementEmailField)
    public WebElement emailField;
    @FindBy(how = How.XPATH,using = webElementSubmitButton)
    public WebElement submitButton;
    @FindBy(how = How.XPATH,using = webElementExpectedInvalidText)
    public WebElement expectedInvalidText;


    public void navToKeepInTouchPage() {
        wait=new WebDriverWait(driver,10);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(signInForButton));
        clickOnElement(signInForButton);


    }

    public void enterFirstNameInField(String firstNameKey){
        wait = new WebDriverWait(driver, 10);

        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(firstNameField));

        firstNameField.sendKeys(firstNameKey);
    }
    public void enterLastNameInField(String lastNameKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(lastNameField));

        lastNameField.sendKeys(lastNameKey);
    }
    public void enterMobilePhoneNumberInField(String mobilePhoneNumberKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(mobilePhoneNumberField));

        mobilePhoneNumberField.sendKeys(mobilePhoneNumberKey);
    }

    public void enterEmailInField(String eMailKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(emailField));

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


