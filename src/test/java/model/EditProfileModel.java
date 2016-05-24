package model;

/**
 * Created by timrusso on 5/17/16.
 */
public class EditProfileModel {

    private String fullName;
    private String countryCode;
    private String phone;
    private String profession;
    private String invitationText;

    public String getFullName() {
        return fullName;
    }

    public EditProfileModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public EditProfileModel setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public EditProfileModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getProfession() {
        return profession;
    }

    public EditProfileModel setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public String getInvitationText() {
        return invitationText;
    }

    public EditProfileModel setInvitationText(String invitationText) {
        this.invitationText = invitationText;
        return this;
    }

}
