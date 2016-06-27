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
    public ClientsPage clientsPage;
    public ClientPage clientPage;
    public BrandPage brandPage;


    public PageManager(AndroidDriver driver) {
        this.driver = driver;
        contactUsPage = initElements(new ContactUsPage(this));
        loginPage = initElements(new LoginPage(this));
        getCodePage = initElements(new GetCodePage(this));
        myProfilePage = initElements(new MyProfilePage(this));
        editProfilePage = initElements(new EditProfilePage(this));
        aboutPage = initElements(new AboutPage(this));
        internalPage = initElements(new InternalPage(this));
        clientsPage = initElements(new ClientsPage(this));
        clientPage = initElements(new ClientPage(this));
        brandPage = initElements(new BrandPage(this));


    }

    private < T extends Page>  T initElements(T page) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), page);
        return page;
    }

    public AndroidDriver getAndroidDriver() {
        return driver;
    }

}
