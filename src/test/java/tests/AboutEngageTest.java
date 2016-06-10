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
    public void loginAsAdviser() throws Exception {
        app.getLoginHelper().loginAs(ADVISER);
        assertTrue(app.getLoginHelper().isGetCodeTrue());
        app.getGetCodeHelper().setCode(CODE);
    }

    @Test
    public void checkAboutEngage() throws Exception {
        app.getMyProfileHelper().openAboutEngage();
        assertTrue(app.getAboutEngageHelper().isAboutEngageOpen("All right reserved, Engage 2016"));
        app.getAboutEngageHelper().openTermsOfUse();
        assertTrue(app.getAboutEngageHelper().isTermsOfUseOpen("Terms of useвыфввв"));
    }

}
