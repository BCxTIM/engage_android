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
        app.getNavigationHelper().goToMyProfile();
        app.getMyProfileHelper().openEditProfile();
    }


    public void cancelChanges() {
        app.getEditProfileHelper().goBack();
    }

    @Test
    public void changeProfile() throws Exception {
        String fullName = "Timofei Moiseev";
        String profession = "Programmer";
        EditProfileModel profileModel = new EditProfileModel()
                .setFullName(fullName)
                .setProfession(profession);
        app.getEditProfileHelper().setProfile(profileModel);
        assertTrue(app.getMyProfileHelper().isChangedName(fullName));
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession));

        app.getMyProfileHelper().openEditProfile();

        String fullName1 = "Tim Russo";
        String profession1 = "Trainer";
        EditProfileModel profileModel1 = new EditProfileModel()
                .setFullName(fullName1)
                .setProfession(profession1);
        app.getEditProfileHelper().setProfile(profileModel1);
        assertTrue(app.getMyProfileHelper().isChangedName(fullName1));
        assertTrue(app.getMyProfileHelper().isProfessionChanged(profession1));
    }



    @Test(enabled = false)
    public void changeNameInvalid() throws Exception {
        //check with empty fields
        String emptyErrorText = "Please enter name to continue";
        EditProfileModel profileModel = new EditProfileModel().setFullName("");
        app.getEditProfileHelper().setFullName(profileModel);
        assertTrue(app.getEditProfileHelper().isFullNameHaveError(emptyErrorText));

       this.cancelChanges();
    }

    @Test (enabled = false)
    public void changeProfessionInvalid() throws Exception {
        EditProfileModel profileModel = new EditProfileModel().setProfession("");
        app.getEditProfileHelper().setProfession(profileModel);
        assertTrue(app.getEditProfileHelper().isProfessionHaveError("Title should be 3 or more characters"));
        app.getEditProfileHelper().goBack();
    }


}
