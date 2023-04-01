package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Header extends BasePage {

    @FindBy(id = "nav-link-home")
    WebElement homeLink;

    @FindBy(css = "#nav-link-login")
    WebElement loginLink;

    @FindBy(linkText = "Profile")
    WebElement profileLink;

    @FindBy(xpath = "//i[@class='fas fa-sign-out-alt fa-lg']")
    WebElement logOutLink;


    public Header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToLogin() {
        Assert.assertTrue(loginLink.isEnabled(), "Login link not enabled");
        clickElement(loginLink);
    }

    public void goToHome() {
        clickElement(homeLink);
    }

    public void goToProfile() {
        clickElement(profileLink);
    }

    public void goToLogOutLink() {
        Assert.assertTrue(logOutLink.isEnabled(), "Log Out link not enabled!");
        clickElement(logOutLink);
    }

}
