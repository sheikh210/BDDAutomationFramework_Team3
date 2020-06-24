package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin = "pretty",
        tags = "@FindAForm"
)

public class FindAFormRunner extends AbstractTestNGCucumberTests {

}
