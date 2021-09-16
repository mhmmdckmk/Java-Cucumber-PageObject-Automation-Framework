package Bank.step_definitions;

import Bank.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

// Hooks trigger based on tags not class name or their location
// These methods can be a part of any step definition class
// Common practice is to store them in the separate class

public class Hooks {

    // hook after = @AfterMethod in TestNG
    // hook after = @AfterMethod in TestNG
    // it's not a good idea to mix implicit and explicit waits. it can lead to unexpectedly long waits. 

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames()); //return all tags that are top of scenario
        System.out.println(": : : Starting Automation : : :");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        // close browser, close DB connection, close tunnel, capture screenshot of the error failure
        //this is a hook after
        //runs automatically after every test
        Driver.closeDriver();
        System.out.println(": : : Enf of test execution: : :");
    }
}
