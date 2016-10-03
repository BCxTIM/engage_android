package applogic1;

import applogic.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by timrusso on 4/28/16.
 */
public class ApplicationManager1 implements ApplicationManager {

    private ContactUsHelper contactUsHelper;
    private LoginHelper loginHelper;
    private GetCodeHelper getCodeHelper;
    private MyProfileHelper myProfileHelper;
    private EditProfileHelper editProfileHelper;
    private AboutEngageHelper aboutEngageHelper;
    private NavigationHelper navigationHelper;
    private PlayersHelper playersHelper;
    private TeamHelper teamHelper;
    private ContactTagPayHelper contactTagPayHelper;
    private TeamInfoHelper teamInfoHelper;
    private FeedHelper feedHelper;

    private AndroidDriver driver;
    private AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    public ApplicationManager1() throws Exception {

        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");

        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("deviceName", "Nexus_5X_API_22");

        File file = new File("/Volumes/Untitled 1/TIM/test/android/app-advisor-debug.apk");
        capabilities.setCapability("app", file.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        contactUsHelper = new ContactUsHelper1(this);
        loginHelper = new LoginHelper1(this);
        getCodeHelper = new GetCodeHelper1(this);
        myProfileHelper = new MyProfileHelper1(this);
        editProfileHelper = new EditProfileHelper1(this);
        aboutEngageHelper = new AboutEngageHelper1(this);
        navigationHelper = new NavigationHelper1(this);
        playersHelper = new PlayersHelper1(this);
        teamHelper = new TeamHelper1(this);
        contactTagPayHelper = new ContactTagPayHelper1(this);
        teamInfoHelper = new TeamInfoHelper1(this);
        feedHelper = new FeedHelper1(this);


    }



    public ContactUsHelper getContactUsHelper() {
        return contactUsHelper;
    }

    public LoginHelper getLoginHelper() {
        return  loginHelper;
    }

    public GetCodeHelper getGetCodeHelper() {
        return getCodeHelper;
    }

    public MyProfileHelper getMyProfileHelper() {
        return myProfileHelper;
    }

    public EditProfileHelper getEditProfileHelper() {
        return  editProfileHelper;
    }

    public AboutEngageHelper getAboutEngageHelper() {
        return aboutEngageHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public PlayersHelper getPlayersHelper() {
        return playersHelper;
    }

    public TeamHelper getTeamHelper() {
        return teamHelper;
    }

    public ContactTagPayHelper getContactTagPayHelper() {
        return contactTagPayHelper;
    }

    public TeamInfoHelper getTeamInfoHelper() {
        return teamInfoHelper;
    }

    public FeedHelper getFeedHelper() {
        return feedHelper;
    }


    public void stop() {
        if(driver != null) {
            driver.quit();
            service.stop();
        }
    }

    public AndroidDriver getAndroidDriver() {
        return driver;
    }



}
