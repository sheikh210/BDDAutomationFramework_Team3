package trip_advisor_runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/feature/",
        glue = "trip_advisor_runner/step_definition",
        tags = "@SearchMultiple",
        plugin = "pretty"
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
