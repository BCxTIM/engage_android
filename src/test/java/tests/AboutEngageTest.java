package tests;

import model.GetCodeModel;
import model.LoginModel;
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
        LoginModel loginModel = new LoginModel().setCountryCode("373").setPhone("60097171");
        GetCodeModel codeModel = new GetCodeModel().setCode("1111");
        app.getLoginHelper().loginAs(loginModel);
        assertTrue(app.getLoginHelper().isGetCodeTrue());
        app.getGetCodeHelper().setCode(codeModel);
    }

    @Test
    public void checkAboutEngage() throws Exception {
        app.getMyProfileHelper().openAboutEngage();
        assertTrue(app.getAboutEngageHelper().isAboutEngageOpen("All right reserved, Engage 2016"));
        app.getAboutEngageHelper().openTermsOfUse();
        assertTrue(app.getAboutEngageHelper().isTermsOfUseOpen("Terms of use"));
    }

}
