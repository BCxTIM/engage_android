package applogic;

import model.PlayerModel;

/**
 * Created by timrusso on 5/19/16.
 */
public interface PlayersHelper {
    void goToAddPlayer();
    boolean ifNoPlayers(String text);
    boolean ifPlayerAdded(String text);
    boolean nameError(String text);
    boolean phoneError(String text);
    boolean emailError(String text);
    void noDeletePlayer();
    void deletePlayer();
    void editPlayer(PlayerModel playerModel);
    boolean ifPlayerEdited(String text);
    boolean ifPlayerDeleted(String text);
    void sendAnotherInvitation();
    boolean ifInvitationSent(String text);
    void closeInvitationAlert();

    void getFromContacts();
    void addManuallyPlayer(PlayerModel playerModel);
    void addPlayer();
}
