package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class PostPage extends BasePage {
    private final String BASE_URL = "http://training.skillo-bg.com:4200/posts/all";

    @FindBy(css = "i.far.fa-heart.fa-2x")
    WebElement likeButton;

    @FindBy(css = "i.far.fa-heart.fa-2x.liked.xh-highlight")
    WebElement unlikeButton;


    public PostPage(WebDriver driver) {
        super(driver);
    }
    public void verifyUrl() {
        verifyUrlContains(BASE_URL);
    }

    public void likePost() {
        clickElement(likeButton);
    }

    public void unlikePost() {
        clickElement(unlikeButton);
    }
}