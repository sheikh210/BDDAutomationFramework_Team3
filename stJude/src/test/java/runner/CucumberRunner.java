package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/java/features/",
        glue = "step_definitions",
        plugin = "pretty",
        tags = "@SignUp"
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
