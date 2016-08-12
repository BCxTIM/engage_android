package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 8/12/16.
 */
public class ContactTagPayPage extends InternalPage {

    public ContactTagPayPage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(id = APPID + "edtText")
    public AndroidElement textField;

    @AndroidFindBy(id = APPID + "btnSendInvitation")
    public AndroidElement sendButton;

    @AndroidFindBy(id = APPID + "tvDialogTitle")
    public AndroidElement thankPopUp;

    @AndroidFindBy(id = "tvInvalidText")
    public AndroidElement errorText;

    @AndroidFindBy(id = APPID + "backArrow")
    public AndroidElement backButton;

    @AndroidFindBy(id = APPID + "dialogClose")
    public AndroidElement closePopUp;


    public ContactTagPayPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "edtText")));
        return this;
    }

    public ContactTagPayPage ensurePopUpLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "tvDialogTitle")));
        return this;
    }

    public ContactTagPayPage setText(String text) {
        textField.sendKeys(text);
        driver.hideKeyboard();
        return this;
    }

    public void goBack() {
        backButton.click();
    }

    public void closePopUp() {
        closePopUp.click();
    }

    public void clickSendButton() {
        sendButton.click();
    }



}
