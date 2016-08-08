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

    @AndroidFindBy(id = APPID + "edtEnterCode")
    public AndroidElement getCodeField;

    @AndroidFindBy(id = APPID + "tvTrouble")
    public AndroidElement havingTroubleLink;


    @AndroidFindBy(id = APPID + "btnGetStarted")
    public AndroidElement getStartedButton;

    @AndroidFindBy(id = APPID + "logoImage")
    public AndroidElement logo;


    public GetCodePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "edtEnterCode")));
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
