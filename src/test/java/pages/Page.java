package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by timrusso on 4/28/16.
 */
public abstract class Page {

    protected AndroidDriver driver;
    protected PageManager pages;
    protected WebDriverWait wait;

    public Page(PageManager pages) {
        this.pages = pages;
        driver = pages.getAndroidDriver();
        wait = new WebDriverWait(driver, 30);
    }

    public Page ensurePageLoaded() {
        return this;
    }

    public boolean waitPageLoaded() {
        try {
            ensurePageLoaded();
            return true;
        } catch (TimeoutException to) {
            return  false;
        }
    }

    public AndroidDriver getAndroidDriver() {
        return driver;
    }

}
