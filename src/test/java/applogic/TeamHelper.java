package applogic;

/**
 * Created by timrusso on 6/27/16.
 */
public interface TeamHelper {

    void selectTeam1();
    void selectTeam2();
    boolean loadTeamPage();
    boolean teamName(String name);
    boolean teamDescription(String description);

}
