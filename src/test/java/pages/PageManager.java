package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by timrusso on 4/28/16.
 */
public class PageManager {

    private AndroidDriver driver;

    public ContactUsPage contactUsPage;
    public LoginPage loginPage;
    public GetCodePage getCodePage;
    public MyProfilePage myProfilePage;
    public EditProfilePage editProfilePage;
    public AboutPage aboutPage;
    public InternalPage internalPage;
    public PlayersPage playersPage;
    public PlayerPage playerPage;
    public TeamPage teamPage;
    public ContactTagPayPage contactTagPayPage;
    public TeamInfoPage teamInfoPage;
    public FeedsPage feedsPage;
    public WhistlePage whistlePage;
    public ImageFeedPage imageFeedPage;


    public PageManager(AndroidDriver driver) {
        this.driver = driver;
        contactUsPage = initElements(new ContactUsPage(this));
        loginPage = initElements(new LoginPage(this));
        getCodePage = initElements(new GetCodePage(this));
        myProfilePage = initElements(new MyProfilePage(this));
        editProfilePage = initElements(new EditProfilePage(this));
        aboutPage = initElements(new AboutPage(this));
        internalPage = initElements(new InternalPage(this));
        playersPage = initElements(new PlayersPage(this));
        playerPage = initElements(new PlayerPage(this));
        teamPage = initElements(new TeamPage(this));
        contactTagPayPage = initElements(new ContactTagPayPage(this));
        teamInfoPage = initElements(new TeamInfoPage(this));
        feedsPage = initElements(new FeedsPage(this));
        whistlePage = initElements(new WhistlePage(this));
        imageFeedPage = initElements(new ImageFeedPage(this));


    }

    private < T extends Page>  T initElements(T page) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), page);
        return page;
    }

    public AndroidDriver getAndroidDriver() {
        return driver;
    }

}
