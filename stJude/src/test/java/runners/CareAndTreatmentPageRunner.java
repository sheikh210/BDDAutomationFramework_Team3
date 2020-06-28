package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"step_definitions"},
   // tags = "@Search",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"}
)

public class CareAndTreatmentPageRunner extends AbstractTestNGCucumberTests {




}
