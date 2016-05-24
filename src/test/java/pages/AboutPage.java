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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/rights")));
        return this;
    }

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/terms_of_use")
    public AndroidElement termsOfUseLink;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/dialogText")
    public AndroidElement termsOfUseText;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/rights")
    public AndroidElement rightsText;

    public AboutPage openTermsOfUse() {
        termsOfUseLink.click();
        return this;
    }



}
