package applogic;

import model.ContactUsModel;

/**
 * Created by timrusso on 4/28/16.
 */
public interface ContactUsHelper {

    void contactUs(ContactUsModel contactUsModel);
    boolean isContactUsFormOpened();
    boolean nameEmpty(String text);
    boolean phoneEmpty(String text);
    boolean emailEmpty(String text);
    boolean thankYouAlert(String text);
    void closeOkAlertAndOpenForm();


}
