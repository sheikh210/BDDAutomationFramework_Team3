package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features ="src/test/resources/features/helpPageFeatures",
        glue=    "step_definitions",
        plugin = "pretty",
        tags=   "@HelpPage"

)

public class HelpPageRunner extends AbstractTestNGCucumberTests {
}
