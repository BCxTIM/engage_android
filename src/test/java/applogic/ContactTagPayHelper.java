package applogic;

import model.ContactTagPayModel;

/**
 * Created by timrusso on 8/12/16.
 */
public interface ContactTagPayHelper {

    void sendText(ContactTagPayModel contactTagPayModel);
    boolean checkThankPopUp(String text);

}
