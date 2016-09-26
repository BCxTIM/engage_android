package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 9/26/16.
 */
public class FeedsPage extends AnyPage {

    public FeedsPage(PageManager pages) {
        super(pages);
    }

    public FeedsPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(APPID + "tool_bar_title"), "Feed"));
        return this;
    }

    /**
     * Popups buttons
     */

    //Publish popup
    @AndroidFindBy(id = APPID + "btnSave")
    public AndroidElement publishButtonInPopUp;

    @AndroidFindBy(id = APPID + "btnDiscard")
    public AndroidElement justSaveButtonInPopup;



    public void publishFeedInPopup() {
        publishButtonInPopUp.click();
    }

    public void justSaveFeedInPopup() {
        justSaveButtonInPopup.click();
    }

    //Abort Popup
    @AndroidFindBy(id = APPID + "btnAbort")
    public AndroidElement abortButtonInPopUp;

    @AndroidFindBy(id = APPID + "btnCancel")
    public AndroidElement cancelButtonInPopUp;



    public void abortChangesInPopup() {
        abortButtonInPopUp.click();
    }

    public void cancelChangesInPopup() {
        cancelButtonInPopUp.click();
    }
    /**
     * End popups buttons
     */

    //Create

    @AndroidFindBy(id = APPID + "rlTabArticle")
    public AndroidElement createArticleButton;

    @AndroidFindBy(id = APPID + "rlTabImage")
    public AndroidElement createImageButton;

    @AndroidFindBy(id = APPID + "rlTabWhistle")
    public AndroidElement createWhistleButton;


    //Edit

    @AndroidFindBy(id = APPID + "")
    public AndroidElement editArticleButton;

    @AndroidFindBy(id = APPID + "")
    public AndroidElement editImageButton;

    @AndroidFindBy(id = APPID + "")
    public AndroidElement editWhistleButton;


    //Delete

    @AndroidFindBy(id = APPID + "")
    public AndroidElement deleteArticleButton;

    @AndroidFindBy(id = APPID + "")
    public AndroidElement deleteImageButton;

    @AndroidFindBy(id = APPID + "")
    public AndroidElement deleteWhistleButton;



    //Create
    public void openCreateArticlePage() {
        createArticleButton.click();
    }

    public void openCreateImagePage() {
        createImageButton.click();
    }

    public void openCreateWhisltePage() {
        createWhistleButton.click();
    }

    //Edit

    public void editArticle() {
        editArticleButton.click();
    }

    public void editImage() {
        editWhistleButton.click();
    }

    public void editWhislte() {
        editWhistleButton.click();
    }


    //Delete

    public void deleteArticle() {
        deleteArticleButton.click();
    }

    public void deleteImage() {
        deleteImageButton.click();
    }

    public void deleteWhislte() {
        deleteWhistleButton.click();
    }

}
