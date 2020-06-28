package find_a_form;

import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static find_a_form.FindAFormElements.*;

public class FindAForm extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementFindAFormButton)
    public WebElement findAForm;
    @FindBy(how = How.XPATH, using = webElementTriAngleOneButton)
    public WebElement triAngleOneButton;
    @FindBy(how = How.XPATH, using = webElementOnlineProviderButton)
    public WebElement onlineProviderButton;
    @FindBy(how = How.XPATH, using = webElementSearchingText)
    public WebElement searchingText;
    @FindBy(how = How.XPATH, using = webElementBehavioralHealthPrecertificationMenu)
    public WebElement behavioralHealthPrecertificationMenu;
    @FindBy(how = How.XPATH, using = webElementABARequestButton)
    public WebElement aBARequestButton;
    @FindBy(how = How.XPATH, using = webElementTranscranialMagneticStimulationButton)
    public WebElement transcranialMagneticStimulationButton;
    @FindBy(how = How.XPATH, using = webElementEAPMenu)
    public WebElement eAPMenu;
    @FindBy(how = How.XPATH, using = webElementDisputeResulaionRequest)
    public WebElement disputeResulaionRequest;
    @FindBy(how = How.XPATH, using = webElementNetworkApplicationRequestsMenu)
    public WebElement networkApplicationRequestsMenu;
    @FindBy(how = How.XPATH, using = webElementMedicalRequestButton)
    public WebElement medicalRequestButton;
    @FindBy(how = How.XPATH, using = webElementLastNameField)
    public WebElement lastNameField;
    @FindBy(how = How.XPATH, using = webElementFirstNameField)
    public WebElement firstNameField;
    @FindBy(how = How.XPATH, using = webElementMonthOfBirthField)
    public WebElement monthOfBirthField;
    @FindBy(how = How.XPATH, using = webElementDateOfBirthField)
    public WebElement dateOfBirthField;
    @FindBy(how = How.XPATH, using = webElementYearOfBirthField)
    public WebElement yearOfBirthField;
    @FindBy(how = How.XPATH, using = webElementEmailField)
    public WebElement emailField;
    @FindBy(how = How.XPATH, using = webElementVerifyEmailField)
    public WebElement verifyEmailField;
    @FindBy(how = How.XPATH, using = webElementTaxIdTypeButton)
    public WebElement taxIdTypeButton;
    @FindBy(how = How.XPATH, using = webElementApplyingAsButton)
    public WebElement applyingAsButton;
    @FindBy(how = How.XPATH, using = webElementSubmitButton)
    public WebElement submitButton;
    @FindBy(how = How.XPATH, using = webElementInvalidText)
    public WebElement invalidText;


    public void navigateToFindAFormPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(findAForm));
        try {
            sleepFor(2);
            clickOnElement(findAForm);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void doClickOnTriAngleButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(triAngleOneButton));
        try {
            sleepFor(2);
            triAngleOneButton.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void doClickOnOnlineProviderButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(onlineProviderButton));
        try {
            sleepFor(2);
            clickOnElement(onlineProviderButton);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public String getExpectedUrl() {
        String pageUrl = driver.getCurrentUrl();
        return pageUrl;

    }

    public String getExpectedText() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchingText));
        return searchingText.getText();

    }

    public void doClickOnBehavioralHealthPrecertificationMenu() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(behavioralHealthPrecertificationMenu));
        try {
            sleepFor(2);
            clickOnElement(behavioralHealthPrecertificationMenu);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public boolean isABARequestButtonDisplayed() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(aBARequestButton));
        return aBARequestButton.isDisplayed();
    }

    public void doClickABARequestButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(aBARequestButton));
        try {
            sleepFor(2);
            clickOnElement(aBARequestButton);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getThePageUrl() {
        return driver.getCurrentUrl();

    }

    public boolean isTranscranialMagneticStimulationButtonDisplayed() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(transcranialMagneticStimulationButton));

        return transcranialMagneticStimulationButton.isDisplayed();

    }

    public void doClickOnEAPMenu() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(eAPMenu));
        try {
            sleepFor(2);
            clickOnElement(eAPMenu);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public boolean isDisputeResulaionRequest_Displayed() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(disputeResulaionRequest));

        return disputeResulaionRequest.isDisplayed();


    }
    public void doClickOnNetworkApplicationRequests(){


        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(networkApplicationRequestsMenu));
        driver.navigate().refresh();

        clickOnElement(networkApplicationRequestsMenu);


    }
    public void doClickOnMedicalRequestButton(){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(medicalRequestButton));
        medicalRequestButton.submit();

    }
    public void doWriteLastName(String lastNameKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(lastNameField));
        driver.navigate().refresh();
        lastNameField.sendKeys(lastNameKey);
    }
    public void doWriteFirstName(String firstNameKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(firstNameField));
        firstNameField.sendKeys(firstNameKey);
    }
    public void doWriteDayOfBirth(String dayOfBirthKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(dateOfBirthField));
        dateOfBirthField.sendKeys(dayOfBirthKey);
    } public void doWriteMonthOfBirth(String monthOfBirthKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(monthOfBirthField));
        monthOfBirthField.sendKeys(monthOfBirthKey);

    } public void doWriteYearOfBirth(String yearOfBirthKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(yearOfBirthField));
        yearOfBirthField.sendKeys(yearOfBirthKey);
    }public void doWriteEmail(String eMail){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(eMail);
    }public void doWriteEmailAgain(String confirmEmailKey){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(verifyEmailField));
        verifyEmailField.sendKeys(confirmEmailKey);
    }
    public void clickONTaxTypeButton(){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(taxIdTypeButton));
        clickOnElement(taxIdTypeButton);

    } public void selectSocialSecurityButton(){
        Select select=new Select(taxIdTypeButton);
        select.selectByVisibleText("S - Social Security number");


    }
    public void clickOnSpecialist(){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(applyingAsButton));
        clickOnElement(applyingAsButton);


    }
    public void clickOnSubmitButton(){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(submitButton));

        clickOnElement(submitButton);


    }
    public boolean isTextDisplayed(){
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(invalidText));
        return invalidText.isDisplayed();

    }

}
