package helpPage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helpPage.HelpPageElements.*;

public class HelpPageActions extends WebAPI {
    WebDriverWait wait;

    @FindBy(css=webElementHelpButton)
    public WebElement helpButton;
    @FindBy(css = webElementSearchBox)
    public WebElement searchBox;
    @FindBy(xpath = webElementReturnText)
    public WebElement returnText;
    @FindBy(xpath = webElementSignInButton)
    public WebElement signInButton;
    @FindBy(xpath = webElementVerify)
    public WebElement verify;
    @FindBy(xpath = webElementRegisterButton)
    public WebElement registerButton;
    @FindBy(xpath = webElementCOVIDArticleLink)
    public WebElement covidArticleLink;
    @FindBy(xpath = webElementBuyingAsGuest)
    public WebElement buyingAsGuest;
    @FindBy(xpath = webElementReturnRefund)
    public WebElement returnRefund;
    @FindBy(xpath = webElementShipping)
    public WebElement shipping;
    @FindBy(xpath = webElementSelling)
    public WebElement selling;
    @FindBy(xpath = webElementBuying)
    public WebElement buying;
    @FindBy(xpath = webElementAccount)
    public WebElement account;
    @FindBy(xpath = webElementFees)
    public WebElement fees;
    @FindBy(xpath = webElementContactUsButton)
    public WebElement contactUsButton;
    @FindBy(xpath = webElementReportAnItem)
    public WebElement reportAnItem;
    @FindBy(xpath = webElementStartReturn)
    public WebElement startReturn;
    @FindBy(xpath =webElementAboutEbay )
    public WebElement aboutEbay;
    @FindBy(xpath = webElementAnnouncement)
    public WebElement announcement;
    @FindBy(xpath = webElementCommunity)
    public WebElement community;
    @FindBy(xpath = webElementSecurityCenter)
    public WebElement securityCenter;
    @FindBy(xpath = WebElementResolutionCenter)
    public WebElement resolutionCenter;

