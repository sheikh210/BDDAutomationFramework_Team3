package cruisesSearchPage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static cruisesSearchPage.CruisesSearchPageElements.*;

public class CruisesSearchPageActions extends WebAPI {

    @FindBy(xpath = webElementMoreDropDown)
    public WebElement moreDropDown;

    @FindBy(xpath = webElementCruisesOption)
    public WebElement cruisesOption;

    @FindBy(xpath = webElementSelectDestinationBox)
    public WebElement selectDestinationBox;

    @FindBy(xpath = webElementDestinationCaribbean)
    public WebElement destinationCaribbean;


    public void navigateToCruisesSearchPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(moreDropDown));
        moreDropDown.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(cruisesOption));
        cruisesOption.click();
        System.out.println("Clicked \"Cruises\" option");
    }

    public void selectDestination(String destination) {
        Select select = new Select(selectCategory);

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(selectCategory));
        select.selectByVisibleText(category);
        System.out.println("Selected \"" + category + "\" in Category dropdown");
    }

}
