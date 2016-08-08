package tests;

import model.EditProfileModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by timrusso on 5/17/16.
 */
public class EditProfileTests  extends TestBase {

    @BeforeClass
    public void login() throws Exception {
        this.loginAsAdviser();
    }

    @BeforeMethod
    public void openEditProfilePage() throws Exception {
        app.getMyProfileHelper().openEditProfile();
    }


    public void cancelChangesAndOpenEdit() {
        app.getEditProfileHelper().goBack();
        app.getMyProfileHelper().openEditProfile();
    }

    @Test
    public void changeProfile() throws Exception {
        String fullName = "Timofei Moiseev";
        String countryCode = "373";
        String phone = "60097170";
        String profession = "Programmer";
        EditProfileModel profileModel = new EditProfileModel()
                .setFullName(fullName)
                .setCountryCode(countryCode)
                .setPhone(phone)
                .setProfession(profession);
        app.getEditProfileHelper().setProfile(profileModel);
        assertTrue(app.getMyProfileHelper().isChangedName(fullName));
        assertTrue(app.getMyProfileHelper().isChangedPhoneNumber(countryCode + phone));
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession));

        app.getMyProfileHelper().openEditProfile();

        //change back
        String fullName1 = "Tim Russo";
        String countryCode1 = "373";
        String phone1 = "60097171";
        String profession1 = "Trainer";
        EditProfileModel profileModel1 = new EditProfileModel()
                .setFullName(fullName1)
                .setCountryCode(countryCode1)
                .setPhone(phone1)
                .setProfession(profession1);
        app.getEditProfileHelper().setProfile(profileModel1);
        assertTrue(app.getMyProfileHelper().isChangedName(fullName1));
        assertTrue(app.getMyProfileHelper().isChangedPhoneNumber(countryCode1 + phone1));
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession1));
    }

    @Test(enabled = false)
    public void changeFullName() throws Exception {
        String fullName = "Timofei Moiseev";
        EditProfileModel profileModel = new EditProfileModel().setFullName(fullName);
        app.getEditProfileHelper().setFullName(profileModel);
        assertTrue(app.getMyProfileHelper().seeProfile("My Profile"));
        assertTrue(app.getMyProfileHelper().isChangedName(fullName));
    }

    @Test(enabled = false)
    public void changeBackFullName() throws Exception {
        String fullName = "Tim Russo";
        EditProfileModel profileModel = new EditProfileModel().setFullName(fullName);
        app.getEditProfileHelper().setFullName(profileModel);
        assertTrue(app.getMyProfileHelper().seeProfile("My Profile"));
        assertTrue(app.getMyProfileHelper().isChangedName(fullName));
    }

    @Test(enabled = false)
    public void changePhoneNumber() throws  Exception {
        String countryCode = "373";

        String phoneNumber = "60097170";
        EditProfileModel profileModel = new EditProfileModel().setCountryCode(countryCode).setPhone(phoneNumber);
        app.getEditProfileHelper().setPhoneNumber(profileModel);
        assertTrue(app.getMyProfileHelper().isChangedPhoneNumber(countryCode + phoneNumber));

        app.getMyProfileHelper().openEditProfile();

        String userPhoneNumber = "60097171";
        EditProfileModel profileModel1 = new EditProfileModel().setCountryCode(countryCode).setPhone(userPhoneNumber);
        app.getEditProfileHelper().setPhoneNumber(profileModel1);
        assertTrue(app.getMyProfileHelper().isChangedPhoneNumber(countryCode + userPhoneNumber));
    }

    @Test(enabled = false)
    public void changeProfession() throws Exception {
        String profession = "Programmer";
        EditProfileModel profileModel = new EditProfileModel().setProfession(profession);
        app.getEditProfileHelper().setProfession(profileModel);
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession));

        app.getMyProfileHelper().openEditProfile();

        String userProfession = "Trainer";
        EditProfileModel profileModel1 = new EditProfileModel().setProfession(userProfession);
        app.getEditProfileHelper().setProfession(profileModel1);
        assertTrue(app.getMyProfileHelper().isProfessionChanged(userProfession));
    }

    @Test
    public void changeNameInvalid() throws Exception {
        //check with empty fields
        String emptyErrorText = "Name should be 1 or more characters";
        EditProfileModel profileModel = new EditProfileModel().setFullName("");
        app.getEditProfileHelper().setFullName(profileModel);
        assertTrue(app.getEditProfileHelper().isFullNameHaveError(emptyErrorText));

       this.cancelChangesAndOpenEdit();

        /*
        //check if full name contains 123 (NOT ACTUAL)
        String numbersErrorText = "Full name can't contain digits";
        EditProfileModel profileModel1 = new EditProfileModel().setFullName("tim 123");
        app.getEditProfileHelper().setFullName(profileModel1);
        assertTrue(app.getEditProfileHelper().isFullNameHaveError(numbersErrorText));
        app.getEditProfileHelper().goBack();*/
    }

    @Test
    public void changePhoneInvalid() throws Exception {
        String phoneInDb = "Mobile number is already taken";
        EditProfileModel profileModel1 = new EditProfileModel().setCountryCode("373").setPhone("69999999");
        app.getEditProfileHelper().setPhoneNumber(profileModel1);
        assertTrue(app.getEditProfileHelper().isPhoneHaveError(phoneInDb));

        this.cancelChangesAndOpenEdit();

        String emptyPhone = "Please enter a phone number";
        EditProfileModel profileModel = new EditProfileModel().setCountryCode("373").setPhone("");
        app.getEditProfileHelper().setPhoneNumber(profileModel);
        assertTrue(app.getEditProfileHelper().isPhoneHaveError(emptyPhone));
        app.getEditProfileHelper().goBack();
    }

    @Test
    public void changeProfessionInvalid() throws Exception {
        EditProfileModel profileModel = new EditProfileModel().setProfession("");
        app.getEditProfileHelper().setProfession(profileModel);
        assertTrue(app.getEditProfileHelper().isProfessionHaveError("Title should be 3 or more characters"));
        app.getEditProfileHelper().goBack();
    }
}
