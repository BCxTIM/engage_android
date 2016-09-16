package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by timrusso on 5/11/16.
 */
public class MyProfilePage extends AnyPage {

    public MyProfilePage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(id = APPID + "tool_bar_title")
    public AndroidElement myProfileTitle;

    @AndroidFindBy(id = APPID + "ivEditProfile")
    public AndroidElement editProfileButton;

    @AndroidFindBy(id = APPID + "tvName")
    public AndroidElement fullName;

    @AndroidFindBy(id = APPID + "tvTitle")
    public AndroidElement profession;

    @AndroidFindBy(id = APPID + "tvPhone")
    public AndroidElement phone;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
    public AndroidElement optionButton;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public AndroidElement aboutLink;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public AndroidElement contactTagPayLink;

    public MyProfilePage openAboutForm() {
        optionButton.click();
        aboutLink.click();
        return this;
    }

    public MyProfilePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "tool_bar_title")));
        return this;
    }

    public MyProfilePage openEditProfile() {
        editProfileButton.click();
        return this;
    }

    public MyProfilePage openContactTagPayForm() {
        optionButton.click();
        contactTagPayLink.click();
        return this;
    }



}
