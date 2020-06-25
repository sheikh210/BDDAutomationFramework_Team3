package ebay_step_definitions;

import advancedSearchPage.AdvancedSearchPageActions;
import io.cucumber.java.en.*;

public class AdvancedSearchSearchIncludingSteps {

    AdvancedSearchPageActions advancedSearchPageActions = new AdvancedSearchPageActions();

    @And("user select {string} from Search Including section")
    public void user_select_from_Search_Including_section(String string) {
        advancedSearchPageActions.checkCheckbox(string);
    }

    @And("user clicks bottom Search button")
    public void user_clicks_bottom_Search_button(){
        advancedSearchPageActions.clickOnBottomSearchButton();

    }
}
