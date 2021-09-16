package Bank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features/gherkin",
        glue = "Bank/step_definitions",
        dryRun = false,
        tags = "@account_opening_unlimited_Checking",
        publish = true
)
public class CucumberRunner {
}
