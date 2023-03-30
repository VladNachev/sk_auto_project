package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class PostPage extends BasePage {
    private final String BASE_URL = "http://training.skillo-bg.com:4200/posts/all";
    public PostPage(WebDriver driver) {
        super(driver);
    }
    public void verifyUrl() {
        verifyUrlContains(BASE_URL);
    }
}