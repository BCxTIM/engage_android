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


    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtName")
    public AndroidElement nameField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtPhone")
    public AndroidElement phoneField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtMail")
    public AndroidElement emailField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/explanationTV")
    public AndroidElement explanationTVText;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnSendInvitation")
    public AndroidElement sendButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvInvalidName")
    public AndroidElement nameInvalidError;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvInvalidPhone")
    public AndroidElement phoneInvalidError;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvInvalidMail")
    public AndroidElement emailInvalidError;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvDialogTitle")
    public AndroidElement thankYouAlert;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/dialogClose")
    public AndroidElement closeAlert;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/flagPicker")
    public AndroidElement flagDropdownList;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtSearch")
    public AndroidElement searchField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/country_info")
    public AndroidElement selectedCountry;

    public ContactUsPage setCountry(String text) {
        flagDropdownList.click();
        searchField.sendKeys(text);
        selectedCountry.click();
        return this;
    }


    public ContactUsPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/edtName")));
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
