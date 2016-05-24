package tests;

import model.LoginModel;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;


/**
 * Created by timrusso on 4/25/16.
 */
public class LoginFlowTests extends TestBase {


    @Test(enabled = false) //временно отключил т/к/ нет необходимости проверять тут
    public void loginOk() throws Exception {
        app.getLoginHelper().loginAs(ADVISER);
        assertTrue(app.getLoginHelper().isGetCodeTrue());
        app.getGetCodeHelper().setCode(CODE);
        assertTrue(app.getMyProfileHelper().seeProfile("My Profile"));
    }

    @Test
    public void checkWhyWeNeedNumber() throws Exception {
        app.getLoginHelper().checkWhyWeNeedNumber();
        assertTrue(app.getLoginHelper().alertWeNeedNumberTrue("Why do we need your number"));
        app.getLoginHelper().closeDialogAlert();
        assertTrue(app.getLoginHelper().alertClosed());
    }

    @Test
    public void loginFailedWithEmptyPhone() throws Exception {
        LoginModel loginModel = new LoginModel().setCountryCode("373").setPhone("");
        app.getLoginHelper().loginAs(loginModel);
        assertTrue(app.getLoginHelper().checkErrorText("You must enter a phone number"));
    }
    @Test
    public void loginFailedWithIncorrectPhone() throws Exception {
        LoginModel loginModel = new LoginModel().setCountryCode("373").setPhone("123123");
        app.getLoginHelper().loginAs(loginModel);
        assertTrue(app.getLoginHelper().checkErrorText("Please check your number"));
    }
}
