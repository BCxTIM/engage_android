package tests;

import model.ClientModel;
import model.GetCodeModel;
import model.LoginModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by timrusso on 5/19/16.
 */
public class ClientsTest extends TestBase {

    @BeforeClass
    public void loginAsAdviser() throws Exception {
        LoginModel loginModel = new LoginModel().setCountryCode("373").setPhone("60097171");
        GetCodeModel codeModel = new GetCodeModel().setCode("1111");
        app.getLoginHelper().loginAs(loginModel);
        assertTrue(app.getLoginHelper().isGetCodeTrue());
        app.getGetCodeHelper().setCode(codeModel);

        app.getNavigationHelper().goToClientsScreen();
    }


    @Test
    public void addContact() throws Exception {
        String name = "aaa aaa";
        ClientModel clientModel = new ClientModel().setName(name).setCountryCode("373").setPhone("69999991").setEmail("verront+88898@gmail.com");
        assertTrue(app.getClientsHelper().isNoClients(""));
        app.getClientsHelper().addManuallyContact(clientModel);
        assertTrue(app.getClientsHelper().isContactAdded(name));
    }

    @Test(dependsOnMethods = "addContact")
    public void sendAnotherInvitation() throws Exception {
        app.getClientsHelper().sendAnotherInvitation();
        assertTrue(app.getClientsHelper().isInvitationSended("A New Invitation Was Sent!"));
        app.getClientsHelper().closeInvitationAlert();
    }

    @Test(dependsOnMethods = "sendAnotherInvitation")
    public void deleteContact() throws Exception {
        app.getClientsHelper().deleteContact();
        assertTrue(app.getClientsHelper().isContactDeleted("No clients yet :("));
    }
}
