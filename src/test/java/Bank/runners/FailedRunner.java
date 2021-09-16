package Bank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "Bank/step_definitions",
        features = "@target/rerun.txt"

)

public class FailedRunner {

}
