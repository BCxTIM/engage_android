package applogic1;

import applogic.ApplicationManager;
import applogic.ContactTagPayHelper;
import model.ContactTagPayModel;

/**
 * Created by timrusso on 8/12/16.
 */
public class ContactTagPayHelper1 extends DriverBasedHelper implements ContactTagPayHelper {


    private ApplicationManager manager;

    public ContactTagPayHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void sendText(ContactTagPayModel contactTagPayModel) {
        pages.contactTagPayPage.ensurePageLoaded()
                .setText(contactTagPayModel.getText())
                .clickSendButton();
    }

    @Override
    public boolean checkThankPopUp(String text) {
        pages.contactTagPayPage.ensurePopUpLoaded();
        return pages.contactTagPayPage.thankPopUp.getText().contains(text);
    }
}
