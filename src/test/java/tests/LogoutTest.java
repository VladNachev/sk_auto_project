package tests;

import pages.Header;
import pages.HomePage;
import pages.LoginPage;
import pages.PostPage;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @Test(dataProvider = "user") // Test data located in BaseTest.java
    public void logOutUser(String username, String password) {
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

        System.out.println("8. Check the correct url is opened (PostPage)");
        PostPage postPage = new PostPage(driver);
        postPage.verifyUrl();

        System.out.println("User successfully logged. Proceeding with Logout functionality");

        System.out.println("9. Navigate to logoutLink and click");
        header.goToLogOutLink();

        System.out.println("10. Verify the home page URL for unsigned users is displayed in address bar");
        loginPage.verifyUrl();

        System.out.println("11. Verify the Successful logout! popup appears!");
        loginPage.verifyLogoutMessage();
    }

}
