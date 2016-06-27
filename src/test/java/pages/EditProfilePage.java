package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by timrusso on 5/17/16.
 */
public class EditProfilePage extends InternalPage {

    public EditProfilePage(PageManager pages) {
        super(pages);
    }

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtName")
    public AndroidElement fullNameField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/flagPicker")
    public AndroidElement dropDownButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/search")
    public AndroidElement searchField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/country_info")
    public AndroidElement countrySelected;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtPhone")
    public AndroidElement phoneField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtTitle")
    public AndroidElement professionField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtInvitationMessage")
    public AndroidElement invitationField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/ivUserImage")
    public AndroidElement logo;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnSave")
    public AndroidElement saveButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/backArrow")
    public AndroidElement goBackButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnDiscard")
    public AndroidElement discardButton;


    //text errors
    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvInvalidFullName")
    public AndroidElement errorFullName;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvInvalidPhone")
    public AndroidElement errorPhone;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvInvalidTitle")
    public AndroidElement errorProfession;




    public EditProfilePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("titaniumsoft.com.engage.advisor:id/edtTitle")));
        return this;
    }

    public EditProfilePage setFullName(String text) {
        fullNameField.sendKeys(text);
        return this;
    }

    public EditProfilePage setCountry(String text) {
        dropDownButton.click();
        searchField.sendKeys(text);
        countrySelected.click();
        return this;
    }

    public EditProfilePage setPhone(String text) {
        phoneField.sendKeys(text);
        return this;
    }

    public EditProfilePage setProfession(String text) {
        professionField.sendKeys(text);
        return this;
    }

    public EditProfilePage setInvitationText(String text) {
        invitationField.sendKeys(text);
        return this;
    }

    public EditProfilePage clickLogo() {
        logo.click();
        return this;
    }

    public void clickSaveButton() {
        driver.scrollTo("Save");
        saveButton.click();
    }

    public EditProfilePage goToProfilePage() {
        goBackButton.click();
        return this;
    }

    public void discard() {
        discardButton.click();
    }



}
