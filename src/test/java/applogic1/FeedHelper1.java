package applogic1;

import applogic.ApplicationManager;
import applogic.FeedHelper;
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
    public void createArticle() {

    }

    @Override
    public void createImage() {

    }

    @Override
    public void createWhistle(WhistleModel whistleModel) {
        pages.feedsPage.ensurePageLoaded().openCreateWhisltePage();
        pages.whistlePage
                .setText(whistleModel.getText())
                .saveWhistle();
        pages.feedsPage.publishFeedInPopup();
    }

    @Override
    public void editArticle() {

    }

    @Override
    public void editImage() {

    }

    @Override
    public void editWhistle(WhistleModel whistleModel) {

    }

    @Override
    public void createWhistlePublished() {

    }

    @Override
    public void editWhistlePublished() {

    }

    @Override
    public void publishFeed() {

    }

    @Override
    public void unPublishFeed() {

    }

    @Override
    public void deleteArticle() {

    }

    @Override
    public void deleteImage() {

    }

    @Override
    public void deleteWhistle() {

    }

    @Override
    public void openArticle() {

    }

    @Override
    public void openImage() {

    }

    @Override
    public void showFullWhistle() {

    }

    @Override
    public void searchFeed(SearchFeedModel searchFeedModel) {

    }


}
