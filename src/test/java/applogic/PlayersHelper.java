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
    boolean ifPlayerDeleted(String text);
    void sendAnotherInvitation();
    boolean ifInvitationSent(String text);
    void closeInvitationAlert();

    void getFromContacts();
    void addManuallyPlayer(PlayerModel clientModel);
    void addPlayer();
}
