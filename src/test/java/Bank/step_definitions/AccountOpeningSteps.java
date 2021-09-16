package Bank.step_definitions;

import Bank.Pages.ApplyOnlinePage;
import Bank.Pages.HomePage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class AccountOpeningSteps {

    WebDriver driver;

    HomePage homePage = new HomePage();
    ApplyOnlinePage applyOnlinePage = new ApplyOnlinePage();

    @Given("the user launches to huntington page")
    public void the_user_launches_to_huntington_page() {
        homePage.navigateToHomePage();
    }

    @When("the user clicks on open an Account")
    public void the_user_clicks_on_open_an_account() {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[4]/ul/li[1]/a")).click();
        homePage.openAccount();

    }
    @When("the user clicks on Apply for Asterisk-Free Checking")
    public void the_user_clicks_on_apply_for_asterisk_free_checking() {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.xpath("//*[@id=\"rich-tile-1c63dd20086940da87779aea49205459\"]/p[2]/a")).click();
        applyOnlinePage.applyAsterisk();

    }
    @Then("the user validates the Asterisk-Free Checking is display on the page")
    public void the_user_validates_the_asterisk_free_checking_is_display_on_the_page() {

    }

    @When("the user clicks on Unlimited Business Checking button")
    public void the_user_clicks_on_unlimited_business_checking_button() {
        applyOnlinePage.applyBUC();
    }

    @Then("the user should be on the Welcome page")
    public void the_user_should_be_on_the_welcome_page() {

    }

}
