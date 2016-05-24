package pages;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by timrusso on 4/26/16.
 */
public class GetCodePage extends InternalPage {

    public GetCodePage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtEnterCode")
    public AndroidElement getCodeField;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
    public AndroidElement havingTroubleLink;


    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnGetStarted")
    public AndroidElement getStartedButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/imageView")
    public AndroidElement logo;


    public GetCodePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/edtEnterCode")));
        return this;
    }

    public GetCodePage setCode(String code) {
        getCodeField.sendKeys(code);
        logo.click();
        return this;
    }

    public void clickGetStarted() {
        getStartedButton.click();
    }



    public void clickContactUsLink() {
        havingTroubleLink.click();
    }




}
