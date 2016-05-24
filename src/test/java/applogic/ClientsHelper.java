package applogic;

import model.ClientModel;

/**
 * Created by timrusso on 5/19/16.
 */
public interface ClientsHelper {
    boolean isNoClients(String text);
    boolean isContactAdded(String text);
    void deleteContact();
    boolean isContactDeleted(String text);
    void sendAnotherInvitation();
    boolean isInvitationSended(String text);
    void closeInvitationAlert();

    void getFromContacts();
    void addManuallyContact(ClientModel clientModel);
    void addContact();
}
