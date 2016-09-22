package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by timrusso on 5/19/16.
 */
public class AboutTagPayTest extends TestBase {


    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
    }

    @BeforeMethod
    public void openAboutTagPayPage() throws Exception {
        app.getNavigationHelper().goToMyProfile();
        app.getNavigationHelper().openAboutTagPayForm();
    }

    @Test
    public void checkAboutTagPay() throws Exception {
        assertTrue(app.getAboutEngageHelper().isAboutFormOpen("All right reserved, TagPay 2016"));
        app.getAboutEngageHelper().openTermsOfUse();
        assertTrue(app.getAboutEngageHelper().isTermsOfUseOpen("Terms of Use"));
    }

}
