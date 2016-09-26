package applogic1;

import applogic.ApplicationManager;
import applogic.TeamInfoHelper;
import model.EditTeamModel;

/**
 * Created by timrusso on 9/22/16.
 */
public class TeamInfoHelper1 extends DriverBasedHelper implements TeamInfoHelper {

    private ApplicationManager manager;

    public TeamInfoHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }


    @Override
    public void changeTeamInfo(EditTeamModel editTeamModel) {
        pages.teamInfoPage.openEditTeamInfo()
                .setTeamName(editTeamModel.getTitle())
                .setTeamDescription(editTeamModel.getDescription())
                .saveTeamInfo();
        pages.myProfilePage.ensurePageLoaded();
    }

    public void goToTeamPage() {
        pages.teamInfoPage.openTeamsPage();
    }
}
