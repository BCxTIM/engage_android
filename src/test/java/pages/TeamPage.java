package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 6/27/16.
 */
public class TeamPage extends InternalPage {

    public TeamPage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]")
    public AndroidElement team1;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]")
    public AndroidElement team2;

    @AndroidFindBy(id = APPID + "rlHeader")
    public AndroidElement teamPage;

    public TeamPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "rlHeader")));
        return this;
    }

    public TeamPage selectTeam1() {
        team1.click();
        return this;
    }

    public TeamPage selectTeam2() {
        team2.click();
        return this;
    }



}
