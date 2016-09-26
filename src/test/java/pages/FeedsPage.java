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

    @AndroidFindBy(id = APPID + "btnSave")
    public AndroidElement saveButtonInPopup;

    @AndroidFindBy(id = APPID + "btnDiscard")
    public AndroidElement cancelButtonInPopup;

    @AndroidFindBy(id = APPID + "btnAbort")
    public AndroidElement abortButtonInPopUp;

    @AndroidFindBy(id = APPID + "btnCancel")
    public AndroidElement cancelButtonInPopUp;

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

    @AndroidFindBy(id = APPID + "tvEdit")
    public AndroidElement editFeedButton;


    //Delete

    @AndroidFindBy(id = APPID + "tvDelete")
    public AndroidElement deleteFeedButton;

    ///////////////////////////////////////////

    @AndroidFindBy(id = APPID + "tvNoContentYet")
    public AndroidElement noFeedsText;

    @AndroidFindBy(id = APPID + "tvTitle")
    public AndroidElement feedTitle;



    //Create
    public void openCreateArticlePage() {
        createArticleButton.click();
    }

    public void openCreateImagePage() {
        createImageButton.click();
    }

    public void openCreateWhistlePage() {
        createWhistleButton.click();
    }

    //Edit

    public void openEditFeed() {
        editFeedButton.click();
    }


    //Delete

    public void deleteFeed() {
        deleteFeedButton.click();
        saveButtonInPopup.click();
    }

}
