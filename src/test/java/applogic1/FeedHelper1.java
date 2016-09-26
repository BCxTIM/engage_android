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
        pages.feedsPage.ensurePageLoaded().openCreateWhistlePage();
        pages.whistlePage
                .setText(whistleModel.getText())
                .saveWhistle();
    }

    @Override
    public void editFeed(WhistleModel whistleModel) {

    }


    @Override
    public void publishFeed() {

    }

    @Override
    public void unPublishFeed() {

    }


    @Override
    public void deleteFeed() {
        pages.feedsPage.ensurePageLoaded().deleteFeed();
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
