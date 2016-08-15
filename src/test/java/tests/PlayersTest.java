package tests;

import model.PlayerModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by timrusso on 5/19/16.
 */
public class PlayersTest extends TestBase {

    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
        app.getNavigationHelper().goToPlayersScreen();
    }

    private String newName = "aaa aaa";
    private String editName = "bbb bbb";
    private String newEmail = "verront+88898@gmail.com";
    private String editEmail = "verront+88899@gmail.com";


    @Test
    public void addPlayerWithIncorrectFields() throws Exception {
        PlayerModel playerModel = new PlayerModel().setName("").setCountryCode("373").setPhone("").setEmail("aa");
        assertTrue(app.getPlayersHelper().ifNoPlayers("Add Manually"));
        app.getPlayersHelper().goToAddPlayer();
        app.getPlayersHelper().addManuallyPlayer(playerModel);
        assertTrue(app.getPlayersHelper().nameError("Name should be 1 or more characters"));
        assertTrue(app.getPlayersHelper().phoneError("Please enter a phone number"));
        assertTrue(app.getPlayersHelper().emailError("Invalid email address"));
    }

    @Test(dependsOnMethods = "addPlayerWithIncorrectFields")
    public void addPlayer() throws Exception {
        PlayerModel playerModel = new PlayerModel().setName(newName).setCountryCode("373").setPhone("69999991").setEmail(newEmail);
        app.getPlayersHelper().addManuallyPlayer(playerModel);
        assertTrue(app.getPlayersHelper().ifPlayerAdded(newName));
    }

    @Test(dependsOnMethods = "addPlayer")
    public void checkToUserNotAppearInOtherTeam() throws Exception {
        app.getNavigationHelper().goToTeamPage();
        app.getTeamHelper().selectTeam2();
        app.getNavigationHelper().goToPlayersScreen();
        assertTrue(app.getPlayersHelper().ifNoPlayers("Add Manually"));
        app.getNavigationHelper().goToTeamPage();
        app.getTeamHelper().selectTeam1();
        app.getNavigationHelper().goToPlayersScreen();
    }

    @Test(dependsOnMethods = "checkToUserNotAppearInOtherTeam")
    public void tryDeletePlayerFromMenu() throws Exception {
        app.getPlayersHelper().noDeletePlayer();
        assertTrue(app.getPlayersHelper().ifPlayerAdded(newName));
    }

    @Test(dependsOnMethods = "tryDeletePlayerFromMenu")
    public void editPlayer() throws Exception {
        PlayerModel playerModel = new PlayerModel().setName(editName).setEmail(editEmail);
        app.getPlayersHelper().editPlayer(playerModel);
        assertTrue(app.getPlayersHelper().ifPlayerEdited(editName));
    }

    @Test(dependsOnMethods = "editPlayer")
    public void deletePlayer() throws Exception {
        PlayerModel playerModel = new PlayerModel().setName(newName).setEmail(newEmail);
        app.getPlayersHelper().editPlayer(playerModel);
        app.getPlayersHelper().deletePlayer();
        assertTrue(app.getPlayersHelper().ifPlayerDeleted("Add Manually"));
    }


}
