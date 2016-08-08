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


    public void cancelChanges() {
        app.getEditProfileHelper().goBack();
    }

    @Test
    public void changeProfile() throws Exception {
        String fullName = "Timofei Moiseev";
//        String countryCode = "373";
//        String phone = "60097170";
        String profession = "Programmer";
        EditProfileModel profileModel = new EditProfileModel()
                .setFullName(fullName)
//                .setCountryCode(countryCode)
//                .setPhone(phone)
                .setProfession(profession);
        app.getEditProfileHelper().setProfile(profileModel);
        assertTrue(app.getMyProfileHelper().isChangedName(fullName));
//        assertTrue(app.getMyProfileHelper().isChangedPhoneNumber(countryCode + phone));
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession));

        app.getMyProfileHelper().openEditProfile();

        //change back
        String fullName1 = "Tim Russo";
//        String countryCode1 = "373";
//        String phone1 = "60097171";
        String profession1 = "Trainer";
        EditProfileModel profileModel1 = new EditProfileModel()
                .setFullName(fullName1)
//                .setCountryCode(countryCode1)
//                .setPhone(phone1)
                .setProfession(profession1);
        app.getEditProfileHelper().setProfile(profileModel1);
        assertTrue(app.getMyProfileHelper().isChangedName(fullName1));
//        assertTrue(app.getMyProfileHelper().isChangedPhoneNumber(countryCode1 + phone1));
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession1));
    }



    @Test
    public void changeNameInvalid() throws Exception {
        //check with empty fields
        String emptyErrorText = "Name should be 1 or more characters";
        EditProfileModel profileModel = new EditProfileModel().setFullName("");
        app.getEditProfileHelper().setFullName(profileModel);
        assertTrue(app.getEditProfileHelper().isFullNameHaveError(emptyErrorText));

       this.cancelChanges();
    }

    @Test
    public void changeProfessionInvalid() throws Exception {
        EditProfileModel profileModel = new EditProfileModel().setProfession("");
        app.getEditProfileHelper().setProfession(profileModel);
        assertTrue(app.getEditProfileHelper().isProfessionHaveError("Title should be 3 or more characters"));
        app.getEditProfileHelper().goBack();
    }


}
