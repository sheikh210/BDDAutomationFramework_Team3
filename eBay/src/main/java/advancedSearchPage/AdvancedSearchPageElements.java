package advancedSearchPage;

public class AdvancedSearchPageElements {

    // Advanced Search Link (id)
    public static final String webElementLinkAdvancedSearch = "gh-as-a";
    // Keywords Input Field (id)
    public static final String webElementInputKeywords = "_nkw";
    // Category Dropdown (css)
    public static final String webElementSelectCategory = "#e1-1";
    // Top Search Button (css)
    public static final String webElementButtonSearchTop = "#adv_search_from div.adv-s.mb.space-top > button";
    // Bottom Search Button (id)
    public static final String webElementButtonSearchBottom = "searchBtnLowerLnk";
    // Title & Description Checkbox (css)
    public static final String webElementCheckboxTitleAndDescription = "#LH_TitleDesc";
    // Completed Listings Checkbox (xPath)
    public static final String webElementCheckboxCompletedListings = "//*[@id=\"LH_Complete\"]";
    // Sold Listings Checkbox (xPath)
    public static final String webElementCheckboxSoldListings = "//*[@id=\"LH_Sold\"]";
    // Show Items Priced From Checkbox (id)
    public static final String webElementCheckboxShowItemsPricedFrom = "_mPrRngCbx";
    // Minimum Price Input Field (CSS)
    public static final String webElementInputMinimumPrice = "#adv_search_from input[aria-label*='minimum']";
    // Maximum Price Input Field (CSS)
    public static final String webElementInputMaximumPrice = "#adv_search_from input[aria-label*='maximum']";
    // Search by price - Results page Price Range (CSS)
    public static final String webElementResultPriceRange = "#smuys > span > b > span";
    // Find Store Button (CSS)
    public static final String webElementButtonFindStore = "#LeftPanel a[href*='type=7']";
    // Find Store Input Field (CSS)
    public static final String webElementInputFindStore = "#_nkw";
    // Find Store Search Button (CSS)
    public static final String webElementButtonSearchFindStore = "#adv_search_from button";
    // On Ebay Motors Button (CSS)
    public static final String webElementButtonOnEbayMotors = "#LeftPanel a[href*='sofindtype=21']";
    // Ebay Motors Vehicle Select (CSS)
    public static final String webElementSelectVehicle = "#fisc";
    // Ebay Motors Vehicle Select (LIST) (CSS)
    private static final String webElementListSelectVehicle = "#fisc > option";
    public static String getWebElementListSelectVehicle() { return webElementListSelectVehicle; }
    // Ebay Motors Vehicle Make Select (CSS)
    public static final String webElementSelectVehicleMake = "#make";
    // Ebay Motors Vehicle Model Select (CSS)
    public static final String webElementSelectVehicleModel = "#model";
    // Ebay Motors Vehicle Year Low Input Field (CSS)
    public static final String webElementInputVehicleYearLow = "#_yrl";
    // Ebay Motors Vehicle Year High Input Field (CSS)
    public static final String webElementInputVehicleYearHigh = "#_yrh";
    // Ebay Motors Vehicle Transmission Select (CSS)
    public static final String webElementSelectVehicleTransmission = "#transmission";
    // Ebay Motors Sort By Select (CSS)
    public static final String webElementSelectVehicleSortBy = "#_sop";
    // Ebay Motors Search Button (CSS)
    public static final String webElementButtonSearchOnEbayMotors = "#adv_search_from button";
    // Ebay Motors Search Result Assert Element (xPath)
    public static final String webElementTextVehicleSearchResult = "//div[@class='cat-link']//a";

}
