package volunteerNearYouPage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static volunteerNearYouPage.VolunteerNearYouPageElements.*;

public class VolunteerNearYouPageActions extends WebAPI {

    @FindBy(css = webElementButtonGetInvolved)
    public WebElement buttonGetInvolved;

    @FindBy(css = webElementButtonVolunteerLocally)
    public WebElement buttonVolunteerLocally;

    @FindBy(css = webElementButtonRegisterToVolunteer)
    public WebElement buttonRegisterToVolunteer;

    @FindBy(css = webElementInputFirstName)
    public WebElement inputFirstName;

    @FindBy(css = webElementInputLastName)
    public WebElement inputLastName;

    @FindBy(css = webElementButtonCalendar)
    public WebElement buttonCalendar;

    @FindBy(css = webElementBoxPopupCalendar)
    public WebElement boxPopupCalendar;

    @FindBy(css = webElementButtonLeftCalendarYear)
    public WebElement buttonLeftCalendarYear;

    @FindBy(css = webElementDropdownSelectEthnicity)
    public WebElement dropdownSelectEthnicity;

    @FindBy(css = webElementDropdownSelectGender)
    public WebElement dropdownSelectGender;

    @FindBy(css = webElementInputAddress1)
    public WebElement inputAddress;

    @FindBy(css = webElementInputCity)
    public WebElement inputCity;

    @FindBy(css = webElementDropdownSelectState)
    public WebElement dropdownSelectState;

    @FindBy(css = webElementInputZipCode)
    public WebElement inputZipCode;

    @FindBy (css = webElementInputPrimaryPhone)
    public WebElement inputPrimaryPhone;

    @FindBy (css = webElementDropdownSelectPhoneType)
    public WebElement dropdownSelectPhoneType;

    @FindBy (css = webElementInputEmail)
    public WebElement inputEmail;

    @FindBy (css = webElementInputPassword)
    public WebElement inputPassword;

    @FindBy (css = webElementInputVerifyPassword)
    public WebElement inputVerifyPassword;

    @FindBy (css = webElementButtonWaiverAgreements)
    public WebElement buttonWaiverAgreements;

    @FindBy (css = webElementFrameReleaseWaiverLiability)
    public WebElement frameReleaseWaiverLiability;

    @FindBy (css = webElementCheckboxReleaseWaiverLiability)
    public WebElement checkboxReleaseWaiverLiability;

    @FindBy (css = webElementButtonSubmitReleaseWaiverLiability)
    public WebElement buttonSubmitReleaseWaiverLiability;

    @FindBy (css = webElementTextVolunteerRegistrationPage)
    public WebElement textVolunteerRegistrationPage;

    @FindBy (css = webElementTextNameVolunteerRegistrationPage)
    public WebElement textNameVolunteerRegistrationPage;

    @FindBy (css = webElementButtonSearchVolunteerOpportunities)
    public WebElement buttonSearchVolunteerOpportunities;

    @FindBy (css = webElementInputLocation)
    public WebElement inputLocation;

    @FindBy (css = webElementDropdownDistance)
    public WebElement dropdownDistance;

    @FindBy (css = webElementInputKeyword)
    public WebElement inputKeyword;

    @FindBy (css = webElementButtonEnabledSearch)
    public WebElement buttonEnabledSearch;

    @FindBy (css = webElementTextOpportunitySearch)
    public WebElement textOpportunitySearch;

    @FindBy (css = webElementTextOpportunitySearchFilterTag)
    public WebElement textOpportunitySearchDistanceFilterTag;

    @FindBy (css = webElementButtonPlayVideo)
    public WebElement buttonPlayVideo;

    @FindBy (css = webElementButtonPlayingVideo)
    public WebElement buttonPlayingVideo;

    @FindBy (css = webElementButtonPausedVideo)
    public WebElement buttonPausedVideo;

    @FindBy (css = webElementInputRegionalOffice)
    public WebElement inputRegionalOffice;

