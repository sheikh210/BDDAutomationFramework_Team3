package find_a_form_runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "find_a_form_runner/find_a_form_step_definitions",
        plugin = "pretty",
        tags = "@FindAForm"
)
public class FindAFormRunner extends AbstractTestNGCucumberTests {

}




