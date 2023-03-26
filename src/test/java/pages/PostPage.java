package pages;

import org.openqa.selenium.WebDriver;

public class PostPage extends BasePage {
    private final String BASE_URL = "http://training.skillo-bg.com:4200/posts/all";

//    @FindBy(xpath = "//i[@class='far fa-heart fa-2x']")
//    WebElement likeButton;

    public PostPage(WebDriver driver) {
        super(driver);
    }

    public void verifyUrl() {
        verifyUrlContains(BASE_URL);
    }

//    public void likePost(){
//        likeButton.click();
//    }

}