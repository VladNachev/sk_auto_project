package tests;

import org.testng.annotations.BeforeMethod;
import pages.*;
import org.testng.annotations.Test;

public class ModifyProfileTest extends BaseTest{
    @BeforeMethod
    public void loginSetup(){
        LoginPage loginCredentials = new LoginPage(driver);
        loginCredentials.loginCredentials(username, password);

    }

    @Test
    public void modifyProfileInfo() {
        System.out.println("User successful logged in! Proceed with ModifyProfileTest");

        System.out.println("1. Click on Profile Page");
        Header header = new Header(driver);
        header.goToProfile();

        System.out.println("2. Click on edit profile icon");
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickEditIcon();

        System.out.println("3. Validate the modify profile popup is open");
        profilePage.validateTextHeader();

        System.out.println("4. Clear any previus public profile info");
        profilePage.clearInfo();

        System.out.println("5. Add new public profile info");
        profilePage.addInfo();

        System.out.println("6. Slick Save button");
        profilePage.clickSave();

        System.out.println("7. Validate the new info is saved");
        profilePage.validateInfoUpdated();

    }

}
