package tests;

import org.testng.annotations.BeforeMethod;
import pages.Header;
import pages.HomePage;
import pages.LoginPage;
import pages.PostPage;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @BeforeMethod
    public void loginSetup(){
        LoginPage loginCredentials = new LoginPage(driver);
        loginCredentials.loginCredentials(username, password);

    }

    @Test
    public void logOutUser() {

        System.out.println("User successful logged in! Proceed with LogoutTest");

        System.out.println("1. Check the correct url is opened (PostPage)");
        PostPage postPage = new PostPage(driver);
        postPage.verifyUrl();

        System.out.println("2. Navigate to logoutLink and click");
        Header header = new Header(driver);
        header.goToLogOutLink();

        System.out.println("3. Verify the home page URL for unsigned users is displayed in address bar");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUrl();

        System.out.println("4. Verify the Successful logout! popup appears!");
        loginPage.verifyLogoutMessage();
    }

}
