package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Random;

public class RegisterPage extends BasePage {

    final private String URL = "http://training.skillo-bg.com:4200/users/register";

    // create a string of all characters for the generateCredentials function
    final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    @FindBy(name = "username")
    WebElement usernameField;

    @FindBy(css = "input[type=email]")
    WebElement emailField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(name = "verify-password")
    WebElement confirmPasswordField;

    @FindBy(id = "sign-in-button")
    WebElement signInBtn;

    @FindBy(xpath = "//div[contains(string(), 'Successful register')]")
    WebElement popupMessage;

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void verifyUrl(){
        verifyUrl(URL);
    }
    public void generateCredentials(){

        for(int i = 0; i < 7; i++) {
            // generate random index number
            int index = random.nextInt(alphabet.length());
            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);
            // append the character to string builder
            sb.append(randomChar);

        }
        String username = sb.toString();
        String password = sb.toString();
        String email = sb.toString() + "@abv.bg";

        enterText(usernameField, username);
        enterText(emailField, email);
        enterText(passwordField, password);
        enterText(confirmPasswordField, password);
    }

    public void clickSignIn(){
        clickElement(signInBtn);
    }
    public void validateMessage(){
        Assert.assertTrue(popupMessage.isDisplayed(), "Expected confirmation message didn't appear!");
    }
}
