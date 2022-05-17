package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\Feature",
        glue = {"StepDefination"},
        plugin = {"pretty", "html:target/cucumber"},
        tags = "@regression"

)

public class TestRunners extends AbstractTestNGCucumberTests {
}
