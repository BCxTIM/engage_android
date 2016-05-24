package model;

/**
 * Created by timrusso on 4/28/16.
 */
public class ContactUsModel {

    private String name;
    private String phone;
    private String email;
    private String country;

    public String getName() {
        return name;
    }

    public ContactUsModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public ContactUsModel setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ContactUsModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactUsModel setEmail(String email) {
        this.email = email;
        return this;
    }


}