    /**
     * Background
     */
    public void navigateToHelpPage(){
        new WebDriverWait(driver, 10).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(helpButton));
        clickOnElement(helpButton);
    }

    /**
     * Scenario 1
     * @param keyword
     */
    public void enterKeysKeywordSearch(String keyword){
        waitUntilVisible(By.cssSelector(webElementSearchBox));
        typeByCss(webElementSearchBox,keyword);
    }
    public void selectReturnTopicFromList(){
        clickOnElement(returnText);

    }
    /**
     * Scenario 2
     */

    public void clickSignInButton(){
     waitUntilClickAble(By.xpath(webElementSignInButton));
        clickOnElement(signInButton);
    }
    public boolean isVerifyDisplayed(){
        boolean flag=verify.isDisplayed();
        return flag;
    }
    /**
     * Scenario 3
     */
    public void clickRegisterButton(){
        waitUntilClickAble(By.xpath(webElementRegisterButton));
        clickOnElement(registerButton);
    }
    /**
     * Scenario 4
     */
    public void clickCOVIDarticle(){
        waitUntilClickAble(By.xpath(webElementCOVIDArticleLink));
        clickOnElement(covidArticleLink);
    }
    /**
     * Scenario 5
     */
    public void clickBuyingAsGuest(){
        waitUntilClickAble(By.xpath(webElementBuyingAsGuest));
        clickOnElement(buyingAsGuest);
    }
    /**
     * Scenario 6,7,8,9,10
     */
    public void clickHelpfulArticles(String article){
        if (article.equalsIgnoreCase("Returns & Refunds")){
            new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(returnRefund));
            try {
                sleepFor(1);
                clickOnElement(returnRefund);
                System.out.println("Clicked Returns & Refunds");
            } catch (Exception e) {
                System.out.println("ATTEMPT 2 - RETURNS & REFUNDS");
                clickJScript(returnRefund);
            }

        }
        else if(article.equalsIgnoreCase("Shipping & Tracking")){
            new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(shipping));

            try {
                sleepFor(1);
                clickOnElement(shipping);
                System.out.println("Clicked Shipping");
            } catch (Exception e) {
                System.out.println("ATTEMPT 2 - SHIPPING");
                clickJScript(shipping);
            }

        }
        else if(article.equalsIgnoreCase("Selling")){
            new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(selling));
            try {
                sleepFor(1);
                clickOnElement(selling);
                System.out.println("Clicked Selling");
            } catch (Exception e) {
                System.out.println("ATTEMPT 2 - SELLING");
                clickJScript(selling);
            }

        }
        else if(article.equalsIgnoreCase("Buying")){
            new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(buying));
            try {
                sleepFor(1);
                clickOnElement(buying);
                System.out.println("Clicked Buying");
            } catch (Exception e) {
                System.out.println("ATTEMPT 2 - BUYING");
                clickJScript(buying);
            }
        }
        else if(article.equalsIgnoreCase("Account")){
            new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(account));
            try {
                sleepFor(1);
                clickOnElement(account);
                System.out.println("Clicked Account");
            } catch (Exception e) {
                System.out.println("ATTEMPT 2 - ACCOUNT");
                clickJScript(account);
            }

        }
        else if(article.equalsIgnoreCase("Fees & Invoices")){
            new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(fees));
            try {
                sleepFor(1);
                clickOnElement(fees);
                System.out.println("Clicked Fees");
            } catch (Exception e) {
                System.out.println("ATTEMPT 2 - FEES");
                clickJScript(fees);
            }
        }

    }
    public String getHelpfulArticlesPageTitles(String pageTitle){
        new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs(pageTitle));
        return driver.getTitle();
    }
    /**
     * Scenario 11
     */
    public void clickContactUsButton(){
        waitUntilClickAble(By.xpath(webElementContactUsButton));
        clickOnElement(contactUsButton);
        //new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Call Us | eBay"));
    }
    /**
     * Scenario 12
     */
    public void reportAnItem(){
        waitUntilClickAble(By.xpath(webElementReportAnItem));
        clickOnElement(reportAnItem);
    }
    /**
     * Scenario 13
     */
    public void startReturn(){
        new WebDriverWait(driver,10)
                    .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(startReturn));
        try {
            sleepFor(1);
            clickOnElement(startReturn);
            System.out.println("Clicked startReturn");
        } catch (Exception e) {
            System.out.println("ATTEMPT 2 - return");
            clickJScript(startReturn);
        }
    }
    /**
     * Scenario 14
     */
    public void clickAboutEbay(){
        new WebDriverWait(driver,10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(aboutEbay));
        try {
            sleepFor(1);
            clickOnElement(aboutEbay);
            System.out.println("Clicked startReturn");
        } catch (Exception e) {
            System.out.println("ATTEMPT 2 - return");
            clickJScript(aboutEbay);
        }
    }
    /**
     * Scenario 15
     */
    public void clickAnnouncement(){
        new WebDriverWait(driver,10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(announcement));
        try {
            sleepFor(1);
            clickOnElement(announcement);
            System.out.println("Clicked startReturn");
        } catch (Exception e) {
            System.out.println("ATTEMPT 2 - return");
            clickJScript(announcement);
        }

    }
    public void clickCommunity(){
        new WebDriverWait(driver,10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(community));
        try {
            sleepFor(1);
            clickOnElement(community);
            System.out.println("Clicked startReturn");
        } catch (Exception e) {
            System.out.println("ATTEMPT 2 - return");
            clickJScript(community);
        }

    }
    public void clickSecurityCenter(){
        new WebDriverWait(driver,10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(securityCenter));
        try {
            sleepFor(1);
            clickOnElement(securityCenter);
            System.out.println("Clicked startReturn");
        } catch (Exception e) {
            System.out.println("ATTEMPT 2 - return");
            clickJScript(securityCenter);
        }

    }
    public void clickResolutionCenter(){
        new WebDriverWait(driver,10)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(resolutionCenter));
        try {
            sleepFor(1);
            clickOnElement(resolutionCenter);
            System.out.println("Clicked startReturn");
        } catch (Exception e) {
            System.out.println("ATTEMPT 2 - return");
            clickJScript(resolutionCenter);
        }

    }

}
