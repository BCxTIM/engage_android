package tests;

import model.EditTeamModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

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
        app.getNavigationHelper().goToTeamInfo();
    }

    @Test
    public void changeTeamInfo() throws Exception {
        String teamName = "test team";
        String teamDescription = "test description";
        EditTeamModel editTeamModel = new EditTeamModel().setTitle(teamName).setDesctiption(teamDescription);
        app.getTeamInfoHelper().changeTeamInfo(editTeamModel);

        app.getNavigationHelper().goToTeamPage();
        assertTrue(app.getTeamHelper().teamName(teamName));
        assertTrue(app.getTeamHelper().teamDescription(teamDescription));
        app.getTeamHelper().selectTeam1();

        EditTeamModel editTeamModel1 = new EditTeamModel().setTitle("60097171 team").setDesctiption("60097171 description");
        app.getTeamInfoHelper().changeTeamInfo(editTeamModel1);

    }

}
