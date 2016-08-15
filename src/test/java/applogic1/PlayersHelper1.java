package applogic1;

import applogic.PlayersHelper;
import model.PlayerModel;

/**
 * Created by timrusso on 5/19/16.
 */
public class PlayersHelper1 extends DriverBasedHelper implements PlayersHelper {

    private ApplicationManager1 manager;

    public PlayersHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public boolean ifNoPlayers(String text) {
        return pages.playersPage.addManuallyButton.getText().contains(text);
    }

    public boolean ifPlayerAdded(String text) {
        pages.playersPage.ensurePageLoaded();
        return pages.playersPage.playerName.getText().contains(text);
    }

    public boolean nameError(String text) {
        return pages.playerPage.nameErrorText.getText().contains(text);
    }

    public boolean phoneError(String text) {
        return pages.playerPage.phoneErrorText.getText().contains(text);
    }

    public boolean emailError(String text) {
        return pages.playerPage.emailErrorText.getText().contains(text);
    }


    public void noDeletePlayer() {
        pages.playersPage.ensurePageLoaded();
        pages.playersPage
                .swipeMenu()
                .clickRemoveFromTeam()
                .clickNo();
    }

    public void deletePlayer() {
        pages.playersPage.ensurePageLoaded();
        pages.playersPage
                .swipeMenu()
                .clickEdit()
                .deleteClick()
                .clickYes();
    }


    public void editPlayer(PlayerModel playerModel) {
        pages.playersPage
                .swipeMenu()
                .clickEdit();
        pages.playerPage.ensurePageLoaded();
        pages.playerPage
                .setName(playerModel.getName())
                .setEmail(playerModel.getEmail())
                .sendInvitation();
    }


    public boolean ifPlayerEdited(String text) {
        pages.playersPage.ensurePageLoaded();
        return pages.playersPage.playerName.getText().contains(text);
    }

    public boolean ifPlayerDeleted(String text) {
        pages.playersPage.ensurePageLoaded();
        return pages.playersPage.addManuallyButton.getText().contains(text);
    }


    public void sendAnotherInvitation() {
        pages.playersPage.ensurePageLoaded();
        pages.playersPage.swipeMenu()
                .sendAnotherInvitation();
    }

    public boolean ifInvitationSent(String text) {
        return pages.playersPage.invitationSendText.getText().contains(text);
    }

    public void closeInvitationAlert() {
        pages.playersPage.closeInvitationALert();
    }

    public void getFromContacts() {
        pages.playersPage.getFromContacts();
    }

    public void goToAddPlayer() {
        pages.playersPage.addManuallyPlayer();
        pages.playerPage.ensurePageLoaded();
    }

    public void addManuallyPlayer(PlayerModel playerModel) {
        pages.playerPage
                .setName(playerModel.getName())
                .setCountryCode(playerModel.getCountryCode())
                .setPhone(playerModel.getPhone())
                .setEmail(playerModel.getEmail())
                .sendInvitation();
    }

    public void addPlayer() {
        pages.playersPage.addPlayer();
    }
}
