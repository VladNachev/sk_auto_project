package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Header;
import pages.LoginPage;
import pages.ProfilePage;

// Test Description: The goal is to test the viewing of ALL, PUBLIC, PRIVATE post of user Login page

public class UserPrivatePostsTest extends BaseTest{

    @BeforeMethod
    public void loginSetup(){
        LoginPage loginCredentials = new LoginPage(driver);
        loginCredentials.loginCredentials(username, password);
    }

    @Test
    public void viewUserPrivatePosts() {
        System.out.println("User successful logged in! Proceed with ViewUserPrivatePostsTest");

        System.out.println("1. Click on Profile Page");
        Header header = new Header(driver);
        header.goToProfile();

        System.out.println("2. Validate the proper username is displayed");
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.validateUsernameIsDisplaued();

       System.out.println("3. Click on private post button");
       profilePage.cliclPrivatePosts();

        System.out.println("4. Validate the private post is shown");
        profilePage.validatePrivatePosts();

    }
}