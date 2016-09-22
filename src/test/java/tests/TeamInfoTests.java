package tests;

import model.EditTeamModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TestBase;

/**
 * Created by timrusso on 9/22/16.
 */
public class TeamInfoTests extends TestBase {

    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
        app.getNavigationHelper().goToPlayersScreen();
    }

    @BeforeMethod
    public void openTeamInfoPage() throws Exception {
        app.getNavigationHelper().goToMyProfile();
        app.getNavigationHelper().goToTeamPage();
    }

    @Test
    public void changeTeamInfo() throws Exception {
        EditTeamModel editTeamModel = new EditTeamModel().setTitle("test team").setDesctiption("test description");

    }

}
