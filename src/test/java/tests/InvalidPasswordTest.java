package tests;

import pages.Header;
import pages.HomePage;
import pages.LoginPage;
import org.testng.annotations.Test;

// Test Description: The goal is to test the unssuccessful login functionality with incorrect password provided

public class InvalidPasswordTest extends BaseTest{

//    @DataProvider(name = "users")
//    public Object[][] getUsers() {
//        return new Object[][]{
//                {"vlad_auto", "incorrect_password"}, // provided password is incorrect
//        };
//    }
    @Test(dataProvider = "incorrect_password") // Test data located in BaseTest.java
    public void loginAttempt(String username, String password) {
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

        System.out.println("8. Validate the error message");
        loginPage.verifyErrorPass();
    }

}
