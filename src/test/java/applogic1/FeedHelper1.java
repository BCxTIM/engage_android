package applogic1;

import applogic.ApplicationManager;
import applogic.FeedHelper;

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
    public void createWhistle() {

    }

    @Override
    public void editArticle() {

    }

    @Override
    public void editImage() {

    }

    @Override
    public void editWhistle() {

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
    public void searchArticle() {

    }

    @Override
    public void searchImage() {

    }

    @Override
    public void searchWhistle() {

    }
}
