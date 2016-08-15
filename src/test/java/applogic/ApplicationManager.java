package applogic;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by timrusso on 4/28/16.
 */
public interface ApplicationManager {

    ContactUsHelper getContactUsHelper();
    LoginHelper getLoginHelper();
    GetCodeHelper getGetCodeHelper();
    MyProfileHelper getMyProfileHelper();
    EditProfileHelper getEditProfileHelper();
    AboutEngageHelper getAboutEngageHelper();
    NavigationHelper getNavigationHelper();
    PlayersHelper getPlayersHelper();
    TeamHelper getTeamHelper();
    ContactTagPayHelper getContactTagPayHelper();

    void stop();
    AndroidDriver getAndroidDriver();

}
