package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 6/27/16.
 */
public class BrandPage extends InternalPage {

    public BrandPage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]")
    public AndroidElement brand1;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]")
    public AndroidElement brand2;

    @AndroidFindBy(id = APPID + "mock_up_screen")
    public AndroidElement mockUp;

    public BrandPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "mock_up_screen")));
        return this;
    }

    public BrandPage selectBrand1() {
        brand1.click();
        return this;
    }

    public BrandPage selectBrand2() {
        brand2.click();
        return this;
    }



}
