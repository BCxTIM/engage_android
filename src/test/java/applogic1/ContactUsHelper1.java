package applogic1;

import applogic.ContactUsHelper;
import model.ContactUsModel;

/**
 * Created by timrusso on 4/28/16.
 */
public class ContactUsHelper1 extends DriverBasedHelper implements ContactUsHelper {

    private ApplicationManager1 manager;

    public ContactUsHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void contactUs(ContactUsModel contactUsModel) {
        pages.contactUsPage.setName(contactUsModel.getName())
                .setCountry(contactUsModel.getCountry())
                .setPhone(contactUsModel.getPhone())
                .setEmail(contactUsModel.getEmail())
                .closeKeyboard()
                .clickSendContactUs();
    }

    public boolean isContactUsFormOpened() {
        pages.contactUsPage.ensurePageLoaded();
        return pages.contactUsPage.nameField.isDisplayed();
    }

    public boolean nameEmpty(String text) {
        return pages.contactUsPage.nameInvalidError.getText().contains(text);
    }

    public boolean phoneEmpty(String text) {
        return pages.contactUsPage.phoneInvalidError.getText().contains(text);
    }

    public boolean emailEmpty(String text) {
        return pages.contactUsPage.emailInvalidError.getText().contains(text);
    }

    public boolean thankYouAlert(String text) {
        return pages.contactUsPage.thankYouAlert.getText().contains(text);
    }

    public void closeOkAlertAndOpenForm() {
        pages.contactUsPage.closeAlert();
        pages.getCodePage.clickContactUsLink();
    }



}
