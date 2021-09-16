package Bank.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    // To not use web elements directly in step definitions classes
    // helps to prevent code duplication and keep step definitions clear

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[4]/ul/li[1]/a" )
    private WebElement openAccountButton;

    @FindBy(className = "login__button")
    private WebElement loginButton;

    @FindBy(id = "personal-username")
    private WebElement usernameBox;

    @FindBy(id = "personal-password")
    private WebElement passwordBox;


    public void openAccount(){
        openAccountButton.click();
    }

    public void loginButtonClick(){
        loginButton.click();
    }

    public void validateUsernamePasswordDisplayed(){
        usernameBox.isDisplayed();
        passwordBox.isDisplayed();

    }

}
