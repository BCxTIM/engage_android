package applogic;

import model.LoginModel;

/**
 * Created by timrusso on 4/28/16.
 */
public interface LoginHelper {

    void loginAs(LoginModel loginModel);
    void checkWhyWeNeedNumber();
    boolean alertWeNeedNumberTrue(String text);
    void closeDialogAlert();
    boolean alertClosed();
    boolean checkErrorText(String text);
    boolean isGetCodeTrue();

    void switchToQAServer(LoginModel loginModel);
}
