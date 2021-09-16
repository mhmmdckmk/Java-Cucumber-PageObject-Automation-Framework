package Bank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyOnlinePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"rich-tile-1c63dd20086940da87779aea49205459\"]/p[2]/a" )
    private WebElement applyForAsteriskCheckingButton;

    @FindBy(xpath = "//div[1]/div[3]/div[15]/div/div[2]/div/div/p[2]/a")
    private WebElement applyForBusinessUnlimitedCheckingAccount;

    public void applyAsterisk(){
        applyForAsteriskCheckingButton.click();
    }
    public void applyBUC(){
        applyForBusinessUnlimitedCheckingAccount.click();
    }

}
