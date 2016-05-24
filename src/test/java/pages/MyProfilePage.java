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

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tool_bar_title")
    public AndroidElement myProfileTitle;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/ivPencil")
    public AndroidElement editProfileButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvName")
    public AndroidElement fullName;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvTitle")
    public AndroidElement profession;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvPhone")
    public AndroidElement phone;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
    public AndroidElement optionButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public AndroidElement aboutEngageLink;

    public MyProfilePage openAboutEngageForm() {
        optionButton.click();
        aboutEngageLink.click();
        return this;
    }

    public MyProfilePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/tool_bar_title")));
        return this;
    }

    public MyProfilePage openEditProfile() {
        editProfileButton.click();
        return this;
    }



}
