package Bank.step_definitions;

import Bank.Pages.HomePage;
import io.cucumber.java.en.*;

public class LoginModule {

    HomePage homePage = new HomePage();


    @When("the user click on login button")
    public void the_user_click_on_login_button() {
       homePage.loginButtonClick();
    }

    @Then("the user validates the username and password boxes displays on the login module")
    public void the_user_validates_the_and_displays_on_the_login_module() {
        homePage.validateUsernamePasswordDisplayed();
    }
}
