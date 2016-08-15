package applogic;

import model.PlayerModel;

/**
 * Created by timrusso on 5/19/16.
 */
public interface PlayersHelper {
    boolean ifNoPlayers(String text);
    boolean ifPlayerAdded(String text);
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
