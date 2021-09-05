package Bank.Pages;


import Bank.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage{


    public BasePage(){

            PageFactory.initElements(Driver.getDriver(),this);

        }


    }

