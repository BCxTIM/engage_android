package model;

/**
 * Created by timrusso on 4/28/16.
 */
public class LoginModel {

    private String countryCode;
    private String phone;

    public String getCountryCode() {
        return countryCode;
    }

    public LoginModel setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public  String getPhone() {
        return  phone;
    }

    public LoginModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

}
