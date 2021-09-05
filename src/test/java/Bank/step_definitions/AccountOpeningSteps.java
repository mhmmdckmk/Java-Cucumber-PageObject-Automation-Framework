package Bank.step_definitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountOpeningSteps {

    WebDriver driver;

    @Given("the user launches to huntington page")
    public void the_user_launches_to_huntington_page() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.huntington.com");

    }

    @When("the user clicks on open an Account")
    public void the_user_clicks_on_open_an_account() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[4]/ul/li[1]/a")).click();


    }
    @When("the user clicks on Apply for Asterisk-Free Checking")
    public void the_user_clicks_on_apply_for_asterisk_free_checking() {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.xpath("//*[@id=\"rich-tile-1c63dd20086940da87779aea49205459\"]/p[2]/a")).click();

    }
    @Then("the user validates the Asterisk-Free Checking is display on the page")
    public void the_user_validates_the_asterisk_free_checking_is_display_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
        System.out.println(title);
        String actual = title;
        String expected = "Huntington Online Account Opening";
        Assert.assertEquals("Success",expected,actual);



    }
}
