package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 10/3/16.
 */
public class ArticlePage extends FeedsPage {

    public ArticlePage(PageManager pages) {
        super(pages);
    }

    public ArticlePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(APPID + "tvActionName"), "New article"));
        return this;
    }

    @AndroidFindBy(id = APPID + "tvTitle")
    public AndroidElement articleTitle;

    @AndroidFindBy(id = APPID + "tvDescription")
    public AndroidElement articleDescription;


    @AndroidFindBy(id = APPID + "ivFeedImage")
    public AndroidElement cameraIcon;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public AndroidElement attachFromGalleryButton;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
    public AndroidElement imageSelectedButton;


    public ArticlePage selectImageFromGallery() {
        cameraIcon.click();
        attachFromGalleryButton.click();
        imageSelectedButton.click();
        return this;
    }

    @AndroidFindBy(id = APPID + "edtTitle")
    public AndroidElement titleField;

    public ArticlePage setTitle(String title) {
        titleField.clear();
        titleField.sendKeys(title);
        return this;
    }

    @AndroidFindBy(id = APPID + "edtDescription")
    public AndroidElement descriptionField;

    public ArticlePage setDescription(String description) {
        descriptionField.clear();
        descriptionField.sendKeys(description);
        return this;
    }

    @AndroidFindBy(id = APPID + "backArrow")
    public AndroidElement backButton;

    public void goBack() {
        backButton.click();
    }

    public void saveArticle() {
        this.saveButton.click();
        this.discardButtonInPopup.click();
    }

}
