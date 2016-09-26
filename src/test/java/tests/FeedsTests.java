package tests;

import model.WhistleModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TestBase;


import static org.testng.AssertJUnit.assertTrue;
/**
 * Created by timrusso on 9/26/16.
 */
public class FeedsTests  extends TestBase{

    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
    }


    @Test
    public void createWhistle() throws Exception {
        String whistleTitle = "whistle";
        WhistleModel whistleModel = new WhistleModel().setText(whistleTitle);
        app.getFeedHelper().createWhistle(whistleModel);
        assertTrue(app.getFeedHelper().ifWhistleCreated(whistleTitle));
    }

    @Test(dependsOnMethods = "createWhistle")
    public void editWhistle() throws Exception {
        String whistleTitle = "edit whistle";
        WhistleModel whistleModel = new WhistleModel().setText(whistleTitle);
        app.getFeedHelper().editFeed(whistleModel);
        assertTrue(app.getFeedHelper().ifWhistleCreated(whistleTitle));
    }

    @Test(dependsOnMethods = "editWhistle")
    public void deleteWhistle() throws Exception {
        app.getFeedHelper().deleteFeed();
        assertTrue(app.getFeedHelper().ifNoFeeds("No content yet"));
    }
}
