package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 5/19/16.
 */
public class AboutPage extends AnyPage {

    public AboutPage(PageManager pages) {
        super(pages);
    }



    public AboutPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "rights")));
        return this;
    }

    @AndroidFindBy(id = APPID + "terms_of_use")
    public AndroidElement termsOfUseLink;

    @AndroidFindBy(id = APPID + "dialogText")
    public AndroidElement termsOfUseText;

    @AndroidFindBy(id = APPID + "rights")
    public AndroidElement rightsText;

    public AboutPage openTermsOfUse() {
        driver.scrollTo("Terms of use");
        termsOfUseLink.click();
        return this;
    }



}
