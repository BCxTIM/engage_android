package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 9/29/16.
 */
public class ImageFeedPage extends FeedsPage {

    public ImageFeedPage(PageManager pages) {
        super(pages);
    }

    public ImageFeedPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(APPID + "tvActionName"), "New image"));
        return this;
    }

    @AndroidFindBy(id = APPID + "ivFeedImage")
    public AndroidElement cameraIcon;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public AndroidElement attachFromGalleryButton;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.FrameLayout[2]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
    public AndroidElement imageSelectedButton;


    public ImageFeedPage selectImageFromGallery() {
        cameraIcon.click();
        attachFromGalleryButton.click();
        imageSelectedButton.click();
        return this;
    }

    @AndroidFindBy(id = APPID + "backArrow")
    public AndroidElement backButton;

    public void goBack() {
        backButton.click();
    }


    @AndroidFindBy(id = APPID + "tvTitle")
    public AndroidElement titleText;


    @AndroidFindBy(id = APPID + "edtTitle")
    public AndroidElement imageTitle;

    public ImageFeedPage setText(String text) {
        imageTitle.clear();
        imageTitle.sendKeys(text);
        return this;
    }

    public void saveImage() {
        this.saveButton.click();
        this.saveButtonInPopup.click();
    }

}
