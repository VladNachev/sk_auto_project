package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private final String URL = "http://training.skillo-bg.com:4200/users/login";

    @FindBy(css = "form .h4")
    WebElement signInHeader;

    @FindBy(name = "usernameOrEmail")
    WebElement usernameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(id = "sign-in-button")
    WebElement signInBtn;

    @FindBy(className = "toast-error")
    WebElement toastError;

    @FindBy(xpath = "//div[contains(text(),'Successful logout!')]")
    WebElement logougMessage;
    @FindBy(xpath = "//*[contains(text(),'Register')]")
    WebElement registerLink;
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(passwordField, password);
    }

    public void clickSignIn() {
        clickElement(signInBtn);
    }

    public void getSignInHeaderText() {
        Assert.assertEquals(getElementText(signInHeader), "Sign in", "Incorrect Sign in header text!");
    }

    public void verifyUrl() {
        verifyUrl(URL);
    }

    public void verifyErrorPass() {
        Assert.assertEquals(toastError.getText(), "Ivalid password", "Error message not expected!");
    }

    public void verifyErrorUser() {
        Assert.assertEquals(toastError.getText(), "User not found", "Error message not expected!");
    }

    public void verifyLogoutMessage(){
        Assert.assertTrue(logougMessage.isDisplayed(), "Successful Logout popup didn't appear!");
    }

    public void loginCredentials(String username, String password) {
        System.out.println("1. Navigate to home page");
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        System.out.println("2. Navigate to login");
        Header header = new Header(driver);
        header.goToLogin();

        System.out.println("3. Check the correct url is opened (login)");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUrl();

        System.out.println("5. Enter username");
        loginPage.enterUsername(username);

        System.out.println("6. Enter password");
        loginPage.enterPassword(password);

        System.out.println("7. Click Sign in button");
        loginPage.clickSignIn();
    }

    public void goRegisterLink(){
        clickElement(registerLink);
    }
}