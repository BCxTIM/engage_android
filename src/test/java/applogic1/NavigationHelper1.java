package applogic1;

import applogic.NavigationHelper;

/**
 * Created by timrusso on 5/19/16.
 */
public class NavigationHelper1 extends DriverBasedHelper implements NavigationHelper {

    private ApplicationManager1 manager;

    public NavigationHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void goToPlayersScreen() {
        pages.internalPage.openPlayersMenu();
    }

    @Override
    public void openAboutTagPayForm() {
        pages.myProfilePage.ensurePageLoaded();
        pages.myProfilePage.openAboutForm();
    }

    @Override
    public void openContactTagPayForm() {
        pages.myProfilePage.ensurePageLoaded();
        pages.myProfilePage.openContactTagPayForm();
    }
}
