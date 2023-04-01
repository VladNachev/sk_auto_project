package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PostPage;

// Test Description: The goal is to like and dislake the latest post.

public class LikeDislikeTest extends BaseTest{

    @BeforeMethod
    public void loginSetup(){
        LoginPage loginCredentials = new LoginPage(driver);
        loginCredentials.loginCredentials(username, password);
    }

    @Test
    public void giveLikeUnlike() {
        System.out.println("User successful logged in");

        System.out.println("1. Click on the Like button for the latest post");
        PostPage postPage = new PostPage(driver);
        postPage.likePost();

        System.out.println("2. Click on the Unlike button for the same post");
        postPage.unlikePost();

        System.out.println("3. Validate the following message: You don' like this post anymore!");
        postPage.validateMessage();

    }
}