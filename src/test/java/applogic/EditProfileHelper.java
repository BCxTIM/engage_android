package applogic;

import model.EditProfileModel;

/**
 * Created by timrusso on 5/17/16.
 */
public interface EditProfileHelper {

    void setProfile(EditProfileModel editProfileModel);

    void setFullName(EditProfileModel editProfileModel);
    void setPhoneNumber(EditProfileModel editProfileModel);
    void setProfession(EditProfileModel editProfileModel);
    void setInvitation(EditProfileModel editProfileModel);
    void goBack();

    boolean isFullNameHaveError(String text);
    boolean isPhoneHaveError(String text);
    boolean isProfessionHaveError(String text);


}
