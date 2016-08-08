package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


/**
 * Created by timrusso on 4/26/16.
 */
public class LoginPage extends AnyPage {

   public LoginPage(PageManager pages) {
       super(pages);
   }

    @AndroidFindBy(id = APPID + "edtPhone")
    public AndroidElement phoneButton;

    @AndroidFindBy(id =  APPID + "logoLayout")
    public AndroidElement logoButton;

    @AndroidFindBy(id = APPID + "btnGetCode")
    public AndroidElement getCodeButton;

    @AndroidFindBy(id = APPID + "tvExplication")
    public AndroidElement errorPhoneText;

    @AndroidFindBy(id = APPID + "flagPicker")
    public AndroidElement flagDropDownList;

    @AndroidFindBy(id =  APPID + "search")
    public AndroidElement searchCountryField;

    @AndroidFindBy(id = APPID + "status")
    public AndroidElement countrySelected;

    @AndroidFindBy(id = APPID + "tvWhy")
    public AndroidElement whyNeedNumberLink;

    @AndroidFindBy(id = APPID + "btnCool")
    public AndroidElement coolButton;

    @AndroidFindBy(id = APPID + "dialogText")
    public AndroidElement dialogText;


    public LoginPage setCountry(String countryCode) {
        flagDropDownList.click();
        searchCountryField.sendKeys(countryCode);
        countrySelected.click();
        return this;
    }

    public LoginPage setPhone(String phoneNumber) {
        phoneButton.sendKeys(phoneNumber);
        logoButton.click();
        return this;
    }

    public void clickGetCode() {
        getCodeButton.click();
    }

    public LoginPage clickWhyNeedNumberLink() {
        whyNeedNumberLink.click();
        return this;
    }

    public LoginPage closeAlert() {
        coolButton.click();
        return this;
    }







}
