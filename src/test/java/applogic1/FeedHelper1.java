package applogic1;

import applogic.ApplicationManager;
import applogic.FeedHelper;
import model.ImageModel;
import model.SearchFeedModel;
import model.WhistleModel;

/**
 * Created by timrusso on 9/26/16.
 */
public class FeedHelper1 extends DriverBasedHelper implements FeedHelper {


    private ApplicationManager manager;

    public FeedHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }


    @Override
    public void goBack() {
        pages.imageFeedPage.goBack();
    }

    @Override
    public boolean ifNoFeeds(String text) {
        return pages.feedsPage.noFeedsText.getText().contains(text);
    }

    @Override
    public void createArticle() {

    }

    @Override
    public void createImage(ImageModel imageModel) {
        pages.feedsPage.ensurePageLoaded().openCreateImagePage();
        pages.imageFeedPage
                .selectImageFromGallery()
                .setText(imageModel.getTitle())
                .saveImage();
    }

    @Override
    public void createWhistle(WhistleModel whistleModel) {
        pages.feedsPage.ensurePageLoaded().openCreateWhistlePage();
        pages.whistlePage
                .setText(whistleModel.getText())
                .saveWhistle();
    }

    @Override
    public boolean ifFeedCreated(String text) {
        pages.feedsPage.ensurePageLoaded();
        return pages.feedsPage.feedTitle.getText().contains(text);
    }

    @Override
    public void editWhistle(WhistleModel whistleModel) {
        pages.feedsPage.ensurePageLoaded().openEditFeed();
        pages.whistlePage
                .setText(whistleModel.getText())
                .saveWhistle();
    }


    @Override
    public void publishUnpublishFeed() {
        pages.feedsPage.ensurePageLoaded().changeStatusFeed();
    }

    @Override
    public boolean statusFeed(String text) {
        return pages.feedsPage.publishButton.getText().contains(text);
    }



    @Override
    public void deleteFeed() {
        pages.feedsPage.ensurePageLoaded().deleteFeed();
    }


    @Override
    public void openArticle() {

    }

    @Override
    public void openImageFeed() {
        pages.feedsPage.openImageFeed();
    }

    @Override
    public boolean checkImageTitle(String text) {
        return pages.imageFeedPage.titleText.getText().contains(text);
    }


    @Override
    public void showFullWhistle() {

    }

    @Override
    public void searchFeed(SearchFeedModel searchFeedModel) {

    }


}
