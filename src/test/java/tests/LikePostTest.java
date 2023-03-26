package tests;

import pages.Header;
import pages.HomePage;
import pages.LoginPage;
import pages.PostPage;
import org.testng.annotations.Test;

public class LikePostTest extends BaseTest{

    @Test(dataProvider = "user") // Test data provided in BaseTest.java
    public void comment(String username, String password) {
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

//        System.out.println("9. Open latest post");
//        postPage.openLatestPost();


//        System.out.println("10. Like the latest post");
//        postPage.likePost();
//
//        System.out.println("11. Validate the post is licked");
//        WebElement likeButtonClicked = driver.findElement(By.xpath("//i[@class='like far fa-heart fa-2x liked']"));
//        Assert.assertTrue(likeButtonClicked.isDisplayed(), "Post not liked");
//
//        System.out.println("11. Remove the lik");
//        // Removing the like is required if we run the test more than once.
//        likeButtonClicked.click();
  }

}
