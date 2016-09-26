package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 9/26/16.
 */
public class WhistlePage extends FeedsPage {

    public WhistlePage(PageManager pages) {
        super(pages);
    }

    public WhistlePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(APPID + "tvActionName"), "New whistle "));
        return this;
    }

    @AndroidFindBy(id = APPID + "edtDescription")
    public AndroidElement textField;

    @AndroidFindBy(id = APPID + "btnSaveChanges")
    public AndroidElement saveButton;

    public WhistlePage setText(String text) {
        textField.sendKeys(text);
        return this;
    }

    public void saveWhistle() {
        saveButton.click();
    }

}
