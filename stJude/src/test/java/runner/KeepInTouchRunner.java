package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "runner/step_definitions",
        plugin = "pretty",
        tags = "@SignUp"
)


public class KeepInTouchRunner extends AbstractTestNGCucumberTests {


}
