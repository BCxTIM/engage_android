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


    @Test
    public void addPlayer() throws Exception {
        String name = "aaa aaa";
        PlayerModel playerModel = new PlayerModel().setName(name).setCountryCode("373").setPhone("69999991").setEmail("verront+88898@gmail.com");
        assertTrue(app.getPlayersHelper().ifNoPlayers("Add Manually"));
        app.getPlayersHelper().addManuallyPlayer(playerModel);
        assertTrue(app.getPlayersHelper().ifPlayerAdded(name));
    }

    @Test
    public void deletePlayer() throws Exception {
        app.getPlayersHelper().deletePlayer();
        assertTrue(app.getPlayersHelper().ifPlayerDeleted("Add Manually"));
    }


}
