package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 5/19/16.
 */
public class ClientsPage extends InternalPage {

    public ClientsPage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvNoClients")
    public AndroidElement noClientsText;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnGetFromContacts")
    public AndroidElement getFromContactsButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnAddMan")
    public AndroidElement addManuallyButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/add")
    public AndroidElement addButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvClientFullName")
    public AndroidElement clientName;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/ivClientOptions")
    public AndroidElement swipeButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/rlEdit")
    public AndroidElement editButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvDelete")
    public AndroidElement deleteButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnSave")
    public AndroidElement yesButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/rlSendAnotherInvitation")
    public AndroidElement sendInvitationLink;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvDialogTitle")
    public AndroidElement invitationSendText;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/dialogClose")
    public AndroidElement invitationAlert;


    public ClientsPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/add")));
        return this;
    }


    public ClientsPage sendAnotherInvitation() {
        sendInvitationLink.click();
        return this;
    }

    public ClientsPage closeInvitationALert() {
        invitationAlert.click();
        return this;
    }

    public ClientsPage swipeMenu() {
        swipeButton.click();
        return this;
    }

    public ClientsPage clickEdit() {
        editButton.click();
        return this;
    }

    public ClientsPage deleteClick() {
        deleteButton.click();
        return this;
    }

    public void clickYes() {
        yesButton.click();
    }


    public ClientsPage getFromContacts() {
        getFromContactsButton.click();
        return this;
    }

    public ClientsPage addManuallyContact() {
        addManuallyButton.click();
        return this;
    }

    public ClientsPage addContact() {
        addButton.click();
        return this;
    }


}
