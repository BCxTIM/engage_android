package applogic1;

import applogic.ClientsHelper;
import model.ClientModel;

/**
 * Created by timrusso on 5/19/16.
 */
public class ClientsHelper1 extends DriverBasedHelper implements ClientsHelper {

    private ApplicationManager1 manager;

    public ClientsHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public boolean isNoClients(String text) {
        return pages.clientsPage.noClientsText.getText().contains(text);
    }

    public boolean isContactAdded(String text) {
        pages.clientsPage.ensurePageLoaded();
        return pages.clientsPage.clientName.getText().contains(text);
    }

    public void deleteContact() {
        pages.clientsPage.ensurePageLoaded();
        pages.clientsPage
                .swipeMenu()
                .clickEdit()
                .deleteClick()
                .clickYes();
    }

    public boolean isContactDeleted(String text) {
        return pages.clientsPage.noClientsText.getText().contains(text);
    }


    public void sendAnotherInvitation() {
        pages.clientsPage.ensurePageLoaded();
        pages.clientsPage.swipeMenu()
                .waitForSendInvitationLinkIsVisible()
                .sendAnotherInvitation();
    }

    public boolean isInvitationSended(String text) {
        return pages.clientsPage.invitationSendText.getText().contains(text);
    }

    public void closeInvitationAlert() {
        pages.clientsPage.closeInvitationALert();
    }

    public void getFromContacts() {
        pages.clientsPage.getFromContacts();
    }

    public void addManuallyContact(ClientModel clientModel) {
        pages.clientsPage.addManuallyContact();
        pages.clientPage.ensurePageLoaded();
        pages.clientPage
                .setName(clientModel.getName())
                .setCountryCode(clientModel.getCountryCode())
                .setPhone(clientModel.getPhone())
                .setEmail(clientModel.getEmail())
                .sendInvitation();
    }

    public void addContact() {
        pages.clientsPage.addContact();
    }
}
