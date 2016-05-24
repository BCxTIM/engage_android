package tests;

import model.ContactUsModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by timrusso on 4/29/16.
 */
public class ContactUsTests extends TestBase {

    @BeforeClass
    public void loginAsAdviser() throws Exception {
        app.getLoginHelper().loginAs(ADVISER);
        app.getGetCodeHelper().openContactUsForm();
        assertTrue(app.getContactUsHelper().isContactUsFormOpened());
    }

    @Test
    public void sendContact() throws Exception {
        ContactUsModel contactUsModel = new ContactUsModel().setName("tim russo").setCountry("373").setPhone("60097171").setEmail("verront@gmail.com");
        app.getContactUsHelper().contactUs(contactUsModel);
        assertTrue(app.getContactUsHelper().thankYouAlert("Thank you"));
        app.getContactUsHelper().closeOkAlertAndOpenForm();
    }

    @Test
    public void sendContactWithEmptyFields() throws Exception {
        ContactUsModel contactUsModel = new ContactUsModel().setName("").setPhone("").setEmail("");
        app.getContactUsHelper().contactUs(contactUsModel);
        assertTrue(app.getContactUsHelper().nameEmpty("First name and last name should be 3 or more characters"));
        assertTrue(app.getContactUsHelper().phoneEmpty("Invalid phone number"));
        assertTrue(app.getContactUsHelper().emailEmpty("Invalid email address"));
    }



}
