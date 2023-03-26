package tests;

import pages.*;
import org.testng.annotations.Test;

public class ModifyProfileTest extends BaseTest{

    @Test(dataProvider = "user") // Test data located in BaseTest.java
    public void modifyProfileInfo(String username, String password) {
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

        System.out.println("9. Click on Profile Page");
        header.goToProfile();

        System.out.println("10. Click on edit profile icon");
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickEditIcon();

        System.out.println("11. Validate the modify profile popup is open");
        profilePage.validateTextHeader();

        System.out.println("12. Clear any previus public profile info");
        profilePage.clearInfo();

        System.out.println("13. Add new public profile info");
        profilePage.addInfo();

        System.out.println("14. Slick Save button");
        profilePage.clickSave();

        System.out.println("15. Validate the new info is saved");
        profilePage.validateInfoUpdated();

    }

}
