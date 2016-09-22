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

    @AndroidFindBy(id = APPID + "news_layout")
    public AndroidElement logo;

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
        logo.click();
    }

}
