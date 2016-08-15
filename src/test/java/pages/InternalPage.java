package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by timrusso on 4/28/16.
 */
public class InternalPage extends AnyPage {

    public InternalPage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView[1]")
    public AndroidElement playersMenu;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
    public AndroidElement optionMenu;

    @AndroidFindBy(id = APPID + "title")
    public AndroidElement switchButton;


    public InternalPage openPlayersMenu() {
        playersMenu.click();
        return this;
    }

    public InternalPage openTeamsPage() {
        optionMenu.click();
        switchButton.click();
        return this;
    }
}
