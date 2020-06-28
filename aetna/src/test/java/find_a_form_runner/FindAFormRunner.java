package find_a_form_runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"step_definitions"}
        , tags = "@SmokeTest"
        , monochrome = true
        , plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"}

)
public class FindAFormRunner extends AbstractTestNGCucumberTests {

}



