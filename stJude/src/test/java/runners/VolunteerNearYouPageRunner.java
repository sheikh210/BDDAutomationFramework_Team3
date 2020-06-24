package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"step_definitions"}
//        , tags = "@VolunteerNearYou-SearchOpportunities"
        , monochrome = true
        , plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"}
)

public class VolunteerNearYouPageRunner extends AbstractTestNGCucumberTests {
}
