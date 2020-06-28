package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "ebay_step_definitions",
        plugin = "pretty",
        tags = "@AdvancedSearchSearchIncluding"
)

public class AdvancedSearchRunner extends AbstractTestNGCucumberTests {
}