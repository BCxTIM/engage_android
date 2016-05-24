package applogic;

/**
 * Created by timrusso on 5/19/16.
 */
public interface AboutEngageHelper {
    void openTermsOfUse();
    boolean isAboutEngageOpen(String text);
    boolean isTermsOfUseOpen(String text);
}
