package tests;

import pages.Header;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import org.testng.annotations.Test;

// Test Description: The goal is to test the login functionality with correcr username and password provided
public class LoginTest extends BaseTest{

    @Test(dataProvider = "users") // Test data located in BaseTest.java
    public void loginTest(String usernameOrEmail, String password, String username) {
        System.out.println("1. Navigate to home page");
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        System.out.println("2. Navigate to login");
        Header header = new Header(driver);
        header.goToLogin();

        System.out.println("3. Check the correct url is opened (login)");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUrl();

        System.out.println("4. Check that Sign in header is displayed");
        loginPage.getSignInHeaderText();

        System.out.println("5. Enter username");
        loginPage.enterUsername(usernameOrEmail);

        System.out.println("6. Enter password");
        loginPage.enterPassword(password);

        System.out.println("7. Click Sign in button");
        loginPage.clickSignIn();

        System.out.println("8. Check the correct url is opened (homepage)");
        homePage.verifyUrl();

        System.out.println("9. Navigate to Profile page");
        header.goToProfile();

        System.out.println("10. Check the correct url is opened (profile)");
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyUrl();

        System.out.println("11. Check the correct username is displayed");
        profilePage.ValidateUsernameHeaderText();

    }

}