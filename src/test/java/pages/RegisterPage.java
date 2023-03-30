package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    final private String URL = "http://training.skillo-bg.com:4200/users/register";

//    @FindBy(css = "input[name=username]")
//    WebElement usernameField;

//    @FindBy(xpath = "//input[@name='username']")
//    @FindBy(name = "username")
//    WebElement usernameField;
//
//    @FindBy(css = "input[formcontrolname=email]")
//    WebElement emailField;
//
//    @FindBy(css = "input[formcontrolname=password]")
//    WebElement passwordField;
//
//    @FindBy(css = "input[formcontrolname=confirmPassword]")
//    WebElement confirmPasswordField;
//
//    @FindBy(css = "button[type='submit']")
//    WebElement submitButton;

    public void verifyUrl(){
        verifyUrl(URL);
    }

//    public void typeCredentials(String username, String email, String password, String confirmPassword) {
//        RegisterPage registerPage = new RegisterPage(driver);
//
//        System.out.println("1. Enter username");
//        if (usernameField.isDisplayed()) {
//            enterText(usernameField, username);
//        }
//        else {
//            System.out.println("element not displayed");
//        }


//        System.out.println("2. Enter email");
//        enterText(emailField, email);
//
//        System.out.println("3. Enter passowrd");
//        enterText(passwordField, password);
//
//        System.out.println("4. Confirm password");
//        enterText(confirmPasswordField, confirmPassword);
//    }
//
//    public void clickSignInButton(){
//        clickElement(submitButton);
//    }

}
