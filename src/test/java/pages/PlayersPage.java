package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 5/19/16.
 */
public class PlayersPage extends InternalPage {

    public PlayersPage(PageManager pages) {
        super(pages);
    }


    @AndroidFindBy(id = APPID + "btnGetFromContacts")
    public AndroidElement getFromContactsButton;

    @AndroidFindBy(id = APPID + "btnAddMan")
    public AndroidElement addManuallyButton;

    @AndroidFindBy(id = APPID + "add")
    public AndroidElement addButton;

    @AndroidFindBy(id = APPID + "tvClientFullName")
    public AndroidElement playerName;

    @AndroidFindBy(id = APPID + "ivClientOptions")
    public AndroidElement swipeButton;

    @AndroidFindBy(id = APPID + "rlEdit")
    public AndroidElement editButton;

    @AndroidFindBy(id = APPID + "tvDelete")
    public AndroidElement deleteButton;

    @AndroidFindBy(id = APPID + "btnSave")
    public AndroidElement yesButton;

    @AndroidFindBy(id = APPID + "rlSendAnotherInvitation")
    public AndroidElement sendInvitationLink;

    @AndroidFindBy(id = APPID + "tvDialogTitle")
    public AndroidElement invitationSendText;

    @AndroidFindBy(id = APPID + "dialogClose")
    public AndroidElement invitationAlert;


    public PlayersPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "add")));
        return this;
    }


    public PlayersPage sendAnotherInvitation() {
        sendInvitationLink.click();
        return this;
    }

    public PlayersPage closeInvitationALert() {
        invitationAlert.click();
        return this;
    }

    public PlayersPage swipeMenu() {
        swipeButton.click();
        return this;
    }

    public PlayersPage clickEdit() {
        editButton.click();
        return this;
    }

    public PlayersPage deleteClick() {
        deleteButton.click();
        return this;
    }

    public void clickYes() {
        yesButton.click();
    }


    public PlayersPage getFromContacts() {
        getFromContactsButton.click();
        return this;
    }

    public PlayersPage addManuallyPlayer() {
        addManuallyButton.click();
        return this;
    }

    public PlayersPage addPlayer() {
        addButton.click();
        return this;
    }


}
