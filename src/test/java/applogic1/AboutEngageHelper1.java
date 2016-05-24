package applogic1;

import applogic.AboutEngageHelper;

/**
 * Created by timrusso on 5/19/16.
 */
public class AboutEngageHelper1  extends DriverBasedHelper implements AboutEngageHelper {

    private ApplicationManager1 manager;

    public AboutEngageHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }


    public void openTermsOfUse() {
        pages.aboutPage.openTermsOfUse();
    }

    public boolean isAboutEngageOpen(String text) {
        pages.aboutPage.ensurePageLoaded();
        return pages.aboutPage.rightsText.getText().contains(text);
    }

    public boolean isTermsOfUseOpen(String text) {
        return pages.aboutPage.termsOfUseText.getText().contains(text);
    }
}
