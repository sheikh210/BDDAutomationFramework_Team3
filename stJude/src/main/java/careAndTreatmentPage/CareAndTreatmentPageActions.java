package careAndTreatmentPage;

import common.WebAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static careAndTreatmentPage.CareAndTreatmentPageElements.*;


public class CareAndTreatmentPageActions extends WebAPI {
    //1
    @FindBy(how = How.XPATH,using = webElementCareAndTreatment)
    public WebElement careAndTreatment;
    @FindBy(how = How.XPATH,using = webElementBrainTumors)
    public WebElement brainTumors;
    @FindBy(how = How.XPATH,using = webElementTraining)
    public WebElement training;
    @FindBy(how = How.XPATH,using = webElementGraduateStudent)
    public WebElement graduateStudent;
    //2
    @FindBy(how = How.XPATH,using = webElementInternships)
    public WebElement internships;
    //3
    @FindBy(how = How.XPATH,using = webElementMedicalStudents)
    public WebElement medicalStudents;
    //4
    @FindBy(how = How.XPATH,using = webElementNursingStudents)
    public WebElement nursingStudents;
    //5
    @FindBy(how = How.XPATH,using = webElementUndergraduateStudents)
    public WebElement undergraduateStudents;
    //6
    @FindBy(how = How.XPATH,using = webElementEducationOutreach)
    public WebElement educationOutreach;
    //7
    @FindBy(how = How.XPATH,using = webElementOnlineResources)
    public WebElement onlineResources;
    //8
    @FindBy(how = How.XPATH,using = webElementSupportScientific)
    public WebElement supportScientific;
    //9
    @FindBy(how = How.XPATH,using = webElementSupportClinical)
    public WebElement supportClinical;
    //10
    @FindBy(how = How.XPATH,using = webElementClinicalFellows)
    public WebElement clinicalFellows;
    //11
    @FindBy(how = How.XPATH,using = webElementContinuingEducation)
    public WebElement continuingEducation;
    //12
    @FindBy(how = How.XPATH,using = webElementNursingFellows)
    public WebElement nursingFellows;
    //13
    @FindBy(how = How.XPATH,using = webElementWaysToGive)
    public WebElement waysToGive;
    //14
    @FindBy(how = How.XPATH,using = webElementSendCard)
    public WebElement sendCard;
    //15
    @FindBy(how = How.XPATH,using = webElementCreateFund)
    public WebElement createFund;
    //16
    @FindBy(how = How.XPATH,using = webElementDedicateABrick)
    public WebElement dedicateABrick;
    //17
    @FindBy(how = How.XPATH,using = webElementPayrollDeduction)
    public WebElement payrollDeduction;
    //18
    @FindBy(how = How.XPATH,using = webElementFundraising)
    public WebElement fundraising;
    //19
    @FindBy(how = How.XPATH,using = webElementEmployerMatch)
    public WebElement employerMatch;
    //20
    @FindBy(how = How.XPATH,using = webElementCorporatePartner)
    public WebElement corporatePartner;

    //1
    public void doClickOnCareAndTreatment(){
    new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(careAndTreatment));
    clickOnElement(careAndTreatment);
    }
    public void doClickOnBrainTumors() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(brainTumors));
        clickOnElement(brainTumors);
    }
    public void doClickOnTraining() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(training));
        clickOnElement(training);
    }
    public boolean isGraduateStudentDisplayed(){
    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(graduateStudent));
    return graduateStudent.isDisplayed();
    }
    //2
    public String getWebElement(){
    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(internships));
    return internships.getText();
    }
    //3
    public String getWebElementMedicalStudents (){
    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(medicalStudents));
    return medicalStudents.getText();
    }
    //4
    public String getWebElementNursingStudents (){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(nursingStudents));
        return nursingStudents.getText();
    }
    //5
    public String getWebElementUndergraduateStudents (){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(undergraduateStudents));
        return undergraduateStudents.getText();
    }
    //6
    public String getWebElementEducationOutreach(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(educationOutreach));
        return educationOutreach.getText();
    }
    //7
    public String getWebElementOnlineResources(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(onlineResources));
        return onlineResources.getText();
    }
    //8
    public String getWebElementSupportScientific(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(supportScientific));
        return supportScientific.getText();
    }
    //9
    public String getWebElementSupportClinical(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(supportClinical));
        return supportClinical.getText();
    }
    //10
    public String getWebElementClinicalFellows(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(clinicalFellows));
        return clinicalFellows.getText();
    }
    //11
    public String getWebElementContinuingEducation(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(continuingEducation));
        return continuingEducation.getText();
    }

    //12
    public String getWebElementNursingFellows(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(nursingFellows));
        return nursingFellows.getText();
    }
    //13
    public void doClickOnWaysToGive() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(waysToGive));
        clickOnElement(waysToGive);
    }
    //14
    public boolean isSendCardDisplayed(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(sendCard));
        return sendCard.isDisplayed();
    }
    //15
    public boolean isCreateFundDisplayed(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(createFund));
        return createFund.isDisplayed();
    }
    //16
    public String getWebElementDedicateABrick(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(dedicateABrick));
        return dedicateABrick.getText();
    }
    //17
    public String getWebElementPayrollDeduction(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(payrollDeduction));
        return payrollDeduction.getText();
    }
    //18
    public String getWebElementFundraising(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(fundraising));
        return fundraising.getText();
    }
    //19
    public String getWebElementEmployerMatch(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(employerMatch));
        return employerMatch.getText();
    }
    //20
    public String getWebElementCorporatePartner(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(corporatePartner));
        return corporatePartner.getText();
    }


}
