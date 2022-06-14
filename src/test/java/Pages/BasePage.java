package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Sign in")
    public WebElement SignInButton;

    @FindBy(linkText = "Cart")
    public WebElement ShoppingCart;

    @FindBy(id = "search_query_top")
    public WebElement SearchBar;
}
