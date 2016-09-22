package tests;

import model.ContactTagPayModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

import pages.TestBase;

/**
 * Created by timrusso on 8/12/16.
 */
public class ContactTagPayTests extends TestBase {

    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
    }

   @BeforeMethod
    public void goToContactTagPayForm() throws Exception {
       app.getNavigationHelper().goToMyProfile();
       app.getNavigationHelper().openContactTagPayForm();
   }

    @Test
    public void sendContact() throws Exception {
        ContactTagPayModel contactTagPayModel = new ContactTagPayModel().setText("test");
        app.getContactTagPayHelper().sendText(contactTagPayModel);
        assertTrue(app.getContactTagPayHelper().checkThankPopUp("Thank you"));
        app.getContactTagPayHelper().closePopUp();
    }

    @Test
    public void invalidSendText() throws Exception {
        ContactTagPayModel contactTagPayModel = new ContactTagPayModel().setText("");
        app.getContactTagPayHelper().sendText(contactTagPayModel);
        assertTrue(app.getContactTagPayHelper().invalidText("Please enter some text to be sent"));
        app.getContactTagPayHelper().goBack();
    }

}
