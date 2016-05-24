package applogic;

/**
 * Created by timrusso on 5/11/16.
 */
public interface MyProfileHelper {
    boolean seeProfile(String text);
    void openEditProfile();
    boolean isChangedName(String text);
    boolean isChangedPhoneNumber(String text);
    boolean isProfessionChanged(String text);

    void openAboutEngage();

}
