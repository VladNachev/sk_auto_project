package tests;

import pages.*;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUser() {
        System.out.println("1. Navigate to home page");
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        System.out.println("2. Navigate to login");
        Header header = new Header(driver);
        header.goToLogin();

        System.out.println("3. Check the correct url is opened (login)");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUrl();

        System.out.println("5. CLick on Register link");
        loginPage.goRegisterLink();

        System.out.println("6. Check the correct URL of the Register page is open");
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.verifyUrl();

        System.out.println("7. Fill in register credentials");
        // generateCredentials function generates random crecentials each time when the function is called
        // That way this test can be re-used, and each time unique credentials will be used
        registerPage.generateCredentials();

        System.out.println("8. Click on Sign in Button");
        registerPage.clickSignIn();

        System.out.println("9. Validate the Successful register message");
        registerPage.validateMessage();

    }

}