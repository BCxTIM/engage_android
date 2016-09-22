package applogic1;

import applogic.TeamHelper;

/**
 * Created by timrusso on 6/27/16.
 */
public class TeamHelper1 extends DriverBasedHelper implements TeamHelper {

    private ApplicationManager1 manager;

    public TeamHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void selectTeam1() {
        pages.teamPage.ensurePageLoaded();
        pages.teamPage.selectTeam1();
    }

    public void selectTeam2() {
        pages.teamPage.ensurePageLoaded();
        pages.teamPage.selectTeam2();
    }

    public boolean loadTeamPage() {
        return pages.teamPage.waitPageLoaded();
    }

    @Override
    public boolean teamName(String name) {
        return pages.teamPage.titleName.getText().contains(name);
    }

    @Override
    public boolean teamDescription(String description) {
        return pages.teamPage.titleDescription.getText().contains(description);
    }


}
