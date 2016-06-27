package applogic1;


import applogic.LoginHelper;
import model.LoginModel;


/**
 * Created by timrusso on 4/28/16.
 */
public class LoginHelper1 extends DriverBasedHelper implements LoginHelper {

    private ApplicationManager1 manager;

    public LoginHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void loginAs(LoginModel loginModel) {
        pages.loginPage
                .setCountry(loginModel.getCountryCode())
                .setPhone(loginModel.getPhone())
                .clickGetCode();
    }

    public void checkWhyWeNeedNumber() {
        pages.loginPage
                .clickWhyNeedNumberLink();
    }

    public boolean isGetCodeTrue() {
        pages.getCodePage.ensurePageLoaded();
        return pages.getCodePage.getCodeField.isDisplayed();
    }

    public boolean alertWeNeedNumberTrue(String text) {
        return pages.loginPage.dialogText
                .getText().contains(text);
    }

    public void closeDialogAlert() {
        pages.loginPage.closeAlert();
    }

    public boolean alertClosed() {
        return pages.loginPage.phoneButton.isDisplayed();
    }

    public boolean checkErrorText(String text) {
        return pages.loginPage.errorPhoneText.getText().contains(text);
    }


}
