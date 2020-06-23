package volunteerNearYouPage;

public class VolunteerNearYouPageElements {

    // St Jude Homepage - "Get Involved" Button Dropdown (CSS)
    public static final String webElementButtonGetInvolved = "body li.get-involved > a";

    // "Volunteer Locally" Button (CSS)
    public static final String webElementButtonVolunteerLocally = "a[href*='gi-mm-volunteer-locally']";

    // "Register To Volunteer" Button (CSS)
    public static final String webElementButtonRegisterToVolunteer = "a[href*='volunteer_registration']";

    // "First Name" Input Field (CSS)
    public static final String webElementInputFirstName = "#erec_wrapper > div.view-container.clearfix input[name*=FIRST_NAME]";

    // "Last Name" Input Field (CSS)
    public static final String webElementInputLastName = "#erec_wrapper > div.view-container.clearfix input[name*=LAST_NAME]";

    // Calendar Button (CSS)
    public static final String webElementButtonCalendar = "#erec_wrapper > div.view-container.clearfix button";

    // Calendar Pop-Up Box (CSS)
    public static final String webElementBoxPopupCalendar = "#erec_wrapper > div.view-container.clearfix ul[role*='presentation']";

    // Calendar Year Left Button (CSS)
    public static final String webElementButtonLeftCalendarYear = "#erec_wrapper > div.view-container.clearfix div.container.ng-scope button[class*='uib-left']";

    // Calendar Year (CSS)
    public static String getWebElementButtonCalendarYear(String yearRow, String yearCell) { return "#erec_wrapper > div.view-container.clearfix tbody > tr:nth-child("+yearRow+") td:nth-child("+yearCell+")"; }

    // Calendar Month (CSS)
    public static String getWebElementButtonCalendarMonth(String monthRow, String monthCell) { return "#erec_wrapper > div.view-container.clearfix tbody > tr:nth-child("+ monthRow +") td:nth-child("+ monthCell +") button"; }

    // Calendar Day (CSS)
    public static String getWebElementButtonCalendarDay(String dayRow, String dayCell) { return "#erec_wrapper > div.view-container.clearfix > div > div.container.ng-scope tbody tr:nth-child(" + dayRow + ") > td:nth-child(" + dayCell + ") button"; }

    // "Ethnicity" Dropdown (CSS)
    public static final String webElementDropdownSelectEthnicity = "#Ethnicity_Ethnicity";

    // "Gender" Dropdown (CSS)
    public static final String webElementDropdownSelectGender = "#Gender_Gender";

    // "Address 1" Input Field (CSS)
    public static final String webElementInputAddress1 = "#erec_wrapper > div.view-container.clearfix input[name*='ADDRESS_1']";

    // "City" Input Field (CSS)
    public static final String webElementInputCity = "#erec_wrapper > div.view-container.clearfix input[name*='VOL_CITY']";

    // "State" Dropdown (CSS)
    public static final String webElementDropdownSelectState = "#VOL_STATE";

    // "Zip Code" Input Field (CSS)
    public static final String webElementInputZipCode = "input[name*='VOL_POSTAL_CODE']";

    // "Primary Phone" Input Field (CSS)
    public static final String webElementInputPrimaryPhone = "#VOL_CONTACT\\#4";

    // "Phone Type" Dropdown (CSS)
    public static final String webElementDropdownSelectPhoneType = "#Communication_Method_Phone_Type";

    // "Email" Input Field (CSS)
    public static final String webElementInputEmail = "#VOL_USER_ID";

    // "Password" Input Field (CSS)
    public static final String webElementInputPassword = "#VOL_PASSWORD";

    // "Verify Password" Input Field (CSS)
    public static final String webElementInputVerifyPassword = "#VOL_PASSWORD_VERIFY";

    // "Waiver Agreements" Button (CSS)
    public static final String webElementButtonWaiverAgreements = "a[class*='btn btn-primary btn-lg']";

    // "Release and Waiver Liability" Frame (CSS)
    public static final String webElementFrameReleaseWaiverLiability = "#page_volunteer_registration > div.modal.fade.ng-scope.ng-isolate-scope.in";

    // "Release and Waiver Liability" Checkbox (CSS)
    public static final String webElementCheckboxReleaseWaiverLiability = "#Waiver\\[1478\\]";

    // "Release and Waiver Liability" Submit Application Button (CSS)
    public static final String webElementButtonSubmitReleaseWaiverLiability = "#page_volunteer_registration button.btn.btn-primary";

    // Volunteer Registration Success Page - Text (CSS)
    public static final String webElementTextVolunteerRegistrationPage = "#erec_wrapper strong";

    // Volunteer Registration Success Page - First Name (CSS)
    public static final String webElementTextNameVolunteerRegistrationPage = "#header-vol-name";

}