    @FindBy (css = webElementTextRegionalOfficeSearch)
    public WebElement textRegionalOfficeSearch;


    public void navigateToVolunteerNearYouPage() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonGetInvolved));

        clickOnElement(buttonGetInvolved);
        System.out.println("Clicked \"Get Involved\" header dropdown menu");

        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonVolunteerLocally));

        clickOnElement(buttonVolunteerLocally);
        System.out.println("Clicked \"Volunteer Locally\" button");
    }

    public void clickButtonRegisterToVolunteer() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonRegisterToVolunteer));

        clickOnElement(buttonRegisterToVolunteer);
        System.out.println("Clicked \"Register To Volunteer\" button");
    }

    public void switchTabs() {
        java.util.Iterator<String> iter = driver.getWindowHandles().iterator();

        String parentWindow = iter.next();
        String childWindow = iter.next();
        driver.switchTo().window(childWindow);

        String actualTitle = driver.getTitle();
        System.out.println("Switched to tab: " + actualTitle);
    }

    public void inputFirstName(String firstName) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputFirstName));

        inputFirstName.sendKeys(firstName);
        System.out.println("Entered " + firstName + "in \"First Name\" input field");
    }

    public void inputLastName(String lastName) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputLastName));

        inputLastName.sendKeys(lastName);
        System.out.println("Entered " + lastName + "in \"Last Name\" input field");
    }

    public void clickButtonCalendar() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(buttonCalendar));

        try {
            clickJScript(buttonCalendar);
            System.out.println("Clicked \"Calendar\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"CALENDAR\" BUTTON --- TRYING AGAIN");
            clickOnElement(buttonCalendar);
        }
    }

    public void clickButtonLeftCalendarYear() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(boxPopupCalendar));

        try {
            clickOnElement(buttonLeftCalendarYear);
            System.out.println("Clicked \"Calendar Year - Left\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"CALENDAR YEAR - LEFT\" BUTTON --- TRYING AGAIN");
            clickOnElement(buttonLeftCalendarYear);
        }
    }

    public void clickButtonCalendarYear(String yearRow, String yearCell) {
        try {
            sleepFor(1);
        } catch (Exception e) {
            e.getMessage();
        }

        WebElement calendarYear = driver.findElement(By.cssSelector(getWebElementButtonCalendarYear(yearRow, yearCell)));

        try {
            clickOnElement(calendarYear);
            System.out.println("Selected Year in Calendar");
        } catch (Exception e) {
            System.out.println("UNABLE TO SELECT YEAR --- TRYING AGAIN");
            clickOnElement(calendarYear);
        }
    }

    public void clickButtonCalendarMonth(String monthRow, String monthCell) {
        try {
            sleepFor(1);
        } catch (Exception e) {
            e.getMessage();
        }

        WebElement calendarMonth = driver.findElement(By.cssSelector(getWebElementButtonCalendarMonth(monthRow, monthCell)));

        try {
            clickOnElement(calendarMonth);
            System.out.println("Selected Month in Calendar");
        } catch (Exception e) {
            System.out.println("UNABLE TO SELECT MONTH --- TRYING AGAIN");
            clickOnElement(calendarMonth);
        }
    }

    public void clickButtonCalendarDay(String dayRow, String dayCell) {
        try {
            sleepFor(1);
        } catch (Exception e) {
            e.getMessage();
        }

        WebElement calendarDay = driver.findElement(By.cssSelector(getWebElementButtonCalendarDay(dayRow, dayCell)));

        try {
            clickOnElement(calendarDay);
            System.out.println("Selected Month in Calendar");
        } catch (Exception e) {
            System.out.println("UNABLE TO SELECT DAY --- TRYING AGAIN");
            clickOnElement(calendarDay);
        }
    }

    public void selectEthnicity(String ethnicity) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(dropdownSelectEthnicity));

        Select select = new Select(dropdownSelectEthnicity);
        select.selectByVisibleText(ethnicity);
    }

    public void selectGender(String gender) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(dropdownSelectGender));

        Select select = new Select(dropdownSelectGender);
        select.selectByVisibleText(gender);
    }

    public void inputAddress(String address) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputAddress));

        inputAddress.sendKeys(address);
        System.out.println("Entered " + address + "in \"Street Address 1\" input field");
    }

    public void inputCity(String city) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputCity));

        inputCity.sendKeys(city);
        System.out.println("Entered " + city + "in \"City\" input field");
    }

    public void selectState(String state) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(dropdownSelectState));

        Select select = new Select(dropdownSelectState);
        select.selectByVisibleText(state);
    }

    public void inputZipCode(String zipcode) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputZipCode));

        inputZipCode.sendKeys(zipcode);
        System.out.println("Entered " + zipcode + "in \"Zip Code\" input field");
    }

    public void inputPrimaryPhone(String phoneNum) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputPrimaryPhone));

        inputPrimaryPhone.sendKeys(phoneNum);
        System.out.println("Entered " + phoneNum + "in \"Primary Phone\" input field");
    }

    public void selectPhoneType(String phoneType) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(dropdownSelectPhoneType));

        Select select = new Select(dropdownSelectPhoneType);
        select.selectByVisibleText(phoneType);
    }

    public void inputEmail(String email) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputEmail));

        inputEmail.sendKeys(email);
        System.out.println("Entered " + email + "in \"Email\" input field");
    }

    public void inputPassword(String password) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputPassword));

        inputPassword.sendKeys(password);
        System.out.println("Entered " + password + "in \"Password\" input field");
    }

    public void inputVerifyPassword(String password) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputVerifyPassword));

        inputVerifyPassword.sendKeys(password);
        System.out.println("Entered " + password + "in \"Verify Password\" input field");
    }

    public void clickButtonWaiverAgreements() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.visibilityOf(buttonWaiverAgreements));

        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonWaiverAgreements));

        try {
            sleepFor(1);
            clickJScript(buttonWaiverAgreements);
            System.out.println("Clicked \"Waiver Agreements\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"WAIVER AGREEMENTS\" BUTTON --- TRYING AGAIN");
            clickOnElement(buttonWaiverAgreements);
        }
    }

    public void clickCheckboxReleaseWaiverLiability() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(checkboxReleaseWaiverLiability));

        try {
            clickJScript(checkboxReleaseWaiverLiability);
            System.out.println("Clicked \"Release and Waiver Liability\" checkbox");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK ON \"RELEASE AND WAIVER LIABILITY\" CHECKBOX --- TRYING AGAIN");
            clickOnElement(checkboxReleaseWaiverLiability);
        }
    }

    public void clickButtonSubmitReleaseWaiverLiability() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonSubmitReleaseWaiverLiability));

        try {
            clickJScript(buttonSubmitReleaseWaiverLiability);
            System.out.println("Clicked \"Release and Waiver Liability\" Submit button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK ON \"RELEASE AND WAIVER LIABILITY\" SUBMIT BUTTON --- TRYING AGAIN");
            clickOnElement(buttonSubmitReleaseWaiverLiability);
        }
    }

    public String getURLVolunteerRegistrationPage(String url) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.urlToBe(url));

        return driver.getCurrentUrl();
    }

    public String getTextVolunteerRegistrationPage() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(textVolunteerRegistrationPage));

        return textVolunteerRegistrationPage.getText();
    }

    public String getNameVolunteerRegistrationPage() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(textNameVolunteerRegistrationPage));

        return textNameVolunteerRegistrationPage.getText();
    }

    public void clickButtonSearchVolunteerOpportunities() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonSearchVolunteerOpportunities));

        try {
            clickJScript(buttonSearchVolunteerOpportunities);
            System.out.println("Clicked \"Search Volunteer Opportunities\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK ON \"SEARCH VOLUNTEER OPPORTUNITIES\" BUTTON --- TRYING AGAIN");
            clickOnElement(buttonSearchVolunteerOpportunities);
        }
    }

    public void inputLocationSearchVolunteerOpportunitiesPage(String location) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputLocation));

        try {
            sleepFor(1);
            inputLocation.sendKeys(location);
            System.out.println("Entered " + location + "in \"Location\" input field");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void selectDistanceSearchVolunteerOpportunitiesPage(String distance) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(dropdownDistance));

        Select select = new Select(dropdownDistance);

        try {
            sleepFor(1);
            select.selectByVisibleText(distance);
            System.out.println("Selected \"" + distance + "\" from \"Distance\" dropdown");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickButtonEnabledSearchVolunteerOpportunities() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonEnabledSearch));

        try {
            sleepFor(1);
            clickJScript(buttonEnabledSearch);
            System.out.println("Clicked \"Search\" button");
            sleepFor(2);
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK ON \"SEARCH\" BUTTON --- TRYING AGAIN");
            clickOnElement(buttonEnabledSearch);
        }
    }

    public String getHeaderTextOpportunitySearchPage() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(textOpportunitySearch));

        return textOpportunitySearch.getText();
    }

    public void clickPlayEmbeddedVideo() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(buttonPlayVideo));

        try {
            clickJScript(buttonPlayVideo);
            System.out.println("Clicked \"Play\" button on embedded video");
            sleepFor(2);
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"PLAY\" BUTTON ON EMBEDDED VIDEO --- TRYING AGAIN");
            clickJScript(buttonPlayVideo);
        }
    }

    public void clickPauseEmbeddedVideo() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(buttonPlayingVideo));

        try {
            sleepFor(2);
            clickJScript(buttonPlayingVideo);
            System.out.println("Clicked \"Pause\" button in embedded video control bar");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"PAUSE\" BUTTON IN EMBEDDED VIDEO CONTROL BAR --- TRYING AGAIN");
            clickJScript(buttonPlayingVideo);
        }
    }

    public boolean isVideoPlayerPaused() {
        boolean flag = false;
        if (buttonPausedVideo.isDisplayed()) {
            flag = true;

            try {
                sleepFor(2);
                clickJScript(buttonPausedVideo);
                System.out.println("Clicked \"Play\" button in embedded video control bar");
                sleepFor(2);
            } catch (Exception e) {
                System.out.println("UNABLE TO CLICK \"PLAY\" BUTTON IN EMBEDDED VIDEO CONTROL BAR --- TRYING AGAIN");
                clickJScript(buttonPausedVideo);
            }
            return flag;
        } else {
            return flag;
        }
    }

    public void inputStateRegionalOfficeLookup(String state){
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(inputRegionalOffice));

        try {
            inputRegionalOffice.sendKeys(state);
            System.out.println("Entered " + state + " in \"Regional Office State Lookup\" input field");
        } catch (Exception e) {
            System.out.println("UNABLE TO ENTER " + state.toUpperCase() + " IN \"REGIONAL OFFICE STATE LOOKUP\" INPUT FIELD --- TRYING AGAIN");
            inputRegionalOffice.sendKeys(state);
        }
    }

    public void clickSearchResultStateRegionalOffice(String state) {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath(getWebElementButtonStateSelect(state)))));

        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(getWebElementButtonStateSelect(state))));

        try {
            sleepFor(2);
            clickJScript(driver.findElement(By.xpath(getWebElementButtonStateSelect(state))));
            System.out.println("Clicked \"" + state + "\" button in search result dropdown menu");
            sleepFor(1);
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"" + state + "\" BUTTON IN SEARCH RESULT DROPDOWN MENU --- TRYING AGAIN");
            clickJScript(driver.findElement(By.xpath(getWebElementButtonStateSelect(state))));
        }
    }

    public String getTextRegionalOfficeResultPage() {
        new WebDriverWait(driver, 10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(textRegionalOfficeSearch));

        return textRegionalOfficeSearch.getText();
    }


}






