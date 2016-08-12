package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 4/28/16.
 */
public class ContactUsPage extends InternalPage{


    public ContactUsPage(PageManager pages) {
        super(pages);
    }


    @AndroidFindBy(id = APPID + "edtName")
    public AndroidElement nameField;

    @AndroidFindBy(id = APPID + "edtPhone")
    public AndroidElement phoneField;

    @AndroidFindBy(id = APPID + "edtMail")
    public AndroidElement emailField;

    @AndroidFindBy(id = APPID + "explanationTV")
    public AndroidElement explanationTVText;

    @AndroidFindBy(id = APPID + "btnSendInvitation")
    public AndroidElement sendButton;

    @AndroidFindBy(id = APPID + "tvInvalidName")
    public AndroidElement nameInvalidError;

    @AndroidFindBy(id = APPID + "tvInvalidPhone")
    public AndroidElement phoneInvalidError;

    @AndroidFindBy(id = APPID + "tvInvalidMail")
    public AndroidElement emailInvalidError;

    @AndroidFindBy(id = APPID + "tvDialogTitle")
    public AndroidElement thankYouAlert;

    @AndroidFindBy(id = APPID + "dialogClose")
    public AndroidElement closeAlert;

    @AndroidFindBy(id = APPID + "flagPicker")
    public AndroidElement flagDropdownList;

    @AndroidFindBy(id = APPID + "edtSearch")
    public AndroidElement searchField;

    @AndroidFindBy(id = APPID + "country_info")
    public AndroidElement selectedCountry;

    public ContactUsPage setCountry(String text) {
        flagDropdownList.click();
        searchField.sendKeys(text);
        selectedCountry.click();
        return this;
    }


    public ContactUsPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "edtName")));
        return this;
    }

    public ContactUsPage ensureAlertLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "tvDialogTitle")));
        return this;
    }

    public ContactUsPage setName(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public ContactUsPage setPhone(String phone) {
        phoneField.sendKeys(phone);
        return this;
    }

    public ContactUsPage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public ContactUsPage closeKeyboard() {
        explanationTVText.click();
        return this;
    }

    public ContactUsPage closeAlert() {
        closeAlert.click();
        return this;
    }

    public void clickSendContactUs() {
        sendButton.click();
    }

}
