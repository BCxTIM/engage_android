package applogic1;

import applogic.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

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
    private ClientsHelper clientsHelper;

    private AndroidDriver driver;

    public ApplicationManager1() throws Exception {

        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");

        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("deviceName", "Nexus_5X_API_23");

        File file = new File("/Users/timrusso/.jenkins/workspace/testgradle/app/build/outputs/apk/app-advisor-debug.apk");
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
        clientsHelper = new ClientsHelper1(this);


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

    public ClientsHelper getClientsHelper() {
        return clientsHelper;
    }

    public void stop() {
        if(driver != null) {
            driver.quit();
        }
        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        service.stop();
    }

    public AndroidDriver getAndroidDriver() {
        return driver;
    }



}
