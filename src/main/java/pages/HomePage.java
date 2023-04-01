package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final String URL = "http://training.skillo-bg.com:4200/posts/all";
    private final String URL_Logout = "http://training.skillo-bg.com:4200/users/login";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get(URL);
    }

    public void verifyUrl() {
        verifyUrl(URL);
    }
    public void verifyUrlLogout() {
        verifyUrl(URL_Logout);
    }
}