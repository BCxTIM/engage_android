package applogic1;

import applogic.EditProfileHelper;
import model.EditProfileModel;

/**
 * Created by timrusso on 5/17/16.
 */
public class EditProfileHelper1 extends DriverBasedHelper implements EditProfileHelper {

    private ApplicationManager1 manager;

    public EditProfileHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }


    public void setProfile(EditProfileModel editProfileModel) {
        pages.editProfilePage
                .setFullName(editProfileModel.getFullName())
                .clickLogo()
                .setProfession(editProfileModel.getProfession())
                .clickLogo()
                .clickSaveButton();
    }

    public void setFullName(EditProfileModel editProfileModel) {
        pages.editProfilePage
                .setFullName(editProfileModel.getFullName())
                .clickSaveButton();
    }


    public void setPhoneNumber(EditProfileModel editProfileModel) {
        pages.editProfilePage
                .setCountry(editProfileModel.getCountryCode())
                .setPhone(editProfileModel.getPhone())
                .clickLogo()
                .clickSaveButton();
    }

    public void setProfession(EditProfileModel editProfileModel) {
        pages.editProfilePage
                .setProfession(editProfileModel.getProfession())
                .clickSaveButton();
    }

    public void setInvitation(EditProfileModel editProfileModel) {
        pages.editProfilePage
                .setInvitationText(editProfileModel.getInvitationText())
                .clickLogo()
                .clickSaveButton();
    }

    public void goBack() {
        pages.editProfilePage.goToProfilePage().discard();

    }

    public boolean isFullNameHaveError(String text) {
        return pages.editProfilePage.errorFullName.getText().contains(text);
    }

    public boolean isPhoneHaveError(String text) {
        pages.editProfilePage.ensurePageLoaded();
        return pages.editProfilePage.errorPhone.getText().contains(text);
    }

    public boolean isProfessionHaveError(String text) {
        return pages.editProfilePage.errorProfession.getText().contains(text);
    }
}
