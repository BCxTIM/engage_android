package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by timrusso on 5/19/16.
 */
public class AboutEngageTest extends TestBase {


    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
    }

    @Test
    public void checkAboutEngage() throws Exception {
        app.getMyProfileHelper().openAboutForm();
        assertTrue(app.getAboutEngageHelper().isAboutFormOpen("All right reserved, TagPay 2016"));
        app.getAboutEngageHelper().openTermsOfUse();
        assertTrue(app.getAboutEngageHelper().isTermsOfUseOpen("Terms of use"));
    }

}
