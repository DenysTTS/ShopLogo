package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email_create")
    public WebElement EmailAddressCreateAccount;

    @FindBy(id="SubmitCreate")
    public WebElement CreateAccountButton;

    @FindBy(id="email")
    public WebElement LoginEmail;

    @FindBy(id="passwd")
    public WebElement LoginPassword;

    @FindBy(id="SubmitLogin")
    public WebElement LoginButton;


}
