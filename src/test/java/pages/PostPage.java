package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class PostPage extends BasePage {
    private final String BASE_URL = "http://training.skillo-bg.com:4200/posts/all";

    @FindBy(css = "div.post-feed-img")
    WebElement latestPost;

    @FindBy(xpath = "//button[contains(.,'Follow')]")
    WebElement followButton;

//    @FindBy(xpath = "//i[@class='far fa-heart fa-2x']")
//    WebElement likeButton;


    public PostPage(WebDriver driver) {
        super(driver);
    }

    public void verifyUrl() {
        verifyUrlContains(BASE_URL);
    }

    public void clickLatestPost(){
        latestPost.click();
    }

    public void clickFollowButton(){
        followButton.click();
    }

//    public void likePost(){
//        likeButton.click();
//    }

}