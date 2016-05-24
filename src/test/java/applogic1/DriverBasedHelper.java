package applogic1;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageManager;

/**
 * Created by timrusso on 4/28/16.
 */
public class DriverBasedHelper {

    protected AndroidDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

    public DriverBasedHelper(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        pages = new PageManager(driver);

    }

}
