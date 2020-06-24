package realEstateCenterPage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static realEstateCenterPage.RealEstateCenterPageElements.*;

public class RealEstateCenterPageActions extends WebAPI {

    @FindBy (css = webElementButtonHomeLoans)
    private WebElement buttonHomeLoans;

    @FindBy (css = webElementButtonFindAHome)
    private WebElement buttonFindAHome;

    @FindBy (css = webElementInputLocation)
    private WebElement inputLocation;

    @FindBy (css = webElementListItemFirstSearchResult)
    private WebElement listItemFirstSearchResult;

    @FindBy (css = webElementButtonContinueModal)
    private WebElement buttonContinueModal;

    @FindBy (css = webElementTextPartnerSiteFilterTag)
    private WebElement textPartnerSiteFilterTag;

    @FindBy (css = webElementButtonHomeValue)
    private WebElement buttonHomeValue;

    @FindBy (css = webElementTextFirstLineHomeAddress)
    private WebElement textFirstLineHomeAddress;

    @FindBy (css = webElementTextSecondLineHomeAddress)
    private WebElement textSecondLineHomeAddress;

    public void navigateToRealEstateCenterPage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonHomeLoans));
        try{
            clickJScript(buttonHomeLoans);
            System.out.println("Clicked \"Home Loans\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"HOME LOANS\" BUTTON --- TRYING AGAIN");
            clickJScript(buttonHomeLoans);
        }

        wait.until(ExpectedConditions.elementToBeClickable(buttonFindAHome));
        try{
            clickJScript(buttonFindAHome);
            System.out.println("Clicked \"Find A Home\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"FIND A HOME\" BUTTON --- TRYING AGAIN");
            clickJScript(buttonFindAHome);
        }
    }

    public void inputSearchTermLocationInputField(String searchTerm) {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.attributeContains(inputLocation, "data-placeholder-short", "Enter Location"));

        inputLocation.sendKeys(searchTerm);
        System.out.println("Input \"" + searchTerm + "\" in Location input field");
    }

    public void clickSearchResultLocationInputFieldDropdown() {
        wait = new WebDriverWait(driver, 10);

        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(listItemFirstSearchResult));

        try {
            clickJScript(listItemFirstSearchResult);
            System.out.println("Clicked first search result");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK FIRST SEARCH RESULT --- TRYING AGAIN");
            clickJScript(listItemFirstSearchResult);
        }
    }

    public void clickContinueModalContainer() {
        wait = new WebDriverWait(driver, 10);

        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(buttonContinueModal));

        try {
            clickJScript(buttonContinueModal);
            System.out.println("Clicked Continue in modal container");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK CONTINUE IN MODAL CONTAINER --- TRYING AGAIN");
            clickJScript(buttonContinueModal);
        }
    }

    public String getPageTitle(String pageTitle) {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.titleIs(pageTitle));

        String capturedPageTitle = driver.getTitle();
        System.out.println("Captured page title: " + capturedPageTitle);

        return capturedPageTitle;
    }

    public String getTextPartnerSiteFilterTag() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(textPartnerSiteFilterTag));

        String capturedFilterTagText = textPartnerSiteFilterTag.getText();
        System.out.println("Captured filter tag text: " + capturedFilterTagText);

        return capturedFilterTagText;
    }

    public void clickButtonHomeValue() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonHomeValue));

        try {
            clickJScript(buttonHomeValue);
            System.out.println("Clicked \"Home Value\" button");
        } catch (Exception e) {
            System.out.println("UNABLE TO CLICK \"HOME VALUE\" BUTTON --- TRYING AGAIN");
            clickJScript(buttonHomeValue);
        }
    }

    public void switchTabs() {
        java.util.Iterator<String> iter = driver.getWindowHandles().iterator();

        String parentWindow = iter.next();
        String childWindow = iter.next();
        driver.switchTo().window(childWindow);

        String actualTitle = driver.getTitle();
        System.out.println("Switched to tab: " + actualTitle);
    }

    public String getTextHomeAddressHomeValueSearchResultPage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(textFirstLineHomeAddress));
        String address1 = textFirstLineHomeAddress.getText();

        wait.until(ExpectedConditions.visibilityOf(textSecondLineHomeAddress));
        String address2 = textSecondLineHomeAddress.getText();

        String capturedAddress = address1 + ", " + address2;
        System.out.println("Captured address: " + capturedAddress);

        return capturedAddress;
    }
}

