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

    @AndroidFindBy(id = APPID + "edtName")
    public AndroidElement fullNameField;

    @AndroidFindBy(id = APPID + "flagPicker")
    public AndroidElement dropDownButton;

    @AndroidFindBy(id = APPID + "search")
    public AndroidElement searchField;

    @AndroidFindBy(id = APPID + "country_info")
    public AndroidElement countrySelected;

    @AndroidFindBy(id = APPID + "edtPhone")
    public AndroidElement phoneField;

    @AndroidFindBy(id = APPID + "edtTitle")
    public AndroidElement professionField;

    @AndroidFindBy(id = APPID + "edtInvitationMessage")
    public AndroidElement invitationField;

    @AndroidFindBy(id = APPID + "ivUserImage")
    public AndroidElement logo;

    @AndroidFindBy(id = APPID + "tvInvitaionTitle")
    public AndroidElement saveButton;

    @AndroidFindBy(id = APPID + "backArrow")
    public AndroidElement goBackButton;

    @AndroidFindBy(id = APPID + "btnDiscard")
    public AndroidElement discardButton;

    @AndroidFindBy(id = APPID + "tvPhone")
    public AndroidElement phoneNumber;


    //text errors
    @AndroidFindBy(id = APPID + "tvInvalidFullName")
    public AndroidElement errorFullName;

    @AndroidFindBy(id = APPID + "tvInvalidPhone")
    public AndroidElement errorPhone;

    @AndroidFindBy(id = APPID + "tvInvalidTitle")
    public AndroidElement errorProfession;



    public EditProfilePage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(APPID + "edtTitle")));
        return this;
    }

    public EditProfilePage setFullName(String text) {
        fullNameField.clear();
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
        professionField.clear();
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
        driver.hideKeyboard();
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
