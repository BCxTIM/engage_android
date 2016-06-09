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

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/edtPhone")
    public AndroidElement phoneButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/logoLayout")
    public AndroidElement logoButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnGetCode")
    public AndroidElement getCodeButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvExplication")
    public AndroidElement errorPhoneText;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/flagPicker")
    public AndroidElement flagDropDownList;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/search")
    public AndroidElement searchCountryField;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/status")
    public AndroidElement countrySelected;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/tvWhy")
    public AndroidElement whyNeedNumberLink;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/btnCool")
    public AndroidElement coolButton;

    @AndroidFindBy(id = "titaniumsoft.com.engage.advisor:id/dialogText")
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
