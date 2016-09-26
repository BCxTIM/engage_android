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
        WhistleModel whistleModel = new WhistleModel().setText("whistle");
        app.getFeedHelper().createWhistle(whistleModel);
    }

    @Test(dependsOnMethods = "createWhistle")
    public void deleteWhistle() throws Exception {
        app.getFeedHelper().deleteFeed();
    }
}
