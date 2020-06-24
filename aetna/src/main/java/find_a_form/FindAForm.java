package find_a_form;

import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static find_a_form.FindAFormElements.*;

public class FindAForm extends WebAPI {

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
    public void doClickOnEAPMenu(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(eAPMenu));
        try {
            sleepFor(2);
            clickOnElement(eAPMenu);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public boolean isDisputeResulaionRequest_Displayed(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(disputeResulaionRequest));

        return disputeResulaionRequest.isDisplayed();


    }

}
