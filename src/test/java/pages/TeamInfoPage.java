package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by timrusso on 9/22/16.
 */
public class TeamInfoPage  extends AnyPage{

    public TeamInfoPage(PageManager pages) {
        super(pages);
    }


    @AndroidFindBy(id = APPID + "ivEditProfile")
    public AndroidElement editTeamInfoButton;

    @AndroidFindBy(id = APPID + "edtName")
    public AndroidElement titleField;

    @AndroidFindBy(id = APPID + "edtTitle")
    public AndroidElement descriptionField;

    @AndroidFindBy(id = APPID + "tvInvitaionTitle")
    public AndroidElement saveButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
    public AndroidElement optionMenu;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public AndroidElement switchButton;

    public TeamInfoPage openTeamsPage() {
        optionMenu.click();
        switchButton.click();
        return this;
    }

    public TeamInfoPage openEditTeamInfo() {
        editTeamInfoButton.click();
        return this;
    }

    public TeamInfoPage setTeamName(String text) {
        titleField.clear();
        titleField.sendKeys(text);
        return this;
    }

    public TeamInfoPage setTeamDescription(String text) {
        descriptionField.clear();
        descriptionField.sendKeys(text);
        return this;
    }

    public void saveTeamInfo() {
        driver.hideKeyboard();
        saveButton.click();
    }

}
