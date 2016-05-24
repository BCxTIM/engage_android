package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 5/19/16.
 */
public class ClientPage extends InternalPage {

    public ClientPage(PageManager pages) {
        super(pages);
    }

    public ClientPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/btnSendInvitation")));
        return this;
    }

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtName")
    public AndroidElement nameField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/flag")
    public AndroidElement dropDownButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/search")
    public AndroidElement countryCodeField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/country_info")
    public AndroidElement countrySelected;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtPhone")
    public AndroidElement phoneField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtEmail")
    public AndroidElement emailField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnSendInvitation")
    public AndroidElement sendInvitationButton;

    public ClientPage setName(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public ClientPage setCountryCode(String countryCode) {
        dropDownButton.click();
        countryCodeField.sendKeys(countryCode);
        countrySelected.click();
        return this;
    }

    public ClientPage setPhone(String phone) {
        phoneField.sendKeys(phone);
        return this;
    }

    public ClientPage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public void sendInvitation() {
        sendInvitationButton.click();
    }
}
