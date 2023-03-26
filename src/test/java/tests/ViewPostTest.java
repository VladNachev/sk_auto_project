package tests;

import pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewPostTest extends BaseTest{

    @Test
    public void viewLatestPost() {
        System.out.println("1. Navigate to home page");
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        System.out.println("2. Locate and click on the latest post");
        WebElement latesPost = driver.findElement(By.cssSelector("div.post-feed-img"));
        Assert.assertTrue(latesPost.isDisplayed(), "No posts available or unable to be located");
        latesPost.click();

        System.out.println("3. Validate the pop-up window with the latest post is open");
        WebElement postOpen = driver.findElement(By.cssSelector("div.post-modal-img"));
        Assert.assertTrue(postOpen.isDisplayed(), "Post is not open");

    }
}