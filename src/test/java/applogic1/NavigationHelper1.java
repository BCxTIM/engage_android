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

    public void goToClientsScreen() {
        pages.internalPage.openClientsMenu();
    }
}
