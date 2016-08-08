package applogic1;

import applogic.MyProfileHelper;

/**
 * Created by timrusso on 5/11/16.
 */
public class MyProfileHelper1 extends DriverBasedHelper implements MyProfileHelper {


    private ApplicationManager1 manager;


    public MyProfileHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public boolean seeProfile(String text) {
        pages.myProfilePage.ensurePageLoaded();
        return pages.myProfilePage.myProfileTitle.getText().contains(text);
    }

    public boolean isChangedName(String text) {
        pages.myProfilePage.ensurePageLoaded();
        return pages.myProfilePage.fullName.getText().contains(text);
    }

    public boolean isChangedPhoneNumber(String text) {
        pages.myProfilePage.ensurePageLoaded();
        return pages.myProfilePage.phone.getText().contains(text);
    }

    public boolean isProfessionChanged(String text) {
        pages.myProfilePage.ensurePageLoaded();
        return pages.myProfilePage.profession.getText().contains(text);
    }

    public void openAboutForm() {
        pages.myProfilePage.ensurePageLoaded();
        pages.myProfilePage.openAboutForm();
    }

    public void openEditProfile() {
        pages.myProfilePage.ensurePageLoaded();
        pages.myProfilePage.openEditProfile();
        pages.editProfilePage.ensurePageLoaded();
    }

}
