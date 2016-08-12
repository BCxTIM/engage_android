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

    private String name = "aaa aaa";

    @Test
    public void addPlayer() throws Exception {
        PlayerModel playerModel = new PlayerModel().setName(name).setCountryCode("373").setPhone("69999991").setEmail("verront+88898@gmail.com");
        assertTrue(app.getPlayersHelper().ifNoPlayers("Add Manually"));
        app.getPlayersHelper().addManuallyPlayer(playerModel);
        assertTrue(app.getPlayersHelper().ifPlayerAdded(name));
    }

    @Test(dependsOnMethods = "addPlayer")
    public void tryDeletePlayerFromMenu() throws Exception {
        app.getPlayersHelper().noDeletePlayer();
        assertTrue(app.getPlayersHelper().ifPlayerAdded(name));
    }

    @Test(dependsOnMethods = "tryDeletePlayerFromMenu")
    public void deletePlayer() throws Exception {
        app.getPlayersHelper().deletePlayer();
        assertTrue(app.getPlayersHelper().ifPlayerDeleted("Add Manually"));
    }


}
