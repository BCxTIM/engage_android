package model;

/**
 * Created by timrusso on 5/19/16.
 */
public class PlayerModel {

    private String name;
    private String countryCode;
    private String phone;
    private String email;

    public PlayerModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlayerModel setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public PlayerModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public PlayerModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

}
