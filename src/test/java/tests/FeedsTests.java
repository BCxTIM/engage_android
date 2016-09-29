package tests;

import model.ImageModel;
import model.WhistleModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TestBase;


import static org.testng.AssertJUnit.assertTrue;
/**
 * Created by timrusso on 9/26/16.
 */
public class FeedsTests  extends TestBase{


    private String noFeedText = "No content yet";

    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
    }


    @Test
    public void createWhistle() throws Exception {
        String whistleTitle = "whistle";
        WhistleModel whistleModel = new WhistleModel().setText(whistleTitle);
        app.getFeedHelper().createWhistle(whistleModel);
        assertTrue(app.getFeedHelper().ifFeedCreated(whistleTitle));
        assertTrue(app.getFeedHelper().statusFeed("Unpublish"));
    }

    @Test(dependsOnMethods = "createWhistle")
    public void unpublishWhistle() throws Exception {
        app.getFeedHelper().publishUnpublishFeed();
        assertTrue(app.getFeedHelper().statusFeed("Publish"));
    }

    @Test(dependsOnMethods = "unpublishWhistle")
    public void editWhistle() throws Exception {
        String whistleTitle = "edit whistle";
        WhistleModel whistleModel = new WhistleModel().setText(whistleTitle);
        app.getFeedHelper().editWhistle(whistleModel);
        assertTrue(app.getFeedHelper().ifFeedCreated(whistleTitle));
    }

    @Test(dependsOnMethods = "editWhistle")
    public void deleteWhistle() throws Exception {
        app.getFeedHelper().deleteFeed();
        assertTrue(app.getFeedHelper().ifNoFeeds(noFeedText));
    }

    @Test(dependsOnMethods = "deleteWhistle")
    public void createImageFeed() throws Exception {
        String imageTitle = "image";
        ImageModel imageModel = new ImageModel().setTitle(imageTitle);
        app.getFeedHelper().createImage(imageModel);
        assertTrue(app.getFeedHelper().ifFeedCreated(imageTitle));
        assertTrue(app.getFeedHelper().statusFeed("Unpublish"));
    }

    @Test(dependsOnMethods = "createImageFeed")
    public void openImageFeed() throws Exception {
        app.getFeedHelper().openImageFeed();
        assertTrue(app.getFeedHelper().checkImageTitle("image"));
        app.getFeedHelper().goBack();
    }

    @Test(dependsOnMethods = "openImageFeed")
    public void deleteImageFeed() throws Exception {
        app.getFeedHelper().deleteFeed();
        assertTrue(app.getFeedHelper().ifNoFeeds(noFeedText));
    }
}
