package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage extends BasePage {
    private final String BASE_URL = "http://training.skillo-bg.com:4200/users/";

    @FindBy(css = ".profile-user-settings > h2")
    WebElement usernameHeader;

    @FindBy(css = "i.fa-user-edit")
    WebElement editIcon;

    @FindBy(css = "app-edit-profile-modal h4")
    WebElement modifyTextHeader;

    @FindBy(css = "textarea[formcontrolname='publicInfo']")
    WebElement publicInfo;

    @FindBy(xpath = "//div[contains(string(), 'Profile updated')]")
    WebElement popupMessage;

    @FindBy(css = "button.btn-primary")
    WebElement saveButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void ValidateUsernameHeaderText() {
        Assert.assertEquals(getElementText(usernameHeader), "vlad_auto", "Incorrect username!");
    }

    public void verifyUrl() {
        verifyUrlContains(BASE_URL);
    }

    public void clickEditIcon(){
        clickElement(editIcon);
    }

    public void validateTextHeader(){
        Assert.assertEquals(getElementText(modifyTextHeader), "Modify Your Profile", "Incorrect text!");

    }

    public void clearInfo() {
        publicInfo.clear();
    }
    public void addInfo(){
        publicInfo.sendKeys("Test public info added");
    }

    public void clickSave(){
        saveButton.click();
    }

    public void validateInfoUpdated() {
        Assert.assertTrue(popupMessage.isDisplayed(), "Changes not saved");
    }
}